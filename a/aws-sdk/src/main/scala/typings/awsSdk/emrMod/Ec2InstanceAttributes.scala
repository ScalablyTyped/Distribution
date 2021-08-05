package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2InstanceAttributes extends StObject {
  
  /**
    * A list of additional Amazon EC2 security group IDs for the master node.
    */
  var AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of additional Amazon EC2 security group IDs for the core and task nodes.
    */
  var AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Availability Zone in which the cluster will run. 
    */
  var Ec2AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named "hadoop".
    */
  var Ec2KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value, and your account supports EC2-Classic, the cluster launches in EC2-Classic.
    */
  var Ec2SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the Amazon EC2 security group for the master node.
    */
  var EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the Amazon EC2 security group for the core and task nodes.
    */
  var EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM role that was specified when the cluster was launched. The EC2 instances of the cluster assume this role.
    */
  var IamInstanceProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Applies to clusters configured with the instance fleets option. Specifies one or more Availability Zones in which to launch EC2 cluster instances when the EC2-Classic network configuration is supported. Amazon EMR chooses the Availability Zone with the best fit from among the list of RequestedEc2AvailabilityZones, and then launches all cluster instances within that Availability Zone. If you do not specify this value, Amazon EMR chooses the Availability Zone for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
  
  /**
    * Applies to clusters configured with the instance fleets option. Specifies the unique identifier of one or more Amazon EC2 subnets in which to launch EC2 cluster instances. Subnets must exist within the same VPC. Amazon EMR chooses the EC2 subnet with the best fit from among the list of RequestedEc2SubnetIds, and then launches all cluster instances within that Subnet. If this value is not specified, and the account and Region support EC2-Classic networks, the cluster launches instances in the EC2-Classic network and uses RequestedEc2AvailabilityZones instead of this setting. If EC2-Classic is not supported, and no Subnet is specified, Amazon EMR chooses the subnet for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined
  
  /**
    * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
    */
  var ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined
}
object Ec2InstanceAttributes {
  
  inline def apply(): Ec2InstanceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ec2InstanceAttributes]
  }
  
  extension [Self <: Ec2InstanceAttributes](x: Self) {
    
    inline def setAdditionalMasterSecurityGroups(value: StringList): Self = StObject.set(x, "AdditionalMasterSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMasterSecurityGroupsUndefined: Self = StObject.set(x, "AdditionalMasterSecurityGroups", js.undefined)
    
    inline def setAdditionalMasterSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "AdditionalMasterSecurityGroups", js.Array(value :_*))
    
    inline def setAdditionalSlaveSecurityGroups(value: StringList): Self = StObject.set(x, "AdditionalSlaveSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSlaveSecurityGroupsUndefined: Self = StObject.set(x, "AdditionalSlaveSecurityGroups", js.undefined)
    
    inline def setAdditionalSlaveSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "AdditionalSlaveSecurityGroups", js.Array(value :_*))
    
    inline def setEc2AvailabilityZone(value: String): Self = StObject.set(x, "Ec2AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setEc2AvailabilityZoneUndefined: Self = StObject.set(x, "Ec2AvailabilityZone", js.undefined)
    
    inline def setEc2KeyName(value: String): Self = StObject.set(x, "Ec2KeyName", value.asInstanceOf[js.Any])
    
    inline def setEc2KeyNameUndefined: Self = StObject.set(x, "Ec2KeyName", js.undefined)
    
    inline def setEc2SubnetId(value: String): Self = StObject.set(x, "Ec2SubnetId", value.asInstanceOf[js.Any])
    
    inline def setEc2SubnetIdUndefined: Self = StObject.set(x, "Ec2SubnetId", js.undefined)
    
    inline def setEmrManagedMasterSecurityGroup(value: String): Self = StObject.set(x, "EmrManagedMasterSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setEmrManagedMasterSecurityGroupUndefined: Self = StObject.set(x, "EmrManagedMasterSecurityGroup", js.undefined)
    
    inline def setEmrManagedSlaveSecurityGroup(value: String): Self = StObject.set(x, "EmrManagedSlaveSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setEmrManagedSlaveSecurityGroupUndefined: Self = StObject.set(x, "EmrManagedSlaveSecurityGroup", js.undefined)
    
    inline def setIamInstanceProfile(value: String): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setRequestedEc2AvailabilityZones(value: XmlStringMaxLen256List): Self = StObject.set(x, "RequestedEc2AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setRequestedEc2AvailabilityZonesUndefined: Self = StObject.set(x, "RequestedEc2AvailabilityZones", js.undefined)
    
    inline def setRequestedEc2AvailabilityZonesVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "RequestedEc2AvailabilityZones", js.Array(value :_*))
    
    inline def setRequestedEc2SubnetIds(value: XmlStringMaxLen256List): Self = StObject.set(x, "RequestedEc2SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setRequestedEc2SubnetIdsUndefined: Self = StObject.set(x, "RequestedEc2SubnetIds", js.undefined)
    
    inline def setRequestedEc2SubnetIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "RequestedEc2SubnetIds", js.Array(value :_*))
    
    inline def setServiceAccessSecurityGroup(value: String): Self = StObject.set(x, "ServiceAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessSecurityGroupUndefined: Self = StObject.set(x, "ServiceAccessSecurityGroup", js.undefined)
  }
}
