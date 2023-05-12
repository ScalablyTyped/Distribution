package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTableDescription extends StObject {
  
  /**
    * <p> The client token that was provided for the import task. Reusing the client token on
    *             retry makes a call to <code>ImportTable</code> idempotent. </p>
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the
    *             target table. </p>
    */
  var CloudWatchLogGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The time at which the creation of the table associated with this import task
    *             completed. </p>
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p> The number of errors occurred on importing the source file into the target table.
    *         </p>
    */
  var ErrorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> The error code corresponding to the failure that the import job ran into during
    *             execution. </p>
    */
  var FailureCode: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The error message corresponding to the failure that the import job ran into during
    *             execution. </p>
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The Amazon Resource Number (ARN) corresponding to the import request.
    *             </p>
    */
  var ImportArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The status of the import. </p>
    */
  var ImportStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ImportStatus | String] = js.undefined
  
  /**
    * <p> The number of items successfully imported into the new table. </p>
    */
  var ImportedItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> The compression options for the data that has been imported into the target table.
    *             The values are NONE, GZIP, or ZSTD. </p>
    */
  var InputCompressionType: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputCompressionType | String
  ] = js.undefined
  
  /**
    * <p> The format of the source data going into the target table.
    *             </p>
    */
  var InputFormat: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormat | String] = js.undefined
  
  /**
    * <p> The format options for the data that was imported into the target table. There is one
    *             value, CsvOption. </p>
    */
  var InputFormatOptions: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormatOptions] = js.undefined
  
  /**
    * <p> The total number of items processed from the source file. </p>
    */
  var ProcessedItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> The total size of data processed from the source file, in Bytes. </p>
    */
  var ProcessedSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> Values for the S3 bucket the source file is imported from. Includes bucket name
    *             (required), key prefix (optional) and bucket account owner ID (optional). </p>
    */
  var S3BucketSource: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.S3BucketSource] = js.undefined
  
  /**
    * <p> The time when this import task started. </p>
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p> The Amazon Resource Number (ARN) of the table being imported into.
    *             </p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The parameters for the new table that is being imported into. </p>
    */
  var TableCreationParameters: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableCreationParameters] = js.undefined
  
  /**
    * <p> The table id corresponding to the table created by import table process.
    *             </p>
    */
  var TableId: js.UndefOr[String] = js.undefined
}
object ImportTableDescription {
  
  inline def apply(): ImportTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTableDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTableDescription] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCloudWatchLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setImportArn(value: String): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    
    inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
    
    inline def setImportStatus(value: ImportStatus | String): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setImportedItemCount(value: Double): Self = StObject.set(x, "ImportedItemCount", value.asInstanceOf[js.Any])
    
    inline def setImportedItemCountUndefined: Self = StObject.set(x, "ImportedItemCount", js.undefined)
    
    inline def setInputCompressionType(value: InputCompressionType | String): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
    
    inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
    
    inline def setInputFormat(value: InputFormat | String): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setProcessedItemCount(value: Double): Self = StObject.set(x, "ProcessedItemCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedItemCountUndefined: Self = StObject.set(x, "ProcessedItemCount", js.undefined)
    
    inline def setProcessedSizeBytes(value: Double): Self = StObject.set(x, "ProcessedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setProcessedSizeBytesUndefined: Self = StObject.set(x, "ProcessedSizeBytes", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
    
    inline def setTableCreationParametersUndefined: Self = StObject.set(x, "TableCreationParameters", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
  }
}
