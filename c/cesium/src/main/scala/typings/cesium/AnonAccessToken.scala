package typings.cesium

import typings.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken extends js.Object {
  var accessToken: String
  var server: String | Resource
}

object AnonAccessToken {
  @scala.inline
  def apply(accessToken: String, server: String | Resource): AnonAccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessToken]
  }
}

