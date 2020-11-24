package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScriptInput extends js.Object {
  
  /**
    * A unique identifier for a Realtime script to delete. You can use either the script ID or ARN value.
    */
  var ScriptId: ScriptIdOrArn = js.native
}
object DeleteScriptInput {
  
  @scala.inline
  def apply(ScriptId: ScriptIdOrArn): DeleteScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScriptInput]
  }
  
  @scala.inline
  implicit class DeleteScriptInputOps[Self <: DeleteScriptInput] (val x: Self) extends AnyVal {
    
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
    def setScriptId(value: ScriptIdOrArn): Self = this.set("ScriptId", value.asInstanceOf[js.Any])
  }
}
