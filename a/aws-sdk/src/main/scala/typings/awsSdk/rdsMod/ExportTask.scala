package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTask extends js.Object {
  
  /**
    * The data exported from the snapshot. Valid values are the following:    database - Export all the data from a specified database.    database.table table-name - Export a table of the snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB, and Aurora MySQL.    database.schema schema-name - Export a database schema of the snapshot. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.    database.schema.table table-name - Export a table of the database schema. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.  
    */
  var ExportOnly: js.UndefOr[StringList] = js.native
  
  /**
    * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the snapshot is exported to. 
    */
  var ExportTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The reason the export failed, if it failed.
    */
  var FailureCause: js.UndefOr[String] = js.native
  
  /**
    * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot. 
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The progress of the snapshot export task as a percentage.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon S3 bucket that the snapshot is exported to.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[String] = js.native
  
  /**
    * The time that the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
    */
  var SourceArn: js.UndefOr[String] = js.native
  
  /**
    * The progress status of the export task.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The time that the snapshot export task completed.
    */
  var TaskEndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The time that the snapshot export task started.
    */
  var TaskStartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The total amount of data exported, in gigabytes.
    */
  var TotalExtractedDataInGB: js.UndefOr[Integer] = js.native
  
  /**
    * A warning about the snapshot export task.
    */
  var WarningMessage: js.UndefOr[String] = js.native
}
object ExportTask {
  
  @scala.inline
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  @scala.inline
  implicit class ExportTaskOps[Self <: ExportTask] (val x: Self) extends AnyVal {
    
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
    def setExportOnlyVarargs(value: String*): Self = this.set("ExportOnly", js.Array(value :_*))
    
    @scala.inline
    def setExportOnly(value: StringList): Self = this.set("ExportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportOnly: Self = this.set("ExportOnly", js.undefined)
    
    @scala.inline
    def setExportTaskIdentifier(value: String): Self = this.set("ExportTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTaskIdentifier: Self = this.set("ExportTaskIdentifier", js.undefined)
    
    @scala.inline
    def setFailureCause(value: String): Self = this.set("FailureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCause: Self = this.set("FailureCause", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: Integer): Self = this.set("PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentProgress: Self = this.set("PercentProgress", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: String): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Prefix: Self = this.set("S3Prefix", js.undefined)
    
    @scala.inline
    def setSnapshotTime(value: TStamp): Self = this.set("SnapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotTime: Self = this.set("SnapshotTime", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTaskEndTime(value: TStamp): Self = this.set("TaskEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskEndTime: Self = this.set("TaskEndTime", js.undefined)
    
    @scala.inline
    def setTaskStartTime(value: TStamp): Self = this.set("TaskStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskStartTime: Self = this.set("TaskStartTime", js.undefined)
    
    @scala.inline
    def setTotalExtractedDataInGB(value: Integer): Self = this.set("TotalExtractedDataInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalExtractedDataInGB: Self = this.set("TotalExtractedDataInGB", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: String): Self = this.set("WarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningMessage: Self = this.set("WarningMessage", js.undefined)
  }
}
