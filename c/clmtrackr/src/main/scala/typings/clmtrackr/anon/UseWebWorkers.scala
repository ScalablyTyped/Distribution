package typings.clmtrackr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseWebWorkers extends js.Object {
  /** whether to use web workers for face detection (default is true) */
  var useWebWorkers: js.UndefOr[Boolean] = js.undefined
}

object UseWebWorkers {
  @scala.inline
  def apply(useWebWorkers: js.UndefOr[Boolean] = js.undefined): UseWebWorkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useWebWorkers)) __obj.updateDynamic("useWebWorkers")(useWebWorkers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseWebWorkers]
  }
}

