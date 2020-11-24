package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is actually what gets sent to the PUT assignment.
  */
@js.native
trait Assignments extends js.Object {
  
  var assignments: Assignment | js.Array[Assignment] = js.native
}
object Assignments {
  
  @scala.inline
  def apply(assignments: Assignment | js.Array[Assignment]): Assignments = {
    val __obj = js.Dynamic.literal(assignments = assignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignments]
  }
  
  @scala.inline
  implicit class AssignmentsOps[Self <: Assignments] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: Assignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: Assignment | js.Array[Assignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
  }
}
