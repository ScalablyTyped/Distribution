package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOptions extends js.Object {
  var metadataType: MetadataOptionsType
}

object MetadataOptions {
  @scala.inline
  def apply(metadataType: MetadataOptionsType): MetadataOptions = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetadataOptions]
  }
}

