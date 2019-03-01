package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardHostedFields extends js.Object {
  var card: js.Any
  var hostedFields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFields
  var mobile: js.Any
}

object Anon_CardHostedFields {
  @scala.inline
  def apply(
    card: js.Any,
    hostedFields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFields,
    mobile: js.Any
  ): Anon_CardHostedFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("card")(card)
    __obj.updateDynamic("hostedFields")(hostedFields)
    __obj.updateDynamic("mobile")(mobile)
    __obj.asInstanceOf[Anon_CardHostedFields]
  }
}

