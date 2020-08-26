package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImgOptions extends js.Object {
  // format to set the image format manually, avoiding relying on the filename
  var format: js.UndefOr[String] = js.native
  // quality to set the image quality, from 1 to 100
  var quality: js.UndefOr[Double] = js.native
}

object ImgOptions {
  @scala.inline
  def apply(): ImgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgOptions]
  }
  @scala.inline
  implicit class ImgOptionsOps[Self <: ImgOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

