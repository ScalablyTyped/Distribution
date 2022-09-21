package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRequest extends StObject {
  
  /**
    * A flag indicating whether it is possible to delete the firewall. A setting of TRUE indicates that the firewall is protected against deletion. Use this setting to protect against accidentally deleting a firewall that is in use. When you create a firewall, the operation initializes this flag to TRUE.
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * A complex type that contains settings for encryption of your firewall resources.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.networkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: ResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the FirewallPolicy that you want to use for the firewall.
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
    * The public subnets to use for your Network Firewall firewalls. Each subnet must belong to a different Availability Zone in the VPC. Network Firewall creates a firewall endpoint in each subnet. 
    */
  var SubnetMappings: typings.awsSdk.networkfirewallMod.SubnetMappings
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The unique identifier of the VPC where Network Firewall should create the firewall.  You can't change this setting after you create the firewall. 
    */
  var VpcId: typings.awsSdk.networkfirewallMod.VpcId
}
object CreateFirewallRequest {
  
  inline def apply(
    FirewallName: ResourceName,
    FirewallPolicyArn: ResourceArn,
    SubnetMappings: SubnetMappings,
    VpcId: VpcId
  ): CreateFirewallRequest = {
    val __obj = js.Dynamic.literal(FirewallName = FirewallName.asInstanceOf[js.Any], FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], SubnetMappings = SubnetMappings.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRequest]
  }
  
  extension [Self <: CreateFirewallRequest](x: Self) {
    
    inline def setDeleteProtection(value: Boolean): Self = StObject.set(x, "DeleteProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteProtectionUndefined: Self = StObject.set(x, "DeleteProtection", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyChangeProtection(value: Boolean): Self = StObject.set(x, "FirewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "FirewallPolicyChangeProtection", js.undefined)
    
    inline def setSubnetChangeProtection(value: Boolean): Self = StObject.set(x, "SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "SubnetChangeProtection", js.undefined)
    
    inline def setSubnetMappings(value: SubnetMappings): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingsVarargs(value: SubnetMapping*): Self = StObject.set(x, "SubnetMappings", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
