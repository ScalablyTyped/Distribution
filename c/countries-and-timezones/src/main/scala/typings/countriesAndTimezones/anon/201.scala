package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var c: js.Array[KP]
  
  var u: `540`
}
object `201` {
  
  inline def apply(c: js.Array[KP]): `201` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 540)
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[KP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KP*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
