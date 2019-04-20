package typings
package deezerDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: java.lang.String
  var expire: java.lang.String
}

trait Anon_Accesstoken extends js.Object {
  val access_token: java.lang.String
  val expire: java.lang.String
}

object Anon_AccessToken {
  @scala.inline
  def apply(accessToken: java.lang.String, expire: java.lang.String): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expire = expire)
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

object Anon_Accesstoken {
  @scala.inline
  def apply(access_token: java.lang.String, expire: java.lang.String): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token, expire = expire)
  
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

