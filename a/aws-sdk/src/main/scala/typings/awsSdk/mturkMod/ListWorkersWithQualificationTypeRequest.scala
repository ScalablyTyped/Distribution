package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkersWithQualificationTypeRequest extends StObject {
  
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the Qualification type of the Qualifications to return.
    */
  var QualificationTypeId: EntityId = js.native
  
  /**
    *  The status of the Qualifications to return. Can be Granted | Revoked. 
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
}
object ListWorkersWithQualificationTypeRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId): ListWorkersWithQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
  }
  
  @scala.inline
  implicit class ListWorkersWithQualificationTypeRequestMutableBuilder[Self <: ListWorkersWithQualificationTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: QualificationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
