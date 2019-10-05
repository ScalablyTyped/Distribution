package typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeNode[T] extends IProps {
  /**
    * Child tree nodes of this node.
    */
  var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.undefined
  /**
    * Whether this tree node is non-interactive. Enabling this prop will ignore
    * mouse event handlers (in particular click, down, enter, leave).
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the caret to expand/collapse a node should be shown.
    * If not specified, this will be true if the node has children and false otherwise.
    */
  var hasCaret: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a Blueprint icon (or an icon element) to render next to the node's label.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * A unique identifier for the node.
    */
  var id: String | Double
  /**
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this node is selected.
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * The main label for the node.
    */
  var label: String | Element
  /**
    * An optional custom user object to associate with the node.
    * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
    * event handlers for doing custom logic per node.
    */
  var nodeData: js.UndefOr[T] = js.undefined
  /**
    * A secondary label/component that is displayed at the right side of the node.
    */
  var secondaryLabel: js.UndefOr[String | MaybeElement] = js.undefined
}

object ITreeNode {
  @scala.inline
  def apply[T](
    id: String | Double,
    label: String | Element,
    childNodes: js.Array[ITreeNode[T]] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasCaret: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    nodeData: T = null,
    secondaryLabel: String | MaybeElement = null
  ): ITreeNode[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNode[T]]
  }
}

