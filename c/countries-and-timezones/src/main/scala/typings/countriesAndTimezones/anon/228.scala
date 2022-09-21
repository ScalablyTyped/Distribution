package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var c: js.Array[IS]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
}
object `228` {
  
  inline def apply(c: js.Array[IS]): `228` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setC(value: js.Array[IS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
