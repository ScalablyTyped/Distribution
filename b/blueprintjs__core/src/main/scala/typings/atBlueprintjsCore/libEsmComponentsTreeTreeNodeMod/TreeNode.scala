package typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod

import org.scalablytyped.runtime.Instantiable1
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* private */ def maybeRenderCaret(): js.Any = js.native
  /* private */ def maybeRenderSecondaryLabel(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
@js.native
object TreeNode extends js.Object {
  var displayName: String = js.native
  def ofType[T](): Instantiable1[/* props */ ITreeNodeProps[T], TreeNode[T]] = js.native
}

