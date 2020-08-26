package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionContextAttributes extends js.Object {
  /**
    * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
    */
  var creationDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var mfaAuthenticated: js.UndefOr[boolean] = js.native
}

object SessionContextAttributes {
  @scala.inline
  def apply(): SessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContextAttributes]
  }
  @scala.inline
  implicit class SessionContextAttributesOps[Self <: SessionContextAttributes] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: timestampIso8601): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setMfaAuthenticated(value: boolean): Self = this.set("mfaAuthenticated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfaAuthenticated: Self = this.set("mfaAuthenticated", js.undefined)
  }
  
}

