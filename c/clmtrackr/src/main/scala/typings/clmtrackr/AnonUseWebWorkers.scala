package typings.clmtrackr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseWebWorkers extends js.Object {
  /** whether to use web workers for face detection (default is true) */
  var useWebWorkers: js.UndefOr[Boolean] = js.undefined
}

object AnonUseWebWorkers {
  @scala.inline
  def apply(useWebWorkers: js.UndefOr[Boolean] = js.undefined): AnonUseWebWorkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useWebWorkers)) __obj.updateDynamic("useWebWorkers")(useWebWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseWebWorkers]
  }
}

