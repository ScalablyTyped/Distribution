package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartContactRecordingRequest extends js.Object {
  /**
    * The identifier of the contact.
    */
  var ContactId: typings.awsSdk.connectMod.ContactId = js.native
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * Who is being recorded.
    */
  var VoiceRecordingConfiguration: typings.awsSdk.connectMod.VoiceRecordingConfiguration = js.native
}

object StartContactRecordingRequest {
  @scala.inline
  def apply(
    ContactId: ContactId,
    InitialContactId: ContactId,
    InstanceId: InstanceId,
    VoiceRecordingConfiguration: VoiceRecordingConfiguration
  ): StartContactRecordingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VoiceRecordingConfiguration = VoiceRecordingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContactRecordingRequest]
  }
  @scala.inline
  implicit class StartContactRecordingRequestOps[Self <: StartContactRecordingRequest] (val x: Self) extends AnyVal {
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
    def setContactId(value: ContactId): Self = this.set("ContactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialContactId(value: ContactId): Self = this.set("InitialContactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceRecordingConfiguration(value: VoiceRecordingConfiguration): Self = this.set("VoiceRecordingConfiguration", value.asInstanceOf[js.Any])
  }
  
}

