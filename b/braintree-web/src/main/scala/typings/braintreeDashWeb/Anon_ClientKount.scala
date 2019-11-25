package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientKount extends js.Object {
  var client: Client
  var kount: Boolean
  var paypal: Boolean
}

object Anon_ClientKount {
  @scala.inline
  def apply(client: Client, kount: Boolean, paypal: Boolean): Anon_ClientKount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], kount = kount.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientKount]
  }
}

