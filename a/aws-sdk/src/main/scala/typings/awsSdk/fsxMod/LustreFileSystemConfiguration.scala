package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LustreFileSystemConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. (Default = false)
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  
  var DataRepositoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryConfiguration] = js.native
  
  /**
    * The deployment type of the FSX for Lustre file system. Scratch deployment type is designed for temporary storage and shorter-term processing of data.  SCRATCH_1 and SCRATCH_2 deployment types are best suited for when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. The PERSISTENT_1 deployment type is used for longer-term storage and workloads and encryption of data in transit. To learn more about deployment types, see  FSx for Lustre Deployment Options. (Default = SCRATCH_1)
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.native
  
  /**
    * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This parameter is required when storage type is HDD. Set to READ, improve the performance for frequently accessed files and allows 20% of the total storage capacity of the file system to be cached.  This parameter is required when StorageType is set to HDD.
    */
  var DriveCacheType: js.UndefOr[typings.awsSdk.fsxMod.DriveCacheType] = js.native
  
  /**
    * You use the MountName value when mounting the file system. For the SCRATCH_1 deployment type, this value is always "fsx". For SCRATCH_2 and PERSISTENT_1 deployment types, this value is a string that is unique within an AWS Region. 
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.native
  
  /**
    *  Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for PERSISTENT_1 deployment types.  Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40. 
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.native
  
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}
object LustreFileSystemConfiguration {
  
  @scala.inline
  def apply(): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
  
  @scala.inline
  implicit class LustreFileSystemConfigurationMutableBuilder[Self <: LustreFileSystemConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    @scala.inline
    def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    @scala.inline
    def setDataRepositoryConfiguration(value: DataRepositoryConfiguration): Self = StObject.set(x, "DataRepositoryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRepositoryConfigurationUndefined: Self = StObject.set(x, "DataRepositoryConfiguration", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: LustreDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    @scala.inline
    def setDriveCacheType(value: DriveCacheType): Self = StObject.set(x, "DriveCacheType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveCacheTypeUndefined: Self = StObject.set(x, "DriveCacheType", js.undefined)
    
    @scala.inline
    def setMountName(value: LustreFileSystemMountName): Self = StObject.set(x, "MountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountNameUndefined: Self = StObject.set(x, "MountName", js.undefined)
    
    @scala.inline
    def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "PerUnitStorageThroughput", js.undefined)
    
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
