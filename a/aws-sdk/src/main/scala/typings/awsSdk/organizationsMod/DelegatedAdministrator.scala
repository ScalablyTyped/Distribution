package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatedAdministrator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delegated administrator's account.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  /**
    * The date when the account was made a delegated administrator.
    */
  var DelegationEnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The email address that is associated with the delegated administrator's AWS account.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.native
  /**
    * The unique identifier (ID) of the delegated administrator's account.
    */
  var Id: js.UndefOr[AccountId] = js.native
  /**
    * The method by which the delegated administrator's account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  /**
    * The date when the delegated administrator's account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The friendly name of the delegated administrator's account.
    */
  var Name: js.UndefOr[AccountName] = js.native
  /**
    * The status of the delegated administrator's account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}

object DelegatedAdministrator {
  @scala.inline
  def apply(
    Arn: AccountArn = null,
    DelegationEnabledDate: Timestamp = null,
    Email: Email = null,
    Id: AccountId = null,
    JoinedMethod: AccountJoinedMethod = null,
    JoinedTimestamp: Timestamp = null,
    Name: AccountName = null,
    Status: AccountStatus = null
  ): DelegatedAdministrator = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DelegationEnabledDate != null) __obj.updateDynamic("DelegationEnabledDate")(DelegationEnabledDate.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JoinedMethod != null) __obj.updateDynamic("JoinedMethod")(JoinedMethod.asInstanceOf[js.Any])
    if (JoinedTimestamp != null) __obj.updateDynamic("JoinedTimestamp")(JoinedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegatedAdministrator]
  }
}

