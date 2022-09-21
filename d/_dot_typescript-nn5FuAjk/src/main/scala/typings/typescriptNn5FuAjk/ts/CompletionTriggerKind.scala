package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends StObject
@JSGlobal("ts.CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends StObject {
  
  /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
  @js.native
  sealed trait Invoked
    extends StObject
       with CompletionTriggerKind
  
  /** Completion was triggered by a trigger character. */
  @js.native
  sealed trait TriggerCharacter
    extends StObject
       with CompletionTriggerKind
  
  /** Completion was re-triggered as the current completion list is incomplete. */
  @js.native
  sealed trait TriggerForIncompleteCompletions
    extends StObject
       with CompletionTriggerKind
}
