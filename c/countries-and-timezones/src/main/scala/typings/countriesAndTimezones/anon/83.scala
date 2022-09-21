package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var c: js.Array[EC]
  
  var u: `-300`
}
object `83` {
  
  inline def apply(c: js.Array[EC]): `83` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setC(value: js.Array[EC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: EC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
