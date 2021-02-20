package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShippingLabelOutput extends StObject {
  
  var ShippingLabelURL: js.UndefOr[GenericString] = js.native
  
  var Warning: js.UndefOr[GenericString] = js.native
}
object GetShippingLabelOutput {
  
  @scala.inline
  def apply(): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
  
  @scala.inline
  implicit class GetShippingLabelOutputMutableBuilder[Self <: GetShippingLabelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingLabelURL(value: GenericString): Self = StObject.set(x, "ShippingLabelURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingLabelURLUndefined: Self = StObject.set(x, "ShippingLabelURL", js.undefined)
    
    @scala.inline
    def setWarning(value: GenericString): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
