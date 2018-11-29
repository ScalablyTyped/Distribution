package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITreeNode[T]
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Child tree nodes of this node.
       */
  var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.undefined
  /**
       * Whether the caret to expand/collapse a node should be shown.
       * If not specified, this will be true if the node has children and false otherwise.
       */
  var hasCaret: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The name of a Blueprint icon (or an icon element) to render next to the node's label.
       */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /**
       * A unique identifier for the node.
       */
  var id: java.lang.String | scala.Double
  /**
       */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether this node is selected.
       * @default false
       */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The main label for the node.
       */
  var label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  /**
       * An optional custom user object to associate with the node.
       * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
       * event handlers for doing custom logic per node.
       */
  var nodeData: js.UndefOr[T] = js.undefined
  /**
       * A secondary label/component that is displayed at the right side of the node.
       */
  var secondaryLabel: js.UndefOr[java.lang.String | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement] = js.undefined
}

