package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var anchor: js.UndefOr[Size] = js.undefined
  var imageOffset: js.UndefOr[Size] = js.undefined
  var infoWindowAnchor: js.UndefOr[Size] = js.undefined
  var printImageUrl: js.UndefOr[String] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(
    anchor: Size = null,
    imageOffset: Size = null,
    infoWindowAnchor: Size = null,
    printImageUrl: String = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (imageOffset != null) __obj.updateDynamic("imageOffset")(imageOffset.asInstanceOf[js.Any])
    if (infoWindowAnchor != null) __obj.updateDynamic("infoWindowAnchor")(infoWindowAnchor.asInstanceOf[js.Any])
    if (printImageUrl != null) __obj.updateDynamic("printImageUrl")(printImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

