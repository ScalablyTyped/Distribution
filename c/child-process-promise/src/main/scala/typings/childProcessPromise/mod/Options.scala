package typings.childProcessPromise.mod

import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Pass an additional capture option to buffer the result of stdout and/or stderr
    * Default: []
    */
  var capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.undefined
  /**
    * Array of the numbers that should be interpreted as successful execution codes
    * Default: [0]
    */
  var successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capture: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout]) = null,
    successfulExitCodes: js.Array[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (successfulExitCodes != null) __obj.updateDynamic("successfulExitCodes")(successfulExitCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

