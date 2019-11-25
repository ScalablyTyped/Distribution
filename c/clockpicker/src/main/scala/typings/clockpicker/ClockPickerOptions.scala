package typings.clockpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockPickerOptions extends js.Object {
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var donetext: js.UndefOr[String] = js.undefined
  var fromnow: js.UndefOr[Double] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var twelvehour: js.UndefOr[Boolean] = js.undefined
  var vibrate: js.UndefOr[Boolean] = js.undefined
}

object ClockPickerOptions {
  @scala.inline
  def apply(
    afterDone: () => Unit = null,
    afterHide: () => Unit = null,
    afterHourSelect: () => Unit = null,
    afterShow: () => Unit = null,
    align: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    beforeDone: () => Unit = null,
    beforeHide: () => Unit = null,
    beforeHourSelect: () => Unit = null,
    beforeShow: () => Unit = null,
    default: String = null,
    donetext: String = null,
    fromnow: Int | Double = null,
    init: () => Unit = null,
    placement: String = null,
    twelvehour: js.UndefOr[Boolean] = js.undefined,
    vibrate: js.UndefOr[Boolean] = js.undefined
  ): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (afterDone != null) __obj.updateDynamic("afterDone")(js.Any.fromFunction0(afterDone))
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction0(afterHide))
    if (afterHourSelect != null) __obj.updateDynamic("afterHourSelect")(js.Any.fromFunction0(afterHourSelect))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction0(afterShow))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    if (beforeDone != null) __obj.updateDynamic("beforeDone")(js.Any.fromFunction0(beforeDone))
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(js.Any.fromFunction0(beforeHide))
    if (beforeHourSelect != null) __obj.updateDynamic("beforeHourSelect")(js.Any.fromFunction0(beforeHourSelect))
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction0(beforeShow))
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (donetext != null) __obj.updateDynamic("donetext")(donetext.asInstanceOf[js.Any])
    if (fromnow != null) __obj.updateDynamic("fromnow")(fromnow.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(twelvehour)) __obj.updateDynamic("twelvehour")(twelvehour.asInstanceOf[js.Any])
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockPickerOptions]
  }
}

