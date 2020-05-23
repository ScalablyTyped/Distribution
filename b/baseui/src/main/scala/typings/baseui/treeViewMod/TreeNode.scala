package typings.baseui.treeViewMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode[T]
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeNode[_]]] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var info: js.UndefOr[T] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String
}

object TreeNode {
  @scala.inline
  def apply[T](
    label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.Array[TreeNode[_]] = null,
    id: Double | String = null,
    info: T = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined
  ): TreeNode[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[T]]
  }
}

