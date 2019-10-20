package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFailureOptions extends js.Object {
  var errorDetails: js.UndefOr[String] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var retires: js.UndefOr[Double] = js.undefined
  var retryTimeout: js.UndefOr[Double] = js.undefined
}

object HandleFailureOptions {
  @scala.inline
  def apply(
    errorDetails: String = null,
    errorMessage: String = null,
    retires: Int | Double = null,
    retryTimeout: Int | Double = null
  ): HandleFailureOptions = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (retires != null) __obj.updateDynamic("retires")(retires.asInstanceOf[js.Any])
    if (retryTimeout != null) __obj.updateDynamic("retryTimeout")(retryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFailureOptions]
  }
}

