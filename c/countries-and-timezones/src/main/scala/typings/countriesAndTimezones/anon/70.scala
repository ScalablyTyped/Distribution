package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  var c: js.Array[CA]
  
  var u: `-420`
}
object `70` {
  
  inline def apply(c: js.Array[CA]): `70` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -420)
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `70`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
