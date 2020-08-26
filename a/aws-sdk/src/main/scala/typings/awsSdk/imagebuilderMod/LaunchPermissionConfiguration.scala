package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionConfiguration extends js.Object {
  /**
    * The name of the group. 
    */
  var userGroups: js.UndefOr[StringList] = js.native
  /**
    * The AWS account ID. 
    */
  var userIds: js.UndefOr[AccountList] = js.native
}

object LaunchPermissionConfiguration {
  @scala.inline
  def apply(): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
  @scala.inline
  implicit class LaunchPermissionConfigurationOps[Self <: LaunchPermissionConfiguration] (val x: Self) extends AnyVal {
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
    def setUserGroupsVarargs(value: NonEmptyString*): Self = this.set("userGroups", js.Array(value :_*))
    @scala.inline
    def setUserGroups(value: StringList): Self = this.set("userGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserGroups: Self = this.set("userGroups", js.undefined)
    @scala.inline
    def setUserIdsVarargs(value: NonEmptyString*): Self = this.set("userIds", js.Array(value :_*))
    @scala.inline
    def setUserIds(value: AccountList): Self = this.set("userIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIds: Self = this.set("userIds", js.undefined)
  }
  
}

