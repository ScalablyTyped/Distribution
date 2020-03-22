package typings.braintreeWeb

import typings.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends js.Object {
  var client: Client_
  var version: Double
}

object AnonVersion {
  @scala.inline
  def apply(client: Client_, version: Double): AnonVersion = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVersion]
  }
}

