package typings.builderDashUtilDashRuntime.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileInfo extends BlockMapDataHolder {
  var url: String
}

object UpdateFileInfo {
  @scala.inline
  def apply(
    sha512: String,
    url: String,
    blockMapSize: Int | Double = null,
    isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): UpdateFileInfo = {
    val __obj = js.Dynamic.literal(sha512 = sha512, url = url)
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileInfo]
  }
}

