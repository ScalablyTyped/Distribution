package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetFpgaImageAttributeRequest extends StObject {
  
  /**
    * The attribute.
    */
  var Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
}
object ResetFpgaImageAttributeRequest {
  
  @scala.inline
  def apply(FpgaImageId: FpgaImageId): ResetFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetFpgaImageAttributeRequest]
  }
  
  @scala.inline
  implicit class ResetFpgaImageAttributeRequestMutableBuilder[Self <: ResetFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: ResetFpgaImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFpgaImageId(value: FpgaImageId): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
  }
}
