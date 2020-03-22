package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeViewMod {
  type TGetId = js.Function1[/* node */ typings.baseui.treeViewMod.TreeNode, java.lang.String | scala.Double]
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[typings.baseui.treeViewMod.TreeNode], 
    /* togggledNode */ typings.baseui.treeViewMod.TreeNode, 
    /* getId */ js.UndefOr[typings.baseui.treeViewMod.TGetId], 
    js.Array[typings.baseui.treeViewMod.TreeNode]
  ]
}
