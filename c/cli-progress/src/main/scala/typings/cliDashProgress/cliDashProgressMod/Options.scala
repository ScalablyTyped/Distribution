package typings.cliDashProgress.cliDashProgressMod

import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  /** number of updates with which to calculate the eta; higher numbers give a more stable eta (default: 10) */
  var etaBuffer: js.UndefOr[Double] = js.undefined
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
  /** hide the cursor during progress operation; restored on complete (default: false) */
  var hideCursor: js.UndefOr[Boolean] = js.undefined
  /** disable line wrapping (default: false) - pass null to keep terminal settings; pass true to trim the output to terminal width */
  var linewrap: js.UndefOr[Boolean | Null] = js.undefined
  /**  automatically call stop() when the value reaches the total (default: false) */
  var stopOnComplete: js.UndefOr[Boolean] = js.undefined
  /** output stream to use (default: process.stderr) */
  var stream: js.UndefOr[WritableStream] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    barCompleteChar: String = null,
    barCompleteString: String = null,
    barIncompleteChar: String = null,
    barIncompleteString: String = null,
    barsize: Int | Double = null,
    clearOnComplete: js.UndefOr[Boolean] = js.undefined,
    etaBuffer: Int | Double = null,
    format: String = null,
    fps: Int | Double = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    linewrap: js.UndefOr[Boolean] = js.undefined,
    stopOnComplete: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (barCompleteChar != null) __obj.updateDynamic("barCompleteChar")(barCompleteChar)
    if (barCompleteString != null) __obj.updateDynamic("barCompleteString")(barCompleteString)
    if (barIncompleteChar != null) __obj.updateDynamic("barIncompleteChar")(barIncompleteChar)
    if (barIncompleteString != null) __obj.updateDynamic("barIncompleteString")(barIncompleteString)
    if (barsize != null) __obj.updateDynamic("barsize")(barsize.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnComplete)) __obj.updateDynamic("clearOnComplete")(clearOnComplete)
    if (etaBuffer != null) __obj.updateDynamic("etaBuffer")(etaBuffer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor)
    if (!js.isUndefined(linewrap)) __obj.updateDynamic("linewrap")(linewrap)
    if (!js.isUndefined(stopOnComplete)) __obj.updateDynamic("stopOnComplete")(stopOnComplete)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Options]
  }
}

