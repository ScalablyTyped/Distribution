package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDescription extends StObject {
  
  /**
    * <p>The billable size of the table export.</p>
    */
  var BilledSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The client token that was provided for the export task. A client token makes calls to
    *                 <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple
    *             identical calls have the same effect as one single call.</p>
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The time at which the export task completed.</p>
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the table export.</p>
    */
  var ExportArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The format of the exported data. Valid values for <code>ExportFormat</code> are
    *                 <code>DYNAMODB_JSON</code> or <code>ION</code>.</p>
    */
  var ExportFormat: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportFormat | String] = js.undefined
  
  /**
    * <p>The name of the manifest file for the export task.</p>
    */
  var ExportManifest: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Export can be in one of the following states: IN_PROGRESS, COMPLETED, or
    *             FAILED.</p>
    */
  var ExportStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportStatus | String] = js.undefined
  
  /**
    * <p>Point in time from which table data was exported.</p>
    */
  var ExportTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Status code for the result of the failed export.</p>
    */
  var FailureCode: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Export failure reason description.</p>
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The number of items exported.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The name of the Amazon S3 bucket containing the export.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The ID of the Amazon Web Services account that owns the bucket containing the
    *             export.</p>
    */
  var S3BucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon S3 bucket prefix used as the file name and path of the exported
    *             snapshot.</p>
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Type of encryption used on the bucket where export data is stored. Valid values for
    *                 <code>S3SseAlgorithm</code> are:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>AES256</code> - server-side encryption with Amazon S3 managed
    *                     keys</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>KMS</code> - server-side encryption with KMS managed
    *                     keys</p>
    *             </li>
    *          </ul>
    */
  var S3SseAlgorithm: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.S3SseAlgorithm | String] = js.undefined
  
  /**
    * <p>The ID of the KMS managed key used to encrypt the S3 bucket where
    *             export data is stored (if applicable).</p>
    */
  var S3SseKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The time at which the export task began.</p>
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the table that was exported.</p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Unique ID of the table that was exported.</p>
    */
  var TableId: js.UndefOr[String] = js.undefined
}
object ExportDescription {
  
  inline def apply(): ExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDescription] (val x: Self) extends AnyVal {
    
    inline def setBilledSizeBytes(value: Double): Self = StObject.set(x, "BilledSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBilledSizeBytesUndefined: Self = StObject.set(x, "BilledSizeBytes", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setExportArn(value: String): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    inline def setExportFormat(value: ExportFormat | String): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    inline def setExportManifest(value: String): Self = StObject.set(x, "ExportManifest", value.asInstanceOf[js.Any])
    
    inline def setExportManifestUndefined: Self = StObject.set(x, "ExportManifest", js.undefined)
    
    inline def setExportStatus(value: ExportStatus | String): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    
    inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: String): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    inline def setS3SseAlgorithm(value: S3SseAlgorithm | String): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
    
    inline def setS3SseKmsKeyId(value: String): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
  }
}
