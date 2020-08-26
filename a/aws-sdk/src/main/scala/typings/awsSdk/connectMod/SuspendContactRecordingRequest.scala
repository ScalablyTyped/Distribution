package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendContactRecordingRequest extends js.Object {
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
}

object SuspendContactRecordingRequest {
  @scala.inline
  def apply(ContactId: ContactId, InitialContactId: ContactId, InstanceId: InstanceId): SuspendContactRecordingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendContactRecordingRequest]
  }
  @scala.inline
  implicit class SuspendContactRecordingRequestOps[Self <: SuspendContactRecordingRequest] (val x: Self) extends AnyVal {
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
  }
  
}

