package typings.cordovaDashPluginDashMediaDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates video capture configuration options. */
trait VideoOptions extends js.Object {
  /** The maximum duration of a video clip, in seconds. */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of video clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[Double] = js.undefined
}

object VideoOptions {
  @scala.inline
  def apply(duration: Int | Double = null, limit: Int | Double = null): VideoOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOptions]
  }
}

