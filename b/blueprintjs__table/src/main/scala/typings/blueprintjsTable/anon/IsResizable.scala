package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsResizable extends js.Object {
  var isResizable: Boolean = js.native
  var minSize: Double = js.native
}

object IsResizable {
  @scala.inline
  def apply(isResizable: Boolean, minSize: Double): IsResizable = {
    val __obj = js.Dynamic.literal(isResizable = isResizable.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsResizable]
  }
  @scala.inline
  implicit class IsResizableOps[Self <: IsResizable] (val x: Self) extends AnyVal {
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
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
  }
  
}

