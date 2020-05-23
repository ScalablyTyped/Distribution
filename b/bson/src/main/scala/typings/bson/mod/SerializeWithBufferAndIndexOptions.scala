package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeWithBufferAndIndexOptions extends CommonSerializeOptions {
  /** {default:0}, the index in the buffer where we wish to start serializing into. */
  var index: js.UndefOr[scala.Double] = js.undefined
}

object SerializeWithBufferAndIndexOptions {
  @scala.inline
  def apply(
    checkKeys: js.UndefOr[Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[scala.Double] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined
  ): SerializeWithBufferAndIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkKeys)) __obj.updateDynamic("checkKeys")(checkKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeWithBufferAndIndexOptions]
  }
}

