package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleFailureOptions extends js.Object {
  var errorDetails: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var retries: js.UndefOr[Double] = js.native
  var retryTimeout: js.UndefOr[Double] = js.native
}

object HandleFailureOptions {
  @scala.inline
  def apply(): HandleFailureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleFailureOptions]
  }
  @scala.inline
  implicit class HandleFailureOptionsOps[Self <: HandleFailureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setRetryTimeout(value: Double): Self = this.set("retryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryTimeout: Self = this.set("retryTimeout", js.undefined)
  }
  
}

