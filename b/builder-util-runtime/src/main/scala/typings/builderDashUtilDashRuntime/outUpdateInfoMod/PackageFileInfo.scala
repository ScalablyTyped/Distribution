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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageFileInfo]
  }
}

