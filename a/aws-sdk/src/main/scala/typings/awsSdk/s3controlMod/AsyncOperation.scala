package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncOperation extends StObject {
  
  /**
    * The time that the request was sent to the service.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The specific operation for the asynchronous request.
    */
  var Operation: js.UndefOr[AsyncOperationName] = js.undefined
  
  /**
    * The parameters associated with the request.
    */
  var RequestParameters: js.UndefOr[AsyncRequestParameters] = js.undefined
  
  /**
    * The current status of the request.
    */
  var RequestStatus: js.UndefOr[AsyncRequestStatus] = js.undefined
  
  /**
    * The request token associated with the request.
    */
  var RequestTokenARN: js.UndefOr[AsyncRequestTokenARN] = js.undefined
  
  /**
    * The details of the response.
    */
  var ResponseDetails: js.UndefOr[AsyncResponseDetails] = js.undefined
}
object AsyncOperation {
  
  inline def apply(): AsyncOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOperation]
  }
  
  extension [Self <: AsyncOperation](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOperation(value: AsyncOperationName): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setRequestParameters(value: AsyncRequestParameters): Self = StObject.set(x, "RequestParameters", value.asInstanceOf[js.Any])
    
    inline def setRequestParametersUndefined: Self = StObject.set(x, "RequestParameters", js.undefined)
    
    inline def setRequestStatus(value: AsyncRequestStatus): Self = StObject.set(x, "RequestStatus", value.asInstanceOf[js.Any])
    
    inline def setRequestStatusUndefined: Self = StObject.set(x, "RequestStatus", js.undefined)
    
    inline def setRequestTokenARN(value: AsyncRequestTokenARN): Self = StObject.set(x, "RequestTokenARN", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenARNUndefined: Self = StObject.set(x, "RequestTokenARN", js.undefined)
    
    inline def setResponseDetails(value: AsyncResponseDetails): Self = StObject.set(x, "ResponseDetails", value.asInstanceOf[js.Any])
    
    inline def setResponseDetailsUndefined: Self = StObject.set(x, "ResponseDetails", js.undefined)
  }
}
