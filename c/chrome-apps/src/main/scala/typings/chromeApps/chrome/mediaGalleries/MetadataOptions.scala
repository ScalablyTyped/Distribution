package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataOptions extends js.Object {
  var metadataType: MetadataOptionsType = js.native
}

object MetadataOptions {
  @scala.inline
  def apply(metadataType: MetadataOptionsType): MetadataOptions = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataOptions]
  }
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
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
    def setMetadataType(value: MetadataOptionsType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
  }
  
}

