package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemLustreConfiguration extends js.Object {
  /**
    * (Optional) Choose SCRATCH_1 and SCRATCH_2 deployment types when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. Choose PERSISTENT_1 deployment type for longer-term storage and workloads and encryption of data in transit. To learn more about deployment types, see  FSx for Lustre Deployment Options. Encryption of data in-transit is automatically enabled when you access a SCRATCH_2 or PERSISTENT_1 file system from Amazon EC2 instances that support this feature. (Default = SCRATCH_1)  Encryption of data in-transit for SCRATCH_2 and PERSISTENT_1 deployment types is supported when accessed from supported instance types in supported AWS Regions. To learn more, Encrypting Data in Transit.
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
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object CreateFileSystemLustreConfiguration {
  @scala.inline
  def apply(
    DeploymentType: LustreDeploymentType = null,
    ExportPath: ArchivePath = null,
    ImportPath: ArchivePath = null,
    ImportedFileChunkSize: Int | Double = null,
    PerUnitStorageThroughput: Int | Double = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): CreateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (ExportPath != null) __obj.updateDynamic("ExportPath")(ExportPath.asInstanceOf[js.Any])
    if (ImportPath != null) __obj.updateDynamic("ImportPath")(ImportPath.asInstanceOf[js.Any])
    if (ImportedFileChunkSize != null) __obj.updateDynamic("ImportedFileChunkSize")(ImportedFileChunkSize.asInstanceOf[js.Any])
    if (PerUnitStorageThroughput != null) __obj.updateDynamic("PerUnitStorageThroughput")(PerUnitStorageThroughput.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
  }
}

