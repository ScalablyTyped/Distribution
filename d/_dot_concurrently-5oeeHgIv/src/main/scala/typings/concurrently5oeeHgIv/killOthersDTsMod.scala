package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.anon.Conditions
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object killOthersDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/flow-control/kill-others.d.ts", "KillOthers")
  @js.native
  open class KillOthers protected ()
    extends StObject
       with FlowController {
    def this(hasLoggerConditions: Conditions) = this()
    
    /* private */ val conditions: Any = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.failure
    - typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.success
  */
  trait ProcessCloseCondition extends StObject
  object ProcessCloseCondition {
    
    inline def failure: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.failure = "failure".asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.failure]
    
    inline def success: typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.success = "success".asInstanceOf[typings.concurrently5oeeHgIv.concurrently5oeeHgIvStrings.success]
  }
}
