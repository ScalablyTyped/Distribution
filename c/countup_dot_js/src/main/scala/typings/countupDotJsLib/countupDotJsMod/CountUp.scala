package typings
package countupDotJsLib.countupDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountUp extends js.Object {
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.native
  // #region Dynamic params
  // Will appear(or not) in the CountUpInstance object once the other functions fire
  // i.e. paused will return undefined instead of boolean unless the pauseResume() was called before
  var countDown: js.UndefOr[scala.Boolean] = js.native
  var d: js.UndefOr[js.Any] = js.native
  var dec: js.UndefOr[scala.Double] = js.native
  var decimals: js.UndefOr[scala.Double] = js.native
  var duration: js.UndefOr[scala.Double] = js.native
  var endVal: js.UndefOr[scala.Double] = js.native
  var error: js.UndefOr[java.lang.String] = js.native
  var frameVal: js.UndefOr[scala.Double] = js.native
  var initialized: js.UndefOr[scala.Boolean] = js.native
  var options: js.UndefOr[countupDotJsLib.countupDotJsMod.CountUpNs.CountUpOptions] = js.native
  var paused: js.UndefOr[scala.Boolean] = js.native
  var rAF: js.UndefOr[scala.Double] = js.native
  var remaining: js.UndefOr[scala.Double] = js.native
  var startTime: js.UndefOr[scala.Double] = js.native
  var startVal: js.UndefOr[scala.Double] = js.native
  var timestamp: js.UndefOr[scala.Double] = js.native
  // #endregion
  /**
    * @param timestamp
    */
  def count(timestamp: scala.Double): scala.Unit = js.native
  def initialize(): scala.Boolean = js.native
  /**
    * Toggles pause/resume animation.
    */
  def pauseResume(): scala.Unit = js.native
  /**
    * Print value to target.
    * @param value number that will be passed to formattingFn and then printed to the target
    */
  def printValue(value: scala.Double): scala.Unit = js.native
  /**
    * Reset to startVal so animation can be run again.
    */
  def reset(): scala.Unit = js.native
  /**
    * Start your animation.
    * @param callback Option callback to run on animation end
    */
  def start(): scala.Unit = js.native
  def start(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(newEndVal: java.lang.String): scala.Unit = js.native
  /**
    * Pass a new endVal and start animation.
    * @param newEndVal new value
    */
  def update(newEndVal: scala.Double): scala.Unit = js.native
  def version(): java.lang.String = js.native
}

