package typings.cesium.anon

import typings.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: String
  var server: String | Resource
}

object AccessToken {
  @scala.inline
  def apply(accessToken: String, server: String | Resource): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
}

