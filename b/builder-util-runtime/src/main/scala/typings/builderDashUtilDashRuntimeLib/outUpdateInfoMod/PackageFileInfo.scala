package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageFileInfo extends BlockMapDataHolder {
  val path: java.lang.String
}

object PackageFileInfo {
  @scala.inline
  def apply(
    path: java.lang.String,
    sha512: java.lang.String,
    blockMapSize: scala.Int | scala.Double = null,
    isAdminRightsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): PackageFileInfo = {
    val __obj = js.Dynamic.literal(path = path, sha512 = sha512)
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageFileInfo]
  }
}

