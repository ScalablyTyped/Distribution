package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `405` extends StObject {
  
  var c: js.Array[PW]
  
  var u: `540`
}
object `405` {
  
  inline def apply(c: js.Array[PW]): `405` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 540)
    __obj.asInstanceOf[`405`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `405`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PW]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PW*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
