package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeViewMod {
  type TGetId = js.Function1[
    /* node */ typings.baseui.treeViewMod.TreeNode[js.Any], 
    java.lang.String | scala.Double
  ]
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[typings.baseui.treeViewMod.TreeNode[js.Any]], 
    /* toggledNode */ typings.baseui.treeViewMod.TreeNode[js.Any], 
    /* getId */ js.UndefOr[typings.baseui.treeViewMod.TGetId], 
    js.Array[typings.baseui.treeViewMod.TreeNode[js.Any]]
  ]
}
