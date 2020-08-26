package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptgroupsT extends /* key */ StringDictionary[Value] {
  var __ungrouped: Value = js.native
}

object OptgroupsT {
  @scala.inline
  def apply(__ungrouped: Value): OptgroupsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptgroupsT]
  }
  @scala.inline
  implicit class OptgroupsTOps[Self <: OptgroupsT] (val x: Self) extends AnyVal {
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
    def set__ungroupedVarargs(value: Option*): Self = this.set("__ungrouped", js.Array(value :_*))
    @scala.inline
    def set__ungrouped(value: Value): Self = this.set("__ungrouped", value.asInstanceOf[js.Any])
  }
  
}

