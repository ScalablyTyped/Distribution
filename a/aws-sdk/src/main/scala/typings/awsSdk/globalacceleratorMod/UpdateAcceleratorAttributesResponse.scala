package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAcceleratorAttributesResponse extends StObject {
  
  /**
    * Updated attributes for the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsSdk.globalacceleratorMod.AcceleratorAttributes] = js.native
}
object UpdateAcceleratorAttributesResponse {
  
  @scala.inline
  def apply(): UpdateAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
  }
  
  @scala.inline
  implicit class UpdateAcceleratorAttributesResponseMutableBuilder[Self <: UpdateAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorAttributes(value: AcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
