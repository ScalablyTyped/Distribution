package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsamSettings extends js.Object {
  /**
    * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
    */
  var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.native
  /**
    * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
    */
  var ResponseSignalPreroll: js.UndefOr[integerMin0Max30000] = js.native
  /**
    * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing instructions that you provide in the setting SCC XML (sccXml).
    */
  var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.native
}

object EsamSettings {
  @scala.inline
  def apply(): EsamSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamSettings]
  }
  @scala.inline
  implicit class EsamSettingsOps[Self <: EsamSettings] (val x: Self) extends AnyVal {
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
    def setManifestConfirmConditionNotification(value: EsamManifestConfirmConditionNotification): Self = this.set("ManifestConfirmConditionNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestConfirmConditionNotification: Self = this.set("ManifestConfirmConditionNotification", js.undefined)
    @scala.inline
    def setResponseSignalPreroll(value: integerMin0Max30000): Self = this.set("ResponseSignalPreroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseSignalPreroll: Self = this.set("ResponseSignalPreroll", js.undefined)
    @scala.inline
    def setSignalProcessingNotification(value: EsamSignalProcessingNotification): Self = this.set("SignalProcessingNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalProcessingNotification: Self = this.set("SignalProcessingNotification", js.undefined)
  }
  
}

