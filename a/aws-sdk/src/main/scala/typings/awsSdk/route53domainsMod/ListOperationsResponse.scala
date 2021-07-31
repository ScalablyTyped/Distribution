package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsResponse extends StObject {
  
  /**
    * If there are more operations than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * Lists summaries of the operations.
    */
  var Operations: OperationSummaryList
}
object ListOperationsResponse {
  
  @scala.inline
  def apply(Operations: OperationSummaryList): ListOperationsResponse = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
  
  @scala.inline
  implicit class ListOperationsResponseMutableBuilder[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageMarker(value: PageMarker): Self = StObject.set(x, "NextPageMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageMarkerUndefined: Self = StObject.set(x, "NextPageMarker", js.undefined)
    
    @scala.inline
    def setOperations(value: OperationSummaryList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: OperationSummary*): Self = StObject.set(x, "Operations", js.Array(value :_*))
  }
}
