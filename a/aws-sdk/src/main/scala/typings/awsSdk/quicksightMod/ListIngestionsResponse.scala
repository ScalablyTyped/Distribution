package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIngestionsResponse extends StObject {
  
  /**
    * A list of the ingestions.
    */
  var Ingestions: js.UndefOr[typings.awsSdk.quicksightMod.Ingestions] = js.native
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListIngestionsResponse {
  
  @scala.inline
  def apply(): ListIngestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIngestionsResponse]
  }
  
  @scala.inline
  implicit class ListIngestionsResponseMutableBuilder[Self <: ListIngestionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngestions(value: Ingestions): Self = StObject.set(x, "Ingestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionsUndefined: Self = StObject.set(x, "Ingestions", js.undefined)
    
    @scala.inline
    def setIngestionsVarargs(value: Ingestion*): Self = StObject.set(x, "Ingestions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: java.lang.String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: java.lang.String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
