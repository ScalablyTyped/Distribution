package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2NetworkInterfaceSecurityGroup extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2NetworkInterfaceSecurityGroup {
  @scala.inline
  def apply(GroupId: NonEmptyString = null, GroupName: NonEmptyString = null): AwsEc2NetworkInterfaceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2NetworkInterfaceSecurityGroup]
  }
}

