package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDescription extends js.Object {
  
  /**
    * The billable size of the table export.
    */
  var BilledSizeBytes: js.UndefOr[typings.awsSdk.dynamodbMod.BilledSizeBytes] = js.native
  
  /**
    * The client token that was provided for the export task. A client token makes calls to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.dynamodbMod.ClientToken] = js.native
  
  /**
    * The time at which the export task completed.
    */
  var EndTime: js.UndefOr[ExportEndTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the table export.
    */
  var ExportArn: js.UndefOr[typings.awsSdk.dynamodbMod.ExportArn] = js.native
  
  /**
    * The format of the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
    */
  var ExportFormat: js.UndefOr[typings.awsSdk.dynamodbMod.ExportFormat] = js.native
  
  /**
    * The name of the manifest file for the export task.
    */
  var ExportManifest: js.UndefOr[typings.awsSdk.dynamodbMod.ExportManifest] = js.native
  
  /**
    * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
    */
  var ExportStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ExportStatus] = js.native
  
  /**
    * Point in time from which table data was exported.
    */
  var ExportTime: js.UndefOr[typings.awsSdk.dynamodbMod.ExportTime] = js.native
  
  /**
    * Status code for the result of the failed export.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.dynamodbMod.FailureCode] = js.native
  
  /**
    * Export failure reason description.
    */
  var FailureMessage: js.UndefOr[typings.awsSdk.dynamodbMod.FailureMessage] = js.native
  
  /**
    * The number of items exported.
    */
  var ItemCount: js.UndefOr[typings.awsSdk.dynamodbMod.ItemCount] = js.native
  
  /**
    * The name of the Amazon S3 bucket containing the export.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.dynamodbMod.S3Bucket] = js.native
  
  /**
    * The ID of the AWS account that owns the bucket containing the export.
    */
  var S3BucketOwner: js.UndefOr[typings.awsSdk.dynamodbMod.S3BucketOwner] = js.native
  
  /**
    * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[typings.awsSdk.dynamodbMod.S3Prefix] = js.native
  
  /**
    * Type of encryption used on the bucket where export data is stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with AWS KMS managed keys  
    */
  var S3SseAlgorithm: js.UndefOr[typings.awsSdk.dynamodbMod.S3SseAlgorithm] = js.native
  
  /**
    * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
    */
  var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.S3SseKmsKeyId] = js.native
  
  /**
    * The time at which the export task began.
    */
  var StartTime: js.UndefOr[ExportStartTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the table that was exported.
    */
  var TableArn: js.UndefOr[typings.awsSdk.dynamodbMod.TableArn] = js.native
  
  /**
    * Unique ID of the table that was exported.
    */
  var TableId: js.UndefOr[typings.awsSdk.dynamodbMod.TableId] = js.native
}
object ExportDescription {
  
  @scala.inline
  def apply(): ExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDescription]
  }
  
  @scala.inline
  implicit class ExportDescriptionOps[Self <: ExportDescription] (val x: Self) extends AnyVal {
    
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
    def setBilledSizeBytes(value: BilledSizeBytes): Self = this.set("BilledSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilledSizeBytes: Self = this.set("BilledSizeBytes", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setEndTime(value: ExportEndTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setExportArn(value: ExportArn): Self = this.set("ExportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportArn: Self = this.set("ExportArn", js.undefined)
    
    @scala.inline
    def setExportFormat(value: ExportFormat): Self = this.set("ExportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFormat: Self = this.set("ExportFormat", js.undefined)
    
    @scala.inline
    def setExportManifest(value: ExportManifest): Self = this.set("ExportManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportManifest: Self = this.set("ExportManifest", js.undefined)
    
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = this.set("ExportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportStatus: Self = this.set("ExportStatus", js.undefined)
    
    @scala.inline
    def setExportTime(value: ExportTime): Self = this.set("ExportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTime: Self = this.set("ExportTime", js.undefined)
    
    @scala.inline
    def setFailureCode(value: FailureCode): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: FailureMessage): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
    
    @scala.inline
    def setItemCount(value: ItemCount): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3BucketOwner(value: S3BucketOwner): Self = this.set("S3BucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketOwner: Self = this.set("S3BucketOwner", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: S3Prefix): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Prefix: Self = this.set("S3Prefix", js.undefined)
    
    @scala.inline
    def setS3SseAlgorithm(value: S3SseAlgorithm): Self = this.set("S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3SseAlgorithm: Self = this.set("S3SseAlgorithm", js.undefined)
    
    @scala.inline
    def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = this.set("S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3SseKmsKeyId: Self = this.set("S3SseKmsKeyId", js.undefined)
    
    @scala.inline
    def setStartTime(value: ExportStartTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    
    @scala.inline
    def setTableId(value: TableId): Self = this.set("TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("TableId", js.undefined)
  }
}
