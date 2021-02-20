package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQualificationTypesResponse extends StObject {
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of Qualification types on this page in the filtered results list, equivalent to the number of types this operation returns. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
  
  /**
    *  The list of QualificationType elements returned by the query. 
    */
  var QualificationTypes: js.UndefOr[QualificationTypeList] = js.native
}
object ListQualificationTypesResponse {
  
  @scala.inline
  def apply(): ListQualificationTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationTypesResponse]
  }
  
  @scala.inline
  implicit class ListQualificationTypesResponseMutableBuilder[Self <: ListQualificationTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
    
    @scala.inline
    def setQualificationTypes(value: QualificationTypeList): Self = StObject.set(x, "QualificationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypesUndefined: Self = StObject.set(x, "QualificationTypes", js.undefined)
    
    @scala.inline
    def setQualificationTypesVarargs(value: QualificationType*): Self = StObject.set(x, "QualificationTypes", js.Array(value :_*))
  }
}
