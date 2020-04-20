package typings.cloudmersiveVirusApiClient

import typings.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApikey extends js.Object {
  var Apikey: ApiInstanceAuthentications
}

object AnonApikey {
  @scala.inline
  def apply(Apikey: ApiInstanceAuthentications): AnonApikey = {
    val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApikey]
  }
}

