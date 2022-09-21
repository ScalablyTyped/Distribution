package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIngestionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the data ingestion.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * An ID for the ingestion.
    */
  var IngestionId: js.UndefOr[typings.awsSdk.quicksightMod.IngestionId] = js.undefined
  
  /**
    * The ingestion status.
    */
  var IngestionStatus: js.UndefOr[typings.awsSdk.quicksightMod.IngestionStatus] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object CreateIngestionResponse {
  
  inline def apply(): CreateIngestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIngestionResponse]
  }
  
  extension [Self <: CreateIngestionResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionIdUndefined: Self = StObject.set(x, "IngestionId", js.undefined)
    
    inline def setIngestionStatus(value: IngestionStatus): Self = StObject.set(x, "IngestionStatus", value.asInstanceOf[js.Any])
    
    inline def setIngestionStatusUndefined: Self = StObject.set(x, "IngestionStatus", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
