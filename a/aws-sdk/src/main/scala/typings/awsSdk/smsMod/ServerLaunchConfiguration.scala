package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerLaunchConfiguration extends StObject {
  
  /**
    * Indicates whether a publicly accessible IP address is created when launching the server.
    */
  var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined
  
  var configureScript: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The type of configuration script.
    */
  var configureScriptType: js.UndefOr[ScriptType] = js.undefined
  
  /**
    * The name of the Amazon EC2 SSH key to be used for connecting to the launched server.
    */
  var ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined
  
  /**
    * The name of the IAM instance profile.
    */
  var iamInstanceProfileName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The instance type to use when launching the server.
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The logical ID of the server in the AWS CloudFormation template.
    */
  var logicalId: js.UndefOr[LogicalId] = js.undefined
  
  /**
    * The ID of the security group that applies to the launched server.
    */
  var securityGroup: js.UndefOr[SecurityGroup] = js.undefined
  
  /**
    * The ID of the server with which the launch configuration is associated.
    */
  var server: js.UndefOr[Server] = js.undefined
  
  /**
    * The ID of the subnet the server should be launched into.
    */
  var subnet: js.UndefOr[Subnet] = js.undefined
  
  /**
    * Location of the user-data script to be executed when launching the server.
    */
  var userData: js.UndefOr[UserData] = js.undefined
  
  /**
    * The ID of the VPC into which the server should be launched.
    */
  var vpc: js.UndefOr[VPC] = js.undefined
}
object ServerLaunchConfiguration {
  
  inline def apply(): ServerLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerLaunchConfiguration]
  }
  
  extension [Self <: ServerLaunchConfiguration](x: Self) {
    
    inline def setAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    inline def setConfigureScript(value: S3Location): Self = StObject.set(x, "configureScript", value.asInstanceOf[js.Any])
    
    inline def setConfigureScriptType(value: ScriptType): Self = StObject.set(x, "configureScriptType", value.asInstanceOf[js.Any])
    
    inline def setConfigureScriptTypeUndefined: Self = StObject.set(x, "configureScriptType", js.undefined)
    
    inline def setConfigureScriptUndefined: Self = StObject.set(x, "configureScript", js.undefined)
    
    inline def setEc2KeyName(value: EC2KeyName): Self = StObject.set(x, "ec2KeyName", value.asInstanceOf[js.Any])
    
    inline def setEc2KeyNameUndefined: Self = StObject.set(x, "ec2KeyName", js.undefined)
    
    inline def setIamInstanceProfileName(value: RoleName): Self = StObject.set(x, "iamInstanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileNameUndefined: Self = StObject.set(x, "iamInstanceProfileName", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLogicalId(value: LogicalId): Self = StObject.set(x, "logicalId", value.asInstanceOf[js.Any])
    
    inline def setLogicalIdUndefined: Self = StObject.set(x, "logicalId", js.undefined)
    
    inline def setSecurityGroup(value: SecurityGroup): Self = StObject.set(x, "securityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "securityGroup", js.undefined)
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSubnet(value: Subnet): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    inline def setUserData(value: UserData): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    inline def setVpc(value: VPC): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
