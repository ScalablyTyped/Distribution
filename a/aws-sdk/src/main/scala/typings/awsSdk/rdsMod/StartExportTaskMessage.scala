package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportTaskMessage extends js.Object {
  /**
    * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported. Valid values are the following:    database - Export all the data of the snapshot.    database.table [table-name] - Export a table of the snapshot.    database.schema [schema-name] - Export a database schema of the snapshot. This value isn't valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.    database.schema.table [table-name] - Export a table of the database schema. This value isn't valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.  
    */
  var ExportOnly: js.UndefOr[StringList] = js.native
  /**
    * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the snapshot is to be exported to. 
    */
  var ExportTaskIdentifier: String = js.native
  /**
    * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot. 
    */
  var IamRoleArn: String = js.native
  /**
    * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key. 
    */
  var KmsKeyId: String = js.native
  /**
    * The name of the Amazon S3 bucket to export the snapshot to.
    */
  var S3BucketName: String = js.native
  /**
    * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
    */
  var SourceArn: String = js.native
}

object StartExportTaskMessage {
  @scala.inline
  def apply(
    ExportTaskIdentifier: String,
    IamRoleArn: String,
    KmsKeyId: String,
    S3BucketName: String,
    SourceArn: String,
    ExportOnly: StringList = null,
    S3Prefix: String = null
  ): StartExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    if (ExportOnly != null) __obj.updateDynamic("ExportOnly")(ExportOnly.asInstanceOf[js.Any])
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportTaskMessage]
  }
}

