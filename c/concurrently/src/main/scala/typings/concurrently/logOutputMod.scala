package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.Logger
import typings.concurrently.commandMod.Command
import typings.concurrently.flowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logOutputMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-output", "LogOutput")
  @js.native
  open class LogOutput protected ()
    extends StObject
       with FlowController {
    def this(hasLogger: Logger) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
}
