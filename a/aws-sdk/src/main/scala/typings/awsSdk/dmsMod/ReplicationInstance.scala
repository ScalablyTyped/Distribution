package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstance extends js.Object {
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
    * The engine version number of the replication instance.
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
    * The maintenance window times for the replication instance.
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
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain 1-63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
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
  implicit class ReplicationInstanceOps[Self <: ReplicationInstance] (val x: Self) extends AnyVal {
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDnsNameServers(value: String): Self = this.set("DnsNameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsNameServers: Self = this.set("DnsNameServers", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setFreeUntil(value: TStamp): Self = this.set("FreeUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeUntil: Self = this.set("FreeUntil", js.undefined)
    @scala.inline
    def setInstanceCreateTime(value: TStamp): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMultiAZ(value: Boolean): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setPendingModifiedValues(value: ReplicationPendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = this.set("ReplicationInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceClass: Self = this.set("ReplicationInstanceClass", js.undefined)
    @scala.inline
    def setReplicationInstanceIdentifier(value: String): Self = this.set("ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceIdentifier: Self = this.set("ReplicationInstanceIdentifier", js.undefined)
    @scala.inline
    def setReplicationInstancePrivateIpAddress(value: String): Self = this.set("ReplicationInstancePrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstancePrivateIpAddress: Self = this.set("ReplicationInstancePrivateIpAddress", js.undefined)
    @scala.inline
    def setReplicationInstancePrivateIpAddressesVarargs(value: String*): Self = this.set("ReplicationInstancePrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setReplicationInstancePrivateIpAddresses(value: ReplicationInstancePrivateIpAddressList): Self = this.set("ReplicationInstancePrivateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstancePrivateIpAddresses: Self = this.set("ReplicationInstancePrivateIpAddresses", js.undefined)
    @scala.inline
    def setReplicationInstancePublicIpAddress(value: String): Self = this.set("ReplicationInstancePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstancePublicIpAddress: Self = this.set("ReplicationInstancePublicIpAddress", js.undefined)
    @scala.inline
    def setReplicationInstancePublicIpAddressesVarargs(value: String*): Self = this.set("ReplicationInstancePublicIpAddresses", js.Array(value :_*))
    @scala.inline
    def setReplicationInstancePublicIpAddresses(value: ReplicationInstancePublicIpAddressList): Self = this.set("ReplicationInstancePublicIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstancePublicIpAddresses: Self = this.set("ReplicationInstancePublicIpAddresses", js.undefined)
    @scala.inline
    def setReplicationInstanceStatus(value: String): Self = this.set("ReplicationInstanceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceStatus: Self = this.set("ReplicationInstanceStatus", js.undefined)
    @scala.inline
    def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = this.set("ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationSubnetGroup: Self = this.set("ReplicationSubnetGroup", js.undefined)
    @scala.inline
    def setSecondaryAvailabilityZone(value: String): Self = this.set("SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAvailabilityZone: Self = this.set("SecondaryAvailabilityZone", js.undefined)
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
  
}

