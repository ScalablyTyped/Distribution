package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dataCollectorOptions extends StObject {
  
  var kount: js.UndefOr[Boolean] = js.undefined
}
object dataCollectorOptions {
  
  inline def apply(): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataCollectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dataCollectorOptions] (val x: Self) extends AnyVal {
    
    inline def setKount(value: Boolean): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    inline def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
  }
}
