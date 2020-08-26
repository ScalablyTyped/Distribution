package typings.baseui.tabsMotionMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var payload: Key = js.native
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any = js.native
}

object Action {
  @scala.inline
  def apply(
    payload: Key,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any
  ): Action = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setPayload(value: Key): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

