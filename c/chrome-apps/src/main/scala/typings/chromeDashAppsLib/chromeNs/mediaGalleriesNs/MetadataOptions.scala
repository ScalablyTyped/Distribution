package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOptions extends js.Object {
  var metadataType: MetadataOptionsType
}

object MetadataOptions {
  @scala.inline
  def apply(metadataType: MetadataOptionsType): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadataType")(metadataType)
    __obj.asInstanceOf[MetadataOptions]
  }
}

