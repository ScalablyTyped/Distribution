package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: braintreeDashWebLib.braintreeDashWebMod.Client
}

object Anon_Client {
  @scala.inline
  def apply(client: braintreeDashWebLib.braintreeDashWebMod.Client): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

