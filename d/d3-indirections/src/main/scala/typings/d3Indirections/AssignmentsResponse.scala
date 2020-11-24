package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a PUT indirections resource request.
  */
@js.native
trait AssignmentsResponse extends js.Object {
  
  var failedAssignments: js.Array[AssignmentFailure] = js.native
}
object AssignmentsResponse {
  
  @scala.inline
  def apply(failedAssignments: js.Array[AssignmentFailure]): AssignmentsResponse = {
    val __obj = js.Dynamic.literal(failedAssignments = failedAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentsResponse]
  }
  
  @scala.inline
  implicit class AssignmentsResponseOps[Self <: AssignmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedAssignmentsVarargs(value: AssignmentFailure*): Self = this.set("failedAssignments", js.Array(value :_*))
    
    @scala.inline
    def setFailedAssignments(value: js.Array[AssignmentFailure]): Self = this.set("failedAssignments", value.asInstanceOf[js.Any])
  }
}
