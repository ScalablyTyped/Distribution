package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFirewallRequest extends js.Object {
  
  /**
    * A flag indicating whether it is possible to delete the firewall. A setting of TRUE indicates that the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to TRUE.
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: ResourceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the FirewallPolicy that you want to use for the firewall.
    */
  var FirewallPolicyArn: ResourceArn = js.native
  
  /**
    * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When you create a firewall, the operation initializes this setting to TRUE.
    */
  var FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you create a firewall, the operation initializes this setting to TRUE.
    */
  var SubnetChangeProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * The public subnets to use for your Network Firewall firewalls. Each subnet must belong to a different Availability Zone in the VPC. Network Firewall creates a firewall endpoint in each subnet. 
    */
  var SubnetMappings: typings.awsSdk.networkfirewallMod.SubnetMappings = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The unique identifier of the VPC where Network Firewall should create the firewall.  You can't change this setting after you create the firewall. 
    */
  var VpcId: typings.awsSdk.networkfirewallMod.VpcId = js.native
}
object CreateFirewallRequest {
  
  @scala.inline
  def apply(
    FirewallName: ResourceName,
    FirewallPolicyArn: ResourceArn,
    SubnetMappings: SubnetMappings,
    VpcId: VpcId
  ): CreateFirewallRequest = {
    val __obj = js.Dynamic.literal(FirewallName = FirewallName.asInstanceOf[js.Any], FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], SubnetMappings = SubnetMappings.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRequest]
  }
  
  @scala.inline
  implicit class CreateFirewallRequestOps[Self <: CreateFirewallRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = this.set("FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = this.set("FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMappingsVarargs(value: SubnetMapping*): Self = this.set("SubnetMappings", js.Array(value :_*))
    
    @scala.inline
    def setSubnetMappings(value: SubnetMappings): Self = this.set("SubnetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtection(value: Boolean): Self = this.set("DeleteProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteProtection: Self = this.set("DeleteProtection", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFirewallPolicyChangeProtection(value: Boolean): Self = this.set("FirewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicyChangeProtection: Self = this.set("FirewallPolicyChangeProtection", js.undefined)
    
    @scala.inline
    def setSubnetChangeProtection(value: Boolean): Self = this.set("SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetChangeProtection: Self = this.set("SubnetChangeProtection", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
