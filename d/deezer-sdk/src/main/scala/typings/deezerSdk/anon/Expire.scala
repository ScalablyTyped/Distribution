package typings.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expire extends js.Object {
  var accessToken: String = js.native
  var expire: String = js.native
  var userID: String = js.native
}

object Expire {
  @scala.inline
  def apply(accessToken: String, expire: String, userID: String): Expire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
  @scala.inline
  implicit class ExpireOps[Self <: Expire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpire(value: String): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
  }
  
}

