package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.JP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var c: js.Array[JP]
  
  var u: `540`
}
object `216` {
  
  inline def apply(c: js.Array[JP]): `216` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 540)
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `216`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[JP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: JP*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
