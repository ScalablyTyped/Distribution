package typings.countupDotJs.countupDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountUp extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  // #region Dynamic params
  // Will appear(or not) in the CountUpInstance object once the other functions fire
  // i.e. paused will return undefined instead of boolean unless the pauseResume() was called before
  var countDown: js.UndefOr[Boolean] = js.native
  var d: js.UndefOr[js.Any] = js.native
  var dec: js.UndefOr[Double] = js.native
  var decimals: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var endVal: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var frameVal: js.UndefOr[Double] = js.native
  var initialized: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[CountUpOptions] = js.native
  var paused: js.UndefOr[Boolean] = js.native
  var rAF: js.UndefOr[Double] = js.native
  var remaining: js.UndefOr[Double] = js.native
  var startTime: js.UndefOr[Double] = js.native
  var startVal: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  // #endregion
  /**
    * @param timestamp
    */
  def count(timestamp: Double): Unit = js.native
  def initialize(): Boolean = js.native
  /**
    * Toggles pause/resume animation.
    */
  def pauseResume(): Unit = js.native
  /**
    * Print value to target.
    * @param value number that will be passed to formattingFn and then printed to the target
    */
  def printValue(value: Double): Unit = js.native
  /**
    * Reset to startVal so animation can be run again.
    */
  def reset(): Unit = js.native
  /**
    * Start your animation.
    * @param callback Option callback to run on animation end
    */
  def start(): Unit = js.native
  def start(callback: js.Function0[Unit]): Unit = js.native
  def update(newEndVal: String): Unit = js.native
  /**
    * Pass a new endVal and start animation.
    * @param newEndVal new value
    */
  def update(newEndVal: Double): Unit = js.native
  def version(): String = js.native
}

