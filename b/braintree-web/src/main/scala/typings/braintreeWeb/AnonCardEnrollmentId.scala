package typings.braintreeWeb

import typings.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardEnrollmentId extends js.Object {
  var card: js.Any
  var enrollmentId: String
  var hostedFields: HostedFields_
  var smsCode: String
}

object AnonCardEnrollmentId {
  @scala.inline
  def apply(card: js.Any, enrollmentId: String, hostedFields: HostedFields_, smsCode: String): AnonCardEnrollmentId = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], enrollmentId = enrollmentId.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], smsCode = smsCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardEnrollmentId]
  }
}

