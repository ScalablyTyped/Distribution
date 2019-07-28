package typings.builderDashUtilDashRuntime.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageFileInfo extends BlockMapDataHolder {
  val path: String
}

object PackageFileInfo {
  @scala.inline
  def apply(
    path: String,
    sha512: String,
    blockMapSize: Int | Double = null,
    isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): PackageFileInfo = {
    val __obj = js.Dynamic.literal(path = path, sha512 = sha512)
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageFileInfo]
  }
}

