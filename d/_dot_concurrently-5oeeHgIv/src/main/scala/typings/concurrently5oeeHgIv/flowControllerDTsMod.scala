package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Commands
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowControllerDTsMod {
  
  trait FlowController extends StObject {
    
    def handle(commands: js.Array[Command]): Commands
  }
  object FlowController {
    
    inline def apply(handle: js.Array[Command] => Commands): FlowController = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[FlowController]
    }
    
    extension [Self <: FlowController](x: Self) {
      
      inline def setHandle(value: js.Array[Command] => Commands): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
}
