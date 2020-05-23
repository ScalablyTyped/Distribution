package typings.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  val access_token: String
  val expire: String
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String, expire: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

