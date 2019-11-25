package typings.deezerDashSdk

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

trait Anon_Accesstoken extends js.Object {
  val access_token: String
  val expire: String
}

object Anon_Accesstoken {
  @scala.inline
  def apply(access_token: String, expire: String): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

