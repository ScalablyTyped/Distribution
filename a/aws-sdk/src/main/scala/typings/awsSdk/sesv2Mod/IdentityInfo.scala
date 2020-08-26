package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityInfo extends js.Object {
  /**
    * The address or domain of the identity.
    */
  var IdentityName: js.UndefOr[Identity] = js.native
  /**
    * The email identity type. The identity type can be one of the following:    EMAIL_ADDRESS – The identity is an email address.    DOMAIN – The identity is a domain.    MANAGED_DOMAIN – The identity is a domain that is managed by AWS.  
    */
  var IdentityType: js.UndefOr[typings.awsSdk.sesv2Mod.IdentityType] = js.native
  /**
    * Indicates whether or not you can send email from the identity. An identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon SES to send email from that identity.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object IdentityInfo {
  @scala.inline
  def apply(): IdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityInfo]
  }
  @scala.inline
  implicit class IdentityInfoOps[Self <: IdentityInfo] (val x: Self) extends AnyVal {
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
    def setIdentityName(value: Identity): Self = this.set("IdentityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityName: Self = this.set("IdentityName", js.undefined)
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityType: Self = this.set("IdentityType", js.undefined)
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = this.set("SendingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendingEnabled: Self = this.set("SendingEnabled", js.undefined)
  }
  
}

