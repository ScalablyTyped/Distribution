package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccesstoken extends js.Object {
  val access_token: String
  val expire: String
}

object AnonAccesstoken {
  @scala.inline
  def apply(access_token: String, expire: String): AnonAccesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccesstoken]
  }
}

