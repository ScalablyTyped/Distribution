package typings.ckeditor.CKEDITOR

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sharedSpace extends js.Object {
  var bottom: js.UndefOr[String | HTMLElement] = js.native
  var top: js.UndefOr[String | HTMLElement] = js.native
}

object sharedSpace {
  @scala.inline
  def apply(): sharedSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sharedSpace]
  }
  @scala.inline
  implicit class sharedSpaceOps[Self <: sharedSpace] (val x: Self) extends AnyVal {
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
    def setBottom(value: String | HTMLElement): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setTop(value: String | HTMLElement): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

