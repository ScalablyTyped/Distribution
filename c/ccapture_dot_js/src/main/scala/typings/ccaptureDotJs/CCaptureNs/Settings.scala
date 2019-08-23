package typings.ccaptureDotJs.CCaptureNs

import typings.ccaptureDotJs.ccaptureDotJsStrings.ffmpegserver
import typings.ccaptureDotJs.ccaptureDotJsStrings.gif
import typings.ccaptureDotJs.ccaptureDotJsStrings.jpg
import typings.ccaptureDotJs.ccaptureDotJsStrings.png
import typings.ccaptureDotJs.ccaptureDotJsStrings.webm
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
    autoSaveTime: Int | Double = null,
    display: js.UndefOr[Boolean] = js.undefined,
    framerate: Int | Double = null,
    motionBlurFrames: Int | Double = null,
    name: String = null,
    quality: Int | Double = null,
    startTime: Int | Double = null,
    timeLimit: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    workersPath: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (autoSaveTime != null) __obj.updateDynamic("autoSaveTime")(autoSaveTime.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (motionBlurFrames != null) __obj.updateDynamic("motionBlurFrames")(motionBlurFrames.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (workersPath != null) __obj.updateDynamic("workersPath")(workersPath)
    __obj.asInstanceOf[Settings]
  }
}

