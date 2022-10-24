package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Conditions
import typings.concurrently.distSrcCommandMod.Command
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlKillOthersMod {
  
  @JSImport("concurrently/dist/src/flow-control/kill-others", "KillOthers")
  @js.native
  open class KillOthers protected ()
    extends StObject
       with FlowController {
    def this(param0: Conditions) = this()
    
    /* private */ val conditions: Any = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.concurrently.concurrentlyStrings.failure
    - typings.concurrently.concurrentlyStrings.success
  */
  trait ProcessCloseCondition extends StObject
  object ProcessCloseCondition {
    
    inline def failure: typings.concurrently.concurrentlyStrings.failure = "failure".asInstanceOf[typings.concurrently.concurrentlyStrings.failure]
    
    inline def success: typings.concurrently.concurrentlyStrings.success = "success".asInstanceOf[typings.concurrently.concurrentlyStrings.success]
  }
}
