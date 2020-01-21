package typings.builderUtilRuntime.updateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMapDataHolder extends js.Object {
  /**
    * The block map file size. Used when block map data is embedded into the file (appimage, windows web installer package).
    * This information can be obtained from the file itself, but it requires additional HTTP request,
    * so, to reduce request count, block map size is specified in the update metadata too.
    */
  var blockMapSize: js.UndefOr[Double] = js.undefined
  val isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The file checksum.
    */
  val sha512: String
  /**
    * The file size. Used to verify downloaded size (save one HTTP request to get length).
    * Also used when block map data is embedded into the file (appimage, windows web installer package).
    */
  var size: js.UndefOr[Double] = js.undefined
}

object BlockMapDataHolder {
  @scala.inline
  def apply(
    sha512: String,
    blockMapSize: Int | Double = null,
    isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): BlockMapDataHolder = {
    val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any])
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockMapDataHolder]
  }
}

