package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ExportOnly: StringList = null,
    ExportTaskIdentifier: String = null,
    FailureCause: String = null,
    IamRoleArn: String = null,
    KmsKeyId: String = null,
    PercentProgress: Int | scala.Double = null,
    S3Bucket: String = null,
    S3Prefix: String = null,
    SnapshotTime: TStamp = null,
    SourceArn: String = null,
    Status: String = null,
    TaskEndTime: TStamp = null,
    TaskStartTime: TStamp = null,
    TotalExtractedDataInGB: Int | scala.Double = null,
    WarningMessage: String = null
  ): ExportTask = {
    val __obj = js.Dynamic.literal()
    if (ExportOnly != null) __obj.updateDynamic("ExportOnly")(ExportOnly.asInstanceOf[js.Any])
    if (ExportTaskIdentifier != null) __obj.updateDynamic("ExportTaskIdentifier")(ExportTaskIdentifier.asInstanceOf[js.Any])
    if (FailureCause != null) __obj.updateDynamic("FailureCause")(FailureCause.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    if (SnapshotTime != null) __obj.updateDynamic("SnapshotTime")(SnapshotTime.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskEndTime != null) __obj.updateDynamic("TaskEndTime")(TaskEndTime.asInstanceOf[js.Any])
    if (TaskStartTime != null) __obj.updateDynamic("TaskStartTime")(TaskStartTime.asInstanceOf[js.Any])
    if (TotalExtractedDataInGB != null) __obj.updateDynamic("TotalExtractedDataInGB")(TotalExtractedDataInGB.asInstanceOf[js.Any])
    if (WarningMessage != null) __obj.updateDynamic("WarningMessage")(WarningMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTask]
  }
}

