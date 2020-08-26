package typings.cesium.anon

import typings.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  var accessToken: String = js.native
  var server: String | Resource = js.native
}

object AccessToken {
  @scala.inline
  def apply(accessToken: String, server: String | Resource): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  @scala.inline
  implicit class AccessTokenOps[Self <: AccessToken] (val x: Self) extends AnyVal {
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
    def setServer(value: String | Resource): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

