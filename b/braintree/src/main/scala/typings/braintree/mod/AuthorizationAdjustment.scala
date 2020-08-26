package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationAdjustment extends js.Object {
  var amount: String = js.native
  var processorResponseCode: String = js.native
  var processorResponseText: String = js.native
  var processorResponseType: String = js.native
  var success: Boolean = js.native
  var timestamp: Date = js.native
}

object AuthorizationAdjustment {
  @scala.inline
  def apply(
    amount: String,
    processorResponseCode: String,
    processorResponseText: String,
    processorResponseType: String,
    success: Boolean,
    timestamp: Date
  ): AuthorizationAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], processorResponseCode = processorResponseCode.asInstanceOf[js.Any], processorResponseText = processorResponseText.asInstanceOf[js.Any], processorResponseType = processorResponseType.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
  @scala.inline
  implicit class AuthorizationAdjustmentOps[Self <: AuthorizationAdjustment] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessorResponseCode(value: String): Self = this.set("processorResponseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessorResponseText(value: String): Self = this.set("processorResponseText", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessorResponseType(value: String): Self = this.set("processorResponseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

