package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkSettings extends StObject {
  
  /**
    * A list of web portal ARNs that this network settings is associated with.
    */
  var associatedPortalArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: ARN
  
  /**
    * One or more security groups used to control access from streaming instances to your VPC. 
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * The subnets in which network interfaces are created to connect streaming instances to your VPC. At least two of these subnets must be in different availability zones.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The VPC that streaming instances will connect to.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object NetworkSettings {
  
  inline def apply(networkSettingsArn: ARN): NetworkSettings = {
    val __obj = js.Dynamic.literal(networkSettingsArn = networkSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSettings]
  }
  
  extension [Self <: NetworkSettings](x: Self) {
    
    inline def setAssociatedPortalArns(value: ArnList): Self = StObject.set(x, "associatedPortalArns", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPortalArnsUndefined: Self = StObject.set(x, "associatedPortalArns", js.undefined)
    
    inline def setAssociatedPortalArnsVarargs(value: ARN*): Self = StObject.set(x, "associatedPortalArns", js.Array(value*))
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
