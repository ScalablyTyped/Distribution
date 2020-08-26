package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabIndex extends js.Object {
  var tabIndex: Double = js.native
}

object TabIndex {
  @scala.inline
  def apply(tabIndex: Double): TabIndex = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndex]
  }
  @scala.inline
  implicit class TabIndexOps[Self <: TabIndex] (val x: Self) extends AnyVal {
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
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
  
}

