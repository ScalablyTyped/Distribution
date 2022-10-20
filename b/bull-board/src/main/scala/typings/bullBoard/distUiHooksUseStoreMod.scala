package typings.bullBoard

import typings.bullBoard.distApiMod.GetQueues
import typings.bullBoard.distAppMod.QueueActions
import typings.bullBoard.distAppMod.SelectedStatuses
import typings.bullBoard.distUiServicesApiMod.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiHooksUseStoreMod {
  
  @JSImport("bull-board/dist/ui/hooks/useStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStore(api: Api): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[Store]
  
  trait State extends StObject {
    
    var data: Null | GetQueues
    
    var loading: Boolean
  }
  object State {
    
    inline def apply(loading: Boolean): State = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setData(value: GetQueues): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store extends StObject {
    
    var actions: QueueActions
    
    var selectedStatuses: SelectedStatuses
    
    var state: State
  }
  object Store {
    
    inline def apply(actions: QueueActions, selectedStatuses: SelectedStatuses, state: State): Store = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], selectedStatuses = selectedStatuses.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setActions(value: QueueActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setSelectedStatuses(value: SelectedStatuses): Self = StObject.set(x, "selectedStatuses", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
