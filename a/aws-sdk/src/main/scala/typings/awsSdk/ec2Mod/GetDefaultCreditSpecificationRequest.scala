package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultCreditSpecificationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily = js.native
}
object GetDefaultCreditSpecificationRequest {
  
  @scala.inline
  def apply(InstanceFamily: UnlimitedSupportedInstanceFamily): GetDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultCreditSpecificationRequest]
  }
  
  @scala.inline
  implicit class GetDefaultCreditSpecificationRequestMutableBuilder[Self <: GetDefaultCreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
  }
}
