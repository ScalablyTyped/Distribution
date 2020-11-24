package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignmentsForHITResponse extends js.Object {
  
  /**
    *  The collection of Assignment data structures returned by this call.
    */
  var Assignments: js.UndefOr[AssignmentList] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
}
object ListAssignmentsForHITResponse {
  
  @scala.inline
  def apply(): ListAssignmentsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignmentsForHITResponse]
  }
  
  @scala.inline
  implicit class ListAssignmentsForHITResponseOps[Self <: ListAssignmentsForHITResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: Assignment*): Self = this.set("Assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: AssignmentList): Self = this.set("Assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("Assignments", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
  }
}
