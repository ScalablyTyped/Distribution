package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var c: js.Array[BB]
  
  var u: `-240`
}
object `51` {
  
  inline def apply(c: js.Array[BB]): `51` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -240)
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setC(value: js.Array[BB]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BB*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
