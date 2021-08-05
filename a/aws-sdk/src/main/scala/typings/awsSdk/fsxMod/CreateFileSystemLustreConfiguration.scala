package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemLustreConfiguration extends StObject {
  
  /**
    *  (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or changed objects after choosing this option.    NEW - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added to the linked S3 bucket that do not currently exist in the FSx file system.     NEW_CHANGED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose this option.    For more information, see Automatically import updates from your S3 bucket.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false. If it's set to true, all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. For more information, see Working with backups.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    *  Choose SCRATCH_1 and SCRATCH_2 deployment types when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. Choose PERSISTENT_1 deployment type for longer-term storage and workloads and encryption of data in transit. To learn more about deployment types, see  FSx for Lustre Deployment Options. Encryption of data in-transit is automatically enabled when you access a SCRATCH_2 or PERSISTENT_1 file system from Amazon EC2 instances that support this feature. (Default = SCRATCH_1)  Encryption of data in-transit for SCRATCH_2 and PERSISTENT_1 deployment types is supported when accessed from supported instance types in supported AWS Regions. To learn more, Encrypting Data in Transit.
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined
  
  /**
    * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This parameter is required when storage type is HDD. Set to READ, improve the performance for frequently accessed files and allows 20% of the total storage capacity of the file system to be cached.  This parameter is required when StorageType is set to HDD.
    */
  var DriveCacheType: js.UndefOr[typings.awsSdk.fsxMod.DriveCacheType] = js.undefined
  
  /**
    * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed data is to be exported from your Amazon FSx for Lustre file system. If an ExportPath value is not provided, Amazon FSx sets a default export path, s3://import-bucket/FSxLustre[creation-timestamp]. The timestamp is in UTC format, for example s3://import-bucket/FSxLustre20181105T222312Z. The Amazon S3 export bucket must be the same as the import bucket specified by ImportPath. If you only specify a bucket name, such as s3://import-bucket, you get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a custom prefix in the export path, such as s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file system to that export prefix in the Amazon S3 bucket.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3 bucket you select. An example is s3://import-bucket/optional-prefix. If you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    *  Required for the PERSISTENT_1 deployment type, describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of throughput that you provision.  Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.undefined
  
  /**
    * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object CreateFileSystemLustreConfiguration {
  
  inline def apply(): CreateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
  }
  
  extension [Self <: CreateFileSystemLustreConfiguration](x: Self) {
    
    inline def setAutoImportPolicy(value: AutoImportPolicyType): Self = StObject.set(x, "AutoImportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoImportPolicyUndefined: Self = StObject.set(x, "AutoImportPolicy", js.undefined)
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: LustreDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setDriveCacheType(value: DriveCacheType): Self = StObject.set(x, "DriveCacheType", value.asInstanceOf[js.Any])
    
    inline def setDriveCacheTypeUndefined: Self = StObject.set(x, "DriveCacheType", js.undefined)
    
    inline def setExportPath(value: ArchivePath): Self = StObject.set(x, "ExportPath", value.asInstanceOf[js.Any])
    
    inline def setExportPathUndefined: Self = StObject.set(x, "ExportPath", js.undefined)
    
    inline def setImportPath(value: ArchivePath): Self = StObject.set(x, "ImportPath", value.asInstanceOf[js.Any])
    
    inline def setImportPathUndefined: Self = StObject.set(x, "ImportPath", js.undefined)
    
    inline def setImportedFileChunkSize(value: Megabytes): Self = StObject.set(x, "ImportedFileChunkSize", value.asInstanceOf[js.Any])
    
    inline def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "ImportedFileChunkSize", js.undefined)
    
    inline def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "PerUnitStorageThroughput", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
