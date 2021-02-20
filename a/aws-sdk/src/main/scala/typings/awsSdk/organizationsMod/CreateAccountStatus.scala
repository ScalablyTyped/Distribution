package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountStatus extends StObject {
  
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
    * If the request failed, a description of the reason for the failure.   ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of accounts in your organization.   CONCURRENT_ACCOUNT_MODIFICATION: You already submitted a request with the same information.   EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address already exists.   GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US) Region could not be created because this Region already includes an account with that email address.   INVALID_ADDRESS: The account could not be created because the address you provided is not valid.   INVALID_EMAIL: The account could not be created because the email address you provided is not valid.   INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the problem persists, contact Customer Support.   MISSING_BUSINESS_VALIDATION: The AWS account that owns your organization has not received Business Validation.    MISSING_PAYMENT_INSTRUMENT: You must configure the management account with a valid payment method, such as a credit card.  
    */
  var FailureReason: js.UndefOr[CreateAccountFailureReason] = js.native
  
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account in the AWS GovCloud (US) Region.
    */
  var GovCloudAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The unique identifier (ID) that references this request. You get this value from the response of the initial CreateAccount request to create the account. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
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
  implicit class CreateAccountStatusMutableBuilder[Self <: CreateAccountStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: AccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    @scala.inline
    def setCompletedTimestamp(value: Timestamp): Self = StObject.set(x, "CompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedTimestampUndefined: Self = StObject.set(x, "CompletedTimestamp", js.undefined)
    
    @scala.inline
    def setFailureReason(value: CreateAccountFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setGovCloudAccountId(value: AccountId): Self = StObject.set(x, "GovCloudAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGovCloudAccountIdUndefined: Self = StObject.set(x, "GovCloudAccountId", js.undefined)
    
    @scala.inline
    def setId(value: CreateAccountRequestId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRequestedTimestamp(value: Timestamp): Self = StObject.set(x, "RequestedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedTimestampUndefined: Self = StObject.set(x, "RequestedTimestamp", js.undefined)
    
    @scala.inline
    def setState(value: CreateAccountState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
