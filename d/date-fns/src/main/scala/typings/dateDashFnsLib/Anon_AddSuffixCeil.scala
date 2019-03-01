package typings
package dateDashFnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffixCeil extends js.Object {
  var addSuffix: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var partialMethod: js.UndefOr[
    dateDashFnsLib.dateDashFnsLibStrings.floor | dateDashFnsLib.dateDashFnsLibStrings.ceil | dateDashFnsLib.dateDashFnsLibStrings.round
  ] = js.undefined
  var unit: js.UndefOr[
    dateDashFnsLib.dateDashFnsLibStrings.s | dateDashFnsLib.dateDashFnsLibStrings.m | dateDashFnsLib.dateDashFnsLibStrings.h | dateDashFnsLib.dateDashFnsLibStrings.d | dateDashFnsLib.dateDashFnsLibStrings.M | dateDashFnsLib.dateDashFnsLibStrings.Y
  ] = js.undefined
}

object Anon_AddSuffixCeil {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[scala.Boolean] = js.undefined,
    locale: js.Object = null,
    partialMethod: dateDashFnsLib.dateDashFnsLibStrings.floor | dateDashFnsLib.dateDashFnsLibStrings.ceil | dateDashFnsLib.dateDashFnsLibStrings.round = null,
    unit: dateDashFnsLib.dateDashFnsLibStrings.s | dateDashFnsLib.dateDashFnsLibStrings.m | dateDashFnsLib.dateDashFnsLibStrings.h | dateDashFnsLib.dateDashFnsLibStrings.d | dateDashFnsLib.dateDashFnsLibStrings.M | dateDashFnsLib.dateDashFnsLibStrings.Y = null
  ): Anon_AddSuffixCeil = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (partialMethod != null) __obj.updateDynamic("partialMethod")(partialMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddSuffixCeil]
  }
}

