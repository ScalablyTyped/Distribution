package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTriggerRequest extends js.Object {
  
  /**
    * The name of the trigger to update.
    */
  var Name: NameString = js.native
  
  /**
    * The new values with which to update the trigger.
    */
  var TriggerUpdate: typings.awsSdk.glueMod.TriggerUpdate = js.native
}
object UpdateTriggerRequest {
  
  @scala.inline
  def apply(Name: NameString, TriggerUpdate: TriggerUpdate): UpdateTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TriggerUpdate = TriggerUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTriggerRequest]
  }
  
  @scala.inline
  implicit class UpdateTriggerRequestOps[Self <: UpdateTriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUpdate(value: TriggerUpdate): Self = this.set("TriggerUpdate", value.asInstanceOf[js.Any])
  }
}
