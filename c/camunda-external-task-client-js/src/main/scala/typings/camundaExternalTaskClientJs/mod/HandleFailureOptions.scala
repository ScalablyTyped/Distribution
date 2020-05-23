package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFailureOptions extends js.Object {
  var errorDetails: js.UndefOr[String] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var retryTimeout: js.UndefOr[Double] = js.undefined
}

object HandleFailureOptions {
  @scala.inline
  def apply(
    errorDetails: String = null,
    errorMessage: String = null,
    retries: js.UndefOr[Double] = js.undefined,
    retryTimeout: js.UndefOr[Double] = js.undefined
  ): HandleFailureOptions = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryTimeout)) __obj.updateDynamic("retryTimeout")(retryTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFailureOptions]
  }
}

