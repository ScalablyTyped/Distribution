package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var c: js.Array[TW]
  
  var u: `480`
}
object `210` {
  
  inline def apply(c: js.Array[TW]): `210` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `210`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[TW]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TW*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
