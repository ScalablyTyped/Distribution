package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationAdjustment extends js.Object {
  var amount: java.lang.String
  var processorResponseCode: java.lang.String
  var processorResponseText: java.lang.String
  var processorResponseType: java.lang.String
  var success: scala.Boolean
  var timestamp: stdLib.Date
}

object AuthorizationAdjustment {
  @scala.inline
  def apply(
    amount: java.lang.String,
    processorResponseCode: java.lang.String,
    processorResponseText: java.lang.String,
    processorResponseType: java.lang.String,
    success: scala.Boolean,
    timestamp: stdLib.Date
  ): AuthorizationAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount, processorResponseCode = processorResponseCode, processorResponseText = processorResponseText, processorResponseType = processorResponseType, success = success, timestamp = timestamp)
  
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
}

