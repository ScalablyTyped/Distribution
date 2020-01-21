package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputSecurityGroupResponse extends js.Object {
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.native
}

object UpdateInputSecurityGroupResponse {
  @scala.inline
  def apply(SecurityGroup: InputSecurityGroup = null): UpdateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputSecurityGroupResponse]
  }
}

