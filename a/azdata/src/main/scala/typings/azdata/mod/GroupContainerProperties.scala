package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupContainerProperties extends js.Object {
  var collapsed: Boolean = js.native
}

object GroupContainerProperties {
  @scala.inline
  def apply(collapsed: Boolean): GroupContainerProperties = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContainerProperties]
  }
  @scala.inline
  implicit class GroupContainerPropertiesOps[Self <: GroupContainerProperties] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
  }
  
}

