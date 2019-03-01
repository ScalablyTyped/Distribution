package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var copyBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[stdLib.MapConstructor | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var set: js.UndefOr[stdLib.SetConstructor | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var useBigIntAsLong: js.UndefOr[scala.Boolean] = js.undefined
  var useBigIntAsVarint: js.UndefOr[scala.Boolean] = js.undefined
  var useUndefinedAsUnset: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    copyBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    map: stdLib.MapConstructor | (js.Function1[/* repeated */ js.Any, _]) = null,
    set: stdLib.SetConstructor | (js.Function1[/* repeated */ js.Any, _]) = null,
    useBigIntAsLong: js.UndefOr[scala.Boolean] = js.undefined,
    useBigIntAsVarint: js.UndefOr[scala.Boolean] = js.undefined,
    useUndefinedAsUnset: js.UndefOr[scala.Boolean] = js.undefined
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

