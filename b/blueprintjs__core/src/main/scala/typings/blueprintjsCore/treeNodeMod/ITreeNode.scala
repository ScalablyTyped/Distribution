package typings.blueprintjsCore.treeNodeMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeNode[T] extends IProps {
  /**
    * Child tree nodes of this node.
    */
  var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.native
  /**
    * Whether this tree node is non-interactive. Enabling this prop will ignore
    * mouse event handlers (in particular click, down, enter, leave).
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the caret to expand/collapse a node should be shown.
    * If not specified, this will be true if the node has children and false otherwise.
    */
  var hasCaret: js.UndefOr[Boolean] = js.native
  /**
    * The name of a Blueprint icon (or an icon element) to render next to the node's label.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * A unique identifier for the node.
    */
  var id: String | Double = js.native
  /**
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    * Whether this node is selected.
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * The main label for the node.
    */
  var label: String | Element = js.native
  /**
    * An optional custom user object to associate with the node.
    * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
    * event handlers for doing custom logic per node.
    */
  var nodeData: js.UndefOr[T] = js.native
  /**
    * A secondary label/component that is displayed at the right side of the node.
    */
  var secondaryLabel: js.UndefOr[String | MaybeElement] = js.native
}

object ITreeNode {
  @scala.inline
  def apply[T](id: String | Double, label: String | Element): ITreeNode[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNode[T]]
  }
  @scala.inline
  implicit class ITreeNodeOps[Self <: ITreeNode[_], T] (val x: Self with ITreeNode[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String | Element): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNodesVarargs(value: ITreeNode[T]*): Self = this.set("childNodes", js.Array(value :_*))
    @scala.inline
    def setChildNodes(value: js.Array[ITreeNode[T]]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildNodes: Self = this.set("childNodes", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHasCaret(value: Boolean): Self = this.set("hasCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCaret: Self = this.set("hasCaret", js.undefined)
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setNodeData(value: T): Self = this.set("nodeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeData: Self = this.set("nodeData", js.undefined)
    @scala.inline
    def setSecondaryLabel(value: String | MaybeElement): Self = this.set("secondaryLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryLabel: Self = this.set("secondaryLabel", js.undefined)
    @scala.inline
    def setSecondaryLabelNull: Self = this.set("secondaryLabel", null)
  }
  
}

