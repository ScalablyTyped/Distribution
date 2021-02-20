package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScriptInput extends StObject {
  
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
  implicit class DeleteScriptInputMutableBuilder[Self <: DeleteScriptInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
  }
}
