package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firewall extends StObject {
  
  /**
    * A flag indicating whether it is possible to delete the firewall. A setting of TRUE indicates that the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to TRUE.
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The unique identifier for the firewall. 
    */
  var FirewallId: ResourceId = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy association, and you can use the same firewall policy for multiple firewalls. 
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
    * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different Availability Zone. 
    */
  var SubnetMappings: typings.awsSdk.networkfirewallMod.SubnetMappings = js.native
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The unique identifier of the VPC where the firewall is in use. 
    */
  var VpcId: typings.awsSdk.networkfirewallMod.VpcId = js.native
}
object Firewall {
  
  @scala.inline
  def apply(
    FirewallId: ResourceId,
    FirewallPolicyArn: ResourceArn,
    SubnetMappings: SubnetMappings,
    VpcId: VpcId
  ): Firewall = {
    val __obj = js.Dynamic.literal(FirewallId = FirewallId.asInstanceOf[js.Any], FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], SubnetMappings = SubnetMappings.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firewall]
  }
  
  @scala.inline
  implicit class FirewallMutableBuilder[Self <: Firewall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteProtection(value: Boolean): Self = StObject.set(x, "DeleteProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtectionUndefined: Self = StObject.set(x, "DeleteProtection", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallId(value: ResourceId): Self = StObject.set(x, "FirewallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyChangeProtection(value: Boolean): Self = StObject.set(x, "FirewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "FirewallPolicyChangeProtection", js.undefined)
    
    @scala.inline
    def setSubnetChangeProtection(value: Boolean): Self = StObject.set(x, "SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "SubnetChangeProtection", js.undefined)
    
    @scala.inline
    def setSubnetMappings(value: SubnetMappings): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMappingsVarargs(value: SubnetMapping*): Self = StObject.set(x, "SubnetMappings", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
