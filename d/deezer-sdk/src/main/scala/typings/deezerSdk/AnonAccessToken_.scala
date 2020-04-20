package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken_ extends js.Object {
  var accessToken: String
  var expire: String
}

object AnonAccessToken_ {
  @scala.inline
  def apply(accessToken: String, expire: String): AnonAccessToken_ = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessToken_]
  }
}

