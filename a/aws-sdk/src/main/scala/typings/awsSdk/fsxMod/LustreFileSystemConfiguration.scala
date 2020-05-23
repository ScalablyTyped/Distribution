package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemConfiguration extends js.Object {
  var DataRepositoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryConfiguration] = js.native
  /**
    * The deployment type of the FSX for Lustre file system.
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.native
  /**
    * You use the MountName value when mounting the file system. For the SCRATCH_1 deployment type, this value is always "fsx". For SCRATCH_2 and PERSISTENT_1 deployment types, this value is a string that is unique within an AWS Region. 
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.native
  /**
    *  Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for PERSISTENT_1 deployment types. Valid values are 50, 100, 200. 
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.native
  /**
    * The UTC time that you want to begin your weekly maintenance window.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object LustreFileSystemConfiguration {
  @scala.inline
  def apply(
    DataRepositoryConfiguration: DataRepositoryConfiguration = null,
    DeploymentType: LustreDeploymentType = null,
    MountName: LustreFileSystemMountName = null,
    PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DataRepositoryConfiguration != null) __obj.updateDynamic("DataRepositoryConfiguration")(DataRepositoryConfiguration.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (MountName != null) __obj.updateDynamic("MountName")(MountName.asInstanceOf[js.Any])
    if (!js.isUndefined(PerUnitStorageThroughput)) __obj.updateDynamic("PerUnitStorageThroughput")(PerUnitStorageThroughput.get.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
}

