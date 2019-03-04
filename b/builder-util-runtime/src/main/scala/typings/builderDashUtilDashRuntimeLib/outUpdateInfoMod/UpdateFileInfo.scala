package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileInfo extends BlockMapDataHolder {
  var url: java.lang.String
}

object UpdateFileInfo {
  @scala.inline
  def apply(
    sha512: java.lang.String,
    url: java.lang.String,
    blockMapSize: scala.Int | scala.Double = null,
    isAdminRightsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): UpdateFileInfo = {
    val __obj = js.Dynamic.literal(sha512 = sha512, url = url)
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileInfo]
  }
}

