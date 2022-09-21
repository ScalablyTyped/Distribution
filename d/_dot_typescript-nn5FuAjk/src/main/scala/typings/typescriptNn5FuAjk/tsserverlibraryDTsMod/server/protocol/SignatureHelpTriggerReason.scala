package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpInvokedReason
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpCharacterTypedReason
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  inline def SignatureHelpCharacterTypedReason(triggerCharacter: SignatureHelpTriggerCharacter): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpCharacterTypedReason]
  }
  
  inline def SignatureHelpInvokedReason(triggerCharacter: Unit): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpInvokedReason]
  }
  
  inline def SignatureHelpRetriggeredReason(): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SignatureHelpRetriggeredReason]
  }
}
