package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.SignatureHelpInvokedReason
  - typings.typescriptNn5FuAjk.ts.SignatureHelpCharacterTypedReason
  - typings.typescriptNn5FuAjk.ts.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  inline def SignatureHelpCharacterTypedReason(triggerCharacter: SignatureHelpTriggerCharacter): typings.typescriptNn5FuAjk.ts.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.SignatureHelpCharacterTypedReason]
  }
  
  inline def SignatureHelpInvokedReason(triggerCharacter: Unit): typings.typescriptNn5FuAjk.ts.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.SignatureHelpInvokedReason]
  }
  
  inline def SignatureHelpRetriggeredReason(): typings.typescriptNn5FuAjk.ts.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.SignatureHelpRetriggeredReason]
  }
}
