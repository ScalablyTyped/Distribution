package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `395` extends StObject {
  
  var c: js.Array[FM]
  
  var u: `660`
}
object `395` {
  
  inline def apply(c: js.Array[FM]): `395` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`395`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `395`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
