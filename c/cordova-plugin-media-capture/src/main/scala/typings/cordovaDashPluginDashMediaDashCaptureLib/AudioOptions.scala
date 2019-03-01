package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates audio capture configuration options. */
trait AudioOptions extends js.Object {
  /** The maximum duration of a audio clip, in seconds. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of audio clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object AudioOptions {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, limit: scala.Int | scala.Double = null): AudioOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOptions]
  }
}

