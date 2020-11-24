package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQualificationTypesResponse extends js.Object {
  
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
  implicit class ListQualificationTypesResponseOps[Self <: ListQualificationTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
    
    @scala.inline
    def setQualificationTypesVarargs(value: QualificationType*): Self = this.set("QualificationTypes", js.Array(value :_*))
    
    @scala.inline
    def setQualificationTypes(value: QualificationTypeList): Self = this.set("QualificationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualificationTypes: Self = this.set("QualificationTypes", js.undefined)
  }
}
