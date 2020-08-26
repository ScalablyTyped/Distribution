package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityDkimEnabledRequest extends js.Object {
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled = js.native
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
}

object SetIdentityDkimEnabledRequest {
  @scala.inline
  def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
  @scala.inline
  implicit class SetIdentityDkimEnabledRequestOps[Self <: SetIdentityDkimEnabledRequest] (val x: Self) extends AnyVal {
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
    def setDkimEnabled(value: Enabled): Self = this.set("DkimEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("Identity", value.asInstanceOf[js.Any])
  }
  
}

