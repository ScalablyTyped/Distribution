package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTask extends StObject {
  
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
  implicit class ExportTaskMutableBuilder[Self <: ExportTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportOnly(value: StringList): Self = StObject.set(x, "ExportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOnlyUndefined: Self = StObject.set(x, "ExportOnly", js.undefined)
    
    @scala.inline
    def setExportOnlyVarargs(value: String*): Self = StObject.set(x, "ExportOnly", js.Array(value :_*))
    
    @scala.inline
    def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskIdentifierUndefined: Self = StObject.set(x, "ExportTaskIdentifier", js.undefined)
    
    @scala.inline
    def setFailureCause(value: String): Self = StObject.set(x, "FailureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "FailureCause", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setSnapshotTime(value: TStamp): Self = StObject.set(x, "SnapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTimeUndefined: Self = StObject.set(x, "SnapshotTime", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskEndTime(value: TStamp): Self = StObject.set(x, "TaskEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskEndTimeUndefined: Self = StObject.set(x, "TaskEndTime", js.undefined)
    
    @scala.inline
    def setTaskStartTime(value: TStamp): Self = StObject.set(x, "TaskStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartTimeUndefined: Self = StObject.set(x, "TaskStartTime", js.undefined)
    
    @scala.inline
    def setTotalExtractedDataInGB(value: Integer): Self = StObject.set(x, "TotalExtractedDataInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalExtractedDataInGBUndefined: Self = StObject.set(x, "TotalExtractedDataInGB", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: String): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
