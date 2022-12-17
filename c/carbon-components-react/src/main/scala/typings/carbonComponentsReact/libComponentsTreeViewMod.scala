package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsTreeViewTreeNodeMod.TreeNodeProps
import typings.carbonComponentsReact.libComponentsTreeViewTreeViewMod.TreeViewFC
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTreeViewMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TreeView", JSImport.Default)
  @js.native
  val default: TreeViewFC = js.native
  
  @JSImport("carbon-components-react/lib/components/TreeView", "TreeNode")
  @js.native
  val TreeNode: FC[TreeNodeProps] = js.native
  
  type _To = TreeViewFC
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTreeViewMod.foo` */
  override def _to: TreeViewFC = default
}
