package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperationsForResourceResult extends StObject {
  
  /**
    * (Deprecated) Returns the number of pages of results that remain.  In releases prior to June 12, 2017, this parameter returned null by the API. It is now deprecated, and the API returns the next page token parameter instead. 
    */
  var nextPageCount: js.UndefOr[String] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetOperationsForResource request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}
object GetOperationsForResourceResult {
  
  @scala.inline
  def apply(): GetOperationsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationsForResourceResult]
  }
  
  @scala.inline
  implicit class GetOperationsForResourceResultMutableBuilder[Self <: GetOperationsForResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageCount(value: String): Self = StObject.set(x, "nextPageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageCountUndefined: Self = StObject.set(x, "nextPageCount", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
