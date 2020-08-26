package typings.baseui.treeViewMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNode[T]
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeNode[_]]] = js.native
  var id: js.UndefOr[Double | String] = js.native
  var info: js.UndefOr[T] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
  var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String = js.native
}

object TreeNode {
  @scala.inline
  def apply[T](label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): TreeNode[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[T]]
  }
  @scala.inline
  implicit class TreeNodeOps[Self <: TreeNode[_], T] (val x: Self with TreeNode[T]) extends AnyVal {
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
    def setLabelFunction1(value: /* node */ TreeNode[_] => ReactNode): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: TreeNode[js.Any]*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TreeNode[_]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: T): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
  }
  
}

