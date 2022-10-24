package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Process
import typings.concurrently.distSrcCommandMod.Command
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlKillOnSignalMod {
  
  @JSImport("concurrently/dist/src/flow-control/kill-on-signal", "KillOnSignal")
  @js.native
  open class KillOnSignal protected ()
    extends StObject
       with FlowController {
    def this(param0: Process) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val process: Any = js.native
  }
}
