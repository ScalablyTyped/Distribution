package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var contentRef: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* element */ reactLib.HTMLDivElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  var depth: scala.Double
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onCollapse: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement], 
      scala.Unit
    ]
  ] = js.undefined
  var path: js.Array[scala.Double]
}

