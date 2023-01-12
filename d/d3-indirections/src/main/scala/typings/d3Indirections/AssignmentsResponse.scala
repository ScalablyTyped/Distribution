package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a PUT indirections resource request.
  */
trait AssignmentsResponse extends StObject {
  
  var failedAssignments: js.Array[AssignmentFailure]
}
object AssignmentsResponse {
  
  inline def apply(failedAssignments: js.Array[AssignmentFailure]): AssignmentsResponse = {
    val __obj = js.Dynamic.literal(failedAssignments = failedAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedAssignments(value: js.Array[AssignmentFailure]): Self = StObject.set(x, "failedAssignments", value.asInstanceOf[js.Any])
    
    inline def setFailedAssignmentsVarargs(value: AssignmentFailure*): Self = StObject.set(x, "failedAssignments", js.Array(value*))
  }
}
