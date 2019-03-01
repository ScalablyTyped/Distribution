package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

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
  var enrollmentId: java.lang.String
  var smsCodeRequired: scala.Boolean
}

object UnionPayEnrollPayload {
  @scala.inline
  def apply(enrollmentId: java.lang.String, smsCodeRequired: scala.Boolean): UnionPayEnrollPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enrollmentId")(enrollmentId)
    __obj.updateDynamic("smsCodeRequired")(smsCodeRequired)
    __obj.asInstanceOf[UnionPayEnrollPayload]
  }
}

