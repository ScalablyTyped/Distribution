package typings
package bsonLib.bsonMod

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
    checkKeys: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializeWithBufferAndIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkKeys)) __obj.updateDynamic("checkKeys")(checkKeys)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    __obj.asInstanceOf[SerializeWithBufferAndIndexOptions]
  }
}

