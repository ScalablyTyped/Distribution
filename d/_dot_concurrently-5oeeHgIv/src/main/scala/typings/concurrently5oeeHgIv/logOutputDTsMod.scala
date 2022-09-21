package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.anon.Logger
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logOutputDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/flow-control/log-output.d.ts", "LogOutput")
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
