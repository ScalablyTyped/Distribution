package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRoleAliasResponse extends js.Object {
  /**
    * The role alias description.
    */
  var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.native
}

object DescribeRoleAliasResponse {
  @scala.inline
  def apply(): DescribeRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoleAliasResponse]
  }
  @scala.inline
  implicit class DescribeRoleAliasResponseOps[Self <: DescribeRoleAliasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleAliasDescription(value: RoleAliasDescription): Self = this.set("roleAliasDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAliasDescription: Self = this.set("roleAliasDescription", js.undefined)
  }
  
}

