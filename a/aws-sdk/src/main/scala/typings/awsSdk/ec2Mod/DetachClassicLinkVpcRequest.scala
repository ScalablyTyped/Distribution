package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachClassicLinkVpcRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance to unlink from the VPC.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * The ID of the VPC to which the instance is linked.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}
object DetachClassicLinkVpcRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, VpcId: VpcId): DetachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachClassicLinkVpcRequest]
  }
  
  @scala.inline
  implicit class DetachClassicLinkVpcRequestMutableBuilder[Self <: DetachClassicLinkVpcRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
