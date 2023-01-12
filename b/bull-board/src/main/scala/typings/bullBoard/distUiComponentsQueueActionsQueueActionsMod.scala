package typings.bullBoard

import typings.bullBoard.distAppMod.AppQueue
import typings.bullBoard.distAppMod.QueueActions
import typings.bullBoard.distUiComponentsConstantsMod.Status
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsQueueActionsQueueActionsMod {
  
  @JSImport("bull-board/dist/ui/components/QueueActions/QueueActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def QueueActions(param0: QueueActionProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("QueueActions")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait QueueActionProps extends StObject {
    
    var actions: QueueActions
    
    var queue: AppQueue
    
    var status: Status
  }
  object QueueActionProps {
    
    inline def apply(actions: QueueActions, queue: AppQueue, status: Status): QueueActionProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueActionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueActionProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: QueueActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: AppQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
