package typings.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accesstoken extends js.Object {
  val access_token: String = js.native
  val expire: String = js.native
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String, expire: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpire(value: String): Self = this.set("expire", value.asInstanceOf[js.Any])
  }
  
}

