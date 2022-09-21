package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.anon.DefaultInputTarget
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputHandlerDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/flow-control/input-handler.d.ts", "InputHandler")
  @js.native
  open class InputHandler protected ()
    extends StObject
       with FlowController {
    def this(hasDefaultInputTargetInputStreamPauseInputStreamOnFinishLogger: DefaultInputTarget) = this()
    
    /* private */ val defaultInputTarget: Any = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val inputStream: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val pauseInputStreamOnFinish: Any = js.native
  }
}
