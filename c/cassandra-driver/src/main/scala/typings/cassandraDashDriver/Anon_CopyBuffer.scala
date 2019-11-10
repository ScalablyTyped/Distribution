package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyBuffer extends js.Object {
  var copyBuffer: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[js.Function] = js.undefined
  var set: js.UndefOr[js.Function] = js.undefined
  var useBigIntAsLong: js.UndefOr[Boolean] = js.undefined
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
}

object Anon_CopyBuffer {
  @scala.inline
  def apply(
    copyBuffer: js.UndefOr[Boolean] = js.undefined,
    map: js.Function = null,
    set: js.Function = null,
    useBigIntAsLong: js.UndefOr[Boolean] = js.undefined,
    useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined,
    useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
  ): Anon_CopyBuffer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyBuffer)) __obj.updateDynamic("copyBuffer")(copyBuffer)
    if (map != null) __obj.updateDynamic("map")(map)
    if (set != null) __obj.updateDynamic("set")(set)
    if (!js.isUndefined(useBigIntAsLong)) __obj.updateDynamic("useBigIntAsLong")(useBigIntAsLong)
    if (!js.isUndefined(useBigIntAsVarint)) __obj.updateDynamic("useBigIntAsVarint")(useBigIntAsVarint)
    if (!js.isUndefined(useUndefinedAsUnset)) __obj.updateDynamic("useUndefinedAsUnset")(useUndefinedAsUnset)
    __obj.asInstanceOf[Anon_CopyBuffer]
  }
}

