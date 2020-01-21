package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopyBuffer extends js.Object {
  var copyBuffer: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[js.Function] = js.undefined
  var set: js.UndefOr[js.Function] = js.undefined
  var useBigIntAsLong: js.UndefOr[Boolean] = js.undefined
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
}

object AnonCopyBuffer {
  @scala.inline
  def apply(
    copyBuffer: js.UndefOr[Boolean] = js.undefined,
    map: js.Function = null,
    set: js.Function = null,
    useBigIntAsLong: js.UndefOr[Boolean] = js.undefined,
    useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined,
    useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
  ): AnonCopyBuffer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyBuffer)) __obj.updateDynamic("copyBuffer")(copyBuffer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(useBigIntAsLong)) __obj.updateDynamic("useBigIntAsLong")(useBigIntAsLong.asInstanceOf[js.Any])
    if (!js.isUndefined(useBigIntAsVarint)) __obj.updateDynamic("useBigIntAsVarint")(useBigIntAsVarint.asInstanceOf[js.Any])
    if (!js.isUndefined(useUndefinedAsUnset)) __obj.updateDynamic("useUndefinedAsUnset")(useUndefinedAsUnset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCopyBuffer]
  }
}

