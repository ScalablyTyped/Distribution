package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.distSrcCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlFlowControllerMod {
  
  trait FlowController extends StObject {
    
    def handle(commands: js.Array[Command]): Commands
  }
  object FlowController {
    
    inline def apply(handle: js.Array[Command] => Commands): FlowController = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[FlowController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowController] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: js.Array[Command] => Commands): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
}
