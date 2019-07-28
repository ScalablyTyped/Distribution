package typings.clmtrackr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseWebWorkers extends js.Object {
  /** whether to use web workers for face detection (default is true) */
  var useWebWorkers: js.UndefOr[Boolean] = js.undefined
}

object Anon_UseWebWorkers {
  @scala.inline
  def apply(useWebWorkers: js.UndefOr[Boolean] = js.undefined): Anon_UseWebWorkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useWebWorkers)) __obj.updateDynamic("useWebWorkers")(useWebWorkers)
    __obj.asInstanceOf[Anon_UseWebWorkers]
  }
}

