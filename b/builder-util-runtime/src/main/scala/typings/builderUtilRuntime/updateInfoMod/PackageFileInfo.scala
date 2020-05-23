package typings.builderUtilRuntime.updateInfoMod

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
    blockMapSize: js.UndefOr[Double] = js.undefined,
    isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): PackageFileInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    if (!js.isUndefined(blockMapSize)) __obj.updateDynamic("blockMapSize")(blockMapSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageFileInfo]
  }
}

