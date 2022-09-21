package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinedCodeActions extends StObject {
  
  var changes: Array[FileCodeEdits]
  
  var commands: js.UndefOr[Array[js.Object]] = js.undefined
}
object CombinedCodeActions {
  
  inline def apply(changes: Array[FileCodeEdits]): CombinedCodeActions = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeActions]
  }
  
  extension [Self <: CombinedCodeActions](x: Self) {
    
    inline def setChanges(value: Array[FileCodeEdits]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setCommands(value: Array[js.Object]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
  }
}
