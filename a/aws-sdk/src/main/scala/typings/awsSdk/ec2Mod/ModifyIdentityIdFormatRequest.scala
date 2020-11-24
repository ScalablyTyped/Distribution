package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyIdentityIdFormatRequest extends js.Object {
  
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify all to modify the ID format for all IAM users, IAM roles, and the root user of the account.
    */
  var PrincipalArn: String = js.native
  
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. Alternatively, use the all-current option to include all resource types that are currently within their opt-in period for longer IDs.
    */
  var Resource: String = js.native
  
  /**
    * Indicates whether the resource should use longer IDs (17-character IDs)
    */
  var UseLongIds: Boolean = js.native
}
object ModifyIdentityIdFormatRequest {
  
  @scala.inline
  def apply(PrincipalArn: String, Resource: String, UseLongIds: Boolean): ModifyIdentityIdFormatRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], UseLongIds = UseLongIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIdentityIdFormatRequest]
  }
  
  @scala.inline
  implicit class ModifyIdentityIdFormatRequestOps[Self <: ModifyIdentityIdFormatRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrincipalArn(value: String): Self = this.set("PrincipalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongIds(value: Boolean): Self = this.set("UseLongIds", value.asInstanceOf[js.Any])
  }
}
