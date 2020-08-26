package typings.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait vbox extends uiElement {
  var children: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var heights: js.UndefOr[js.Array[Double]] = js.native
  var padding: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[String] = js.native
  var width: js.UndefOr[js.Array[Double]] = js.native
}

object vbox {
  @scala.inline
  def apply(): vbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[vbox]
  }
  @scala.inline
  implicit class vboxOps[Self <: vbox] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: typings.ckeditor.CKEDITOR.ui.dialog.uiElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setHeightsVarargs(value: Double*): Self = this.set("heights", js.Array(value :_*))
    @scala.inline
    def setHeights(value: js.Array[Double]): Self = this.set("heights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeights: Self = this.set("heights", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setWidthVarargs(value: Double*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: js.Array[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

