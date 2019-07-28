package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: Client
}

object Anon_Client {
  @scala.inline
  def apply(client: Client): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

