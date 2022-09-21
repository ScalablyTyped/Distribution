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
    - typings.concurrently.concurrentlyStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
    - typings.concurrently.concurrentlyStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
  */
  trait SuccessCondition extends StObject
  object SuccessCondition {
    
    inline def `Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: typings.concurrently.concurrentlyStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("!command-${string | number}").asInstanceOf[typings.concurrently.concurrentlyStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
    
    inline def all: typings.concurrently.concurrentlyStrings.all = "all".asInstanceOf[typings.concurrently.concurrentlyStrings.all]
    
    inline def `command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: typings.concurrently.concurrentlyStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("command-${string | number}").asInstanceOf[typings.concurrently.concurrentlyStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
    
    inline def first: typings.concurrently.concurrentlyStrings.first = "first".asInstanceOf[typings.concurrently.concurrentlyStrings.first]
    
    inline def last: typings.concurrently.concurrentlyStrings.last = "last".asInstanceOf[typings.concurrently.concurrentlyStrings.last]
  }
}
