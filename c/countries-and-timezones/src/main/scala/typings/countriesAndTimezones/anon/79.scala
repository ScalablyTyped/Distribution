package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var c: js.Array[TC]
  
  var d: `-240`
  
  var u: `-300`
}
object `79` {
  
  inline def apply(c: js.Array[TC]): `79` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -240, u = -300)
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setC(value: js.Array[TC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-240`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
