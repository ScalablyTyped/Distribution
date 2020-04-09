package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountStatus extends js.Object {
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: js.UndefOr[typings.awsSdk.organizationsMod.AccountId] = js.native
  /**
    * The account name given to the account when it was created.
    */
  var AccountName: js.UndefOr[typings.awsSdk.organizationsMod.AccountName] = js.native
  /**
    * The date and time that the account was created and the request completed.
    */
  var CompletedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * If the request failed, a description of the reason for the failure.   ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of accounts in your organization.   EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address already exists.   GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US) Region could not be created because this Region already includes an account with that email address.   INVALID_ADDRESS: The account could not be created because the address you provided is not valid.   INVALID_EMAIL: The account could not be created because the email address you provided is not valid.   INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the problem persists, contact Customer Support.  
    */
  var FailureReason: js.UndefOr[CreateAccountFailureReason] = js.native
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account in the AWS GovCloud (US) Region.
    */
  var GovCloudAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The unique identifier (ID) that references this request. You get this value from the response of the initial CreateAccount request to create the account. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[CreateAccountRequestId] = js.native
  /**
    * The date and time that the request was made for the account creation.
    */
  var RequestedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the request.
    */
  var State: js.UndefOr[CreateAccountState] = js.native
}

object CreateAccountStatus {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    AccountName: AccountName = null,
    CompletedTimestamp: Timestamp = null,
    FailureReason: CreateAccountFailureReason = null,
    GovCloudAccountId: AccountId = null,
    Id: CreateAccountRequestId = null,
    RequestedTimestamp: Timestamp = null,
    State: CreateAccountState = null
  ): CreateAccountStatus = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AccountName != null) __obj.updateDynamic("AccountName")(AccountName.asInstanceOf[js.Any])
    if (CompletedTimestamp != null) __obj.updateDynamic("CompletedTimestamp")(CompletedTimestamp.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (GovCloudAccountId != null) __obj.updateDynamic("GovCloudAccountId")(GovCloudAccountId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (RequestedTimestamp != null) __obj.updateDynamic("RequestedTimestamp")(RequestedTimestamp.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountStatus]
  }
}

