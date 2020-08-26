package typings.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaData extends ImageHead {
  var exif: js.UndefOr[Exif] = js.native
  var iptc: js.UndefOr[Iptc] = js.native
  var originalHeight: js.UndefOr[Double] = js.native
  var originalWidth: js.UndefOr[Double] = js.native
}

object MetaData {
  @scala.inline
  def apply(): MetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaData]
  }
  @scala.inline
  implicit class MetaDataOps[Self <: MetaData] (val x: Self) extends AnyVal {
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
    def setExif(value: Exif): Self = this.set("exif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExif: Self = this.set("exif", js.undefined)
    @scala.inline
    def setIptc(value: Iptc): Self = this.set("iptc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIptc: Self = this.set("iptc", js.undefined)
    @scala.inline
    def setOriginalHeight(value: Double): Self = this.set("originalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalHeight: Self = this.set("originalHeight", js.undefined)
    @scala.inline
    def setOriginalWidth(value: Double): Self = this.set("originalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalWidth: Self = this.set("originalWidth", js.undefined)
  }
  
}

