package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.GR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `298` extends StObject {
  
  var c: js.Array[GR]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
}
object `298` {
  
  inline def apply(c: js.Array[GR]): `298` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`298`]
  }
  
  extension [Self <: `298`](x: Self) {
    
    inline def setC(value: js.Array[GR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
