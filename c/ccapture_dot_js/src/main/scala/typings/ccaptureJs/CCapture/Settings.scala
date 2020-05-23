package typings.ccaptureJs.CCapture

import typings.ccaptureJs.ccaptureJsStrings.ffmpegserver
import typings.ccaptureJs.ccaptureJsStrings.gif
import typings.ccaptureJs.ccaptureJsStrings.jpg
import typings.ccaptureJs.ccaptureJsStrings.png
import typings.ccaptureJs.ccaptureJsStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * It will automatically download the captured data every n seconds (only available for webm/png/jpg)
    */
  var autoSaveTime: js.UndefOr[Double] = js.undefined
  /**
    * Adds a widget with capturing info
    */
  var display: js.UndefOr[Boolean] = js.undefined
  var format: webm | gif | png | jpg | ffmpegserver
  /**
    * Target framerate for the capture
    */
  var framerate: js.UndefOr[Double] = js.undefined
  /**
    * Super-sampling of frames to create a motion-blurred frame (0 or 1 make no effect)
    */
  var motionBlurFrames: js.UndefOr[Double] = js.undefined
  /**
    * Name of the files to be exported. if no name is provided, a GUID will be generated
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Quality for webm/jpg
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Skip to that mark (seconds)
    */
  var startTime: js.UndefOr[Double] = js.undefined
  /**
    * Automatically stops and downloads when reaching that time (seconds).
    * Very convenient for long captures: set it and forget it (remember autoSaveTime!)
    */
  var timeLimit: js.UndefOr[Double] = js.undefined
  /**
    * Dumps info on the console
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to the gif worker script
    */
  var workersPath: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    format: webm | gif | png | jpg | ffmpegserver,
    autoSaveTime: js.UndefOr[Double] = js.undefined,
    display: js.UndefOr[Boolean] = js.undefined,
    framerate: js.UndefOr[Double] = js.undefined,
    motionBlurFrames: js.UndefOr[Double] = js.undefined,
    name: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined,
    timeLimit: js.UndefOr[Double] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    workersPath: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSaveTime)) __obj.updateDynamic("autoSaveTime")(autoSaveTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framerate)) __obj.updateDynamic("framerate")(framerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionBlurFrames)) __obj.updateDynamic("motionBlurFrames")(motionBlurFrames.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeLimit)) __obj.updateDynamic("timeLimit")(timeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (workersPath != null) __obj.updateDynamic("workersPath")(workersPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

