package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInterface extends StObject {
  
  /**
    * Immutable and has to be a unique against other VpcInterfaces in this Flow.
    */
  var Name: string
  
  /**
    * IDs of the network interfaces created in customer's account by MediaConnect.
    */
  var NetworkInterfaceIds: listOfString
  
  /**
    * The type of network interface.
    */
  var NetworkInterfaceType: typings.awsSdk.mediaconnectMod.NetworkInterfaceType
  
  /**
    * Role Arn MediaConnect can assumes to create ENIs in customer's account
    */
  var RoleArn: string
  
  /**
    * Security Group IDs to be used on ENI.
    */
  var SecurityGroupIds: listOfString
  
  /**
    * Subnet must be in the AZ of the Flow
    */
  var SubnetId: string
}
object VpcInterface {
  
  inline def apply(
    Name: string,
    NetworkInterfaceIds: listOfString,
    NetworkInterfaceType: NetworkInterfaceType,
    RoleArn: string,
    SecurityGroupIds: listOfString,
    SubnetId: string
  ): VpcInterface = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NetworkInterfaceIds = NetworkInterfaceIds.asInstanceOf[js.Any], NetworkInterfaceType = NetworkInterfaceType.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcInterface]
  }
  
  extension [Self <: VpcInterface](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIds(value: listOfString): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsVarargs(value: string*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setNetworkInterfaceType(value: NetworkInterfaceType): Self = StObject.set(x, "NetworkInterfaceType", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetId(value: string): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
