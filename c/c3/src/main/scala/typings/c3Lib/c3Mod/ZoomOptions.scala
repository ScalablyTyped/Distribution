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

