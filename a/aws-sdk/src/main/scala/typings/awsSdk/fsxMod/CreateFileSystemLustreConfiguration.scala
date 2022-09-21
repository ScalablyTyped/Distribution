package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemLustreConfiguration extends StObject {
  
  /**
    *  (Optional) Available with Scratch and Persistent_1 deployment types. When you create your file system, your existing S3 objects appear as file and directory listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or changed objects after choosing this option.    NEW - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added to the linked S3 bucket that do not currently exist in the FSx file system.     NEW_CHANGED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose this option.    NEW_CHANGED_DELETED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket, any existing objects that are changed in the S3 bucket, and any objects that were deleted in the S3 bucket.   For more information, see  Automatically import updates from your S3 bucket.  This parameter is not supported for file systems with the Persistent_2 deployment type. Instead, use CreateDataRepositoryAssociation to create a data repository association to link your Lustre file system to a data repository. 
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * (Optional) Not available for use with file systems that are linked to a data repository. A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false. If CopyTagsToBackups is set to true, all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any backup-specific tags. If CopyTagsToBackups is set to true and you specify one or more backup tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. (Default = false) For more information, see  Working with backups in the Amazon FSx for Lustre User Guide.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Sets the data compression configuration for the file system. DataCompressionType can have the following values:    NONE - (Default) Data compression is turned off when the file system is created.    LZ4 - Data compression is turned on with the LZ4 algorithm.   For more information, see Lustre data compression in the Amazon FSx for Lustre User Guide.
    */
  var DataCompressionType: js.UndefOr[typings.awsSdk.fsxMod.DataCompressionType] = js.undefined
  
  /**
    * (Optional) Choose SCRATCH_1 and SCRATCH_2 deployment types when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. Choose PERSISTENT_1 for longer-term storage and for throughput-focused workloads that aren’t latency-sensitive. PERSISTENT_1 supports encryption of data in transit, and is available in all Amazon Web Services Regions in which FSx for Lustre is available. Choose PERSISTENT_2 for longer-term storage and for latency-sensitive workloads that require the highest levels of IOPS/throughput. PERSISTENT_2 supports SSD storage, and offers higher PerUnitStorageThroughput (up to 1000 MB/s/TiB). PERSISTENT_2 is available in a limited number of Amazon Web Services Regions. For more information, and an up-to-date list of Amazon Web Services Regions in which PERSISTENT_2 is available, see File system deployment options for FSx for Lustre in the Amazon FSx for Lustre User Guide.  If you choose PERSISTENT_2, and you set FileSystemTypeVersion to 2.10, the CreateFileSystem operation fails.  Encryption of data in transit is automatically turned on when you access SCRATCH_2, PERSISTENT_1 and PERSISTENT_2 file systems from Amazon EC2 instances that support automatic encryption in the Amazon Web Services Regions where they are available. For more information about encryption in transit for FSx for Lustre file systems, see Encrypting data in transit in the Amazon FSx for Lustre User Guide.  (Default = SCRATCH_1)
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined
  
  /**
    * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This parameter is required when storage type is HDD. Set this property to READ to improve the performance for frequently accessed files by caching up to 20% of the total storage capacity of the file system. This parameter is required when StorageType is set to HDD.
    */
  var DriveCacheType: js.UndefOr[typings.awsSdk.fsxMod.DriveCacheType] = js.undefined
  
  /**
    * (Optional) Available with Scratch and Persistent_1 deployment types. Specifies the path in the Amazon S3 bucket where the root of your Amazon FSx file system is exported. The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed data is to be exported from your Amazon FSx for Lustre file system. If an ExportPath value is not provided, Amazon FSx sets a default export path, s3://import-bucket/FSxLustre[creation-timestamp]. The timestamp is in UTC format, for example s3://import-bucket/FSxLustre20181105T222312Z. The Amazon S3 export bucket must be the same as the import bucket specified by ImportPath. If you specify only a bucket name, such as s3://import-bucket, you get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a custom prefix in the export path, such as s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file system to that export prefix in the Amazon S3 bucket.  This parameter is not supported for file systems with the Persistent_2 deployment type. Instead, use CreateDataRepositoryAssociation to create a data repository association to link your Lustre file system to a data repository. 
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3 bucket you select. An example is s3://import-bucket/optional-prefix. If you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.  This parameter is not supported for file systems with the Persistent_2 deployment type. Instead, use CreateDataRepositoryAssociation to create a data repository association to link your Lustre file system to a data repository. 
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB. This parameter is not supported for file systems with the Persistent_2 deployment type. Instead, use CreateDataRepositoryAssociation to create a data repository association to link your Lustre file system to a data repository.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    * The Lustre logging configuration used when creating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs.
    */
  var LogConfiguration: js.UndefOr[LustreLogCreateConfiguration] = js.undefined
  
  /**
    * Required with PERSISTENT_1 and PERSISTENT_2 deployment types, provisions the amount of read and write throughput for each 1 tebibyte (TiB) of file system storage capacity, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4-TiB ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of throughput that you provision.  Valid values:   For PERSISTENT_1 SSD storage: 50, 100, 200 MB/s/TiB.   For PERSISTENT_1 HDD storage: 12, 40 MB/s/TiB.   For PERSISTENT_2 SSD storage: 125, 250, 500, 1000 MB/s/TiB.  
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.undefined
  
  /**
    * The Lustre root squash configuration used when creating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user.
    */
  var RootSquashConfiguration: js.UndefOr[LustreRootSquashConfiguration] = js.undefined
  
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
    
    inline def setDataCompressionType(value: DataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
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
    
    inline def setLogConfiguration(value: LustreLogCreateConfiguration): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "PerUnitStorageThroughput", js.undefined)
    
    inline def setRootSquashConfiguration(value: LustreRootSquashConfiguration): Self = StObject.set(x, "RootSquashConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRootSquashConfigurationUndefined: Self = StObject.set(x, "RootSquashConfiguration", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
