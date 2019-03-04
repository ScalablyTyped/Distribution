package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientKount extends js.Object {
  var client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client
  var kount: scala.Boolean
  var paypal: scala.Boolean
}

object Anon_ClientKount {
  @scala.inline
  def apply(
    client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client,
    kount: scala.Boolean,
    paypal: scala.Boolean
  ): Anon_ClientKount = {
    val __obj = js.Dynamic.literal(client = client, kount = kount, paypal = paypal)
  
    __obj.asInstanceOf[Anon_ClientKount]
  }
}

