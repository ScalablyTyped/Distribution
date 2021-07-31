package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportTaskMessage extends StObject {
  
  /**
    * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported. Valid values are the following:    database - Export all the data from a specified database.    database.table table-name - Export a table of the snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB, and Aurora MySQL.    database.schema schema-name - Export a database schema of the snapshot. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.    database.schema.table table-name - Export a table of the database schema. This format is valid only for RDS for PostgreSQL and Aurora PostgreSQL.  
    */
  var ExportOnly: js.UndefOr[StringList] = js.undefined
  
  /**
    * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the snapshot is to be exported to. 
    */
  var ExportTaskIdentifier: String
  
  /**
    * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot. 
    */
  var IamRoleArn: String
  
  /**
    * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The caller of this operation must be authorized to execute the following operations. These can be set in the KMS key policy:    GrantOperation.Encrypt   GrantOperation.Decrypt   GrantOperation.GenerateDataKey   GrantOperation.GenerateDataKeyWithoutPlaintext   GrantOperation.ReEncryptFrom   GrantOperation.ReEncryptTo   GrantOperation.CreateGrant   GrantOperation.DescribeKey   GrantOperation.RetireGrant  
    */
  var KmsKeyId: String
  
  /**
    * The name of the Amazon S3 bucket to export the snapshot to.
    */
  var S3BucketName: String
  
  /**
    * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
    */
  var SourceArn: String
}
object StartExportTaskMessage {
  
  @scala.inline
  def apply(
    ExportTaskIdentifier: String,
    IamRoleArn: String,
    KmsKeyId: String,
    S3BucketName: String,
    SourceArn: String
  ): StartExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportTaskMessage]
  }
  
  @scala.inline
  implicit class StartExportTaskMessageMutableBuilder[Self <: StartExportTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportOnly(value: StringList): Self = StObject.set(x, "ExportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOnlyUndefined: Self = StObject.set(x, "ExportOnly", js.undefined)
    
    @scala.inline
    def setExportOnlyVarargs(value: String*): Self = StObject.set(x, "ExportOnly", js.Array(value :_*))
    
    @scala.inline
    def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
