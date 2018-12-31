package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubchartOptions extends js.Object {
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.Function1[/* domain */ js.Any, scala.Unit]] = js.undefined
  /**
    * Show sub chart on the bottom of the chart.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[c3Lib.Anon_Height] = js.undefined
}

