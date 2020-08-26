package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier you provide to ensure idempotency of application creation.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * Description of the new application
    */
  var description: js.UndefOr[AppDescription] = js.native
  /**
    * Name of the new application.
    */
  var name: js.UndefOr[AppName] = js.native
  /**
    * Name of service role in customer's account to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of server groups to include in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of tags to be associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(): CreateAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppRequest]
  }
  @scala.inline
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setDescription(value: AppDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: AppName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    @scala.inline
    def setServerGroupsVarargs(value: ServerGroup*): Self = this.set("serverGroups", js.Array(value :_*))
    @scala.inline
    def setServerGroups(value: ServerGroups): Self = this.set("serverGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerGroups: Self = this.set("serverGroups", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

