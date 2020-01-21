package typings.braintreeWeb

import typings.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientKount extends js.Object {
  var client: Client_
  var kount: Boolean
  var paypal: Boolean
}

object AnonClientKount {
  @scala.inline
  def apply(client: Client_, kount: Boolean, paypal: Boolean): AnonClientKount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], kount = kount.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientKount]
  }
}

