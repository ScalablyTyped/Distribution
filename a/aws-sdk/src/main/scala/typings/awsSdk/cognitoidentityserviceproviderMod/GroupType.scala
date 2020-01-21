package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupType extends js.Object {
  /**
    * The date the group was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A string containing the description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The name of the group.
    */
  var GroupName: js.UndefOr[GroupNameType] = js.native
  /**
    * The date the group was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. If a user belongs to two or more groups, it is the group with the highest precedence whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Groups with higher Precedence values take precedence over groups with lower Precedence values or with null Precedence values. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.native
  /**
    * The role ARN for the group.
    */
  var RoleArn: js.UndefOr[ArnType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object GroupType {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    Description: DescriptionType = null,
    GroupName: GroupNameType = null,
    LastModifiedDate: DateType = null,
    Precedence: Int | Double = null,
    RoleArn: ArnType = null,
    UserPoolId: UserPoolIdType = null
  ): GroupType = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Precedence != null) __obj.updateDynamic("Precedence")(Precedence.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupType]
  }
}

