package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Scheduler
import typings.concurrently5oeeHgIv.commandDTsMod.CloseEvent
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completionListenerDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/completion-listener.d.ts", "CompletionListener")
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
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.first
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.last
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.all
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`
  */
  trait SuccessCondition extends StObject
  object SuccessCondition {
    
    inline def `Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("!command-${string | number}").asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`Exclamationmarkcommand-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
    
    inline def all: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.all = "all".asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.all]
    
    inline def `command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket` = ("command-${string | number}").asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.`command-$Leftcurlybracketstring Verticalline numberRightcurlybracket`]
    
    inline def first: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.first = "first".asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.first]
    
    inline def last: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.last = "last".asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.last]
  }
}
