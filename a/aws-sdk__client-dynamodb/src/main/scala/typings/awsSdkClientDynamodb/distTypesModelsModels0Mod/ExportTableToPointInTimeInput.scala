package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTableToPointInTimeInput extends StObject {
  
  /**
    * <p>Providing a <code>ClientToken</code> makes the call to
    *                 <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple
    *             identical calls have the same effect as one single call.</p>
    *          <p>A client token is valid for 8 hours after the first request that uses it is completed.
    *             After 8 hours, any request with the same client token is treated as a new request. Do
    *             not resubmit the same request with the same client token for more than 8 hours, or the
    *             result might not be idempotent.</p>
    *          <p>If you submit a request with the same client token but a change in other parameters
    *             within the 8-hour idempotency window, DynamoDB returns an
    *                 <code>ImportConflictException</code>.</p>
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The format for the exported data. Valid values for <code>ExportFormat</code> are
    *                 <code>DYNAMODB_JSON</code> or <code>ION</code>.</p>
    */
  var ExportFormat: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportFormat | String] = js.undefined
  
  /**
    * <p>Time in the past from which to export table data, counted in seconds from the start of
    *             the Unix epoch. The table export will be a snapshot of the table's state at this point
    *             in time.</p>
    */
  var ExportTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The name of the Amazon S3 bucket to export the snapshot to.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The ID of the Amazon Web Services account that owns the bucket the export will be
    *             stored in.</p>
    */
  var S3BucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon S3 bucket prefix to use as the file name and path of the exported
    *             snapshot.</p>
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Type of encryption used on the bucket where export data will be stored. Valid values
    *             for <code>S3SseAlgorithm</code> are:</p>
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
    *             export data will be stored (if applicable).</p>
    */
  var S3SseKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) associated with the table to export.</p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
}
object ExportTableToPointInTimeInput {
  
  inline def apply(): ExportTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTableToPointInTimeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTableToPointInTimeInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExportFormat(value: ExportFormat | String): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
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
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}
