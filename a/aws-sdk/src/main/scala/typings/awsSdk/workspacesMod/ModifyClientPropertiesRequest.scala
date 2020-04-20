package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClientPropertiesRequest extends js.Object {
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: typings.awsSdk.workspacesMod.ClientProperties = js.native
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: NonEmptyString = js.native
}

object ModifyClientPropertiesRequest {
  @scala.inline
  def apply(ClientProperties: ClientProperties, ResourceId: NonEmptyString): ModifyClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ClientProperties = ClientProperties.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientPropertiesRequest]
  }
}

