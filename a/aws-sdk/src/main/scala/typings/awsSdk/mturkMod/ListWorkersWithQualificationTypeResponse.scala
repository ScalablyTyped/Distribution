package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkersWithQualificationTypeResponse extends StObject {
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The list of Qualification elements returned by this call. 
    */
  var Qualifications: js.UndefOr[QualificationList] = js.undefined
}
object ListWorkersWithQualificationTypeResponse {
  
  @scala.inline
  def apply(): ListWorkersWithQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class ListWorkersWithQualificationTypeResponseMutableBuilder[Self <: ListWorkersWithQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
    
    @scala.inline
    def setQualifications(value: QualificationList): Self = StObject.set(x, "Qualifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationsUndefined: Self = StObject.set(x, "Qualifications", js.undefined)
    
    @scala.inline
    def setQualificationsVarargs(value: Qualification*): Self = StObject.set(x, "Qualifications", js.Array(value :_*))
  }
}
