package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldIndex extends js.Object {
  var newIndex: Double = js.native
  var oldIndex: Double = js.native
}

object OldIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double): OldIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
  @scala.inline
  implicit class OldIndexOps[Self <: OldIndex] (val x: Self) extends AnyVal {
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
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
  }
  
}

