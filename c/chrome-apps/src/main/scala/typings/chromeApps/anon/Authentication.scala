package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authentication extends js.Object {
  var Authentication: String = js.native
}

object Authentication {
  @scala.inline
  def apply(Authentication: String): Authentication = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  @scala.inline
  implicit class AuthenticationOps[Self <: Authentication] (val x: Self) extends AnyVal {
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
    def setAuthentication(value: String): Self = this.set("Authentication", value.asInstanceOf[js.Any])
  }
  
}

