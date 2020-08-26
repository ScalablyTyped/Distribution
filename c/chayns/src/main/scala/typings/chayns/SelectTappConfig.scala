package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.selectTapp()
@js.native
trait SelectTappConfig extends js.Object {
  var id: js.UndefOr[Double] = js.native
  var internalName: js.UndefOr[String] = js.native
  var position: js.UndefOr[Double] = js.native
  var showName: js.UndefOr[String] = js.native
}

object SelectTappConfig {
  @scala.inline
  def apply(): SelectTappConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectTappConfig]
  }
  @scala.inline
  implicit class SelectTappConfigOps[Self <: SelectTappConfig] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalName(value: String): Self = this.set("internalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalName: Self = this.set("internalName", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowName(value: String): Self = this.set("showName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowName: Self = this.set("showName", js.undefined)
  }
  
}

