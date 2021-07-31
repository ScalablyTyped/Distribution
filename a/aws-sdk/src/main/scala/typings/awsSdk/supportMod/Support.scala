package typings.awsSdk.supportMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Support
  extends StObject
     with Service {
  
  /**
    * Adds one or more attachments to an attachment set.  An attachment set is a temporary container for attachments that you add to a case or case communication. The set is available for 1 hour after it's created. The expiryTime returned in the response is when the set expires.     You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def addAttachmentsToSet(): Request[AddAttachmentsToSetResponse, AWSError] = js.native
  def addAttachmentsToSet(callback: js.Function2[/* err */ AWSError, /* data */ AddAttachmentsToSetResponse, Unit]): Request[AddAttachmentsToSetResponse, AWSError] = js.native
  /**
    * Adds one or more attachments to an attachment set.  An attachment set is a temporary container for attachments that you add to a case or case communication. The set is available for 1 hour after it's created. The expiryTime returned in the response is when the set expires.     You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def addAttachmentsToSet(params: AddAttachmentsToSetRequest): Request[AddAttachmentsToSetResponse, AWSError] = js.native
  def addAttachmentsToSet(
    params: AddAttachmentsToSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddAttachmentsToSetResponse, Unit]
  ): Request[AddAttachmentsToSetResponse, AWSError] = js.native
  
  /**
    * Adds additional customer communication to an AWS Support case. Use the caseId parameter to identify the case to which to add communication. You can list a set of email addresses to copy on the communication by using the ccEmailAddresses parameter. The communicationBody value contains the text of the communication.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def addCommunicationToCase(): Request[AddCommunicationToCaseResponse, AWSError] = js.native
  def addCommunicationToCase(callback: js.Function2[/* err */ AWSError, /* data */ AddCommunicationToCaseResponse, Unit]): Request[AddCommunicationToCaseResponse, AWSError] = js.native
  /**
    * Adds additional customer communication to an AWS Support case. Use the caseId parameter to identify the case to which to add communication. You can list a set of email addresses to copy on the communication by using the ccEmailAddresses parameter. The communicationBody value contains the text of the communication.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def addCommunicationToCase(params: AddCommunicationToCaseRequest): Request[AddCommunicationToCaseResponse, AWSError] = js.native
  def addCommunicationToCase(
    params: AddCommunicationToCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddCommunicationToCaseResponse, Unit]
  ): Request[AddCommunicationToCaseResponse, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a case in the AWS Support Center. This operation is similar to how you create a case in the AWS Support Center Create Case page. The AWS Support API doesn't support requesting service limit increases. You can submit a service limit increase in the following ways:    Submit a request from the AWS Support Center Create Case page.   Use the Service Quotas RequestServiceQuotaIncrease operation.   A successful CreateCase request returns an AWS Support case number. You can use the DescribeCases operation and specify the case number to get existing AWS Support cases. After you create a case, use the AddCommunicationToCase operation to add additional communication or attachments to an existing case. The caseId is separate from the displayId that appears in the AWS Support Center. Use the DescribeCases operation to get the displayId.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def createCase(): Request[CreateCaseResponse, AWSError] = js.native
  def createCase(callback: js.Function2[/* err */ AWSError, /* data */ CreateCaseResponse, Unit]): Request[CreateCaseResponse, AWSError] = js.native
  /**
    * Creates a case in the AWS Support Center. This operation is similar to how you create a case in the AWS Support Center Create Case page. The AWS Support API doesn't support requesting service limit increases. You can submit a service limit increase in the following ways:    Submit a request from the AWS Support Center Create Case page.   Use the Service Quotas RequestServiceQuotaIncrease operation.   A successful CreateCase request returns an AWS Support case number. You can use the DescribeCases operation and specify the case number to get existing AWS Support cases. After you create a case, use the AddCommunicationToCase operation to add additional communication or attachments to an existing case. The caseId is separate from the displayId that appears in the AWS Support Center. Use the DescribeCases operation to get the displayId.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def createCase(params: CreateCaseRequest): Request[CreateCaseResponse, AWSError] = js.native
  def createCase(
    params: CreateCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCaseResponse, Unit]
  ): Request[CreateCaseResponse, AWSError] = js.native
  
  /**
    * Returns the attachment that has the specified ID. Attachments can include screenshots, error logs, or other files that describe your issue. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeAttachment(): Request[DescribeAttachmentResponse, AWSError] = js.native
  def describeAttachment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttachmentResponse, Unit]): Request[DescribeAttachmentResponse, AWSError] = js.native
  /**
    * Returns the attachment that has the specified ID. Attachments can include screenshots, error logs, or other files that describe your issue. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeAttachment(params: DescribeAttachmentRequest): Request[DescribeAttachmentResponse, AWSError] = js.native
  def describeAttachment(
    params: DescribeAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttachmentResponse, Unit]
  ): Request[DescribeAttachmentResponse, AWSError] = js.native
  
  /**
    * Returns a list of cases that you specify by passing one or more case IDs. You can use the afterTime and beforeTime parameters to filter the cases by date. You can set values for the includeResolvedCases and includeCommunications parameters to specify how much information to return. The response returns the following in JSON format:   One or more CaseDetails data types.   One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.   Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request might return an error.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeCases(): Request[DescribeCasesResponse, AWSError] = js.native
  def describeCases(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCasesResponse, Unit]): Request[DescribeCasesResponse, AWSError] = js.native
  /**
    * Returns a list of cases that you specify by passing one or more case IDs. You can use the afterTime and beforeTime parameters to filter the cases by date. You can set values for the includeResolvedCases and includeCommunications parameters to specify how much information to return. The response returns the following in JSON format:   One or more CaseDetails data types.   One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.   Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request might return an error.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeCases(params: DescribeCasesRequest): Request[DescribeCasesResponse, AWSError] = js.native
  def describeCases(
    params: DescribeCasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCasesResponse, Unit]
  ): Request[DescribeCasesResponse, AWSError] = js.native
  
  /**
    * Returns communications and attachments for one or more support cases. Use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a specific case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the results. Set maxResults to the number of cases that you want to display on each page, and use nextToken to specify the resumption of pagination.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeCommunications(): Request[DescribeCommunicationsResponse, AWSError] = js.native
  def describeCommunications(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommunicationsResponse, Unit]): Request[DescribeCommunicationsResponse, AWSError] = js.native
  /**
    * Returns communications and attachments for one or more support cases. Use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a specific case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the results. Set maxResults to the number of cases that you want to display on each page, and use nextToken to specify the resumption of pagination.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeCommunications(params: DescribeCommunicationsRequest): Request[DescribeCommunicationsResponse, AWSError] = js.native
  def describeCommunications(
    params: DescribeCommunicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommunicationsResponse, Unit]
  ): Request[DescribeCommunicationsResponse, AWSError] = js.native
  
  /**
    * Returns the current list of AWS services and a list of service categories for each service. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that appear in the Service and Category lists on the AWS Support Center Create Case page. The values in those fields don't necessarily match the service codes and categories returned by the DescribeServices operation. Always use the service codes and categories that the DescribeServices operation returns, so that you have the most recent set of service and category codes.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeServices(): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Returns the current list of AWS services and a list of service categories for each service. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that appear in the Service and Category lists on the AWS Support Center Create Case page. The values in those fields don't necessarily match the service codes and categories returned by the DescribeServices operation. Always use the service codes and categories that the DescribeServices operation returns, so that you have the most recent set of service and category codes.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(
    params: DescribeServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  
  /**
    * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type that you include for a CreateCase request.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeSeverityLevels(): Request[DescribeSeverityLevelsResponse, AWSError] = js.native
  def describeSeverityLevels(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSeverityLevelsResponse, Unit]): Request[DescribeSeverityLevelsResponse, AWSError] = js.native
  /**
    * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type that you include for a CreateCase request.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeSeverityLevels(params: DescribeSeverityLevelsRequest): Request[DescribeSeverityLevelsResponse, AWSError] = js.native
  def describeSeverityLevels(
    params: DescribeSeverityLevelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSeverityLevelsResponse, Unit]
  ): Request[DescribeSeverityLevelsResponse, AWSError] = js.native
  
  /**
    * Returns the refresh status of the AWS Trusted Advisor checks that have the specified check IDs. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. Some checks are refreshed automatically, and you can't return their refresh statuses by using the DescribeTrustedAdvisorCheckRefreshStatuses operation. If you call this operation for these checks, you might see an InvalidParameterValue error.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckRefreshStatuses(): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckRefreshStatuses(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
      Unit
    ]
  ): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError] = js.native
  /**
    * Returns the refresh status of the AWS Trusted Advisor checks that have the specified check IDs. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. Some checks are refreshed automatically, and you can't return their refresh statuses by using the DescribeTrustedAdvisorCheckRefreshStatuses operation. If you call this operation for these checks, you might see an InvalidParameterValue error.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckRefreshStatuses(
    params: DescribeTrustedAdvisorCheckRefreshStatusesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
      Unit
    ]
  ): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError] = js.native
  
  /**
    * Returns the results of the AWS Trusted Advisor check that has the specified check ID. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status - The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp - The time of the last refresh of the check.    checkId - The unique identifier for the check.      You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckResult(): Request[DescribeTrustedAdvisorCheckResultResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckResult(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorCheckResultResponse, Unit]
  ): Request[DescribeTrustedAdvisorCheckResultResponse, AWSError] = js.native
  /**
    * Returns the results of the AWS Trusted Advisor check that has the specified check ID. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status - The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp - The time of the last refresh of the check.    checkId - The unique identifier for the check.      You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest): Request[DescribeTrustedAdvisorCheckResultResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckResult(
    params: DescribeTrustedAdvisorCheckResultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorCheckResultResponse, Unit]
  ): Request[DescribeTrustedAdvisorCheckResultResponse, AWSError] = js.native
  
  /**
    * Returns the results for the AWS Trusted Advisor check summaries for the check IDs that you specified. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. The response contains an array of TrustedAdvisorCheckSummary objects.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckSummaries(): Request[DescribeTrustedAdvisorCheckSummariesResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckSummaries(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorCheckSummariesResponse, Unit]
  ): Request[DescribeTrustedAdvisorCheckSummariesResponse, AWSError] = js.native
  /**
    * Returns the results for the AWS Trusted Advisor check summaries for the check IDs that you specified. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation. The response contains an array of TrustedAdvisorCheckSummary objects.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest): Request[DescribeTrustedAdvisorCheckSummariesResponse, AWSError] = js.native
  def describeTrustedAdvisorCheckSummaries(
    params: DescribeTrustedAdvisorCheckSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorCheckSummariesResponse, Unit]
  ): Request[DescribeTrustedAdvisorCheckSummariesResponse, AWSError] = js.native
  
  /**
    * Returns information about all available AWS Trusted Advisor checks, including the name, ID, category, description, and metadata. You must specify a language code. The AWS Support API currently supports English ("en") and Japanese ("ja"). The response contains a TrustedAdvisorCheckDescription object for each check. You must set the AWS Region to us-east-1.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorChecks(): Request[DescribeTrustedAdvisorChecksResponse, AWSError] = js.native
  def describeTrustedAdvisorChecks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorChecksResponse, Unit]): Request[DescribeTrustedAdvisorChecksResponse, AWSError] = js.native
  /**
    * Returns information about all available AWS Trusted Advisor checks, including the name, ID, category, description, and metadata. You must specify a language code. The AWS Support API currently supports English ("en") and Japanese ("ja"). The response contains a TrustedAdvisorCheckDescription object for each check. You must set the AWS Region to us-east-1.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest): Request[DescribeTrustedAdvisorChecksResponse, AWSError] = js.native
  def describeTrustedAdvisorChecks(
    params: DescribeTrustedAdvisorChecksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustedAdvisorChecksResponse, Unit]
  ): Request[DescribeTrustedAdvisorChecksResponse, AWSError] = js.native
  
  /**
    * Refreshes the AWS Trusted Advisor check that you specify using the check ID. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation.  Some checks are refreshed automatically. If you call the RefreshTrustedAdvisorCheck operation to refresh them, you might see the InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def refreshTrustedAdvisorCheck(): Request[RefreshTrustedAdvisorCheckResponse, AWSError] = js.native
  def refreshTrustedAdvisorCheck(callback: js.Function2[/* err */ AWSError, /* data */ RefreshTrustedAdvisorCheckResponse, Unit]): Request[RefreshTrustedAdvisorCheckResponse, AWSError] = js.native
  /**
    * Refreshes the AWS Trusted Advisor check that you specify using the check ID. You can get the check IDs by calling the DescribeTrustedAdvisorChecks operation.  Some checks are refreshed automatically. If you call the RefreshTrustedAdvisorCheck operation to refresh them, you might see the InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest): Request[RefreshTrustedAdvisorCheckResponse, AWSError] = js.native
  def refreshTrustedAdvisorCheck(
    params: RefreshTrustedAdvisorCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RefreshTrustedAdvisorCheckResponse, Unit]
  ): Request[RefreshTrustedAdvisorCheckResponse, AWSError] = js.native
  
  /**
    * Resolves a support case. This operation takes a caseId and returns the initial and final state of the case.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def resolveCase(): Request[ResolveCaseResponse, AWSError] = js.native
  def resolveCase(callback: js.Function2[/* err */ AWSError, /* data */ ResolveCaseResponse, Unit]): Request[ResolveCaseResponse, AWSError] = js.native
  /**
    * Resolves a support case. This operation takes a caseId and returns the initial and final state of the case.    You must have a Business or Enterprise support plan to use the AWS Support API.    If you call the AWS Support API from an account that does not have a Business or Enterprise support plan, the SubscriptionRequiredException error message appears. For information about changing your support plan, see AWS Support.   
    */
  def resolveCase(params: ResolveCaseRequest): Request[ResolveCaseResponse, AWSError] = js.native
  def resolveCase(
    params: ResolveCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResolveCaseResponse, Unit]
  ): Request[ResolveCaseResponse, AWSError] = js.native
}
