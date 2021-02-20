package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationInstance extends StObject {
  
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * Boolean value indicating if minor version upgrades will be automatically applied to the instance.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The DNS name servers supported for the replication instance to access your on-premise source or target database.
    */
  var DnsNameServers: js.UndefOr[String] = js.native
  
  /**
    * The engine version number of the replication instance. If an engine version number is not specified when a replication instance is created, the default is the latest engine version available. When modifying a major engine version of an instance, also set AllowMajorVersionUpgrade to true.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    *  The expiration date of the free replication instance that is part of the Free DMS program. 
    */
  var FreeUntil: js.UndefOr[TStamp] = js.native
  
  /**
    * The time the replication instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * An AWS KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  
  /**
    * The pending modification values.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.native
  
  /**
    * The maintenance window times for the replication instance. Any pending upgrades to the replication instance are performed during this time.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    *  Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. It is a required parameter, although a defualt value is pre-selected in the DMS console. For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  
  /**
    * The replication instance identifier is a required parameter. This parameter is stored as a lowercase string. Constraints:   Must contain 1-63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of the replication instance.
    */
  var ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * One or more private IP addresses for the replication instance.
    */
  var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.native
  
  /**
    * The public IP address of the replication instance.
    */
  var ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.native
  
  /**
    * One or more public IP addresses for the replication instance.
    */
  var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.native
  
  /**
    * The status of the replication instance. The possible return values include:    "available"     "creating"     "deleted"     "deleting"     "failed"     "modifying"     "upgrading"     "rebooting"     "resetting-master-credentials"     "storage-full"     "incompatible-credentials"     "incompatible-network"     "maintenance"   
    */
  var ReplicationInstanceStatus: js.UndefOr[String] = js.native
  
  /**
    * The subnet group for the replication instance.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.dmsMod.ReplicationSubnetGroup] = js.native
  
  /**
    * The Availability Zone of the standby replication instance in a Multi-AZ deployment.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The VPC security group for the instance.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}
object ReplicationInstance {
  
  @scala.inline
  def apply(): ReplicationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstance]
  }
  
  @scala.inline
  implicit class ReplicationInstanceMutableBuilder[Self <: ReplicationInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDnsNameServers(value: String): Self = StObject.set(x, "DnsNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameServersUndefined: Self = StObject.set(x, "DnsNameServers", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setFreeUntil(value: TStamp): Self = StObject.set(x, "FreeUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeUntilUndefined: Self = StObject.set(x, "FreeUntil", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: TStamp): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: ReplicationPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = StObject.set(x, "ReplicationInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceClassUndefined: Self = StObject.set(x, "ReplicationInstanceClass", js.undefined)
    
    @scala.inline
    def setReplicationInstanceIdentifier(value: String): Self = StObject.set(x, "ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceIdentifierUndefined: Self = StObject.set(x, "ReplicationInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationInstancePrivateIpAddress(value: String): Self = StObject.set(x, "ReplicationInstancePrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstancePrivateIpAddressUndefined: Self = StObject.set(x, "ReplicationInstancePrivateIpAddress", js.undefined)
    
    @scala.inline
    def setReplicationInstancePrivateIpAddresses(value: ReplicationInstancePrivateIpAddressList): Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstancePrivateIpAddressesUndefined: Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setReplicationInstancePrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setReplicationInstancePublicIpAddress(value: String): Self = StObject.set(x, "ReplicationInstancePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstancePublicIpAddressUndefined: Self = StObject.set(x, "ReplicationInstancePublicIpAddress", js.undefined)
    
    @scala.inline
    def setReplicationInstancePublicIpAddresses(value: ReplicationInstancePublicIpAddressList): Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstancePublicIpAddressesUndefined: Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", js.undefined)
    
    @scala.inline
    def setReplicationInstancePublicIpAddressesVarargs(value: String*): Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setReplicationInstanceStatus(value: String): Self = StObject.set(x, "ReplicationInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceStatusUndefined: Self = StObject.set(x, "ReplicationInstanceStatus", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
    
    @scala.inline
    def setSecondaryAvailabilityZone(value: String): Self = StObject.set(x, "SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "SecondaryAvailabilityZone", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
