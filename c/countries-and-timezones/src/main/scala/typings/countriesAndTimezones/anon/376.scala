package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`780`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `376` extends StObject {
  
  var c: js.Array[WS]
  
  var u: `780`
}
object `376` {
  
  inline def apply(c: js.Array[WS]): `376` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 780)
    __obj.asInstanceOf[`376`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `376`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[WS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: WS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `780`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
