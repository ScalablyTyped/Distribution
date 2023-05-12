package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTableDescription extends StObject {
  
  /**
    *  The client token that was provided for the import task. Reusing the client token on retry makes a call to ImportTable idempotent. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ClientToken] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.CloudWatchLogGroupArn] = js.undefined
  
  /**
    *  The time at which the creation of the table associated with this import task completed. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The number of errors occurred on importing the source file into the target table. 
    */
  var ErrorCount: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ErrorCount] = js.undefined
  
  /**
    *  The error code corresponding to the failure that the import job ran into during execution. 
    */
  var FailureCode: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.FailureCode] = js.undefined
  
  /**
    *  The error message corresponding to the failure that the import job ran into during execution. 
    */
  var FailureMessage: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.FailureMessage] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) corresponding to the import request. 
    */
  var ImportArn: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ImportArn] = js.undefined
  
  /**
    *  The status of the import. 
    */
  var ImportStatus: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ImportStatus] = js.undefined
  
  /**
    *  The number of items successfully imported into the new table. 
    */
  var ImportedItemCount: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ImportedItemCount] = js.undefined
  
  /**
    *  The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or ZSTD. 
    */
  var InputCompressionType: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.InputCompressionType] = js.undefined
  
  /**
    *  The format of the source data going into the target table. 
    */
  var InputFormat: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.InputFormat] = js.undefined
  
  /**
    *  The format options for the data that was imported into the target table. There is one value, CsvOption. 
    */
  var InputFormatOptions: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.InputFormatOptions] = js.undefined
  
  /**
    *  The total number of items processed from the source file. 
    */
  var ProcessedItemCount: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ProcessedItemCount] = js.undefined
  
  /**
    *  The total size of data processed from the source file, in Bytes. 
    */
  var ProcessedSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    *  Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional) and bucket account owner ID (optional). 
    */
  var S3BucketSource: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.S3BucketSource] = js.undefined
  
  /**
    *  The time when this import task started. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) of the table being imported into. 
    */
  var TableArn: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableArn] = js.undefined
  
  /**
    *  The parameters for the new table that is being imported into. 
    */
  var TableCreationParameters: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableCreationParameters] = js.undefined
  
  /**
    *  The table id corresponding to the table created by import table process. 
    */
  var TableId: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableId] = js.undefined
}
object ImportTableDescription {
  
  inline def apply(): ImportTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTableDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTableDescription] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    
    inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setImportedItemCount(value: ImportedItemCount): Self = StObject.set(x, "ImportedItemCount", value.asInstanceOf[js.Any])
    
    inline def setImportedItemCountUndefined: Self = StObject.set(x, "ImportedItemCount", js.undefined)
    
    inline def setInputCompressionType(value: InputCompressionType): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
    
    inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setProcessedItemCount(value: ProcessedItemCount): Self = StObject.set(x, "ProcessedItemCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedItemCountUndefined: Self = StObject.set(x, "ProcessedItemCount", js.undefined)
    
    inline def setProcessedSizeBytes(value: Long): Self = StObject.set(x, "ProcessedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setProcessedSizeBytesUndefined: Self = StObject.set(x, "ProcessedSizeBytes", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
    
    inline def setTableCreationParametersUndefined: Self = StObject.set(x, "TableCreationParameters", js.undefined)
    
    inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
  }
}
