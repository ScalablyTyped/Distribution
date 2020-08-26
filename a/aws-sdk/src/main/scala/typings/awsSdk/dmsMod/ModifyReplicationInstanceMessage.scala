package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage, and the change is asynchronously applied as soon as possible. This parameter must be set to true when specifying a value for the EngineVersion parameter that is a different major version than the replication instance's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates that minor version upgrades are applied automatically to the replication instance during the maintenance window. Changing this parameter doesn't result in an outage, except in the case dsecribed following. The change is asynchronously applied as soon as possible.  An outage does result if these factors apply:    This parameter is set to true during the maintenance window.   A newer minor version is available.    AWS DMS has enabled automatic patching for the given engine version.   
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter does not result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String = js.native
  /**
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. For example to specify the instance class dms.c4.large, set this parameter to "dms.c4.large". For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyReplicationInstanceMessage {
  @scala.inline
  def apply(ReplicationInstanceArn: String): ModifyReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationInstanceMessage]
  }
  @scala.inline
  implicit class ModifyReplicationInstanceMessageOps[Self <: ModifyReplicationInstanceMessage] (val x: Self) extends AnyVal {
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
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setAllowMajorVersionUpgrade(value: Boolean): Self = this.set("AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMajorVersionUpgrade: Self = this.set("AllowMajorVersionUpgrade", js.undefined)
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = this.set("ReplicationInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceClass: Self = this.set("ReplicationInstanceClass", js.undefined)
    @scala.inline
    def setReplicationInstanceIdentifier(value: String): Self = this.set("ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceIdentifier: Self = this.set("ReplicationInstanceIdentifier", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
  
}

