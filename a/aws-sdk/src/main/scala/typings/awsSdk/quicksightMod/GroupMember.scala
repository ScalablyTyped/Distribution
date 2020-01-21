package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMember extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the group member (user).
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The name of the group member (user).
    */
  var MemberName: js.UndefOr[GroupMemberName] = js.native
}

object GroupMember {
  @scala.inline
  def apply(Arn: Arn = null, MemberName: GroupMemberName = null): GroupMember = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (MemberName != null) __obj.updateDynamic("MemberName")(MemberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMember]
  }
}

