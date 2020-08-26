package typings.canvasjs.anon

import typings.canvasjs.canvasjsStrings.jpg
import typings.canvasjs.canvasjsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var format: jpg | png = js.native
  var toDataURL: js.UndefOr[Boolean] = js.native
}

object FileName {
  @scala.inline
  def apply(format: jpg | png): FileName = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
  @scala.inline
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setToDataURL(value: Boolean): Self = this.set("toDataURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDataURL: Self = this.set("toDataURL", js.undefined)
  }
  
}

