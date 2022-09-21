package typings.blackEngine

import typings.blackEngine.componentMod.Component
import typings.blackEngine.gameObjectMod.GameObject
import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMod {
  
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
