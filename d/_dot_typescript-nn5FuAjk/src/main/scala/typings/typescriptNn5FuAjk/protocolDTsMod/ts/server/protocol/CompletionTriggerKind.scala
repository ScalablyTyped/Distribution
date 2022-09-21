package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`1`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`2`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`1`
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`2`
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`3`
*/
trait CompletionTriggerKind extends StObject
object CompletionTriggerKind {
  
  /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
  inline def Invoked: `1` = 1.asInstanceOf[`1`]
  
  /** Completion was triggered by a trigger character. */
  inline def TriggerCharacter: `2` = 2.asInstanceOf[`2`]
  
  /** Completion was re-triggered as the current completion list is incomplete. */
  inline def TriggerForIncompleteCompletions: `3` = 3.asInstanceOf[`3`]
}
