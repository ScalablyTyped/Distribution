package typings.dateDashFns

import typings.dateDashFns.dateDashFnsStrings.M
import typings.dateDashFns.dateDashFnsStrings.Y
import typings.dateDashFns.dateDashFnsStrings.ceil
import typings.dateDashFns.dateDashFnsStrings.d
import typings.dateDashFns.dateDashFnsStrings.floor
import typings.dateDashFns.dateDashFnsStrings.h
import typings.dateDashFns.dateDashFnsStrings.m
import typings.dateDashFns.dateDashFnsStrings.round
import typings.dateDashFns.dateDashFnsStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffixCeil extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var partialMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[s | m | h | d | M | Y] = js.undefined
}

object Anon_AddSuffixCeil {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: js.Object = null,
    partialMethod: floor | ceil | round = null,
    unit: s | m | h | d | M | Y = null
  ): Anon_AddSuffixCeil = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (partialMethod != null) __obj.updateDynamic("partialMethod")(partialMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddSuffixCeil]
  }
}

