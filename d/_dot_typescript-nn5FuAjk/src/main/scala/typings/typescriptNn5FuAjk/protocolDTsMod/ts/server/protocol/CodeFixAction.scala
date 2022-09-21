package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeFixAction
  extends StObject
     with CodeAction {
  
  /** Should be present if and only if 'fixId' is. */
  var fixAllDescription: js.UndefOr[String] = js.undefined
  
  /**
    * If present, one may call 'getCombinedCodeFix' with this fixId.
    * This may be omitted to indicate that the code fix can't be applied in a group.
    */
  var fixId: js.UndefOr[js.Object] = js.undefined
  
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: String
}
object CodeFixAction {
  
  inline def apply(changes: Array[FileCodeEdits], description: String, fixName: String): CodeFixAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixName = fixName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixAction]
  }
  
  extension [Self <: CodeFixAction](x: Self) {
    
    inline def setFixAllDescription(value: String): Self = StObject.set(x, "fixAllDescription", value.asInstanceOf[js.Any])
    
    inline def setFixAllDescriptionUndefined: Self = StObject.set(x, "fixAllDescription", js.undefined)
    
    inline def setFixId(value: js.Object): Self = StObject.set(x, "fixId", value.asInstanceOf[js.Any])
    
    inline def setFixIdUndefined: Self = StObject.set(x, "fixId", js.undefined)
    
    inline def setFixName(value: String): Self = StObject.set(x, "fixName", value.asInstanceOf[js.Any])
  }
}
