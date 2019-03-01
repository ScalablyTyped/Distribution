package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client
}

object Anon_Client {
  @scala.inline
  def apply(client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client): Anon_Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[Anon_Client]
  }
}

