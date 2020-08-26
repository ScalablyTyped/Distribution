package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJpgOptions extends ExportOptions {
  /**
    * quality Specifies the quality of the image from 0
    * (low quality, low filesize) to 1 (high quality, high filesize).
    * If not set, the browser's default quality value is used.
    */
  var quality: js.UndefOr[Double] = js.native
}

object ExportJpgOptions {
  @scala.inline
  def apply(): ExportJpgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgOptions]
  }
  @scala.inline
  implicit class ExportJpgOptionsOps[Self <: ExportJpgOptions] (val x: Self) extends AnyVal {
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
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

