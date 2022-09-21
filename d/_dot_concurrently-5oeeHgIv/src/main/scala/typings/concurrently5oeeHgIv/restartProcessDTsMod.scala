package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.anon.Delay
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restartProcessDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/flow-control/restart-process.d.ts", "RestartProcess")
  @js.native
  open class RestartProcess protected ()
    extends StObject
       with FlowController {
    def this(hasDelayTriesLoggerScheduler: Delay) = this()
    
    val delay: Double = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val scheduler: Any = js.native
    
    val tries: Double = js.native
  }
}
