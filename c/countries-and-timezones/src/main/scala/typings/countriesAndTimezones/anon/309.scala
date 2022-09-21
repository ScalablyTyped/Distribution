package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `309` extends StObject {
  
  var c: js.Array[IE]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object `309` {
  
  inline def apply(c: js.Array[IE]): `309` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = 60)
    __obj.asInstanceOf[`309`]
  }
  
  extension [Self <: `309`](x: Self) {
    
    inline def setC(value: js.Array[IE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
