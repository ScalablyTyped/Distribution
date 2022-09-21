package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Logger
import typings.concurrently.commandMod.Command
import typings.concurrently.flowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logExitMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-exit", "LogExit")
  @js.native
  open class LogExit protected ()
    extends StObject
       with FlowController {
    def this(hasLogger: Logger) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
}
