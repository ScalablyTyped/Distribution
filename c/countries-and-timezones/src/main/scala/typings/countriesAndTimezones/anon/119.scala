package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.DO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var c: js.Array[DO]
  
  var u: `-240`
}
object `119` {
  
  inline def apply(c: js.Array[DO]): `119` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -240)
    __obj.asInstanceOf[`119`]
  }
  
  extension [Self <: `119`](x: Self) {
    
    inline def setC(value: js.Array[DO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
