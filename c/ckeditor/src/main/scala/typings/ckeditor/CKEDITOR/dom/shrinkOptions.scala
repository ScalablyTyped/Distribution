package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait shrinkOptions extends js.Object {
  var shrinkOnBlockBoundary: js.UndefOr[Boolean] = js.native
  var skipBogus: js.UndefOr[Boolean] = js.native
}

object shrinkOptions {
  @scala.inline
  def apply(): shrinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shrinkOptions]
  }
  @scala.inline
  implicit class shrinkOptionsOps[Self <: shrinkOptions] (val x: Self) extends AnyVal {
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
    def setShrinkOnBlockBoundary(value: Boolean): Self = this.set("shrinkOnBlockBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkOnBlockBoundary: Self = this.set("shrinkOnBlockBoundary", js.undefined)
    @scala.inline
    def setSkipBogus(value: Boolean): Self = this.set("skipBogus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipBogus: Self = this.set("skipBogus", js.undefined)
  }
  
}

