package typings.braintreeWeb

import typings.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: Client_
}

object AnonClient {
  @scala.inline
  def apply(client: Client_): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

