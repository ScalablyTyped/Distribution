package typings.cassandraDashDriver

import typings.std.MapConstructor
import typings.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var copyBuffer: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[MapConstructor | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var set: js.UndefOr[SetConstructor | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var useBigIntAsLong: js.UndefOr[Boolean] = js.undefined
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    copyBuffer: js.UndefOr[Boolean] = js.undefined,
    map: MapConstructor | (js.Function1[/* repeated */ js.Any, _]) = null,
    set: SetConstructor | (js.Function1[/* repeated */ js.Any, _]) = null,
    useBigIntAsLong: js.UndefOr[Boolean] = js.undefined,
    useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined,
    useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyBuffer)) __obj.updateDynamic("copyBuffer")(copyBuffer)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(useBigIntAsLong)) __obj.updateDynamic("useBigIntAsLong")(useBigIntAsLong)
    if (!js.isUndefined(useBigIntAsVarint)) __obj.updateDynamic("useBigIntAsVarint")(useBigIntAsVarint)
    if (!js.isUndefined(useUndefinedAsUnset)) __obj.updateDynamic("useUndefinedAsUnset")(useUndefinedAsUnset)
    __obj.asInstanceOf[Anon_Args]
  }
}

