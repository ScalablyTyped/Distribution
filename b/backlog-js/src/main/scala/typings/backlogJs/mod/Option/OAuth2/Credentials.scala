package typings.backlogJs.mod.Option.OAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var clientId: String
  var clientSecret: String
}

object Credentials {
  @scala.inline
  def apply(clientId: String, clientSecret: String): Credentials = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Credentials]
  }
}

