package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is actually what gets sent to the PUT assignment.
  */
trait Assignments extends StObject {
  
  var assignments: Assignment | js.Array[Assignment]
}
object Assignments {
  
  inline def apply(assignments: Assignment | js.Array[Assignment]): Assignments = {
    val __obj = js.Dynamic.literal(assignments = assignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assignments] (val x: Self) extends AnyVal {
    
    inline def setAssignments(value: Assignment | js.Array[Assignment]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsVarargs(value: Assignment*): Self = StObject.set(x, "assignments", js.Array(value*))
  }
}
