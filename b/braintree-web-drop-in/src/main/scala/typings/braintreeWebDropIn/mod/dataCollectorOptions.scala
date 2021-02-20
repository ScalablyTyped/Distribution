package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataCollectorOptions extends StObject {
  
  var kount: js.UndefOr[Boolean] = js.native
}
object dataCollectorOptions {
  
  @scala.inline
  def apply(): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataCollectorOptions]
  }
  
  @scala.inline
  implicit class dataCollectorOptionsMutableBuilder[Self <: dataCollectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKount(value: Boolean): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
  }
}
