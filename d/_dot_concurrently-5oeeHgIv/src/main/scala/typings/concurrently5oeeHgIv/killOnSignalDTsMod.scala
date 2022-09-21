package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.anon.Process
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object killOnSignalDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/flow-control/kill-on-signal.d.ts", "KillOnSignal")
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
