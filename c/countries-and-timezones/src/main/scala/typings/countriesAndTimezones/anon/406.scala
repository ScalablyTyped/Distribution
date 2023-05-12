package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `406` extends StObject {
  
  var c: js.Array[PN]
  
  var u: `-480`
}
object `406` {
  
  inline def apply(c: js.Array[PN]): `406` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -480)
    __obj.asInstanceOf[`406`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `406`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
