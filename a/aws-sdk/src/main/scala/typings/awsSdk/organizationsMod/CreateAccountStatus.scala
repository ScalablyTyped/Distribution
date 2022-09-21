package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountStatus extends StObject {
  
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: js.UndefOr[typings.awsSdk.organizationsMod.AccountId] = js.undefined
  
  /**
    * The account name given to the account when it was created.
    */
  var AccountName: js.UndefOr[CreateAccountName] = js.undefined
  
  /**
    * The date and time that the account was created and the request completed.
    */
  var CompletedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the request failed, a description of the reason for the failure.   ACCOUNT_LIMIT_EXCEEDED: The account couldn't be created because you reached the limit on the number of accounts in your organization.   CONCURRENT_ACCOUNT_MODIFICATION: You already submitted a request with the same information.   EMAIL_ALREADY_EXISTS: The account could not be created because another Amazon Web Services account with that email address already exists.   FAILED_BUSINESS_VALIDATION: The Amazon Web Services account that owns your organization failed to receive business license validation.   GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the Amazon Web Services GovCloud (US) Region could not be created because this Region already includes an account with that email address.   IDENTITY_INVALID_BUSINESS_VALIDATION: The Amazon Web Services account that owns your organization can't complete business license validation because it doesn't have valid identity data.   INVALID_ADDRESS: The account could not be created because the address you provided is not valid.   INVALID_EMAIL: The account could not be created because the email address you provided is not valid.   INVALID_PAYMENT_INSTRUMENT: The Amazon Web Services account that owns your organization does not have a supported payment method associated with the account. Amazon Web Services does not support cards issued by financial institutions in Russia or Belarus. For more information, see Managing your Amazon Web Services payments.   INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the problem persists, contact Amazon Web Services Customer Support.   MISSING_BUSINESS_VALIDATION: The Amazon Web Services account that owns your organization has not received Business Validation.    MISSING_PAYMENT_INSTRUMENT: You must configure the management account with a valid payment method, such as a credit card.   PENDING_BUSINESS_VALIDATION: The Amazon Web Services account that owns your organization is still in the process of completing business license validation.   UNKNOWN_BUSINESS_VALIDATION: The Amazon Web Services account that owns your organization has an unknown issue with business license validation.  
    */
  var FailureReason: js.UndefOr[CreateAccountFailureReason] = js.undefined
  
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account in the Amazon Web Services GovCloud (US) Region.
    */
  var GovCloudAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The unique identifier (ID) that references this request. You get this value from the response of the initial CreateAccount request to create the account. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
    */
  var Id: js.UndefOr[CreateAccountRequestId] = js.undefined
  
  /**
    * The date and time that the request was made for the account creation.
    */
  var RequestedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the asynchronous request to create an Amazon Web Services account.
    */
  var State: js.UndefOr[CreateAccountState] = js.undefined
}
object CreateAccountStatus {
  
  inline def apply(): CreateAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountStatus]
  }
  
  extension [Self <: CreateAccountStatus](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAccountName(value: CreateAccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    inline def setCompletedTimestamp(value: js.Date): Self = StObject.set(x, "CompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCompletedTimestampUndefined: Self = StObject.set(x, "CompletedTimestamp", js.undefined)
    
    inline def setFailureReason(value: CreateAccountFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setGovCloudAccountId(value: AccountId): Self = StObject.set(x, "GovCloudAccountId", value.asInstanceOf[js.Any])
    
    inline def setGovCloudAccountIdUndefined: Self = StObject.set(x, "GovCloudAccountId", js.undefined)
    
    inline def setId(value: CreateAccountRequestId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRequestedTimestamp(value: js.Date): Self = StObject.set(x, "RequestedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRequestedTimestampUndefined: Self = StObject.set(x, "RequestedTimestamp", js.undefined)
    
    inline def setState(value: CreateAccountState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
