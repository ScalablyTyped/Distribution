package typings.blackEngine

import typings.blackEngine.coreComponentMod.Component
import typings.blackEngine.coreGameObjectMod.GameObject
import typings.blackEngine.messagesMessageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSystemMod {
  
  @JSImport("black-engine/core/System", "System")
  @js.native
  open class System () extends MessageDispatcher {
    
    def dispose(): Unit = js.native
    
    /* protected */ def onChildrenAdded(gameObject: GameObject): Unit = js.native
    
    /* protected */ def onChildrenChanged(gameObject: GameObject): Unit = js.native
    
    /* protected */ def onChildrenRemoved(gameObject: GameObject): Unit = js.native
    
    /* protected */ def onComponentAdded(child: GameObject, component: Component): Unit = js.native
    
    /* protected */ def onComponentRemoved(child: GameObject, component: Component): Unit = js.native
    
    def onPause(): Unit = js.native
    
    /* protected */ def onPostUpdate(): Unit = js.native
    
    /* protected */ def onRender(): Unit = js.native
    
    def onResume(): Unit = js.native
    
    /* protected */ def onUpdate(): Unit = js.native
  }
}
