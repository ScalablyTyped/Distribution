package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeAction extends StObject {
  
  /** Text changes to apply to each file as part of the code action */
  var changes: Array[FileCodeEdits]
  
  /** A command is an opaque object that should be passed to `ApplyCodeActionCommandRequestArgs` without modification.  */
  var commands: js.UndefOr[Array[js.Object]] = js.undefined
  
  /** Description of the code action to display in the UI of the editor */
  var description: String
}
object CodeAction {
  
  inline def apply(changes: Array[FileCodeEdits], description: String): CodeAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  
  extension [Self <: CodeAction](x: Self) {
    
    inline def setChanges(value: Array[FileCodeEdits]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setCommands(value: Array[js.Object]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
