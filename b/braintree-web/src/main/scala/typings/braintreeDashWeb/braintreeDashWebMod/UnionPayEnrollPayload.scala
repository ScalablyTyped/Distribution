package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} enrollmentId UnionPay enrollment ID. This value should be passed to `tokenize`.
  * @property {boolean} smsCodeRequired UnionPay `smsCodeRequired` flag.
  * </p><b>true</b> - the user will receive an SMS code that needs to be supplied for tokenization.
  * </p><b>false</b> - the card can be immediately tokenized.
  */
trait UnionPayEnrollPayload extends js.Object {
  var enrollmentId: String
  var smsCodeRequired: Boolean
}

object UnionPayEnrollPayload {
  @scala.inline
  def apply(enrollmentId: String, smsCodeRequired: Boolean): UnionPayEnrollPayload = {
    val __obj = js.Dynamic.literal(enrollmentId = enrollmentId.asInstanceOf[js.Any], smsCodeRequired = smsCodeRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnionPayEnrollPayload]
  }
}

