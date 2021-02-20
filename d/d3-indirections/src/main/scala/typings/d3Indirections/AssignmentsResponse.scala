package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a PUT indirections resource request.
  */
@js.native
trait AssignmentsResponse extends StObject {
  
  var failedAssignments: js.Array[AssignmentFailure] = js.native
}
object AssignmentsResponse {
  
  @scala.inline
  def apply(failedAssignments: js.Array[AssignmentFailure]): AssignmentsResponse = {
    val __obj = js.Dynamic.literal(failedAssignments = failedAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentsResponse]
  }
  
  @scala.inline
  implicit class AssignmentsResponseMutableBuilder[Self <: AssignmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedAssignments(value: js.Array[AssignmentFailure]): Self = StObject.set(x, "failedAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedAssignmentsVarargs(value: AssignmentFailure*): Self = StObject.set(x, "failedAssignments", js.Array(value :_*))
  }
}
