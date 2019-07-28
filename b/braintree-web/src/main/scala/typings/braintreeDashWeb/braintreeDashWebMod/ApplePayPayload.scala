package typings.braintreeDashWeb.braintreeDashWebMod

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
    val __obj = js.Dynamic.literal(displayName = displayName, domainName = domainName, merchantIdentifier = merchantIdentifier)
  
    __obj.asInstanceOf[ApplePayPayload]
  }
}

