package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaData extends ImageHead {
  var exif: js.UndefOr[Exif] = js.undefined
  var iptc: js.UndefOr[Iptc] = js.undefined
  var originalHeight: js.UndefOr[Double] = js.undefined
  var originalWidth: js.UndefOr[Double] = js.undefined
}

object MetaData {
  @scala.inline
  def apply(
    exif: Exif = null,
    imageHead: ArrayBuffer | Uint8Array = null,
    iptc: Iptc = null,
    originalHeight: Int | Double = null,
    originalWidth: Int | Double = null
  ): MetaData = {
    val __obj = js.Dynamic.literal()
    if (exif != null) __obj.updateDynamic("exif")(exif.asInstanceOf[js.Any])
    if (imageHead != null) __obj.updateDynamic("imageHead")(imageHead.asInstanceOf[js.Any])
    if (iptc != null) __obj.updateDynamic("iptc")(iptc.asInstanceOf[js.Any])
    if (originalHeight != null) __obj.updateDynamic("originalHeight")(originalHeight.asInstanceOf[js.Any])
    if (originalWidth != null) __obj.updateDynamic("originalWidth")(originalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaData]
  }
}

