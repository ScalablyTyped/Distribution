package typings.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionError extends js.Object {
  var connectionError: js.UndefOr[Boolean] = js.undefined
}

object AnonConnectionError {
  @scala.inline
  def apply(connectionError: js.UndefOr[Boolean] = js.undefined): AnonConnectionError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectionError)) __obj.updateDynamic("connectionError")(connectionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionError]
  }
}

