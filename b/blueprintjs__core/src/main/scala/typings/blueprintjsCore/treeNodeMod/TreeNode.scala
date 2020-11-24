package typings.blueprintjsCore.treeNodeMod

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
@js.native
class TreeNode[T] ()
  extends Component[ITreeNodeProps[T], js.Object, js.Any] {
  
  var handleCaretClick: js.Any = js.native
  
  var handleClick: js.Any = js.native
  
  var handleContentRef: js.Any = js.native
  
  var handleContextMenu: js.Any = js.native
  
  var handleDoubleClick: js.Any = js.native
  
  var handleMouseEnter: js.Any = js.native
  
  var handleMouseLeave: js.Any = js.native
  
  var maybeRenderCaret: js.Any = js.native
  
  var maybeRenderSecondaryLabel: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
@js.native
object TreeNode extends js.Object {
  
  var displayName: String = js.native
  
  def ofType[U](): Instantiable1[/* props */ ITreeNodeProps[U], TreeNode[U]] = js.native
}
