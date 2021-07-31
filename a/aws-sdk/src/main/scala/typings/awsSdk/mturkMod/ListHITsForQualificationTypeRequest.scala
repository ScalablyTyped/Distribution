package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHITsForQualificationTypeRequest extends StObject {
  
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The ID of the Qualification type to use when querying HITs. 
    */
  var QualificationTypeId: EntityId
}
object ListHITsForQualificationTypeRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId): ListHITsForQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
  }
  
  @scala.inline
  implicit class ListHITsForQualificationTypeRequestMutableBuilder[Self <: ListHITsForQualificationTypeRequest] (val x: Self) extends AnyVal {
    
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
  }
}
