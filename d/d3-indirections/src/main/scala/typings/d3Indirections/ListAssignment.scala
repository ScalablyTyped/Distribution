package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assign a list resource by setting its current index.
  */
@js.native
trait ListAssignment
  extends AssignmentBase
     with Assignment {
  
  /** New index of the resource list to use. */
  var resourceIndex: Double = js.native
}
object ListAssignment {
  
  @scala.inline
  def apply(resourceIndex: Double, uid: String): ListAssignment = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignment]
  }
  
  @scala.inline
  implicit class ListAssignmentOps[Self <: ListAssignment] (val x: Self) extends AnyVal {
    
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
    def setResourceIndex(value: Double): Self = this.set("resourceIndex", value.asInstanceOf[js.Any])
  }
}
