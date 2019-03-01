package typings
package clockpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockPickerOptions extends js.Object {
  var afterDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterHourSelect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var align: js.UndefOr[java.lang.String] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var beforeDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeHourSelect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var donetext: js.UndefOr[java.lang.String] = js.undefined
  var fromnow: js.UndefOr[scala.Double] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var twelvehour: js.UndefOr[scala.Boolean] = js.undefined
  var vibrate: js.UndefOr[scala.Boolean] = js.undefined
}

object ClockPickerOptions {
  @scala.inline
  def apply(
    afterDone: js.Function0[scala.Unit] = null,
    afterHide: js.Function0[scala.Unit] = null,
    afterHourSelect: js.Function0[scala.Unit] = null,
    afterShow: js.Function0[scala.Unit] = null,
    align: java.lang.String = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    beforeDone: js.Function0[scala.Unit] = null,
    beforeHide: js.Function0[scala.Unit] = null,
    beforeHourSelect: js.Function0[scala.Unit] = null,
    beforeShow: js.Function0[scala.Unit] = null,
    default: java.lang.String = null,
    donetext: java.lang.String = null,
    fromnow: scala.Int | scala.Double = null,
    init: js.Function0[scala.Unit] = null,
    placement: java.lang.String = null,
    twelvehour: js.UndefOr[scala.Boolean] = js.undefined,
    vibrate: js.UndefOr[scala.Boolean] = js.undefined
  ): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (afterDone != null) __obj.updateDynamic("afterDone")(afterDone)
    if (afterHide != null) __obj.updateDynamic("afterHide")(afterHide)
    if (afterHourSelect != null) __obj.updateDynamic("afterHourSelect")(afterHourSelect)
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (beforeDone != null) __obj.updateDynamic("beforeDone")(beforeDone)
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(beforeHide)
    if (beforeHourSelect != null) __obj.updateDynamic("beforeHourSelect")(beforeHourSelect)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (default != null) __obj.updateDynamic("default")(default)
    if (donetext != null) __obj.updateDynamic("donetext")(donetext)
    if (fromnow != null) __obj.updateDynamic("fromnow")(fromnow.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(twelvehour)) __obj.updateDynamic("twelvehour")(twelvehour)
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate)
    __obj.asInstanceOf[ClockPickerOptions]
  }
}

