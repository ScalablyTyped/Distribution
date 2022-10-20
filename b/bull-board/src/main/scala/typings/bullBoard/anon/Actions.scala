package typings.bullBoard.anon

import typings.bullBoard.distAppMod.AppQueue
import typings.bullBoard.distAppMod.QueueActions
import typings.bullBoard.distAppMod.SelectedStatuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: QueueActions
  
  var queue: js.UndefOr[AppQueue] = js.undefined
  
  var selectedStatus: SelectedStatuses
}
object Actions {
  
  inline def apply(actions: QueueActions, selectedStatus: SelectedStatuses): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], selectedStatus = selectedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: QueueActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: AppQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setSelectedStatus(value: SelectedStatuses): Self = StObject.set(x, "selectedStatus", value.asInstanceOf[js.Any])
  }
}
