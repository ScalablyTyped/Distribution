package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firewall extends StObject {
  
  /**
    * A flag indicating whether it is possible to delete the firewall. A setting of TRUE indicates that the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to TRUE.
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The unique identifier for the firewall. 
    */
  var FirewallId: ResourceId
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. The relationship of firewall to firewall policy is many to one. Each firewall requires one firewall policy association, and you can use the same firewall policy for multiple firewalls. 
    */
  var FirewallPolicyArn: ResourceArn
  
  /**
    * A setting indicating whether the firewall is protected against a change to the firewall policy association. Use this setting to protect against accidentally modifying the firewall policy for a firewall that is in use. When you create a firewall, the operation initializes this setting to TRUE.
    */
  var FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you create a firewall, the operation initializes this setting to TRUE.
    */
  var SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The public subnets that Network Firewall is using for the firewall. Each subnet must belong to a different Availability Zone. 
    */
  var SubnetMappings: typings.awsSdk.networkfirewallMod.SubnetMappings
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The unique identifier of the VPC where the firewall is in use. 
    */
  var VpcId: typings.awsSdk.networkfirewallMod.VpcId
}
object Firewall {
  
  inline def apply(
    FirewallId: ResourceId,
    FirewallPolicyArn: ResourceArn,
    SubnetMappings: SubnetMappings,
    VpcId: VpcId
  ): Firewall = {
    val __obj = js.Dynamic.literal(FirewallId = FirewallId.asInstanceOf[js.Any], FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], SubnetMappings = SubnetMappings.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firewall]
  }
  
  extension [Self <: Firewall](x: Self) {
    
    inline def setDeleteProtection(value: Boolean): Self = StObject.set(x, "DeleteProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteProtectionUndefined: Self = StObject.set(x, "DeleteProtection", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    inline def setFirewallId(value: ResourceId): Self = StObject.set(x, "FirewallId", value.asInstanceOf[js.Any])
    
    inline def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    inline def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    inline def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyChangeProtection(value: Boolean): Self = StObject.set(x, "FirewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "FirewallPolicyChangeProtection", js.undefined)
    
    inline def setSubnetChangeProtection(value: Boolean): Self = StObject.set(x, "SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "SubnetChangeProtection", js.undefined)
    
    inline def setSubnetMappings(value: SubnetMappings): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingsVarargs(value: SubnetMapping*): Self = StObject.set(x, "SubnetMappings", js.Array(value :_*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
