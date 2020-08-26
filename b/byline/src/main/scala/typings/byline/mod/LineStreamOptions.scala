package typings.byline.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStreamOptions extends TransformOptions {
  var keepEmptyLines: js.UndefOr[Boolean] = js.native
}

object LineStreamOptions {
  @scala.inline
  def apply(): LineStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStreamOptions]
  }
  @scala.inline
  implicit class LineStreamOptionsOps[Self <: LineStreamOptions] (val x: Self) extends AnyVal {
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
    def setKeepEmptyLines(value: Boolean): Self = this.set("keepEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepEmptyLines: Self = this.set("keepEmptyLines", js.undefined)
  }
  
}

