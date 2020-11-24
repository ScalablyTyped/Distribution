package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchScheduleActionDeleteRequest extends js.Object {
  
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: listOfString = js.native
}
object BatchScheduleActionDeleteRequest {
  
  @scala.inline
  def apply(ActionNames: listOfString): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
  
  @scala.inline
  implicit class BatchScheduleActionDeleteRequestOps[Self <: BatchScheduleActionDeleteRequest] (val x: Self) extends AnyVal {
    
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
    def setActionNamesVarargs(value: string*): Self = this.set("ActionNames", js.Array(value :_*))
    
    @scala.inline
    def setActionNames(value: listOfString): Self = this.set("ActionNames", value.asInstanceOf[js.Any])
  }
}
