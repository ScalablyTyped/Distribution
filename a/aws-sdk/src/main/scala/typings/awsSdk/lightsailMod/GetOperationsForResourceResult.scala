package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationsForResourceResult extends StObject {
  
  /**
    * (Deprecated) Returns the number of pages of results that remain.  In releases prior to June 12, 2017, this parameter returned null by the API. It is now deprecated, and the API returns the next page token parameter instead. 
    */
  var nextPageCount: js.UndefOr[String] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetOperationsForResource request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object GetOperationsForResourceResult {
  
  inline def apply(): GetOperationsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationsForResourceResult]
  }
  
  extension [Self <: GetOperationsForResourceResult](x: Self) {
    
    inline def setNextPageCount(value: String): Self = StObject.set(x, "nextPageCount", value.asInstanceOf[js.Any])
    
    inline def setNextPageCountUndefined: Self = StObject.set(x, "nextPageCount", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
