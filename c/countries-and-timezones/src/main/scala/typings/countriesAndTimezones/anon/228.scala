package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-60`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var c: js.Array[CV]
  
  var u: `-60`
}
object `228` {
  
  inline def apply(c: js.Array[CV]): `228` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -60)
    __obj.asInstanceOf[`228`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `228`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CV*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
