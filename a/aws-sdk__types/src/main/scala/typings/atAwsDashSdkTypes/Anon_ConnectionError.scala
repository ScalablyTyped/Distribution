package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionError extends js.Object {
  var connectionError: js.UndefOr[Boolean] = js.undefined
}

object Anon_ConnectionError {
  @scala.inline
  def apply(connectionError: js.UndefOr[Boolean] = js.undefined): Anon_ConnectionError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectionError)) __obj.updateDynamic("connectionError")(connectionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConnectionError]
  }
}

