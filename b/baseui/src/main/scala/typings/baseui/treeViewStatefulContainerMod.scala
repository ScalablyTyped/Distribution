package typings.baseui

import typings.baseui.treeViewTypesMod.StatefulContainerProps
import typings.baseui.treeViewTypesMod.TreeNodeData
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewStatefulContainerMod {
  
  @JSImport("baseui/tree-view/stateful-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulContainer {
    def this(props: StatefulContainerProps) = this()
  }
  
  trait StateType extends StObject {
    
    var data: js.Array[TreeNodeData[Any]]
  }
  object StateType {
    
    inline def apply(data: js.Array[TreeNodeData[Any]]): StateType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setData(value: js.Array[TreeNodeData[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TreeNodeData[Any]*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  @js.native
  trait StatefulContainer extends Component[StatefulContainerProps, StateType, Any] {
    
    def onToggle(node: TreeNodeData[Any]): Unit = js.native
  }
}
