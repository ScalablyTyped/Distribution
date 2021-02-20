package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceNetworkAclAssociationRequest extends StObject {
  
  /**
    * The ID of the current association between the original network ACL and the subnet.
    */
  var AssociationId: NetworkAclAssociationId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the new network ACL to associate with the subnet.
    */
  var NetworkAclId: typings.awsSdk.ec2Mod.NetworkAclId = js.native
}
object ReplaceNetworkAclAssociationRequest {
  
  @scala.inline
  def apply(AssociationId: NetworkAclAssociationId, NetworkAclId: NetworkAclId): ReplaceNetworkAclAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclAssociationRequest]
  }
  
  @scala.inline
  implicit class ReplaceNetworkAclAssociationRequestMutableBuilder[Self <: ReplaceNetworkAclAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: NetworkAclAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
  }
}
