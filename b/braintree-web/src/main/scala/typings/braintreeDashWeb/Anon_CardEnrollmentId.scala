package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.HostedFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardEnrollmentId extends js.Object {
  var card: js.Any
  var enrollmentId: String
  var hostedFields: HostedFields
  var smsCode: String
}

object Anon_CardEnrollmentId {
  @scala.inline
  def apply(card: js.Any, enrollmentId: String, hostedFields: HostedFields, smsCode: String): Anon_CardEnrollmentId = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], enrollmentId = enrollmentId.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], smsCode = smsCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CardEnrollmentId]
  }
}

