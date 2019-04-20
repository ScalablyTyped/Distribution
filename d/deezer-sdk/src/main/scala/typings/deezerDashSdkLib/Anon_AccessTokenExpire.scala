package typings
package deezerDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenExpire extends js.Object {
  var accessToken: java.lang.String
  var expire: java.lang.String
  var userID: java.lang.String
}

object Anon_AccessTokenExpire {
  @scala.inline
  def apply(accessToken: java.lang.String, expire: java.lang.String, userID: java.lang.String): Anon_AccessTokenExpire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expire = expire, userID = userID)
  
    __obj.asInstanceOf[Anon_AccessTokenExpire]
  }
}

