package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTableToPointInTimeInput extends StObject {
  
  /**
    * Providing a ClientToken makes the call to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.dynamodbMod.ClientToken] = js.native
  
  /**
    * The format for the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
    */
  var ExportFormat: js.UndefOr[typings.awsSdk.dynamodbMod.ExportFormat] = js.native
  
  /**
    * Time in the past from which to export table data. The table export will be a snapshot of the table's state at this point in time.
    */
  var ExportTime: js.UndefOr[typings.awsSdk.dynamodbMod.ExportTime] = js.native
  
  /**
    * The name of the Amazon S3 bucket to export the snapshot to.
    */
  var S3Bucket: typings.awsSdk.dynamodbMod.S3Bucket = js.native
  
  /**
    * The ID of the AWS account that owns the bucket the export will be stored in.
    */
  var S3BucketOwner: js.UndefOr[typings.awsSdk.dynamodbMod.S3BucketOwner] = js.native
  
  /**
    * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[typings.awsSdk.dynamodbMod.S3Prefix] = js.native
  
  /**
    * Type of encryption used on the bucket where export data will be stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with AWS KMS managed keys  
    */
  var S3SseAlgorithm: js.UndefOr[typings.awsSdk.dynamodbMod.S3SseAlgorithm] = js.native
  
  /**
    * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
    */
  var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.S3SseKmsKeyId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the table to export.
    */
  var TableArn: typings.awsSdk.dynamodbMod.TableArn = js.native
}
object ExportTableToPointInTimeInput {
  
  @scala.inline
  def apply(S3Bucket: S3Bucket, TableArn: TableArn): ExportTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTableToPointInTimeInput]
  }
  
  @scala.inline
  implicit class ExportTableToPointInTimeInputMutableBuilder[Self <: ExportTableToPointInTimeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    @scala.inline
    def setExportTime(value: ExportTime): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
    
    @scala.inline
    def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
  }
}
