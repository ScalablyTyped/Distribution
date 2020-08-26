package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var details: js.Any = js.native
  var hadContextMenu: js.Any = js.native
  var relatedTarget: js.Any = js.native
  var `type`: js.Any = js.native
}

object Details {
  @scala.inline
  def apply(details: js.Any, hadContextMenu: js.Any, relatedTarget: js.Any, `type`: js.Any): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], hadContextMenu = hadContextMenu.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Any): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setHadContextMenu(value: js.Any): Self = this.set("hadContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedTarget(value: js.Any): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

