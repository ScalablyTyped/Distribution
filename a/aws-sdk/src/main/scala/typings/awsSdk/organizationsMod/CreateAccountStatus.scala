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
  def apply(): CreateAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountStatus]
  }
  @scala.inline
  implicit class CreateAccountStatusOps[Self <: CreateAccountStatus] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setAccountName(value: AccountName): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("AccountName", js.undefined)
    @scala.inline
    def setCompletedTimestamp(value: Timestamp): Self = this.set("CompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedTimestamp: Self = this.set("CompletedTimestamp", js.undefined)
    @scala.inline
    def setFailureReason(value: CreateAccountFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setGovCloudAccountId(value: AccountId): Self = this.set("GovCloudAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGovCloudAccountId: Self = this.set("GovCloudAccountId", js.undefined)
    @scala.inline
    def setId(value: CreateAccountRequestId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setRequestedTimestamp(value: Timestamp): Self = this.set("RequestedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedTimestamp: Self = this.set("RequestedTimestamp", js.undefined)
    @scala.inline
    def setState(value: CreateAccountState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

