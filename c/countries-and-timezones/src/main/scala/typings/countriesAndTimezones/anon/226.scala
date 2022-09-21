package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.FO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var c: js.Array[FO]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
}
object `226` {
  
  inline def apply(c: js.Array[FO]): `226` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setC(value: js.Array[FO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
