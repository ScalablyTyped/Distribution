package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveKey extends js.Object {
  var activeKey: typings.react.mod.Key = js.native
}

object ActiveKey {
  @scala.inline
  def apply(activeKey: typings.react.mod.Key): ActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKey]
  }
  @scala.inline
  implicit class ActiveKeyOps[Self <: ActiveKey] (val x: Self) extends AnyVal {
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
    def setActiveKey(value: typings.react.mod.Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
  }
  
}

