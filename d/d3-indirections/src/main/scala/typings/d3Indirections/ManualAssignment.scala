package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assign a resource to a manual indirection.
  */
@js.native
trait ManualAssignment
  extends AssignmentBase
     with Assignment {
  
  /** Unique identifier of the new resource to use. */
  var resourceUid: String = js.native
}
object ManualAssignment {
  
  @scala.inline
  def apply(resourceUid: String, uid: String): ManualAssignment = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualAssignment]
  }
  
  @scala.inline
  implicit class ManualAssignmentOps[Self <: ManualAssignment] (val x: Self) extends AnyVal {
    
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
    def setResourceUid(value: String): Self = this.set("resourceUid", value.asInstanceOf[js.Any])
  }
}
