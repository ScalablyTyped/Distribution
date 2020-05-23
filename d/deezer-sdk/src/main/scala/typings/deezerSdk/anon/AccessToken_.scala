package typings.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken_ extends js.Object {
  var accessToken: String
  var expire: String
}

object AccessToken_ {
  @scala.inline
  def apply(accessToken: String, expire: String): AccessToken_ = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken_]
  }
}

