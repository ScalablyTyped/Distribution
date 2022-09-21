package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeAction extends StObject {
  
  /** Text changes to apply to each file as part of the code action */
  var changes: Array[FileTextChanges]
  
  /**
    * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
    * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
    */
  var commands: js.UndefOr[Array[CodeActionCommand]] = js.undefined
  
  /** Description of the code action to display in the UI of the editor */
  var description: java.lang.String
}
object CodeAction {
  
  inline def apply(changes: Array[FileTextChanges], description: java.lang.String): CodeAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  
  extension [Self <: CodeAction](x: Self) {
    
    inline def setChanges(value: Array[FileTextChanges]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setCommands(value: Array[CodeActionCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
