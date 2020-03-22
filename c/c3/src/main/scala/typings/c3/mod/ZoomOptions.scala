package typings.c3.mod

import typings.c3.AnonMin
import typings.c3.c3Strings.drag
import typings.c3.c3Strings.scroll
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  /**
    * Disable the default animation of zoom. This option is useful when you want to get the zoomed domain by `onzoom` or `onzoomend` handlers and override the default animation behavior.
    * @see https://github.com/c3js/c3/pull/2439 for details.
    */
  var disableDefaultBehavior: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Change zoom extent.
    * **Experimental.**
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * Set the initial minimum and maximum x-axis zoom values.
    */
  var initialRange: js.UndefOr[Domain] = js.undefined
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* event */ Event_, Unit]] = js.undefined
  var priveleged: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[Boolean] = js.undefined
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[scroll | drag] = js.undefined
  var x: js.UndefOr[AnonMin] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    disableDefaultBehavior: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extent: js.Tuple2[Double, Double] = null,
    initialRange: Domain = null,
    onzoom: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit] = null,
    onzoomend: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit] = null,
    onzoomstart: js.ThisFunction1[/* this */ ChartAPI, /* event */ Event_, Unit] = null,
    priveleged: js.UndefOr[Boolean] = js.undefined,
    rescale: js.UndefOr[Boolean] = js.undefined,
    `type`: scroll | drag = null,
    x: AnonMin = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDefaultBehavior)) __obj.updateDynamic("disableDefaultBehavior")(disableDefaultBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (onzoom != null) __obj.updateDynamic("onzoom")(onzoom.asInstanceOf[js.Any])
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(onzoomend.asInstanceOf[js.Any])
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(onzoomstart.asInstanceOf[js.Any])
    if (!js.isUndefined(priveleged)) __obj.updateDynamic("priveleged")(priveleged.asInstanceOf[js.Any])
    if (!js.isUndefined(rescale)) __obj.updateDynamic("rescale")(rescale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

