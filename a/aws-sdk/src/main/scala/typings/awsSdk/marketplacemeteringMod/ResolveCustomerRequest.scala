package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCustomerRequest extends js.Object {
  /**
    * When a buyer visits your website during the registration process, the buyer submits a registration token through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
    */
  var RegistrationToken: NonEmptyString = js.native
}

object ResolveCustomerRequest {
  @scala.inline
  def apply(RegistrationToken: NonEmptyString): ResolveCustomerRequest = {
    val __obj = js.Dynamic.literal(RegistrationToken = RegistrationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCustomerRequest]
  }
}

