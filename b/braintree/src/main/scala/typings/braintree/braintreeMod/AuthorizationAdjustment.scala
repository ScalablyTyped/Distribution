package typings.braintree.braintreeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationAdjustment extends js.Object {
  var amount: String
  var processorResponseCode: String
  var processorResponseText: String
  var processorResponseType: String
  var success: Boolean
  var timestamp: Date
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
    val __obj = js.Dynamic.literal(amount = amount, processorResponseCode = processorResponseCode, processorResponseText = processorResponseText, processorResponseType = processorResponseType, success = success, timestamp = timestamp)
  
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
}

