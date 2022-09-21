package typings.baseui

import typings.baseui.treeViewTypesMod.TreeNodeProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  @JSImport("baseui/tree-view/tree-node", JSImport.Default)
  @js.native
  open class default () extends TreeNode
  
  @js.native
  trait TreeNode
    extends Component[TreeNodeProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MTreeNode(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTreeNode(): Unit = js.native
    
    def onFocus(e: SyntheticEvent[Element, Event]): Unit = js.native
    
    def onToggle(): Unit = js.native
    
    var treeItemRef: RefObject[HTMLLIElement] = js.native
  }
}
