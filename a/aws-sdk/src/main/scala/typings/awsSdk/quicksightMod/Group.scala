package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the group.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The group description.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The name of the group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.quicksightMod.GroupName] = js.native
  /**
    * The principal ID of the group.
    */
  var PrincipalId: js.UndefOr[String] = js.native
}

object Group {
  @scala.inline
  def apply(
    Arn: Arn = null,
    Description: GroupDescription = null,
    GroupName: GroupName = null,
    PrincipalId: String = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

