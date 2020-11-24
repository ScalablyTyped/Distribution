package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssignmentResponse extends js.Object {
  
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[typings.awsSdk.mturkMod.Assignment] = js.native
  
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[typings.awsSdk.mturkMod.HIT] = js.native
}
object GetAssignmentResponse {
  
  @scala.inline
  def apply(): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssignmentResponse]
  }
  
  @scala.inline
  implicit class GetAssignmentResponseOps[Self <: GetAssignmentResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignment(value: Assignment): Self = this.set("Assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignment: Self = this.set("Assignment", js.undefined)
    
    @scala.inline
    def setHIT(value: HIT): Self = this.set("HIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHIT: Self = this.set("HIT", js.undefined)
  }
}
