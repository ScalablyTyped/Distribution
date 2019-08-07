package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientVersion extends js.Object {
  var client: Client
  var version: Double
}

object Anon_ClientVersion {
  @scala.inline
  def apply(client: Client, version: Double): Anon_ClientVersion = {
    val __obj = js.Dynamic.literal(client = client, version = version)
  
    __obj.asInstanceOf[Anon_ClientVersion]
  }
}

