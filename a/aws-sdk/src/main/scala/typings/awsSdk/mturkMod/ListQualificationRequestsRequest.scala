package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQualificationRequestsRequest extends StObject {
  
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
}
object ListQualificationRequestsRequest {
  
  @scala.inline
  def apply(): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
  
  @scala.inline
  implicit class ListQualificationRequestsRequestMutableBuilder[Self <: ListQualificationRequestsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeIdUndefined: Self = StObject.set(x, "QualificationTypeId", js.undefined)
  }
}
