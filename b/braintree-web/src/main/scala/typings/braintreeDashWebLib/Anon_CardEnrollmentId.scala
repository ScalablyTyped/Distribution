package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardEnrollmentId extends js.Object {
  var card: js.Any
  var enrollmentId: java.lang.String
  var hostedFields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFields
  var smsCode: java.lang.String
}

object Anon_CardEnrollmentId {
  @scala.inline
  def apply(
    card: js.Any,
    enrollmentId: java.lang.String,
    hostedFields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFields,
    smsCode: java.lang.String
  ): Anon_CardEnrollmentId = {
    val __obj = js.Dynamic.literal(card = card, enrollmentId = enrollmentId, hostedFields = hostedFields, smsCode = smsCode)
  
    __obj.asInstanceOf[Anon_CardEnrollmentId]
  }
}

