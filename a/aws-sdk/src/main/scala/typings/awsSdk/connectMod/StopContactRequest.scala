package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContactRequest extends js.Object {
  /**
    * The ID of the contact.
    */
  var ContactId: typings.awsSdk.connectMod.ContactId = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}

object StopContactRequest {
  @scala.inline
  def apply(ContactId: ContactId, InstanceId: InstanceId): StopContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContactRequest]
  }
}

