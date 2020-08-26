package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionData extends js.Object {
  @JSName("~referring_link")
  var Tildereferring_link: js.UndefOr[String] = js.native
  var has_app: Boolean = js.native
  var identity: String = js.native
  var referring_identity: js.UndefOr[String] = js.native
}

object SessionData {
  @scala.inline
  def apply(has_app: Boolean, identity: String): SessionData = {
    val __obj = js.Dynamic.literal(has_app = has_app.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionData]
  }
  @scala.inline
  implicit class SessionDataOps[Self <: SessionData] (val x: Self) extends AnyVal {
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
    def setHas_app(value: Boolean): Self = this.set("has_app", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTildereferring_link(value: String): Self = this.set("~referring_link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTildereferring_link: Self = this.set("~referring_link", js.undefined)
    @scala.inline
    def setReferring_identity(value: String): Self = this.set("referring_identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferring_identity: Self = this.set("referring_identity", js.undefined)
  }
  
}

