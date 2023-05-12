package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSummary extends StObject {
  
  /**
    * <p> The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this
    *             import task. </p>
    */
  var CloudWatchLogGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The time at which this import task ended. (Does this include the successful complete
    *             creation of the table it was imported to?) </p>
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p> The Amazon Resource Number (ARN) corresponding to the import request. </p>
    */
  var ImportArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The status of the import operation. </p>
    */
  var ImportStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ImportStatus | String] = js.undefined
  
  /**
    * <p> The format of the source data. Valid values are <code>CSV</code>,
    *                 <code>DYNAMODB_JSON</code> or <code>ION</code>.</p>
    */
  var InputFormat: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormat | String] = js.undefined
  
  /**
    * <p> The path and S3 bucket of the source file that is being imported. This includes the
    *             S3Bucket (required), S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is
    *             owned by the requester). </p>
    */
  var S3BucketSource: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.S3BucketSource] = js.undefined
  
  /**
    * <p> The time at which this import task began. </p>
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p> The Amazon Resource Number (ARN) of the table being imported into. </p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
}
object ImportSummary {
  
  inline def apply(): ImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportSummary] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setImportArn(value: String): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    
    inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
    
    inline def setImportStatus(value: ImportStatus | String): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setInputFormat(value: InputFormat | String): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}
