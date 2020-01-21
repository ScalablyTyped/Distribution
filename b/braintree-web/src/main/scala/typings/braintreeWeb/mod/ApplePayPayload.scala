package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePayPayload extends js.Object {
  var displayName: String
  var domainName: String
  var merchantIdentifier: String
}

object ApplePayPayload {
  @scala.inline
  def apply(displayName: String, domainName: String, merchantIdentifier: String): ApplePayPayload = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], merchantIdentifier = merchantIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplePayPayload]
  }
}

