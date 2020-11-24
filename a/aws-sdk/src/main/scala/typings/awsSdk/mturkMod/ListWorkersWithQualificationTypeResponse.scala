package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkersWithQualificationTypeResponse extends js.Object {
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  
  /**
    *  The list of Qualification elements returned by this call. 
    */
  var Qualifications: js.UndefOr[QualificationList] = js.native
}
object ListWorkersWithQualificationTypeResponse {
  
  @scala.inline
  def apply(): ListWorkersWithQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class ListWorkersWithQualificationTypeResponseOps[Self <: ListWorkersWithQualificationTypeResponse] (val x: Self) extends AnyVal {
    
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
    def setQualificationsVarargs(value: Qualification*): Self = this.set("Qualifications", js.Array(value :_*))
    
    @scala.inline
    def setQualifications(value: QualificationList): Self = this.set("Qualifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifications: Self = this.set("Qualifications", js.undefined)
  }
}
