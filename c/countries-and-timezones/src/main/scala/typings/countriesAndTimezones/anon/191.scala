package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var c: js.Array[RU]
  
  var u: `660`
}
object `191` {
  
  inline def apply(c: js.Array[RU]): `191` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
