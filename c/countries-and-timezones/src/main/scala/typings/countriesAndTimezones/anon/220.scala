package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var c: js.Array[RU]
  
  var u: `600`
}
object `220` {
  
  inline def apply(c: js.Array[RU]): `220` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`220`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `220`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
