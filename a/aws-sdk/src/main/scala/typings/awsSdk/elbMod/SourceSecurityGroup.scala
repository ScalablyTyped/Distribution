package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSecurityGroup extends js.Object {
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.native
}

object SourceSecurityGroup {
  @scala.inline
  def apply(GroupName: SecurityGroupName = null, OwnerAlias: SecurityGroupOwnerAlias = null): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSecurityGroup]
  }
}

