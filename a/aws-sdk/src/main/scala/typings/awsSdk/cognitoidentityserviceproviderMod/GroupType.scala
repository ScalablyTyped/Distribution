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
  def apply(): GroupType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupType]
  }
  @scala.inline
  implicit class GroupTypeOps[Self <: GroupType] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDescription(value: DescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGroupName(value: GroupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setPrecedence(value: PrecedenceType): Self = this.set("Precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecedence: Self = this.set("Precedence", js.undefined)
    @scala.inline
    def setRoleArn(value: ArnType): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

