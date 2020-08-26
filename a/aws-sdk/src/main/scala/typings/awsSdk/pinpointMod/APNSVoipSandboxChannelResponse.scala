package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSVoipSandboxChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the APNs VoIP sandbox channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time when the APNs VoIP sandbox channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.native
  /**
    * Specifies whether the APNs VoIP sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the APNs VoIP sandbox channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the APNs VoIP sandbox channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the APNs VoIP sandbox channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the APNs VoIP sandbox channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time when the APNs VoIP sandbox channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the APNs VoIP sandbox channel, this value is APNS_VOIP_SANDBOX.
    */
  var Platform: string = js.native
  /**
    * The current version of the APNs VoIP sandbox channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object APNSVoipSandboxChannelResponse {
  @scala.inline
  def apply(Platform: string): APNSVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSVoipSandboxChannelResponse]
  }
  @scala.inline
  implicit class APNSVoipSandboxChannelResponseOps[Self <: APNSVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
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
    def setPlatform(value: string): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDefaultAuthenticationMethod(value: string): Self = this.set("DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAuthenticationMethod: Self = this.set("DefaultAuthenticationMethod", js.undefined)
    @scala.inline
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setHasCredential(value: boolean): Self = this.set("HasCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCredential: Self = this.set("HasCredential", js.undefined)
    @scala.inline
    def setHasTokenKey(value: boolean): Self = this.set("HasTokenKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTokenKey: Self = this.set("HasTokenKey", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setIsArchived(value: boolean): Self = this.set("IsArchived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArchived: Self = this.set("IsArchived", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: string): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setVersion(value: integer): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

