package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTask extends StObject {
  
  /**
    * The data exported from the snapshot. Valid values are the following:    database - Export all the data from a specified database.    database.table table-name - Export a table of the snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB, and Aurora MySQL.    database.schema schema-name - Export a database schema of the snapshot. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.    database.schema.table table-name - Export a table of the database schema. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.  
    */
  var ExportOnly: js.UndefOr[StringList] = js.undefined
  
  /**
    * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the snapshot is exported to.
    */
  var ExportTaskIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The reason the export failed, if it failed.
    */
  var FailureCause: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The key identifier of the Amazon Web Services KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key identifier is its key ARN, key ID, alias ARN, or alias name. The IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The progress of the snapshot export task as a percentage.
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon S3 bucket that the snapshot is exported to.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
    */
  var SourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The progress status of the export task.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the snapshot export task completed.
    */
  var TaskEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the snapshot export task started.
    */
  var TaskStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total amount of data exported, in gigabytes.
    */
  var TotalExtractedDataInGB: js.UndefOr[Integer] = js.undefined
  
  /**
    * A warning about the snapshot export task.
    */
  var WarningMessage: js.UndefOr[String] = js.undefined
}
object ExportTask {
  
  inline def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  extension [Self <: ExportTask](x: Self) {
    
    inline def setExportOnly(value: StringList): Self = StObject.set(x, "ExportOnly", value.asInstanceOf[js.Any])
    
    inline def setExportOnlyUndefined: Self = StObject.set(x, "ExportOnly", js.undefined)
    
    inline def setExportOnlyVarargs(value: String*): Self = StObject.set(x, "ExportOnly", js.Array(value*))
    
    inline def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExportTaskIdentifierUndefined: Self = StObject.set(x, "ExportTaskIdentifier", js.undefined)
    
    inline def setFailureCause(value: String): Self = StObject.set(x, "FailureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "FailureCause", js.undefined)
    
    inline def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    inline def setSnapshotTime(value: js.Date): Self = StObject.set(x, "SnapshotTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTimeUndefined: Self = StObject.set(x, "SnapshotTime", js.undefined)
    
    inline def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskEndTime(value: js.Date): Self = StObject.set(x, "TaskEndTime", value.asInstanceOf[js.Any])
    
    inline def setTaskEndTimeUndefined: Self = StObject.set(x, "TaskEndTime", js.undefined)
    
    inline def setTaskStartTime(value: js.Date): Self = StObject.set(x, "TaskStartTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStartTimeUndefined: Self = StObject.set(x, "TaskStartTime", js.undefined)
    
    inline def setTotalExtractedDataInGB(value: Integer): Self = StObject.set(x, "TotalExtractedDataInGB", value.asInstanceOf[js.Any])
    
    inline def setTotalExtractedDataInGBUndefined: Self = StObject.set(x, "TotalExtractedDataInGB", js.undefined)
    
    inline def setWarningMessage(value: String): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
