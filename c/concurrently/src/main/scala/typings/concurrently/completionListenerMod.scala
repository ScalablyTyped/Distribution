package typings.concurrently

import typings.concurrently.anon.Scheduler
import typings.concurrently.commandMod.CloseEvent
import typings.concurrently.commandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completionListenerMod {
  
  @JSImport("concurrently/dist/src/completion-listener", "CompletionListener")
  @js.native
  open class CompletionListener protected () extends StObject {
    def this(hasSuccessConditionScheduler: Scheduler) = this()
    
    /* private */ var isSuccess: Any = js.native
    
    /**
      * Given a list of commands, wait for all of them to exit and then evaluate their exit codes.
      *
      * @returns A Promise that resolves if the success condition is met, or rejects otherwise.
      */
    def listen(commands: js.Array[Command]): js.Promise[js.Array[CloseEvent]] = js.native
    
    /* private */ val scheduler: Any = js.native
    
    /* private */ val successCondition: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.concurrently.concurrentlyStrings.first
    - typings.concurrently.concurrentlyStrings.last
    - typings.concurrently.concurrentlyStrings.all
    - / * template literal string: command-${string|number} * / java.lang.String
  */
  type SuccessCondition = _SuccessCondition | (/* template literal string: command-${string|number} */ String)
  
  trait _SuccessCondition extends StObject
}
