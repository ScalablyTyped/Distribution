package typings.cloudmersiveVirusApiClient.anon

import typings.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apikey extends js.Object {
  var Apikey: ApiInstanceAuthentications
}

object Apikey {
  @scala.inline
  def apply(Apikey: ApiInstanceAuthentications): Apikey = {
    val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
}

