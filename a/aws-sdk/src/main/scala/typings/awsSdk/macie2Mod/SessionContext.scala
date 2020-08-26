package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionContext extends js.Object {
  /**
    * The date and time when the credentials were issued, and whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var attributes: js.UndefOr[SessionContextAttributes] = js.native
  /**
    * The source and type of credentials that were issued to the entity.
    */
  var sessionIssuer: js.UndefOr[SessionIssuer] = js.native
}

object SessionContext {
  @scala.inline
  def apply(): SessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContext]
  }
  @scala.inline
  implicit class SessionContextOps[Self <: SessionContext] (val x: Self) extends AnyVal {
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
    def setAttributes(value: SessionContextAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setSessionIssuer(value: SessionIssuer): Self = this.set("sessionIssuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionIssuer: Self = this.set("sessionIssuer", js.undefined)
  }
  
}

