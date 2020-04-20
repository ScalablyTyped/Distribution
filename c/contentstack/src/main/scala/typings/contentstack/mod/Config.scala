package typings.contentstack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var access_token: String
  var api_key: String
  var environment: String
}

object Config {
  @scala.inline
  def apply(access_token: String, api_key: String, environment: String): Config = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

