package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * A string containing the description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The name of the group. Must be unique.
    */
  var GroupName: GroupNameType = js.native
  /**
    * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower Precedence values take precedence over groups with higher or null Precedence values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.native
  /**
    * The role ARN for the group.
    */
  var RoleArn: js.UndefOr[ArnType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(
    GroupName: GroupNameType,
    UserPoolId: UserPoolIdType,
    Description: DescriptionType = null,
    Precedence: js.UndefOr[PrecedenceType] = js.undefined,
    RoleArn: ArnType = null
  ): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Precedence)) __obj.updateDynamic("Precedence")(Precedence.get.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

