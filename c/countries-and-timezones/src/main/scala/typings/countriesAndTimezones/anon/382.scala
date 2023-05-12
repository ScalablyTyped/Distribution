package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.VU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `382` extends StObject {
  
  var c: js.Array[VU]
  
  var u: `660`
}
object `382` {
  
  inline def apply(c: js.Array[VU]): `382` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`382`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `382`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[VU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: VU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
