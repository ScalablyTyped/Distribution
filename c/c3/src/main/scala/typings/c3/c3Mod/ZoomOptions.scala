package typings.c3.c3Mod

import typings.c3.c3Strings.drag
import typings.c3.c3Strings.scroll
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Change zoom extent.
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.Function1[/* domain */ js.Any, Unit]] = js.undefined
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.Function1[/* domain */ js.Any, Unit]] = js.undefined
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[Boolean] = js.undefined
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[scroll | drag] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    extent: js.Tuple2[Double, Double] = null,
    onzoom: /* domain */ js.Any => Unit = null,
    onzoomend: /* domain */ js.Any => Unit = null,
    onzoomstart: /* event */ Event => Unit = null,
    rescale: js.UndefOr[Boolean] = js.undefined,
    `type`: scroll | drag = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (onzoom != null) __obj.updateDynamic("onzoom")(js.Any.fromFunction1(onzoom))
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(js.Any.fromFunction1(onzoomend))
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(js.Any.fromFunction1(onzoomstart))
    if (!js.isUndefined(rescale)) __obj.updateDynamic("rescale")(rescale)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

