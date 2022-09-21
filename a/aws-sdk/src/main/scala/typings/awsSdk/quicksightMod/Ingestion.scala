package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ingestion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn
  
  /**
    * The time that this ingestion started.
    */
  var CreatedTime: js.Date
  
  /**
    * Error information for this ingestion.
    */
  var ErrorInfo: js.UndefOr[typings.awsSdk.quicksightMod.ErrorInfo] = js.undefined
  
  /**
    * Ingestion ID.
    */
  var IngestionId: js.UndefOr[typings.awsSdk.quicksightMod.IngestionId] = js.undefined
  
  /**
    * The size of the data ingested, in bytes.
    */
  var IngestionSizeInBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * Ingestion status.
    */
  var IngestionStatus: typings.awsSdk.quicksightMod.IngestionStatus
  
  /**
    * The time that this ingestion took, measured in seconds.
    */
  var IngestionTimeInSeconds: js.UndefOr[Long] = js.undefined
  
  var QueueInfo: js.UndefOr[typings.awsSdk.quicksightMod.QueueInfo] = js.undefined
  
  /**
    * Event source for this ingestion.
    */
  var RequestSource: js.UndefOr[IngestionRequestSource] = js.undefined
  
  /**
    * Type of this ingestion.
    */
  var RequestType: js.UndefOr[IngestionRequestType] = js.undefined
  
  var RowInfo: js.UndefOr[typings.awsSdk.quicksightMod.RowInfo] = js.undefined
}
object Ingestion {
  
  inline def apply(Arn: Arn, CreatedTime: js.Date, IngestionStatus: IngestionStatus): Ingestion = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], IngestionStatus = IngestionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingestion]
  }
  
  extension [Self <: Ingestion](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    inline def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionIdUndefined: Self = StObject.set(x, "IngestionId", js.undefined)
    
    inline def setIngestionSizeInBytes(value: Long): Self = StObject.set(x, "IngestionSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setIngestionSizeInBytesUndefined: Self = StObject.set(x, "IngestionSizeInBytes", js.undefined)
    
    inline def setIngestionStatus(value: IngestionStatus): Self = StObject.set(x, "IngestionStatus", value.asInstanceOf[js.Any])
    
    inline def setIngestionTimeInSeconds(value: Long): Self = StObject.set(x, "IngestionTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIngestionTimeInSecondsUndefined: Self = StObject.set(x, "IngestionTimeInSeconds", js.undefined)
    
    inline def setQueueInfo(value: QueueInfo): Self = StObject.set(x, "QueueInfo", value.asInstanceOf[js.Any])
    
    inline def setQueueInfoUndefined: Self = StObject.set(x, "QueueInfo", js.undefined)
    
    inline def setRequestSource(value: IngestionRequestSource): Self = StObject.set(x, "RequestSource", value.asInstanceOf[js.Any])
    
    inline def setRequestSourceUndefined: Self = StObject.set(x, "RequestSource", js.undefined)
    
    inline def setRequestType(value: IngestionRequestType): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "RequestType", js.undefined)
    
    inline def setRowInfo(value: RowInfo): Self = StObject.set(x, "RowInfo", value.asInstanceOf[js.Any])
    
    inline def setRowInfoUndefined: Self = StObject.set(x, "RowInfo", js.undefined)
  }
}
