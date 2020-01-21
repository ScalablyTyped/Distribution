package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactAttributesRequest extends js.Object {
  /**
    * The identifier of the initial contact.
    */
  var InitialContactId: ContactId = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}

object GetContactAttributesRequest {
  @scala.inline
  def apply(InitialContactId: ContactId, InstanceId: InstanceId): GetContactAttributesRequest = {
    val __obj = js.Dynamic.literal(InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetContactAttributesRequest]
  }
}

