package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemLustreConfiguration extends js.Object {
  /**
    *  (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with changes that occur in the linked S3 data repository. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the FSx file system.    NEW - AutoImport is on. New files in the linked data repository that do not currently exist in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    NEW_CHANGED - AutoImport is on. New files in the linked S3 data repository that do not currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository are also automatically imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    For more information, see Automatically import updates from your S3 bucket.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.native
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. For more information, see Working with backups.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    *  Choose SCRATCH_1 and SCRATCH_2 deployment types when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. Choose PERSISTENT_1 deployment type for longer-term storage and workloads and encryption of data in transit. To learn more about deployment types, see  FSx for Lustre Deployment Options. Encryption of data in-transit is automatically enabled when you access a SCRATCH_2 or PERSISTENT_1 file system from Amazon EC2 instances that support this feature. (Default = SCRATCH_1)  Encryption of data in-transit for SCRATCH_2 and PERSISTENT_1 deployment types is supported when accessed from supported instance types in supported AWS Regions. To learn more, Encrypting Data in Transit.
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.native
  /**
    * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed data is to be exported from your Amazon FSx for Lustre file system. If an ExportPath value is not provided, Amazon FSx sets a default export path, s3://import-bucket/FSxLustre[creation-timestamp]. The timestamp is in UTC format, for example s3://import-bucket/FSxLustre20181105T222312Z. The Amazon S3 export bucket must be the same as the import bucket specified by ImportPath. If you only specify a bucket name, such as s3://import-bucket, you get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a custom prefix in the export path, such as s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file system to that export prefix in the Amazon S3 bucket.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3 bucket you select. An example is s3://import-bucket/optional-prefix. If you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.native
  /**
    *  Required for the PERSISTENT_1 deployment type, describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 117 MB/s of ﬁle system throughput. You pay for the amount of throughput that you provision.  Valid values are 50, 100, 200.
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object CreateFileSystemLustreConfiguration {
  @scala.inline
  def apply(): CreateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
  }
  @scala.inline
  implicit class CreateFileSystemLustreConfigurationOps[Self <: CreateFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoImportPolicy(value: AutoImportPolicyType): Self = this.set("AutoImportPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoImportPolicy: Self = this.set("AutoImportPolicy", js.undefined)
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = this.set("AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticBackupRetentionDays: Self = this.set("AutomaticBackupRetentionDays", js.undefined)
    @scala.inline
    def setCopyTagsToBackups(value: Flag): Self = this.set("CopyTagsToBackups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToBackups: Self = this.set("CopyTagsToBackups", js.undefined)
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = this.set("DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyAutomaticBackupStartTime: Self = this.set("DailyAutomaticBackupStartTime", js.undefined)
    @scala.inline
    def setDeploymentType(value: LustreDeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentType: Self = this.set("DeploymentType", js.undefined)
    @scala.inline
    def setExportPath(value: ArchivePath): Self = this.set("ExportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportPath: Self = this.set("ExportPath", js.undefined)
    @scala.inline
    def setImportPath(value: ArchivePath): Self = this.set("ImportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportPath: Self = this.set("ImportPath", js.undefined)
    @scala.inline
    def setImportedFileChunkSize(value: Megabytes): Self = this.set("ImportedFileChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportedFileChunkSize: Self = this.set("ImportedFileChunkSize", js.undefined)
    @scala.inline
    def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = this.set("PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerUnitStorageThroughput: Self = this.set("PerUnitStorageThroughput", js.undefined)
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = this.set("WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("WeeklyMaintenanceStartTime", js.undefined)
  }
  
}

