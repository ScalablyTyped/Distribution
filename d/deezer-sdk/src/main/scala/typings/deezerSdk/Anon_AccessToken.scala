package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: String
  var expire: String
}

object Anon_AccessToken {
  @scala.inline
  def apply(accessToken: String, expire: String): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

