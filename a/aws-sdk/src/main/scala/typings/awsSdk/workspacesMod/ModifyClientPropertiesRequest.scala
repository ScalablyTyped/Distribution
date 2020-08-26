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
  @scala.inline
  implicit class ModifyClientPropertiesRequestOps[Self <: ModifyClientPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setClientProperties(value: ClientProperties): Self = this.set("ClientProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
  
}

