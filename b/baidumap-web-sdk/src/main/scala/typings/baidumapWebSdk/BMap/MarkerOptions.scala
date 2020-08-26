package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  var draggingCursor: js.UndefOr[String] = js.native
  var enableClicking: js.UndefOr[Boolean] = js.native
  var enableDragging: js.UndefOr[Boolean] = js.native
  var enableMassClear: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Icon] = js.native
  var offset: js.UndefOr[Size] = js.native
  var raiseOnDrag: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var shadow: js.UndefOr[Icon] = js.native
  var title: js.UndefOr[String] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
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
    def setDraggingCursor(value: String): Self = this.set("draggingCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingCursor: Self = this.set("draggingCursor", js.undefined)
    @scala.inline
    def setEnableClicking(value: Boolean): Self = this.set("enableClicking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableClicking: Self = this.set("enableClicking", js.undefined)
    @scala.inline
    def setEnableDragging(value: Boolean): Self = this.set("enableDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDragging: Self = this.set("enableDragging", js.undefined)
    @scala.inline
    def setEnableMassClear(value: Boolean): Self = this.set("enableMassClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMassClear: Self = this.set("enableMassClear", js.undefined)
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setRaiseOnDrag(value: Boolean): Self = this.set("raiseOnDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaiseOnDrag: Self = this.set("raiseOnDrag", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setShadow(value: Icon): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

