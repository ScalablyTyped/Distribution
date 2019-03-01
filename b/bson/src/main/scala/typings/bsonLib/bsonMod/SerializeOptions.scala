package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends CommonSerializeOptions {
  /** {default:1024*1024*17}, minimum size of the internal temporary serialization buffer. */
  var minInternalBufferSize: js.UndefOr[scala.Double] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(
    checkKeys: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    minInternalBufferSize: scala.Int | scala.Double = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkKeys)) __obj.updateDynamic("checkKeys")(checkKeys)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (minInternalBufferSize != null) __obj.updateDynamic("minInternalBufferSize")(minInternalBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    __obj.asInstanceOf[SerializeOptions]
  }
}

