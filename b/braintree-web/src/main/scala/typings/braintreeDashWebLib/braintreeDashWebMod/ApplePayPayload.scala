package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePayPayload extends js.Object {
  var displayName: java.lang.String
  var domainName: java.lang.String
  var merchantIdentifier: java.lang.String
}

object ApplePayPayload {
  @scala.inline
  def apply(displayName: java.lang.String, domainName: java.lang.String, merchantIdentifier: java.lang.String): ApplePayPayload = {
    val __obj = js.Dynamic.literal(displayName = displayName, domainName = domainName, merchantIdentifier = merchantIdentifier)
  
    __obj.asInstanceOf[ApplePayPayload]
  }
}

