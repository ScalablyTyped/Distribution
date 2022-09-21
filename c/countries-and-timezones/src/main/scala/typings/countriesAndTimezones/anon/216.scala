package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var c: js.Array[RU]
  
  var u: `600`
}
object `216` {
  
  inline def apply(c: js.Array[RU]): `216` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`216`]
  }
  
  extension [Self <: `216`](x: Self) {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
