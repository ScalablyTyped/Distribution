package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change zoom extent.
    */
  var extent: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.Function1[/* domain */ js.Any, scala.Unit]] = js.undefined
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.Function1[/* domain */ js.Any, scala.Unit]] = js.undefined
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[c3Lib.c3LibStrings.scroll | c3Lib.c3LibStrings.drag] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    extent: js.Tuple2[scala.Double, scala.Double] = null,
    onzoom: js.Function1[/* domain */ js.Any, scala.Unit] = null,
    onzoomend: js.Function1[/* domain */ js.Any, scala.Unit] = null,
    onzoomstart: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    rescale: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: c3Lib.c3LibStrings.scroll | c3Lib.c3LibStrings.drag = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (onzoom != null) __obj.updateDynamic("onzoom")(onzoom)
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(onzoomend)
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(onzoomstart)
    if (!js.isUndefined(rescale)) __obj.updateDynamic("rescale")(rescale)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

