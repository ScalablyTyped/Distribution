package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifySettings extends js.Object {
  var allow_dismiss: js.UndefOr[scala.Boolean] = js.undefined
  var allow_duplicates: js.UndefOr[scala.Boolean] = js.undefined
  var animate: js.UndefOr[Anon_Enter] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var icon_type: js.UndefOr[java.lang.String] = js.undefined
  var mouse_over: js.UndefOr[java.lang.String] = js.undefined
  var newest_on_top: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double | Anon_X] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* $ele */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var onClosed: js.UndefOr[js.Function1[/* $ele */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* $ele */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var onShown: js.UndefOr[js.Function1[/* $ele */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var placement: js.UndefOr[Anon_Align] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var showProgressbar: js.UndefOr[scala.Boolean] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var timer: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url_target: js.UndefOr[java.lang.String] = js.undefined
  var z_index: js.UndefOr[scala.Double] = js.undefined
}

object NotifySettings {
  @scala.inline
  def apply(
    allow_dismiss: js.UndefOr[scala.Boolean] = js.undefined,
    allow_duplicates: js.UndefOr[scala.Boolean] = js.undefined,
    animate: Anon_Enter = null,
    delay: scala.Int | scala.Double = null,
    element: java.lang.String = null,
    icon_type: java.lang.String = null,
    mouse_over: java.lang.String = null,
    newest_on_top: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Double | Anon_X = null,
    onClose: /* $ele */ jqueryLib.JQuery[stdLib.HTMLElement] => scala.Unit = null,
    onClosed: /* $ele */ jqueryLib.JQuery[stdLib.HTMLElement] => scala.Unit = null,
    onShow: /* $ele */ jqueryLib.JQuery[stdLib.HTMLElement] => scala.Unit = null,
    onShown: /* $ele */ jqueryLib.JQuery[stdLib.HTMLElement] => scala.Unit = null,
    placement: Anon_Align = null,
    position: java.lang.String = null,
    showProgressbar: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    timer: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url_target: java.lang.String = null,
    z_index: scala.Int | scala.Double = null
  ): NotifySettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_dismiss)) __obj.updateDynamic("allow_dismiss")(allow_dismiss)
    if (!js.isUndefined(allow_duplicates)) __obj.updateDynamic("allow_duplicates")(allow_duplicates)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (icon_type != null) __obj.updateDynamic("icon_type")(icon_type)
    if (mouse_over != null) __obj.updateDynamic("mouse_over")(mouse_over)
    if (!js.isUndefined(newest_on_top)) __obj.updateDynamic("newest_on_top")(newest_on_top)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showProgressbar)) __obj.updateDynamic("showProgressbar")(showProgressbar)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url_target != null) __obj.updateDynamic("url_target")(url_target)
    if (z_index != null) __obj.updateDynamic("z_index")(z_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifySettings]
  }
}

