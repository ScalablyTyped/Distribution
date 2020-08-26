package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryConfiguration extends js.Object {
  /**
    * Describes the file system's linked S3 data repository's AutoImportPolicy. The AutoImportPolicy configures how your FSx for Lustre file system automatically updates its contents with changes that occur in the linked S3 data repository. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the FSx file system.    NEW - AutoImport is on. New files in the linked data repository that do not currently exist in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    NEW_CHANGED - AutoImport is on. New files in the linked S3 data repository that do not currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository are also automatically imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    For more information, see Automatically import updates from your S3 bucket.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.native
  /**
    * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file system files in S3.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.native
  var FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.native
  /**
    * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your FSx for Lustre file system, for example s3://import-bucket/optional-prefix. If a prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.native
  /**
    * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository. The lifecycle can have the following values:    CREATING - The data repository configuration between the FSx file system and the linked S3 data repository is being created. The data repository is unavailable.    AVAILABLE - The data repository is available for use.    MISCONFIGURED - Amazon FSx cannot automatically import updates from the S3 bucket until the data repository configuration is corrected. For more information, see Troubleshooting a Misconfigured linked S3 bucket.     UPDATING - The data repository is undergoing a customer initiated update and availability may be impacted.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.native
}

object DataRepositoryConfiguration {
  @scala.inline
  def apply(): DataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryConfiguration]
  }
  @scala.inline
  implicit class DataRepositoryConfigurationOps[Self <: DataRepositoryConfiguration] (val x: Self) extends AnyVal {
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
    def setExportPath(value: ArchivePath): Self = this.set("ExportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportPath: Self = this.set("ExportPath", js.undefined)
    @scala.inline
    def setFailureDetails(value: DataRepositoryFailureDetails): Self = this.set("FailureDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDetails: Self = this.set("FailureDetails", js.undefined)
    @scala.inline
    def setImportPath(value: ArchivePath): Self = this.set("ImportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportPath: Self = this.set("ImportPath", js.undefined)
    @scala.inline
    def setImportedFileChunkSize(value: Megabytes): Self = this.set("ImportedFileChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportedFileChunkSize: Self = this.set("ImportedFileChunkSize", js.undefined)
    @scala.inline
    def setLifecycle(value: DataRepositoryLifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
  }
  
}

