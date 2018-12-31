package typings
package cliDashProgressLib.cliDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-progress", "Bar")
@js.native
class Bar protected () extends js.Object {
  /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
  def this(opt: Options) = this()
  def this(opt: Options, preset: Preset) = this()
  def calculateETA(): scala.Unit = js.native
  def formatTime(t: js.Any, roundToMultipleOf: js.Any): js.Any = js.native
  def getTotal(): js.Any = js.native
  /** Increases the current progress value by a specified amount (default +1). Update payload optionally */
  def increment(step: scala.Double): scala.Unit = js.native
  def increment(step: scala.Double, payload: js.Object): scala.Unit = js.native
  def render(): scala.Unit = js.native
  /** Sets the total progress value while progressbar is active. Especially useful handling dynamic tasks. */
  def setTotal(total: scala.Double): scala.Unit = js.native
  /** Starts the progress bar and set the total and initial value */
  def start(total: scala.Double, startValue: scala.Double): scala.Unit = js.native
  def start(total: scala.Double, startValue: scala.Double, payload: js.Object): scala.Unit = js.native
  /** Stops the progress bar and go to next line */
  def stop(): scala.Unit = js.native
  def stopTimer(): scala.Unit = js.native
  /** Sets the current progress value and optionally the payload with values of custom tokens as a second parameter */
  def update(current: scala.Double): scala.Unit = js.native
  def update(current: scala.Double, payload: js.Object): scala.Unit = js.native
}

