package typings.cordovaPluginMediaCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates audio capture configuration options. */
trait AudioOptions extends js.Object {
  /** The maximum duration of a audio clip, in seconds. */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of audio clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[Double] = js.undefined
}

object AudioOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, limit: js.UndefOr[Double] = js.undefined): AudioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOptions]
  }
}

