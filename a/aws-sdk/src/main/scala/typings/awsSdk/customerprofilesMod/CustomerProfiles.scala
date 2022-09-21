package typings.awsSdk.customerprofilesMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerProfiles extends Service {
  
  /**
    * Associates a new key value with a specific profile, such as a Contact Record ContactId. A profile object can have a single unique key and any number of additional keys that can be used to identify the profile that it belongs to.
    */
  def addProfileKey(): Request[AddProfileKeyResponse, AWSError] = js.native
  def addProfileKey(callback: js.Function2[/* err */ AWSError, /* data */ AddProfileKeyResponse, Unit]): Request[AddProfileKeyResponse, AWSError] = js.native
  /**
    * Associates a new key value with a specific profile, such as a Contact Record ContactId. A profile object can have a single unique key and any number of additional keys that can be used to identify the profile that it belongs to.
    */
  def addProfileKey(params: AddProfileKeyRequest): Request[AddProfileKeyResponse, AWSError] = js.native
  def addProfileKey(
    params: AddProfileKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddProfileKeyResponse, Unit]
  ): Request[AddProfileKeyResponse, AWSError] = js.native
  
  @JSName("config")
  var config_CustomerProfiles: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a domain, which is a container for all customer data, such as customer profile attributes, object types, profile keys, and encryption keys. You can create multiple domains, and each domain can have multiple third-party integrations. Each Amazon Connect instance can be associated with only one domain. Multiple Amazon Connect instances can be associated with one domain. Use this API or UpdateDomain to enable identity resolution: set Matching to true.  To prevent cross-service impersonation when you call this API, see Cross-service confused deputy prevention for sample policies that you should apply. 
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a domain, which is a container for all customer data, such as customer profile attributes, object types, profile keys, and encryption keys. You can create multiple domains, and each domain can have multiple third-party integrations. Each Amazon Connect instance can be associated with only one domain. Multiple Amazon Connect instances can be associated with one domain. Use this API or UpdateDomain to enable identity resolution: set Matching to true.  To prevent cross-service impersonation when you call this API, see Cross-service confused deputy prevention for sample policies that you should apply. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    *  Creates an integration workflow. An integration workflow is an async process which ingests historic data and sets up an integration for ongoing updates. The supported Amazon AppFlow sources are Salesforce, ServiceNow, and Marketo. 
    */
  def createIntegrationWorkflow(): Request[CreateIntegrationWorkflowResponse, AWSError] = js.native
  def createIntegrationWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationWorkflowResponse, Unit]): Request[CreateIntegrationWorkflowResponse, AWSError] = js.native
  /**
    *  Creates an integration workflow. An integration workflow is an async process which ingests historic data and sets up an integration for ongoing updates. The supported Amazon AppFlow sources are Salesforce, ServiceNow, and Marketo. 
    */
  def createIntegrationWorkflow(params: CreateIntegrationWorkflowRequest): Request[CreateIntegrationWorkflowResponse, AWSError] = js.native
  def createIntegrationWorkflow(
    params: CreateIntegrationWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationWorkflowResponse, Unit]
  ): Request[CreateIntegrationWorkflowResponse, AWSError] = js.native
  
  /**
    * Creates a standard profile. A standard profile represents the following attributes for a customer profile in a domain.
    */
  def createProfile(): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]): Request[CreateProfileResponse, AWSError] = js.native
  /**
    * Creates a standard profile. A standard profile represents the following attributes for a customer profile in a domain.
    */
  def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(
    params: CreateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]
  ): Request[CreateProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related objects.
    */
  def deleteDomain(): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]): Request[DeleteDomainResponse, AWSError] = js.native
  /**
    * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related objects.
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]
  ): Request[DeleteDomainResponse, AWSError] = js.native
  
  /**
    * Removes an integration from a specific domain.
    */
  def deleteIntegration(): Request[DeleteIntegrationResponse, AWSError] = js.native
  def deleteIntegration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIntegrationResponse, Unit]): Request[DeleteIntegrationResponse, AWSError] = js.native
  /**
    * Removes an integration from a specific domain.
    */
  def deleteIntegration(params: DeleteIntegrationRequest): Request[DeleteIntegrationResponse, AWSError] = js.native
  def deleteIntegration(
    params: DeleteIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIntegrationResponse, Unit]
  ): Request[DeleteIntegrationResponse, AWSError] = js.native
  
  /**
    * Deletes the standard customer profile and all data pertaining to the profile.
    */
  def deleteProfile(): Request[DeleteProfileResponse, AWSError] = js.native
  def deleteProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileResponse, Unit]): Request[DeleteProfileResponse, AWSError] = js.native
  /**
    * Deletes the standard customer profile and all data pertaining to the profile.
    */
  def deleteProfile(params: DeleteProfileRequest): Request[DeleteProfileResponse, AWSError] = js.native
  def deleteProfile(
    params: DeleteProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileResponse, Unit]
  ): Request[DeleteProfileResponse, AWSError] = js.native
  
  /**
    * Removes a searchable key from a customer profile.
    */
  def deleteProfileKey(): Request[DeleteProfileKeyResponse, AWSError] = js.native
  def deleteProfileKey(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileKeyResponse, Unit]): Request[DeleteProfileKeyResponse, AWSError] = js.native
  /**
    * Removes a searchable key from a customer profile.
    */
  def deleteProfileKey(params: DeleteProfileKeyRequest): Request[DeleteProfileKeyResponse, AWSError] = js.native
  def deleteProfileKey(
    params: DeleteProfileKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileKeyResponse, Unit]
  ): Request[DeleteProfileKeyResponse, AWSError] = js.native
  
  /**
    * Removes an object associated with a profile of a given ProfileObjectType.
    */
  def deleteProfileObject(): Request[DeleteProfileObjectResponse, AWSError] = js.native
  def deleteProfileObject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileObjectResponse, Unit]): Request[DeleteProfileObjectResponse, AWSError] = js.native
  /**
    * Removes an object associated with a profile of a given ProfileObjectType.
    */
  def deleteProfileObject(params: DeleteProfileObjectRequest): Request[DeleteProfileObjectResponse, AWSError] = js.native
  def deleteProfileObject(
    params: DeleteProfileObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileObjectResponse, Unit]
  ): Request[DeleteProfileObjectResponse, AWSError] = js.native
  
  /**
    * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the standard profile that were populated from this ProfileObjectType.
    */
  def deleteProfileObjectType(): Request[DeleteProfileObjectTypeResponse, AWSError] = js.native
  def deleteProfileObjectType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileObjectTypeResponse, Unit]): Request[DeleteProfileObjectTypeResponse, AWSError] = js.native
  /**
    * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the standard profile that were populated from this ProfileObjectType.
    */
  def deleteProfileObjectType(params: DeleteProfileObjectTypeRequest): Request[DeleteProfileObjectTypeResponse, AWSError] = js.native
  def deleteProfileObjectType(
    params: DeleteProfileObjectTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileObjectTypeResponse, Unit]
  ): Request[DeleteProfileObjectTypeResponse, AWSError] = js.native
  
  /**
    * Deletes the specified workflow and all its corresponding resources. This is an async process.
    */
  def deleteWorkflow(): Request[DeleteWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowResponse, Unit]): Request[DeleteWorkflowResponse, AWSError] = js.native
  /**
    * Deletes the specified workflow and all its corresponding resources. This is an async process.
    */
  def deleteWorkflow(params: DeleteWorkflowRequest): Request[DeleteWorkflowResponse, AWSError] = js.native
  def deleteWorkflow(
    params: DeleteWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkflowResponse, Unit]
  ): Request[DeleteWorkflowResponse, AWSError] = js.native
  
  /**
    * Tests the auto-merging settings of your Identity Resolution Job without merging your data. It randomly selects a sample of matching groups from the existing matching results, and applies the automerging settings that you provided. You can then view the number of profiles in the sample, the number of matches, and the number of profiles identified to be merged. This enables you to evaluate the accuracy of the attributes in your matching list.  You can't view which profiles are matched and would be merged.  We strongly recommend you use this API to do a dry run of the automerging process before running the Identity Resolution Job. Include at least two matching attributes. If your matching list includes too few attributes (such as only FirstName or only LastName), there may be a large number of matches. This increases the chances of erroneous merges. 
    */
  def getAutoMergingPreview(): Request[GetAutoMergingPreviewResponse, AWSError] = js.native
  def getAutoMergingPreview(callback: js.Function2[/* err */ AWSError, /* data */ GetAutoMergingPreviewResponse, Unit]): Request[GetAutoMergingPreviewResponse, AWSError] = js.native
  /**
    * Tests the auto-merging settings of your Identity Resolution Job without merging your data. It randomly selects a sample of matching groups from the existing matching results, and applies the automerging settings that you provided. You can then view the number of profiles in the sample, the number of matches, and the number of profiles identified to be merged. This enables you to evaluate the accuracy of the attributes in your matching list.  You can't view which profiles are matched and would be merged.  We strongly recommend you use this API to do a dry run of the automerging process before running the Identity Resolution Job. Include at least two matching attributes. If your matching list includes too few attributes (such as only FirstName or only LastName), there may be a large number of matches. This increases the chances of erroneous merges. 
    */
  def getAutoMergingPreview(params: GetAutoMergingPreviewRequest): Request[GetAutoMergingPreviewResponse, AWSError] = js.native
  def getAutoMergingPreview(
    params: GetAutoMergingPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoMergingPreviewResponse, Unit]
  ): Request[GetAutoMergingPreviewResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific domain.
    */
  def getDomain(): Request[GetDomainResponse, AWSError] = js.native
  def getDomain(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResponse, Unit]): Request[GetDomainResponse, AWSError] = js.native
  /**
    * Returns information about a specific domain.
    */
  def getDomain(params: GetDomainRequest): Request[GetDomainResponse, AWSError] = js.native
  def getDomain(
    params: GetDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResponse, Unit]
  ): Request[GetDomainResponse, AWSError] = js.native
  
  /**
    * Returns information about an Identity Resolution Job in a specific domain.  Identity Resolution Jobs are set up using the Amazon Connect admin console. For more information, see Use Identity Resolution to consolidate similar profiles.
    */
  def getIdentityResolutionJob(): Request[GetIdentityResolutionJobResponse, AWSError] = js.native
  def getIdentityResolutionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityResolutionJobResponse, Unit]): Request[GetIdentityResolutionJobResponse, AWSError] = js.native
  /**
    * Returns information about an Identity Resolution Job in a specific domain.  Identity Resolution Jobs are set up using the Amazon Connect admin console. For more information, see Use Identity Resolution to consolidate similar profiles.
    */
  def getIdentityResolutionJob(params: GetIdentityResolutionJobRequest): Request[GetIdentityResolutionJobResponse, AWSError] = js.native
  def getIdentityResolutionJob(
    params: GetIdentityResolutionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityResolutionJobResponse, Unit]
  ): Request[GetIdentityResolutionJobResponse, AWSError] = js.native
  
  /**
    * Returns an integration for a domain.
    */
  def getIntegration(): Request[GetIntegrationResponse, AWSError] = js.native
  def getIntegration(callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponse, Unit]): Request[GetIntegrationResponse, AWSError] = js.native
  /**
    * Returns an integration for a domain.
    */
  def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResponse, AWSError] = js.native
  def getIntegration(
    params: GetIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponse, Unit]
  ): Request[GetIntegrationResponse, AWSError] = js.native
  
  /**
    * Before calling this API, use CreateDomain or UpdateDomain to enable identity resolution: set Matching to true. GetMatches returns potentially matching profiles, based on the results of the latest run of a machine learning process.   The process of matching duplicate profiles. If Matching = true, Amazon Connect Customer Profiles starts a weekly batch process called Identity Resolution Job. If you do not specify a date and time for Identity Resolution Job to run, by default it runs every Saturday at 12AM UTC to detect duplicate profiles in your domains.  After the Identity Resolution Job completes, use the GetMatches API to return and review the results. Or, if you have configured ExportingConfig in the MatchingRequest, you can download the results from S3.  Amazon Connect uses the following profile attributes to identify matches:   PhoneNumber   HomePhoneNumber   BusinessPhoneNumber   MobilePhoneNumber   EmailAddress   PersonalEmailAddress   BusinessEmailAddress   FullName   For example, two or more profiles—with spelling mistakes such as John Doe and Jhn Doe, or different casing email addresses such as JOHN_DOE@ANYCOMPANY.COM and johndoe@anycompany.com, or different phone number formats such as 555-010-0000 and +1-555-010-0000—can be detected as belonging to the same customer John Doe and merged into a unified profile.
    */
  def getMatches(): Request[GetMatchesResponse, AWSError] = js.native
  def getMatches(callback: js.Function2[/* err */ AWSError, /* data */ GetMatchesResponse, Unit]): Request[GetMatchesResponse, AWSError] = js.native
  /**
    * Before calling this API, use CreateDomain or UpdateDomain to enable identity resolution: set Matching to true. GetMatches returns potentially matching profiles, based on the results of the latest run of a machine learning process.   The process of matching duplicate profiles. If Matching = true, Amazon Connect Customer Profiles starts a weekly batch process called Identity Resolution Job. If you do not specify a date and time for Identity Resolution Job to run, by default it runs every Saturday at 12AM UTC to detect duplicate profiles in your domains.  After the Identity Resolution Job completes, use the GetMatches API to return and review the results. Or, if you have configured ExportingConfig in the MatchingRequest, you can download the results from S3.  Amazon Connect uses the following profile attributes to identify matches:   PhoneNumber   HomePhoneNumber   BusinessPhoneNumber   MobilePhoneNumber   EmailAddress   PersonalEmailAddress   BusinessEmailAddress   FullName   For example, two or more profiles—with spelling mistakes such as John Doe and Jhn Doe, or different casing email addresses such as JOHN_DOE@ANYCOMPANY.COM and johndoe@anycompany.com, or different phone number formats such as 555-010-0000 and +1-555-010-0000—can be detected as belonging to the same customer John Doe and merged into a unified profile.
    */
  def getMatches(params: GetMatchesRequest): Request[GetMatchesResponse, AWSError] = js.native
  def getMatches(
    params: GetMatchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMatchesResponse, Unit]
  ): Request[GetMatchesResponse, AWSError] = js.native
  
  /**
    * Returns the object types for a specific domain.
    */
  def getProfileObjectType(): Request[GetProfileObjectTypeResponse, AWSError] = js.native
  def getProfileObjectType(callback: js.Function2[/* err */ AWSError, /* data */ GetProfileObjectTypeResponse, Unit]): Request[GetProfileObjectTypeResponse, AWSError] = js.native
  /**
    * Returns the object types for a specific domain.
    */
  def getProfileObjectType(params: GetProfileObjectTypeRequest): Request[GetProfileObjectTypeResponse, AWSError] = js.native
  def getProfileObjectType(
    params: GetProfileObjectTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProfileObjectTypeResponse, Unit]
  ): Request[GetProfileObjectTypeResponse, AWSError] = js.native
  
  /**
    * Returns the template information for a specific object type. A template is a predefined ProfileObjectType, such as “Salesforce-Account” or “Salesforce-Contact.” When a user sends a ProfileObject, using the PutProfileObject API, with an ObjectTypeName that matches one of the TemplateIds, it uses the mappings from the template.
    */
  def getProfileObjectTypeTemplate(): Request[GetProfileObjectTypeTemplateResponse, AWSError] = js.native
  def getProfileObjectTypeTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetProfileObjectTypeTemplateResponse, Unit]): Request[GetProfileObjectTypeTemplateResponse, AWSError] = js.native
  /**
    * Returns the template information for a specific object type. A template is a predefined ProfileObjectType, such as “Salesforce-Account” or “Salesforce-Contact.” When a user sends a ProfileObject, using the PutProfileObject API, with an ObjectTypeName that matches one of the TemplateIds, it uses the mappings from the template.
    */
  def getProfileObjectTypeTemplate(params: GetProfileObjectTypeTemplateRequest): Request[GetProfileObjectTypeTemplateResponse, AWSError] = js.native
  def getProfileObjectTypeTemplate(
    params: GetProfileObjectTypeTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProfileObjectTypeTemplateResponse, Unit]
  ): Request[GetProfileObjectTypeTemplateResponse, AWSError] = js.native
  
  /**
    * Get details of specified workflow.
    */
  def getWorkflow(): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]): Request[GetWorkflowResponse, AWSError] = js.native
  /**
    * Get details of specified workflow.
    */
  def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse, AWSError] = js.native
  def getWorkflow(
    params: GetWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowResponse, Unit]
  ): Request[GetWorkflowResponse, AWSError] = js.native
  
  /**
    * Get granular list of steps in workflow.
    */
  def getWorkflowSteps(): Request[GetWorkflowStepsResponse, AWSError] = js.native
  def getWorkflowSteps(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepsResponse, Unit]): Request[GetWorkflowStepsResponse, AWSError] = js.native
  /**
    * Get granular list of steps in workflow.
    */
  def getWorkflowSteps(params: GetWorkflowStepsRequest): Request[GetWorkflowStepsResponse, AWSError] = js.native
  def getWorkflowSteps(
    params: GetWorkflowStepsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkflowStepsResponse, Unit]
  ): Request[GetWorkflowStepsResponse, AWSError] = js.native
  
  /**
    * Lists all of the integrations associated to a specific URI in the AWS account.
    */
  def listAccountIntegrations(): Request[ListAccountIntegrationsResponse, AWSError] = js.native
  def listAccountIntegrations(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountIntegrationsResponse, Unit]): Request[ListAccountIntegrationsResponse, AWSError] = js.native
  /**
    * Lists all of the integrations associated to a specific URI in the AWS account.
    */
  def listAccountIntegrations(params: ListAccountIntegrationsRequest): Request[ListAccountIntegrationsResponse, AWSError] = js.native
  def listAccountIntegrations(
    params: ListAccountIntegrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountIntegrationsResponse, Unit]
  ): Request[ListAccountIntegrationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all the domains for an AWS account that have been created.
    */
  def listDomains(): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Returns a list of all the domains for an AWS account that have been created.
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]
  ): Request[ListDomainsResponse, AWSError] = js.native
  
  /**
    * Lists all of the Identity Resolution Jobs in your domain. The response sorts the list by JobStartTime.
    */
  def listIdentityResolutionJobs(): Request[ListIdentityResolutionJobsResponse, AWSError] = js.native
  def listIdentityResolutionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityResolutionJobsResponse, Unit]): Request[ListIdentityResolutionJobsResponse, AWSError] = js.native
  /**
    * Lists all of the Identity Resolution Jobs in your domain. The response sorts the list by JobStartTime.
    */
  def listIdentityResolutionJobs(params: ListIdentityResolutionJobsRequest): Request[ListIdentityResolutionJobsResponse, AWSError] = js.native
  def listIdentityResolutionJobs(
    params: ListIdentityResolutionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityResolutionJobsResponse, Unit]
  ): Request[ListIdentityResolutionJobsResponse, AWSError] = js.native
  
  /**
    * Lists all of the integrations in your domain.
    */
  def listIntegrations(): Request[ListIntegrationsResponse, AWSError] = js.native
  def listIntegrations(callback: js.Function2[/* err */ AWSError, /* data */ ListIntegrationsResponse, Unit]): Request[ListIntegrationsResponse, AWSError] = js.native
  /**
    * Lists all of the integrations in your domain.
    */
  def listIntegrations(params: ListIntegrationsRequest): Request[ListIntegrationsResponse, AWSError] = js.native
  def listIntegrations(
    params: ListIntegrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIntegrationsResponse, Unit]
  ): Request[ListIntegrationsResponse, AWSError] = js.native
  
  /**
    * Lists all of the template information for object types.
    */
  def listProfileObjectTypeTemplates(): Request[ListProfileObjectTypeTemplatesResponse, AWSError] = js.native
  def listProfileObjectTypeTemplates(
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectTypeTemplatesResponse, Unit]
  ): Request[ListProfileObjectTypeTemplatesResponse, AWSError] = js.native
  /**
    * Lists all of the template information for object types.
    */
  def listProfileObjectTypeTemplates(params: ListProfileObjectTypeTemplatesRequest): Request[ListProfileObjectTypeTemplatesResponse, AWSError] = js.native
  def listProfileObjectTypeTemplates(
    params: ListProfileObjectTypeTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectTypeTemplatesResponse, Unit]
  ): Request[ListProfileObjectTypeTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all of the templates available within the service.
    */
  def listProfileObjectTypes(): Request[ListProfileObjectTypesResponse, AWSError] = js.native
  def listProfileObjectTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectTypesResponse, Unit]): Request[ListProfileObjectTypesResponse, AWSError] = js.native
  /**
    * Lists all of the templates available within the service.
    */
  def listProfileObjectTypes(params: ListProfileObjectTypesRequest): Request[ListProfileObjectTypesResponse, AWSError] = js.native
  def listProfileObjectTypes(
    params: ListProfileObjectTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectTypesResponse, Unit]
  ): Request[ListProfileObjectTypesResponse, AWSError] = js.native
  
  /**
    * Returns a list of objects associated with a profile of a given ProfileObjectType.
    */
  def listProfileObjects(): Request[ListProfileObjectsResponse, AWSError] = js.native
  def listProfileObjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectsResponse, Unit]): Request[ListProfileObjectsResponse, AWSError] = js.native
  /**
    * Returns a list of objects associated with a profile of a given ProfileObjectType.
    */
  def listProfileObjects(params: ListProfileObjectsRequest): Request[ListProfileObjectsResponse, AWSError] = js.native
  def listProfileObjects(
    params: ListProfileObjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileObjectsResponse, Unit]
  ): Request[ListProfileObjectsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Query to list all workflows.
    */
  def listWorkflows(): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]): Request[ListWorkflowsResponse, AWSError] = js.native
  /**
    * Query to list all workflows.
    */
  def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(
    params: ListWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]
  ): Request[ListWorkflowsResponse, AWSError] = js.native
  
  /**
    * Runs an AWS Lambda job that does the following:   All the profileKeys in the ProfileToBeMerged will be moved to the main profile.   All the objects in the ProfileToBeMerged will be moved to the main profile.   All the ProfileToBeMerged will be deleted at the end.   All the profileKeys in the ProfileIdsToBeMerged will be moved to the main profile.   Standard fields are merged as follows:   Fields are always "union"-ed if there are no conflicts in standard fields or attributeKeys.   When there are conflicting fields:   If no SourceProfileIds entry is specified, the main Profile value is always taken.    If a SourceProfileIds entry is specified, the specified profileId is always taken, even if it is a NULL value.       You can use MergeProfiles together with GetMatches, which returns potentially matching profiles, or use it with the results of another matching system. After profiles have been merged, they cannot be separated (unmerged).
    */
  def mergeProfiles(): Request[MergeProfilesResponse, AWSError] = js.native
  def mergeProfiles(callback: js.Function2[/* err */ AWSError, /* data */ MergeProfilesResponse, Unit]): Request[MergeProfilesResponse, AWSError] = js.native
  /**
    * Runs an AWS Lambda job that does the following:   All the profileKeys in the ProfileToBeMerged will be moved to the main profile.   All the objects in the ProfileToBeMerged will be moved to the main profile.   All the ProfileToBeMerged will be deleted at the end.   All the profileKeys in the ProfileIdsToBeMerged will be moved to the main profile.   Standard fields are merged as follows:   Fields are always "union"-ed if there are no conflicts in standard fields or attributeKeys.   When there are conflicting fields:   If no SourceProfileIds entry is specified, the main Profile value is always taken.    If a SourceProfileIds entry is specified, the specified profileId is always taken, even if it is a NULL value.       You can use MergeProfiles together with GetMatches, which returns potentially matching profiles, or use it with the results of another matching system. After profiles have been merged, they cannot be separated (unmerged).
    */
  def mergeProfiles(params: MergeProfilesRequest): Request[MergeProfilesResponse, AWSError] = js.native
  def mergeProfiles(
    params: MergeProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MergeProfilesResponse, Unit]
  ): Request[MergeProfilesResponse, AWSError] = js.native
  
  /**
    * Adds an integration between the service and a third-party service, which includes Amazon AppFlow and Amazon Connect. An integration can belong to only one domain. To add or remove tags on an existing Integration, see  TagResource / UntagResource.
    */
  def putIntegration(): Request[PutIntegrationResponse, AWSError] = js.native
  def putIntegration(callback: js.Function2[/* err */ AWSError, /* data */ PutIntegrationResponse, Unit]): Request[PutIntegrationResponse, AWSError] = js.native
  /**
    * Adds an integration between the service and a third-party service, which includes Amazon AppFlow and Amazon Connect. An integration can belong to only one domain. To add or remove tags on an existing Integration, see  TagResource / UntagResource.
    */
  def putIntegration(params: PutIntegrationRequest): Request[PutIntegrationResponse, AWSError] = js.native
  def putIntegration(
    params: PutIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutIntegrationResponse, Unit]
  ): Request[PutIntegrationResponse, AWSError] = js.native
  
  /**
    * Adds additional objects to customer profiles of a given ObjectType. When adding a specific profile object, like a Contact Record, an inferred profile can get created if it is not mapped to an existing profile. The resulting profile will only have a phone number populated in the standard ProfileObject. Any additional Contact Records with the same phone number will be mapped to the same inferred profile. When a ProfileObject is created and if a ProfileObjectType already exists for the ProfileObject, it will provide data to a standard profile depending on the ProfileObjectType definition. PutProfileObject needs an ObjectType, which can be created using PutProfileObjectType.
    */
  def putProfileObject(): Request[PutProfileObjectResponse, AWSError] = js.native
  def putProfileObject(callback: js.Function2[/* err */ AWSError, /* data */ PutProfileObjectResponse, Unit]): Request[PutProfileObjectResponse, AWSError] = js.native
  /**
    * Adds additional objects to customer profiles of a given ObjectType. When adding a specific profile object, like a Contact Record, an inferred profile can get created if it is not mapped to an existing profile. The resulting profile will only have a phone number populated in the standard ProfileObject. Any additional Contact Records with the same phone number will be mapped to the same inferred profile. When a ProfileObject is created and if a ProfileObjectType already exists for the ProfileObject, it will provide data to a standard profile depending on the ProfileObjectType definition. PutProfileObject needs an ObjectType, which can be created using PutProfileObjectType.
    */
  def putProfileObject(params: PutProfileObjectRequest): Request[PutProfileObjectResponse, AWSError] = js.native
  def putProfileObject(
    params: PutProfileObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProfileObjectResponse, Unit]
  ): Request[PutProfileObjectResponse, AWSError] = js.native
  
  /**
    * Defines a ProfileObjectType. To add or remove tags on an existing ObjectType, see  TagResource/UntagResource.
    */
  def putProfileObjectType(): Request[PutProfileObjectTypeResponse, AWSError] = js.native
  def putProfileObjectType(callback: js.Function2[/* err */ AWSError, /* data */ PutProfileObjectTypeResponse, Unit]): Request[PutProfileObjectTypeResponse, AWSError] = js.native
  /**
    * Defines a ProfileObjectType. To add or remove tags on an existing ObjectType, see  TagResource/UntagResource.
    */
  def putProfileObjectType(params: PutProfileObjectTypeRequest): Request[PutProfileObjectTypeResponse, AWSError] = js.native
  def putProfileObjectType(
    params: PutProfileObjectTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProfileObjectTypeResponse, Unit]
  ): Request[PutProfileObjectTypeResponse, AWSError] = js.native
  
  /**
    * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a custom defined index.
    */
  def searchProfiles(): Request[SearchProfilesResponse, AWSError] = js.native
  def searchProfiles(callback: js.Function2[/* err */ AWSError, /* data */ SearchProfilesResponse, Unit]): Request[SearchProfilesResponse, AWSError] = js.native
  /**
    * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a custom defined index.
    */
  def searchProfiles(params: SearchProfilesRequest): Request[SearchProfilesResponse, AWSError] = js.native
  def searchProfiles(
    params: SearchProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchProfilesResponse, Unit]
  ): Request[SearchProfilesResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon Connect Customer Profiles resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon Connect Customer Profiles resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer Profiles, domains, profile object types, and integrations can be tagged.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key. After a domain is created, the name can’t be changed. Use this API or CreateDomain to enable identity resolution: set Matching to true.  To prevent cross-service impersonation when you call this API, see Cross-service confused deputy prevention for sample policies that you should apply.  To add or remove tags on an existing Domain, see TagResource/UntagResource.
    */
  def updateDomain(): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]): Request[UpdateDomainResponse, AWSError] = js.native
  /**
    * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key. After a domain is created, the name can’t be changed. Use this API or CreateDomain to enable identity resolution: set Matching to true.  To prevent cross-service impersonation when you call this API, see Cross-service confused deputy prevention for sample policies that you should apply.  To add or remove tags on an existing Domain, see TagResource/UntagResource.
    */
  def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(
    params: UpdateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]
  ): Request[UpdateDomainResponse, AWSError] = js.native
  
  /**
    * Updates the properties of a profile. The ProfileId is required for updating a customer profile. When calling the UpdateProfile API, specifying an empty string value means that any existing value will be removed. Not specifying a string value means that any value already there will be kept.
    */
  def updateProfile(): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]): Request[UpdateProfileResponse, AWSError] = js.native
  /**
    * Updates the properties of a profile. The ProfileId is required for updating a customer profile. When calling the UpdateProfile API, specifying an empty string value means that any existing value will be removed. Not specifying a string value means that any value already there will be kept.
    */
  def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(
    params: UpdateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]
  ): Request[UpdateProfileResponse, AWSError] = js.native
}
