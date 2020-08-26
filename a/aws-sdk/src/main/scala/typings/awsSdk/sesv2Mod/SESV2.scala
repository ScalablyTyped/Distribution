package typings.awsSdk.sesv2Mod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SESV2 extends Service {
  @JSName("config")
  var config_SESV2: ConfigBase with ClientConfiguration = js.native
  /**
    * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails that you send. You apply a configuration set to an email by specifying the name of the configuration set when you call the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
    */
  def createConfigurationSet(): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails that you send. You apply a configuration set to an email by specifying the name of the configuration set when you call the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
    */
  def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(
    params: CreateConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]
  ): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Create an event destination. Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
    */
  def createConfigurationSetEventDestination(): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Create an event destination. Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
    */
  def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    params: CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(): Request[CreateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def createCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomVerificationEmailTemplateResponse, Unit]
  ): Request[CreateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest): Request[CreateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def createCustomVerificationEmailTemplate(
    params: CreateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomVerificationEmailTemplateResponse, Unit]
  ): Request[CreateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your AWS account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, the message is sent from one of the addresses in the associated pool.
    */
  def createDedicatedIpPool(): Request[CreateDedicatedIpPoolResponse, AWSError] = js.native
  def createDedicatedIpPool(callback: js.Function2[/* err */ AWSError, /* data */ CreateDedicatedIpPoolResponse, Unit]): Request[CreateDedicatedIpPoolResponse, AWSError] = js.native
  /**
    * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your AWS account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, the message is sent from one of the addresses in the associated pool.
    */
  def createDedicatedIpPool(params: CreateDedicatedIpPoolRequest): Request[CreateDedicatedIpPoolResponse, AWSError] = js.native
  def createDedicatedIpPool(
    params: CreateDedicatedIpPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDedicatedIpPoolResponse, Unit]
  ): Request[CreateDedicatedIpPoolResponse, AWSError] = js.native
  /**
    * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon SES then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
    */
  def createDeliverabilityTestReport(): Request[CreateDeliverabilityTestReportResponse, AWSError] = js.native
  def createDeliverabilityTestReport(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeliverabilityTestReportResponse, Unit]
  ): Request[CreateDeliverabilityTestReportResponse, AWSError] = js.native
  /**
    * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon SES then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
    */
  def createDeliverabilityTestReport(params: CreateDeliverabilityTestReportRequest): Request[CreateDeliverabilityTestReportResponse, AWSError] = js.native
  def createDeliverabilityTestReport(
    params: CreateDeliverabilityTestReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeliverabilityTestReportResponse, Unit]
  ): Request[CreateDeliverabilityTestReportResponse, AWSError] = js.native
  /**
    * Starts the process of verifying an email identity. An identity is an email address or domain that you use when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2 permission to send email from the identity. When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain without specifying the DkimSigningAttributes object, this operation provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS configuration for your domain. This verification method is known as Easy DKIM. Alternatively, you can perform the verification process by providing your own public-private key pair. This verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the CreateEmailIdentity operation has to include the DkimSigningAttributes object. When you specify this object, you provide a selector (a component of the DNS record name that identifies the public key that you want to use for DKIM authentication) and a private key.
    */
  def createEmailIdentity(): Request[CreateEmailIdentityResponse, AWSError] = js.native
  def createEmailIdentity(callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailIdentityResponse, Unit]): Request[CreateEmailIdentityResponse, AWSError] = js.native
  /**
    * Starts the process of verifying an email identity. An identity is an email address or domain that you use when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2 permission to send email from the identity. When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain without specifying the DkimSigningAttributes object, this operation provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS configuration for your domain. This verification method is known as Easy DKIM. Alternatively, you can perform the verification process by providing your own public-private key pair. This verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the CreateEmailIdentity operation has to include the DkimSigningAttributes object. When you specify this object, you provide a selector (a component of the DNS record name that identifies the public key that you want to use for DKIM authentication) and a private key.
    */
  def createEmailIdentity(params: CreateEmailIdentityRequest): Request[CreateEmailIdentityResponse, AWSError] = js.native
  def createEmailIdentity(
    params: CreateEmailIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailIdentityResponse, Unit]
  ): Request[CreateEmailIdentityResponse, AWSError] = js.native
  /**
    * Creates the specified sending authorization policy for the given identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createEmailIdentityPolicy(): Request[CreateEmailIdentityPolicyResponse, AWSError] = js.native
  def createEmailIdentityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailIdentityPolicyResponse, Unit]): Request[CreateEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Creates the specified sending authorization policy for the given identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createEmailIdentityPolicy(params: CreateEmailIdentityPolicyRequest): Request[CreateEmailIdentityPolicyResponse, AWSError] = js.native
  def createEmailIdentityPolicy(
    params: CreateEmailIdentityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailIdentityPolicyResponse, Unit]
  ): Request[CreateEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createEmailTemplate(): Request[CreateEmailTemplateResponse, AWSError] = js.native
  def createEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailTemplateResponse, Unit]): Request[CreateEmailTemplateResponse, AWSError] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createEmailTemplate(params: CreateEmailTemplateRequest): Request[CreateEmailTemplateResponse, AWSError] = js.native
  def createEmailTemplate(
    params: CreateEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEmailTemplateResponse, Unit]
  ): Request[CreateEmailTemplateResponse, AWSError] = js.native
  /**
    * Delete an existing configuration set.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def deleteConfigurationSet(): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Delete an existing configuration set.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(
    params: DeleteConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]
  ): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Delete an event destination.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def deleteConfigurationSetEventDestination(): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Delete an event destination.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    params: DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Deletes an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(): Request[DeleteCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomVerificationEmailTemplateResponse, Unit]
  ): Request[DeleteCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Deletes an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest): Request[DeleteCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(
    params: DeleteCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomVerificationEmailTemplateResponse, Unit]
  ): Request[DeleteCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Delete a dedicated IP pool.
    */
  def deleteDedicatedIpPool(): Request[DeleteDedicatedIpPoolResponse, AWSError] = js.native
  def deleteDedicatedIpPool(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDedicatedIpPoolResponse, Unit]): Request[DeleteDedicatedIpPoolResponse, AWSError] = js.native
  /**
    * Delete a dedicated IP pool.
    */
  def deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest): Request[DeleteDedicatedIpPoolResponse, AWSError] = js.native
  def deleteDedicatedIpPool(
    params: DeleteDedicatedIpPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDedicatedIpPoolResponse, Unit]
  ): Request[DeleteDedicatedIpPoolResponse, AWSError] = js.native
  /**
    * Deletes an email identity. An identity can be either an email address or a domain name.
    */
  def deleteEmailIdentity(): Request[DeleteEmailIdentityResponse, AWSError] = js.native
  def deleteEmailIdentity(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailIdentityResponse, Unit]): Request[DeleteEmailIdentityResponse, AWSError] = js.native
  /**
    * Deletes an email identity. An identity can be either an email address or a domain name.
    */
  def deleteEmailIdentity(params: DeleteEmailIdentityRequest): Request[DeleteEmailIdentityResponse, AWSError] = js.native
  def deleteEmailIdentity(
    params: DeleteEmailIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailIdentityResponse, Unit]
  ): Request[DeleteEmailIdentityResponse, AWSError] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteEmailIdentityPolicy(): Request[DeleteEmailIdentityPolicyResponse, AWSError] = js.native
  def deleteEmailIdentityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailIdentityPolicyResponse, Unit]): Request[DeleteEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteEmailIdentityPolicy(params: DeleteEmailIdentityPolicyRequest): Request[DeleteEmailIdentityPolicyResponse, AWSError] = js.native
  def deleteEmailIdentityPolicy(
    params: DeleteEmailIdentityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailIdentityPolicyResponse, Unit]
  ): Request[DeleteEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteEmailTemplate(): Request[DeleteEmailTemplateResponse, AWSError] = js.native
  def deleteEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailTemplateResponse, Unit]): Request[DeleteEmailTemplateResponse, AWSError] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteEmailTemplate(params: DeleteEmailTemplateRequest): Request[DeleteEmailTemplateResponse, AWSError] = js.native
  def deleteEmailTemplate(
    params: DeleteEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailTemplateResponse, Unit]
  ): Request[DeleteEmailTemplateResponse, AWSError] = js.native
  /**
    * Removes an email address from the suppression list for your account.
    */
  def deleteSuppressedDestination(): Request[DeleteSuppressedDestinationResponse, AWSError] = js.native
  def deleteSuppressedDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuppressedDestinationResponse, Unit]): Request[DeleteSuppressedDestinationResponse, AWSError] = js.native
  /**
    * Removes an email address from the suppression list for your account.
    */
  def deleteSuppressedDestination(params: DeleteSuppressedDestinationRequest): Request[DeleteSuppressedDestinationResponse, AWSError] = js.native
  def deleteSuppressedDestination(
    params: DeleteSuppressedDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuppressedDestinationResponse, Unit]
  ): Request[DeleteSuppressedDestinationResponse, AWSError] = js.native
  /**
    * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS Region.
    */
  def getAccount(): Request[GetAccountResponse, AWSError] = js.native
  def getAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountResponse, Unit]): Request[GetAccountResponse, AWSError] = js.native
  /**
    * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS Region.
    */
  def getAccount(params: GetAccountRequest): Request[GetAccountResponse, AWSError] = js.native
  def getAccount(
    params: GetAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountResponse, Unit]
  ): Request[GetAccountResponse, AWSError] = js.native
  /**
    * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
    */
  def getBlacklistReports(): Request[GetBlacklistReportsResponse, AWSError] = js.native
  def getBlacklistReports(callback: js.Function2[/* err */ AWSError, /* data */ GetBlacklistReportsResponse, Unit]): Request[GetBlacklistReportsResponse, AWSError] = js.native
  /**
    * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
    */
  def getBlacklistReports(params: GetBlacklistReportsRequest): Request[GetBlacklistReportsResponse, AWSError] = js.native
  def getBlacklistReports(
    params: GetBlacklistReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlacklistReportsResponse, Unit]
  ): Request[GetBlacklistReportsResponse, AWSError] = js.native
  /**
    * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def getConfigurationSet(): Request[GetConfigurationSetResponse, AWSError] = js.native
  def getConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetResponse, Unit]): Request[GetConfigurationSetResponse, AWSError] = js.native
  /**
    * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def getConfigurationSet(params: GetConfigurationSetRequest): Request[GetConfigurationSetResponse, AWSError] = js.native
  def getConfigurationSet(
    params: GetConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetResponse, Unit]
  ): Request[GetConfigurationSetResponse, AWSError] = js.native
  /**
    * Retrieve a list of event destinations that are associated with a configuration set.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def getConfigurationSetEventDestinations(): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  def getConfigurationSetEventDestinations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetEventDestinationsResponse, Unit]
  ): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  /**
    * Retrieve a list of event destinations that are associated with a configuration set.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  def getConfigurationSetEventDestinations(
    params: GetConfigurationSetEventDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetEventDestinationsResponse, Unit]
  ): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def getCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomVerificationEmailTemplateResponse, Unit]
  ): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def getCustomVerificationEmailTemplate(
    params: GetCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomVerificationEmailTemplateResponse, Unit]
  ): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
    */
  def getDedicatedIp(): Request[GetDedicatedIpResponse, AWSError] = js.native
  def getDedicatedIp(callback: js.Function2[/* err */ AWSError, /* data */ GetDedicatedIpResponse, Unit]): Request[GetDedicatedIpResponse, AWSError] = js.native
  /**
    * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
    */
  def getDedicatedIp(params: GetDedicatedIpRequest): Request[GetDedicatedIpResponse, AWSError] = js.native
  def getDedicatedIp(
    params: GetDedicatedIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDedicatedIpResponse, Unit]
  ): Request[GetDedicatedIpResponse, AWSError] = js.native
  /**
    * List the dedicated IP addresses that are associated with your AWS account.
    */
  def getDedicatedIps(): Request[GetDedicatedIpsResponse, AWSError] = js.native
  def getDedicatedIps(callback: js.Function2[/* err */ AWSError, /* data */ GetDedicatedIpsResponse, Unit]): Request[GetDedicatedIpsResponse, AWSError] = js.native
  /**
    * List the dedicated IP addresses that are associated with your AWS account.
    */
  def getDedicatedIps(params: GetDedicatedIpsRequest): Request[GetDedicatedIpsResponse, AWSError] = js.native
  def getDedicatedIps(
    params: GetDedicatedIpsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDedicatedIpsResponse, Unit]
  ): Request[GetDedicatedIpsResponse, AWSError] = js.native
  /**
    * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon SES Pricing.
    */
  def getDeliverabilityDashboardOptions(): Request[GetDeliverabilityDashboardOptionsResponse, AWSError] = js.native
  def getDeliverabilityDashboardOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeliverabilityDashboardOptionsResponse, Unit]
  ): Request[GetDeliverabilityDashboardOptionsResponse, AWSError] = js.native
  /**
    * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon SES Pricing.
    */
  def getDeliverabilityDashboardOptions(params: GetDeliverabilityDashboardOptionsRequest): Request[GetDeliverabilityDashboardOptionsResponse, AWSError] = js.native
  def getDeliverabilityDashboardOptions(
    params: GetDeliverabilityDashboardOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeliverabilityDashboardOptionsResponse, Unit]
  ): Request[GetDeliverabilityDashboardOptionsResponse, AWSError] = js.native
  /**
    * Retrieve the results of a predictive inbox placement test.
    */
  def getDeliverabilityTestReport(): Request[GetDeliverabilityTestReportResponse, AWSError] = js.native
  def getDeliverabilityTestReport(callback: js.Function2[/* err */ AWSError, /* data */ GetDeliverabilityTestReportResponse, Unit]): Request[GetDeliverabilityTestReportResponse, AWSError] = js.native
  /**
    * Retrieve the results of a predictive inbox placement test.
    */
  def getDeliverabilityTestReport(params: GetDeliverabilityTestReportRequest): Request[GetDeliverabilityTestReportResponse, AWSError] = js.native
  def getDeliverabilityTestReport(
    params: GetDeliverabilityTestReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeliverabilityTestReportResponse, Unit]
  ): Request[GetDeliverabilityTestReportResponse, AWSError] = js.native
  /**
    * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for.
    */
  def getDomainDeliverabilityCampaign(): Request[GetDomainDeliverabilityCampaignResponse, AWSError] = js.native
  def getDomainDeliverabilityCampaign(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainDeliverabilityCampaignResponse, Unit]
  ): Request[GetDomainDeliverabilityCampaignResponse, AWSError] = js.native
  /**
    * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for.
    */
  def getDomainDeliverabilityCampaign(params: GetDomainDeliverabilityCampaignRequest): Request[GetDomainDeliverabilityCampaignResponse, AWSError] = js.native
  def getDomainDeliverabilityCampaign(
    params: GetDomainDeliverabilityCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainDeliverabilityCampaignResponse, Unit]
  ): Request[GetDomainDeliverabilityCampaignResponse, AWSError] = js.native
  /**
    * Retrieve inbox placement and engagement rates for the domains that you use to send email.
    */
  def getDomainStatisticsReport(): Request[GetDomainStatisticsReportResponse, AWSError] = js.native
  def getDomainStatisticsReport(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainStatisticsReportResponse, Unit]): Request[GetDomainStatisticsReportResponse, AWSError] = js.native
  /**
    * Retrieve inbox placement and engagement rates for the domains that you use to send email.
    */
  def getDomainStatisticsReport(params: GetDomainStatisticsReportRequest): Request[GetDomainStatisticsReportResponse, AWSError] = js.native
  def getDomainStatisticsReport(
    params: GetDomainStatisticsReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainStatisticsReportResponse, Unit]
  ): Request[GetDomainStatisticsReportResponse, AWSError] = js.native
  /**
    * Provides information about a specific identity, including the identity's verification status, sending authorization policies, its DKIM authentication status, and its custom Mail-From settings.
    */
  def getEmailIdentity(): Request[GetEmailIdentityResponse, AWSError] = js.native
  def getEmailIdentity(callback: js.Function2[/* err */ AWSError, /* data */ GetEmailIdentityResponse, Unit]): Request[GetEmailIdentityResponse, AWSError] = js.native
  /**
    * Provides information about a specific identity, including the identity's verification status, sending authorization policies, its DKIM authentication status, and its custom Mail-From settings.
    */
  def getEmailIdentity(params: GetEmailIdentityRequest): Request[GetEmailIdentityResponse, AWSError] = js.native
  def getEmailIdentity(
    params: GetEmailIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEmailIdentityResponse, Unit]
  ): Request[GetEmailIdentityResponse, AWSError] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getEmailIdentityPolicies(): Request[GetEmailIdentityPoliciesResponse, AWSError] = js.native
  def getEmailIdentityPolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetEmailIdentityPoliciesResponse, Unit]): Request[GetEmailIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getEmailIdentityPolicies(params: GetEmailIdentityPoliciesRequest): Request[GetEmailIdentityPoliciesResponse, AWSError] = js.native
  def getEmailIdentityPolicies(
    params: GetEmailIdentityPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEmailIdentityPoliciesResponse, Unit]
  ): Request[GetEmailIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Displays the template object (which includes the subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getEmailTemplate(): Request[GetEmailTemplateResponse, AWSError] = js.native
  def getEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetEmailTemplateResponse, Unit]): Request[GetEmailTemplateResponse, AWSError] = js.native
  /**
    * Displays the template object (which includes the subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getEmailTemplate(params: GetEmailTemplateRequest): Request[GetEmailTemplateResponse, AWSError] = js.native
  def getEmailTemplate(
    params: GetEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEmailTemplateResponse, Unit]
  ): Request[GetEmailTemplateResponse, AWSError] = js.native
  /**
    * Retrieves information about a specific email address that's on the suppression list for your account.
    */
  def getSuppressedDestination(): Request[GetSuppressedDestinationResponse, AWSError] = js.native
  def getSuppressedDestination(callback: js.Function2[/* err */ AWSError, /* data */ GetSuppressedDestinationResponse, Unit]): Request[GetSuppressedDestinationResponse, AWSError] = js.native
  /**
    * Retrieves information about a specific email address that's on the suppression list for your account.
    */
  def getSuppressedDestination(params: GetSuppressedDestinationRequest): Request[GetSuppressedDestinationResponse, AWSError] = js.native
  def getSuppressedDestination(
    params: GetSuppressedDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSuppressedDestinationResponse, Unit]
  ): Request[GetSuppressedDestinationResponse, AWSError] = js.native
  /**
    * List all of the configuration sets associated with your account in the current region.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def listConfigurationSets(): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * List all of the configuration sets associated with your account in the current region.  Configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
    */
  def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(
    params: ListConfigurationSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]
  ): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  def listCustomVerificationEmailTemplates(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVerificationEmailTemplatesResponse, Unit]
  ): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  def listCustomVerificationEmailTemplates(
    params: ListCustomVerificationEmailTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVerificationEmailTemplatesResponse, Unit]
  ): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  /**
    * List all of the dedicated IP pools that exist in your AWS account in the current Region.
    */
  def listDedicatedIpPools(): Request[ListDedicatedIpPoolsResponse, AWSError] = js.native
  def listDedicatedIpPools(callback: js.Function2[/* err */ AWSError, /* data */ ListDedicatedIpPoolsResponse, Unit]): Request[ListDedicatedIpPoolsResponse, AWSError] = js.native
  /**
    * List all of the dedicated IP pools that exist in your AWS account in the current Region.
    */
  def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): Request[ListDedicatedIpPoolsResponse, AWSError] = js.native
  def listDedicatedIpPools(
    params: ListDedicatedIpPoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDedicatedIpPoolsResponse, Unit]
  ): Request[ListDedicatedIpPoolsResponse, AWSError] = js.native
  /**
    * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
    */
  def listDeliverabilityTestReports(): Request[ListDeliverabilityTestReportsResponse, AWSError] = js.native
  def listDeliverabilityTestReports(callback: js.Function2[/* err */ AWSError, /* data */ ListDeliverabilityTestReportsResponse, Unit]): Request[ListDeliverabilityTestReportsResponse, AWSError] = js.native
  /**
    * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
    */
  def listDeliverabilityTestReports(params: ListDeliverabilityTestReportsRequest): Request[ListDeliverabilityTestReportsResponse, AWSError] = js.native
  def listDeliverabilityTestReports(
    params: ListDeliverabilityTestReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeliverabilityTestReportsResponse, Unit]
  ): Request[ListDeliverabilityTestReportsResponse, AWSError] = js.native
  /**
    * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
    */
  def listDomainDeliverabilityCampaigns(): Request[ListDomainDeliverabilityCampaignsResponse, AWSError] = js.native
  def listDomainDeliverabilityCampaigns(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainDeliverabilityCampaignsResponse, Unit]
  ): Request[ListDomainDeliverabilityCampaignsResponse, AWSError] = js.native
  /**
    * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
    */
  def listDomainDeliverabilityCampaigns(params: ListDomainDeliverabilityCampaignsRequest): Request[ListDomainDeliverabilityCampaignsResponse, AWSError] = js.native
  def listDomainDeliverabilityCampaigns(
    params: ListDomainDeliverabilityCampaignsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainDeliverabilityCampaignsResponse, Unit]
  ): Request[ListDomainDeliverabilityCampaignsResponse, AWSError] = js.native
  /**
    * Returns a list of all of the email identities that are associated with your AWS account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
    */
  def listEmailIdentities(): Request[ListEmailIdentitiesResponse, AWSError] = js.native
  def listEmailIdentities(callback: js.Function2[/* err */ AWSError, /* data */ ListEmailIdentitiesResponse, Unit]): Request[ListEmailIdentitiesResponse, AWSError] = js.native
  /**
    * Returns a list of all of the email identities that are associated with your AWS account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
    */
  def listEmailIdentities(params: ListEmailIdentitiesRequest): Request[ListEmailIdentitiesResponse, AWSError] = js.native
  def listEmailIdentities(
    params: ListEmailIdentitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEmailIdentitiesResponse, Unit]
  ): Request[ListEmailIdentitiesResponse, AWSError] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listEmailTemplates(): Request[ListEmailTemplatesResponse, AWSError] = js.native
  def listEmailTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListEmailTemplatesResponse, Unit]): Request[ListEmailTemplatesResponse, AWSError] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listEmailTemplates(params: ListEmailTemplatesRequest): Request[ListEmailTemplatesResponse, AWSError] = js.native
  def listEmailTemplates(
    params: ListEmailTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEmailTemplatesResponse, Unit]
  ): Request[ListEmailTemplatesResponse, AWSError] = js.native
  /**
    * Retrieves a list of email addresses that are on the suppression list for your account.
    */
  def listSuppressedDestinations(): Request[ListSuppressedDestinationsResponse, AWSError] = js.native
  def listSuppressedDestinations(callback: js.Function2[/* err */ AWSError, /* data */ ListSuppressedDestinationsResponse, Unit]): Request[ListSuppressedDestinationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of email addresses that are on the suppression list for your account.
    */
  def listSuppressedDestinations(params: ListSuppressedDestinationsRequest): Request[ListSuppressedDestinationsResponse, AWSError] = js.native
  def listSuppressedDestinations(
    params: ListSuppressedDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuppressedDestinationsResponse, Unit]
  ): Request[ListSuppressedDestinationsResponse, AWSError] = js.native
  /**
    * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A tag is a label that you optionally define and associate with a resource. Each tag consists of a required tag key and an optional associated tag value. A tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor within a tag key.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A tag is a label that you optionally define and associate with a resource. Each tag consists of a required tag key and an optional associated tag value. A tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor within a tag key.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Enable or disable the automatic warm-up feature for dedicated IP addresses.
    */
  def putAccountDedicatedIpWarmupAttributes(): Request[PutAccountDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  def putAccountDedicatedIpWarmupAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountDedicatedIpWarmupAttributesResponse, Unit]
  ): Request[PutAccountDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  /**
    * Enable or disable the automatic warm-up feature for dedicated IP addresses.
    */
  def putAccountDedicatedIpWarmupAttributes(params: PutAccountDedicatedIpWarmupAttributesRequest): Request[PutAccountDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  def putAccountDedicatedIpWarmupAttributes(
    params: PutAccountDedicatedIpWarmupAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountDedicatedIpWarmupAttributesResponse, Unit]
  ): Request[PutAccountDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  /**
    * Update your Amazon SES account details.
    */
  def putAccountDetails(): Request[PutAccountDetailsResponse, AWSError] = js.native
  def putAccountDetails(callback: js.Function2[/* err */ AWSError, /* data */ PutAccountDetailsResponse, Unit]): Request[PutAccountDetailsResponse, AWSError] = js.native
  /**
    * Update your Amazon SES account details.
    */
  def putAccountDetails(params: PutAccountDetailsRequest): Request[PutAccountDetailsResponse, AWSError] = js.native
  def putAccountDetails(
    params: PutAccountDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountDetailsResponse, Unit]
  ): Request[PutAccountDetailsResponse, AWSError] = js.native
  /**
    * Enable or disable the ability of your account to send email.
    */
  def putAccountSendingAttributes(): Request[PutAccountSendingAttributesResponse, AWSError] = js.native
  def putAccountSendingAttributes(callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSendingAttributesResponse, Unit]): Request[PutAccountSendingAttributesResponse, AWSError] = js.native
  /**
    * Enable or disable the ability of your account to send email.
    */
  def putAccountSendingAttributes(params: PutAccountSendingAttributesRequest): Request[PutAccountSendingAttributesResponse, AWSError] = js.native
  def putAccountSendingAttributes(
    params: PutAccountSendingAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSendingAttributesResponse, Unit]
  ): Request[PutAccountSendingAttributesResponse, AWSError] = js.native
  /**
    * Change the settings for the account-level suppression list.
    */
  def putAccountSuppressionAttributes(): Request[PutAccountSuppressionAttributesResponse, AWSError] = js.native
  def putAccountSuppressionAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSuppressionAttributesResponse, Unit]
  ): Request[PutAccountSuppressionAttributesResponse, AWSError] = js.native
  /**
    * Change the settings for the account-level suppression list.
    */
  def putAccountSuppressionAttributes(params: PutAccountSuppressionAttributesRequest): Request[PutAccountSuppressionAttributesResponse, AWSError] = js.native
  def putAccountSuppressionAttributes(
    params: PutAccountSuppressionAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSuppressionAttributesResponse, Unit]
  ): Request[PutAccountSuppressionAttributesResponse, AWSError] = js.native
  /**
    * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
    */
  def putConfigurationSetDeliveryOptions(): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  def putConfigurationSetDeliveryOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetDeliveryOptionsResponse, Unit]
  ): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  /**
    * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
    */
  def putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  def putConfigurationSetDeliveryOptions(
    params: PutConfigurationSetDeliveryOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetDeliveryOptionsResponse, Unit]
  ): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  /**
    * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
    */
  def putConfigurationSetReputationOptions(): Request[PutConfigurationSetReputationOptionsResponse, AWSError] = js.native
  def putConfigurationSetReputationOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetReputationOptionsResponse, Unit]
  ): Request[PutConfigurationSetReputationOptionsResponse, AWSError] = js.native
  /**
    * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
    */
  def putConfigurationSetReputationOptions(params: PutConfigurationSetReputationOptionsRequest): Request[PutConfigurationSetReputationOptionsResponse, AWSError] = js.native
  def putConfigurationSetReputationOptions(
    params: PutConfigurationSetReputationOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetReputationOptionsResponse, Unit]
  ): Request[PutConfigurationSetReputationOptionsResponse, AWSError] = js.native
  /**
    * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
    */
  def putConfigurationSetSendingOptions(): Request[PutConfigurationSetSendingOptionsResponse, AWSError] = js.native
  def putConfigurationSetSendingOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetSendingOptionsResponse, Unit]
  ): Request[PutConfigurationSetSendingOptionsResponse, AWSError] = js.native
  /**
    * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
    */
  def putConfigurationSetSendingOptions(params: PutConfigurationSetSendingOptionsRequest): Request[PutConfigurationSetSendingOptionsResponse, AWSError] = js.native
  def putConfigurationSetSendingOptions(
    params: PutConfigurationSetSendingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetSendingOptionsResponse, Unit]
  ): Request[PutConfigurationSetSendingOptionsResponse, AWSError] = js.native
  /**
    * Specify the account suppression list preferences for a configuration set.
    */
  def putConfigurationSetSuppressionOptions(): Request[PutConfigurationSetSuppressionOptionsResponse, AWSError] = js.native
  def putConfigurationSetSuppressionOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetSuppressionOptionsResponse, Unit]
  ): Request[PutConfigurationSetSuppressionOptionsResponse, AWSError] = js.native
  /**
    * Specify the account suppression list preferences for a configuration set.
    */
  def putConfigurationSetSuppressionOptions(params: PutConfigurationSetSuppressionOptionsRequest): Request[PutConfigurationSetSuppressionOptionsResponse, AWSError] = js.native
  def putConfigurationSetSuppressionOptions(
    params: PutConfigurationSetSuppressionOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetSuppressionOptionsResponse, Unit]
  ): Request[PutConfigurationSetSuppressionOptionsResponse, AWSError] = js.native
  /**
    * Specify a custom domain to use for open and click tracking elements in email that you send.
    */
  def putConfigurationSetTrackingOptions(): Request[PutConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def putConfigurationSetTrackingOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[PutConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Specify a custom domain to use for open and click tracking elements in email that you send.
    */
  def putConfigurationSetTrackingOptions(params: PutConfigurationSetTrackingOptionsRequest): Request[PutConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def putConfigurationSetTrackingOptions(
    params: PutConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[PutConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your AWS account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
    */
  def putDedicatedIpInPool(): Request[PutDedicatedIpInPoolResponse, AWSError] = js.native
  def putDedicatedIpInPool(callback: js.Function2[/* err */ AWSError, /* data */ PutDedicatedIpInPoolResponse, Unit]): Request[PutDedicatedIpInPoolResponse, AWSError] = js.native
  /**
    * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your AWS account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
    */
  def putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest): Request[PutDedicatedIpInPoolResponse, AWSError] = js.native
  def putDedicatedIpInPool(
    params: PutDedicatedIpInPoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDedicatedIpInPoolResponse, Unit]
  ): Request[PutDedicatedIpInPoolResponse, AWSError] = js.native
  /**
    * 
    */
  def putDedicatedIpWarmupAttributes(): Request[PutDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  def putDedicatedIpWarmupAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutDedicatedIpWarmupAttributesResponse, Unit]
  ): Request[PutDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  /**
    * 
    */
  def putDedicatedIpWarmupAttributes(params: PutDedicatedIpWarmupAttributesRequest): Request[PutDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  def putDedicatedIpWarmupAttributes(
    params: PutDedicatedIpWarmupAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDedicatedIpWarmupAttributesResponse, Unit]
  ): Request[PutDedicatedIpWarmupAttributesResponse, AWSError] = js.native
  /**
    * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon SES Pricing.
    */
  def putDeliverabilityDashboardOption(): Request[PutDeliverabilityDashboardOptionResponse, AWSError] = js.native
  def putDeliverabilityDashboardOption(
    callback: js.Function2[/* err */ AWSError, /* data */ PutDeliverabilityDashboardOptionResponse, Unit]
  ): Request[PutDeliverabilityDashboardOptionResponse, AWSError] = js.native
  /**
    * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon SES Pricing.
    */
  def putDeliverabilityDashboardOption(params: PutDeliverabilityDashboardOptionRequest): Request[PutDeliverabilityDashboardOptionResponse, AWSError] = js.native
  def putDeliverabilityDashboardOption(
    params: PutDeliverabilityDashboardOptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDeliverabilityDashboardOptionResponse, Unit]
  ): Request[PutDeliverabilityDashboardOptionResponse, AWSError] = js.native
  /**
    * Used to enable or disable DKIM authentication for an email identity.
    */
  def putEmailIdentityDkimAttributes(): Request[PutEmailIdentityDkimAttributesResponse, AWSError] = js.native
  def putEmailIdentityDkimAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityDkimAttributesResponse, Unit]
  ): Request[PutEmailIdentityDkimAttributesResponse, AWSError] = js.native
  /**
    * Used to enable or disable DKIM authentication for an email identity.
    */
  def putEmailIdentityDkimAttributes(params: PutEmailIdentityDkimAttributesRequest): Request[PutEmailIdentityDkimAttributesResponse, AWSError] = js.native
  def putEmailIdentityDkimAttributes(
    params: PutEmailIdentityDkimAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityDkimAttributesResponse, Unit]
  ): Request[PutEmailIdentityDkimAttributesResponse, AWSError] = js.native
  /**
    * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this operation to do any of the following:   Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).   Change from using no DKIM authentication to using Easy DKIM.   Change from using no DKIM authentication to using BYODKIM.   Change from using Easy DKIM to using BYODKIM.   Change from using BYODKIM to using Easy DKIM.  
    */
  def putEmailIdentityDkimSigningAttributes(): Request[PutEmailIdentityDkimSigningAttributesResponse, AWSError] = js.native
  def putEmailIdentityDkimSigningAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityDkimSigningAttributesResponse, Unit]
  ): Request[PutEmailIdentityDkimSigningAttributesResponse, AWSError] = js.native
  /**
    * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this operation to do any of the following:   Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).   Change from using no DKIM authentication to using Easy DKIM.   Change from using no DKIM authentication to using BYODKIM.   Change from using Easy DKIM to using BYODKIM.   Change from using BYODKIM to using Easy DKIM.  
    */
  def putEmailIdentityDkimSigningAttributes(params: PutEmailIdentityDkimSigningAttributesRequest): Request[PutEmailIdentityDkimSigningAttributesResponse, AWSError] = js.native
  def putEmailIdentityDkimSigningAttributes(
    params: PutEmailIdentityDkimSigningAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityDkimSigningAttributesResponse, Unit]
  ): Request[PutEmailIdentityDkimSigningAttributesResponse, AWSError] = js.native
  /**
    * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  def putEmailIdentityFeedbackAttributes(): Request[PutEmailIdentityFeedbackAttributesResponse, AWSError] = js.native
  def putEmailIdentityFeedbackAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityFeedbackAttributesResponse, Unit]
  ): Request[PutEmailIdentityFeedbackAttributesResponse, AWSError] = js.native
  /**
    * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  def putEmailIdentityFeedbackAttributes(params: PutEmailIdentityFeedbackAttributesRequest): Request[PutEmailIdentityFeedbackAttributesResponse, AWSError] = js.native
  def putEmailIdentityFeedbackAttributes(
    params: PutEmailIdentityFeedbackAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityFeedbackAttributesResponse, Unit]
  ): Request[PutEmailIdentityFeedbackAttributesResponse, AWSError] = js.native
  /**
    * Used to enable or disable the custom Mail-From domain configuration for an email identity.
    */
  def putEmailIdentityMailFromAttributes(): Request[PutEmailIdentityMailFromAttributesResponse, AWSError] = js.native
  def putEmailIdentityMailFromAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityMailFromAttributesResponse, Unit]
  ): Request[PutEmailIdentityMailFromAttributesResponse, AWSError] = js.native
  /**
    * Used to enable or disable the custom Mail-From domain configuration for an email identity.
    */
  def putEmailIdentityMailFromAttributes(params: PutEmailIdentityMailFromAttributesRequest): Request[PutEmailIdentityMailFromAttributesResponse, AWSError] = js.native
  def putEmailIdentityMailFromAttributes(
    params: PutEmailIdentityMailFromAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailIdentityMailFromAttributesResponse, Unit]
  ): Request[PutEmailIdentityMailFromAttributesResponse, AWSError] = js.native
  /**
    * Adds an email address to the suppression list for your account.
    */
  def putSuppressedDestination(): Request[PutSuppressedDestinationResponse, AWSError] = js.native
  def putSuppressedDestination(callback: js.Function2[/* err */ AWSError, /* data */ PutSuppressedDestinationResponse, Unit]): Request[PutSuppressedDestinationResponse, AWSError] = js.native
  /**
    * Adds an email address to the suppression list for your account.
    */
  def putSuppressedDestination(params: PutSuppressedDestinationRequest): Request[PutSuppressedDestinationResponse, AWSError] = js.native
  def putSuppressedDestination(
    params: PutSuppressedDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSuppressedDestinationResponse, Unit]
  ): Request[PutSuppressedDestinationResponse, AWSError] = js.native
  /**
    * Composes an email message to multiple destinations.
    */
  def sendBulkEmail(): Request[SendBulkEmailResponse, AWSError] = js.native
  def sendBulkEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendBulkEmailResponse, Unit]): Request[SendBulkEmailResponse, AWSError] = js.native
  /**
    * Composes an email message to multiple destinations.
    */
  def sendBulkEmail(params: SendBulkEmailRequest): Request[SendBulkEmailResponse, AWSError] = js.native
  def sendBulkEmail(
    params: SendBulkEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendBulkEmailResponse, Unit]
  ): Request[SendBulkEmailResponse, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  def sendCustomVerificationEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendCustomVerificationEmailResponse, Unit]): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  def sendCustomVerificationEmail(
    params: SendCustomVerificationEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCustomVerificationEmailResponse, Unit]
  ): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  /**
    * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon SES assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.    Templated – A message that contains personalization tags. When you send this type of email, Amazon SES API v2 automatically replaces the tags with values that you specify.  
    */
  def sendEmail(): Request[SendEmailResponse, AWSError] = js.native
  def sendEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendEmailResponse, Unit]): Request[SendEmailResponse, AWSError] = js.native
  /**
    * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon SES assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.    Templated – A message that contains personalization tags. When you send this type of email, Amazon SES API v2 automatically replaces the tags with values that you specify.  
    */
  def sendEmail(params: SendEmailRequest): Request[SendEmailResponse, AWSError] = js.native
  def sendEmail(
    params: SendEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendEmailResponse, Unit]
  ): Request[SendEmailResponse, AWSError] = js.native
  /**
    * Add one or more tags (keys and values) to a specified resource. A tag is a label that you optionally define and associate with a resource. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. Each tag consists of a required tag key and an associated tag value, both of which you define. A tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor within a tag key.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add one or more tags (keys and values) to a specified resource. A tag is a label that you optionally define and associate with a resource. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. Each tag consists of a required tag key and an associated tag value, both of which you define. A tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor within a tag key.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderEmailTemplate(): Request[TestRenderEmailTemplateResponse, AWSError] = js.native
  def testRenderEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ TestRenderEmailTemplateResponse, Unit]): Request[TestRenderEmailTemplateResponse, AWSError] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderEmailTemplate(params: TestRenderEmailTemplateRequest): Request[TestRenderEmailTemplateResponse, AWSError] = js.native
  def testRenderEmailTemplate(
    params: TestRenderEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestRenderEmailTemplateResponse, Unit]
  ): Request[TestRenderEmailTemplateResponse, AWSError] = js.native
  /**
    * Remove one or more tags (keys and values) from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove one or more tags (keys and values) from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Update the configuration of an event destination for a configuration set.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def updateConfigurationSetEventDestination(): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Update the configuration of an event destination for a configuration set.  Events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    params: UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(): Request[UpdateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def updateCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomVerificationEmailTemplateResponse, Unit]
  ): Request[UpdateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest): Request[UpdateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def updateCustomVerificationEmailTemplate(
    params: UpdateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomVerificationEmailTemplateResponse, Unit]
  ): Request[UpdateCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Updates the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateEmailIdentityPolicy(): Request[UpdateEmailIdentityPolicyResponse, AWSError] = js.native
  def updateEmailIdentityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailIdentityPolicyResponse, Unit]): Request[UpdateEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Updates the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateEmailIdentityPolicy(params: UpdateEmailIdentityPolicyRequest): Request[UpdateEmailIdentityPolicyResponse, AWSError] = js.native
  def updateEmailIdentityPolicy(
    params: UpdateEmailIdentityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailIdentityPolicyResponse, Unit]
  ): Request[UpdateEmailIdentityPolicyResponse, AWSError] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateEmailTemplate(): Request[UpdateEmailTemplateResponse, AWSError] = js.native
  def updateEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailTemplateResponse, Unit]): Request[UpdateEmailTemplateResponse, AWSError] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateEmailTemplate(params: UpdateEmailTemplateRequest): Request[UpdateEmailTemplateResponse, AWSError] = js.native
  def updateEmailTemplate(
    params: UpdateEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailTemplateResponse, Unit]
  ): Request[UpdateEmailTemplateResponse, AWSError] = js.native
}

