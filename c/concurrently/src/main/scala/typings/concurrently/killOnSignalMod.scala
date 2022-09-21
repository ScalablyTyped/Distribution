package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Process
import typings.concurrently.commandMod.Command
import typings.concurrently.flowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object killOnSignalMod {
  
  @JSImport("concurrently/dist/src/flow-control/kill-on-signal", "KillOnSignal")
  @js.native
  open class KillOnSignal protected ()
    extends StObject
       with FlowController {
    def this(hasProcess: Process) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val process: Any = js.native
  }
}
