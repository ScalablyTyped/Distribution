package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyBuffer extends js.Object {
  var copyBuffer: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[js.Function] = js.undefined
  var set: js.UndefOr[js.Function] = js.undefined
  var useBigIntAsLong: js.UndefOr[Boolean] = js.undefined
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
}

object CopyBuffer {
  @scala.inline
  def apply(
    copyBuffer: js.UndefOr[Boolean] = js.undefined,
    map: js.Function = null,
    set: js.Function = null,
    useBigIntAsLong: js.UndefOr[Boolean] = js.undefined,
    useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined,
    useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
  ): CopyBuffer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyBuffer)) __obj.updateDynamic("copyBuffer")(copyBuffer.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(useBigIntAsLong)) __obj.updateDynamic("useBigIntAsLong")(useBigIntAsLong.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBigIntAsVarint)) __obj.updateDynamic("useBigIntAsVarint")(useBigIntAsVarint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUndefinedAsUnset)) __obj.updateDynamic("useUndefinedAsUnset")(useUndefinedAsUnset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBuffer]
  }
}

