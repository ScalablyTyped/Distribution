package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIngestionResponse extends StObject {
  
  /**
    * Information about the ingestion.
    */
  var Ingestion: js.UndefOr[typings.awsSdk.quicksightMod.Ingestion] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeIngestionResponse {
  
  inline def apply(): DescribeIngestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIngestionResponse]
  }
  
  extension [Self <: DescribeIngestionResponse](x: Self) {
    
    inline def setIngestion(value: Ingestion): Self = StObject.set(x, "Ingestion", value.asInstanceOf[js.Any])
    
    inline def setIngestionUndefined: Self = StObject.set(x, "Ingestion", js.undefined)
    
    inline def setRequestId(value: java.lang.String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
