package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait iframeElement extends js.Object {
  var height: String = js.native
  var onContentLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var src: String = js.native
  var width: String = js.native
}

object iframeElement {
  @scala.inline
  def apply(height: String, src: String, width: String): iframeElement = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[iframeElement]
  }
  @scala.inline
  implicit class iframeElementOps[Self <: iframeElement] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnContentLoad(value: () => Unit): Self = this.set("onContentLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnContentLoad: Self = this.set("onContentLoad", js.undefined)
  }
  
}

