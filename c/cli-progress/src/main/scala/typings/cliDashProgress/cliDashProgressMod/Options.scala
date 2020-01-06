package typings.cliDashProgress.cliDashProgressMod

import typings.cliDashProgress.cliDashProgressStrings.center
import typings.cliDashProgress.cliDashProgressStrings.left
import typings.cliDashProgress.cliDashProgressStrings.right
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**  position of the progress bar - 'left' (default), 'right' or 'center  */
  var align: js.UndefOr[left | right | center] = js.undefined
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteChar: js.UndefOr[String] = js.undefined
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteString: js.UndefOr[String] = js.undefined
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteChar: js.UndefOr[String] = js.undefined
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteString: js.UndefOr[String] = js.undefined
  /** the length of the progress bar in chars (default: 40) */
  var barsize: js.UndefOr[Double] = js.undefined
  /** clear the progress bar on complete / stop() call (default: false) */
  var clearOnComplete: js.UndefOr[Boolean] = js.undefined
  /** display progress bars with 'total' of zero(0) as empty, not full (default: false) */
  var emptyOnZero: js.UndefOr[Boolean] = js.undefined
  /** number of updates with which to calculate the eta; higher numbers give a more stable eta (default: 10) */
  var etaBuffer: js.UndefOr[Double] = js.undefined
  /** trigger redraw on every frame even if progress remains the same; can be useful if progress bar gets overwritten by other concurrent writes to the terminal (default: false) */
  var forceRedraw: js.UndefOr[Boolean] = js.undefined
  /**
    * progress bar output format.
    * The progressbar can be customized by using the following build-in placeholders. They can be combined in any order.
    *   {bar} - the progress bar, customizable by the options barsize, barCompleteString and barIncompleteString
    *   {percentage} - the current progress in percent (0-100)
    *   {total} - the end value
    *   {value} - the current value set by last update() call
    *   {eta} - expected time of accomplishment in seconds
    *   {duration} - elapsed time in seconds
    *   {eta_formatted} - expected time of accomplishment formatted into appropriate units
    *   {duration_formatted} - elapsed time formatted into appropriate units
    *
    * Example:
    *      progress [{bar}] {percentage}% | ETA: {eta}s | {value}/{total}
    *    is rendered as
    *      progress [========================================] 100% | ETA: 0s | 200/200
    */
  var format: js.UndefOr[String] = js.undefined
  /** the maximum update rate (default: 10) */
  var fps: js.UndefOr[Double] = js.undefined
  /**
    * hide the cursor during progress operation; restored on complete (default: false)
    * - pass `null` to keep terminal settings
    */
  var hideCursor: js.UndefOr[Boolean | Null] = js.undefined
  /** disable line wrapping (default: false) - pass null to keep terminal settings; pass true to trim the output to terminal width */
  var linewrap: js.UndefOr[Boolean | Null] = js.undefined
  /** enable scheduled output to notty streams - e.g. redirect to files (default: false) */
  var noTTYOutput: js.UndefOr[Boolean] = js.undefined
  /** set the output schedule/interval for notty output in ms (default: 2000ms) */
  var notTTYSchedule: js.UndefOr[Double] = js.undefined
  /**  automatically call stop() when the value reaches the total (default: false) */
  var stopOnComplete: js.UndefOr[Boolean] = js.undefined
  /** output stream to use (default: process.stderr) */
  var stream: js.UndefOr[WritableStream] = js.undefined
  /** trigger redraw during update() in case threshold time x2 is exceeded (default: true) - limited to single bar usage */
  var synchronousUpdate: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: left | right | center = null,
    barCompleteChar: String = null,
    barCompleteString: String = null,
    barIncompleteChar: String = null,
    barIncompleteString: String = null,
    barsize: Int | Double = null,
    clearOnComplete: js.UndefOr[Boolean] = js.undefined,
    emptyOnZero: js.UndefOr[Boolean] = js.undefined,
    etaBuffer: Int | Double = null,
    forceRedraw: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    fps: Int | Double = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    linewrap: js.UndefOr[Boolean] = js.undefined,
    noTTYOutput: js.UndefOr[Boolean] = js.undefined,
    notTTYSchedule: Int | Double = null,
    stopOnComplete: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    synchronousUpdate: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (barCompleteChar != null) __obj.updateDynamic("barCompleteChar")(barCompleteChar.asInstanceOf[js.Any])
    if (barCompleteString != null) __obj.updateDynamic("barCompleteString")(barCompleteString.asInstanceOf[js.Any])
    if (barIncompleteChar != null) __obj.updateDynamic("barIncompleteChar")(barIncompleteChar.asInstanceOf[js.Any])
    if (barIncompleteString != null) __obj.updateDynamic("barIncompleteString")(barIncompleteString.asInstanceOf[js.Any])
    if (barsize != null) __obj.updateDynamic("barsize")(barsize.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnComplete)) __obj.updateDynamic("clearOnComplete")(clearOnComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(emptyOnZero)) __obj.updateDynamic("emptyOnZero")(emptyOnZero.asInstanceOf[js.Any])
    if (etaBuffer != null) __obj.updateDynamic("etaBuffer")(etaBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRedraw)) __obj.updateDynamic("forceRedraw")(forceRedraw.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(linewrap)) __obj.updateDynamic("linewrap")(linewrap.asInstanceOf[js.Any])
    if (!js.isUndefined(noTTYOutput)) __obj.updateDynamic("noTTYOutput")(noTTYOutput.asInstanceOf[js.Any])
    if (notTTYSchedule != null) __obj.updateDynamic("notTTYSchedule")(notTTYSchedule.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnComplete)) __obj.updateDynamic("stopOnComplete")(stopOnComplete.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronousUpdate)) __obj.updateDynamic("synchronousUpdate")(synchronousUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

