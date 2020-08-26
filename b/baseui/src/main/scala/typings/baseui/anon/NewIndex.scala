package typings.baseui.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewIndex extends js.Object {
  var newIndex: Double = js.native
  var newState: js.Array[ReactNode] = js.native
  var oldIndex: Double = js.native
}

object NewIndex {
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[ReactNode], oldIndex: Double): NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewIndex]
  }
  @scala.inline
  implicit class NewIndexOps[Self <: NewIndex] (val x: Self) extends AnyVal {
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
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewStateVarargs(value: ReactNode*): Self = this.set("newState", js.Array(value :_*))
    @scala.inline
    def setNewState(value: js.Array[ReactNode]): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
  }
  
}

