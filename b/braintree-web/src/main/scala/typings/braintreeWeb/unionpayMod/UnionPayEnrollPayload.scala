package typings.braintreeWeb.unionpayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionPayEnrollPayload extends js.Object {
  var enrollmentId: String = js.native
  var smsCodeRequired: Boolean = js.native
}

object UnionPayEnrollPayload {
  @scala.inline
  def apply(enrollmentId: String, smsCodeRequired: Boolean): UnionPayEnrollPayload = {
    val __obj = js.Dynamic.literal(enrollmentId = enrollmentId.asInstanceOf[js.Any], smsCodeRequired = smsCodeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayEnrollPayload]
  }
  @scala.inline
  implicit class UnionPayEnrollPayloadOps[Self <: UnionPayEnrollPayload] (val x: Self) extends AnyVal {
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
    def setEnrollmentId(value: String): Self = this.set("enrollmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmsCodeRequired(value: Boolean): Self = this.set("smsCodeRequired", value.asInstanceOf[js.Any])
  }
  
}

