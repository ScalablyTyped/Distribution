package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Logger
import typings.concurrently.distSrcCommandMod.Command
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlLogExitMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-exit", "LogExit")
  @js.native
  open class LogExit protected ()
    extends StObject
       with FlowController {
    def this(param0: Logger) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
}
