package typings.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  // Disables creating the imageHead property.
  var disableImageHead: js.UndefOr[Boolean] = js.undefined
  // Defines the maximum number of bytes to parse.
  var maxMetaDataSize: js.UndefOr[Double] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    disableImageHead: js.UndefOr[Boolean] = js.undefined,
    maxMetaDataSize: js.UndefOr[Double] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableImageHead)) __obj.updateDynamic("disableImageHead")(disableImageHead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMetaDataSize)) __obj.updateDynamic("maxMetaDataSize")(maxMetaDataSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

