package typings.awsSdk.clientsWorkmailMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkMail extends Service {
  
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  def associateDelegateToResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDelegateToResourceResponse, Unit]): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(params: AssociateDelegateToResourceRequest): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  def associateDelegateToResource(
    params: AssociateDelegateToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDelegateToResourceResponse, Unit]
  ): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  def associateMemberToGroup(callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberToGroupResponse, Unit]): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(params: AssociateMemberToGroupRequest): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  def associateMemberToGroup(
    params: AssociateMemberToGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberToGroupResponse, Unit]
  ): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  
  /**
    * Assumes an impersonation role for the given WorkMail organization. This method returns an authentication token you can use to make impersonated calls.
    */
  def assumeImpersonationRole(): Request[AssumeImpersonationRoleResponse, AWSError] = js.native
  def assumeImpersonationRole(callback: js.Function2[/* err */ AWSError, /* data */ AssumeImpersonationRoleResponse, Unit]): Request[AssumeImpersonationRoleResponse, AWSError] = js.native
  /**
    * Assumes an impersonation role for the given WorkMail organization. This method returns an authentication token you can use to make impersonated calls.
    */
  def assumeImpersonationRole(params: AssumeImpersonationRoleRequest): Request[AssumeImpersonationRoleResponse, AWSError] = js.native
  def assumeImpersonationRole(
    params: AssumeImpersonationRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssumeImpersonationRoleResponse, Unit]
  ): Request[AssumeImpersonationRoleResponse, AWSError] = js.native
  
  /**
    * Cancels a mailbox export job.  If the mailbox export job is near completion, it might not be possible to cancel it. 
    */
  def cancelMailboxExportJob(): Request[CancelMailboxExportJobResponse, AWSError] = js.native
  def cancelMailboxExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelMailboxExportJobResponse, Unit]): Request[CancelMailboxExportJobResponse, AWSError] = js.native
  /**
    * Cancels a mailbox export job.  If the mailbox export job is near completion, it might not be possible to cancel it. 
    */
  def cancelMailboxExportJob(params: CancelMailboxExportJobRequest): Request[CancelMailboxExportJobResponse, AWSError] = js.native
  def cancelMailboxExportJob(
    params: CancelMailboxExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelMailboxExportJobResponse, Unit]
  ): Request[CancelMailboxExportJobResponse, AWSError] = js.native
  
  @JSName("config")
  var config_WorkMail: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Adds an alias to the set of a given member (user or group) of WorkMail.
    */
  def createAlias(): Request[CreateAliasResponse, AWSError] = js.native
  def createAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResponse, Unit]): Request[CreateAliasResponse, AWSError] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of WorkMail.
    */
  def createAlias(params: CreateAliasRequest): Request[CreateAliasResponse, AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResponse, Unit]
  ): Request[CreateAliasResponse, AWSError] = js.native
  
  /**
    * Creates an AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def createAvailabilityConfiguration(): Request[CreateAvailabilityConfigurationResponse, AWSError] = js.native
  def createAvailabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAvailabilityConfigurationResponse, Unit]
  ): Request[CreateAvailabilityConfigurationResponse, AWSError] = js.native
  /**
    * Creates an AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def createAvailabilityConfiguration(params: CreateAvailabilityConfigurationRequest): Request[CreateAvailabilityConfigurationResponse, AWSError] = js.native
  def createAvailabilityConfiguration(
    params: CreateAvailabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAvailabilityConfigurationResponse, Unit]
  ): Request[CreateAvailabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a group that can be used in WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a group that can be used in WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Creates an impersonation role for the given WorkMail organization.  Idempotency ensures that an API request completes no more than one time. With an idempotent request, if the original request completes successfully, any subsequent retries also complete successfully without performing any further actions.
    */
  def createImpersonationRole(): Request[CreateImpersonationRoleResponse, AWSError] = js.native
  def createImpersonationRole(callback: js.Function2[/* err */ AWSError, /* data */ CreateImpersonationRoleResponse, Unit]): Request[CreateImpersonationRoleResponse, AWSError] = js.native
  /**
    * Creates an impersonation role for the given WorkMail organization.  Idempotency ensures that an API request completes no more than one time. With an idempotent request, if the original request completes successfully, any subsequent retries also complete successfully without performing any further actions.
    */
  def createImpersonationRole(params: CreateImpersonationRoleRequest): Request[CreateImpersonationRoleResponse, AWSError] = js.native
  def createImpersonationRole(
    params: CreateImpersonationRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImpersonationRoleResponse, Unit]
  ): Request[CreateImpersonationRoleResponse, AWSError] = js.native
  
  /**
    * Creates a new mobile device access rule for the specified WorkMail organization.
    */
  def createMobileDeviceAccessRule(): Request[CreateMobileDeviceAccessRuleResponse, AWSError] = js.native
  def createMobileDeviceAccessRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateMobileDeviceAccessRuleResponse, Unit]): Request[CreateMobileDeviceAccessRuleResponse, AWSError] = js.native
  /**
    * Creates a new mobile device access rule for the specified WorkMail organization.
    */
  def createMobileDeviceAccessRule(params: CreateMobileDeviceAccessRuleRequest): Request[CreateMobileDeviceAccessRuleResponse, AWSError] = js.native
  def createMobileDeviceAccessRule(
    params: CreateMobileDeviceAccessRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMobileDeviceAccessRuleResponse, Unit]
  ): Request[CreateMobileDeviceAccessRuleResponse, AWSError] = js.native
  
  /**
    * Creates a new WorkMail organization. Optionally, you can choose to associate an existing AWS Directory Service directory with your organization. If an AWS Directory Service directory ID is specified, the organization alias must match the directory alias. If you choose not to associate an existing directory with your organization, then we create a new WorkMail directory for you. For more information, see Adding an organization in the WorkMail Administrator Guide. You can associate multiple email domains with an organization, then choose your default email domain from the WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For more information, see Adding a domain and Choosing the default domain in the WorkMail Administrator Guide. Optionally, you can use a customer managed key from AWS Key Management Service (AWS KMS) to encrypt email for your organization. If you don't associate an AWS KMS key, WorkMail creates a default, AWS managed key for you.
    */
  def createOrganization(): Request[CreateOrganizationResponse, AWSError] = js.native
  def createOrganization(callback: js.Function2[/* err */ AWSError, /* data */ CreateOrganizationResponse, Unit]): Request[CreateOrganizationResponse, AWSError] = js.native
  /**
    * Creates a new WorkMail organization. Optionally, you can choose to associate an existing AWS Directory Service directory with your organization. If an AWS Directory Service directory ID is specified, the organization alias must match the directory alias. If you choose not to associate an existing directory with your organization, then we create a new WorkMail directory for you. For more information, see Adding an organization in the WorkMail Administrator Guide. You can associate multiple email domains with an organization, then choose your default email domain from the WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For more information, see Adding a domain and Choosing the default domain in the WorkMail Administrator Guide. Optionally, you can use a customer managed key from AWS Key Management Service (AWS KMS) to encrypt email for your organization. If you don't associate an AWS KMS key, WorkMail creates a default, AWS managed key for you.
    */
  def createOrganization(params: CreateOrganizationRequest): Request[CreateOrganizationResponse, AWSError] = js.native
  def createOrganization(
    params: CreateOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOrganizationResponse, Unit]
  ): Request[CreateOrganizationResponse, AWSError] = js.native
  
  /**
    * Creates a new WorkMail resource.
    */
  def createResource(): Request[CreateResourceResponse, AWSError] = js.native
  def createResource(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceResponse, Unit]): Request[CreateResourceResponse, AWSError] = js.native
  /**
    * Creates a new WorkMail resource.
    */
  def createResource(params: CreateResourceRequest): Request[CreateResourceResponse, AWSError] = js.native
  def createResource(
    params: CreateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceResponse, Unit]
  ): Request[CreateResourceResponse, AWSError] = js.native
  
  /**
    * Creates a user who can be used in WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user who can be used in WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deletes an access control rule for the specified WorkMail organization.  Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteAccessControlRule(): Request[DeleteAccessControlRuleResponse, AWSError] = js.native
  def deleteAccessControlRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessControlRuleResponse, Unit]): Request[DeleteAccessControlRuleResponse, AWSError] = js.native
  /**
    * Deletes an access control rule for the specified WorkMail organization.  Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteAccessControlRule(params: DeleteAccessControlRuleRequest): Request[DeleteAccessControlRuleResponse, AWSError] = js.native
  def deleteAccessControlRule(
    params: DeleteAccessControlRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessControlRuleResponse, Unit]
  ): Request[DeleteAccessControlRuleResponse, AWSError] = js.native
  
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(): Request[DeleteAliasResponse, AWSError] = js.native
  def deleteAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAliasResponse, Unit]): Request[DeleteAliasResponse, AWSError] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse, AWSError] = js.native
  def deleteAlias(
    params: DeleteAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAliasResponse, Unit]
  ): Request[DeleteAliasResponse, AWSError] = js.native
  
  /**
    * Deletes the AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def deleteAvailabilityConfiguration(): Request[DeleteAvailabilityConfigurationResponse, AWSError] = js.native
  def deleteAvailabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAvailabilityConfigurationResponse, Unit]
  ): Request[DeleteAvailabilityConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def deleteAvailabilityConfiguration(params: DeleteAvailabilityConfigurationRequest): Request[DeleteAvailabilityConfigurationResponse, AWSError] = js.native
  def deleteAvailabilityConfiguration(
    params: DeleteAvailabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAvailabilityConfigurationResponse, Unit]
  ): Request[DeleteAvailabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the email monitoring configuration for a specified organization.
    */
  def deleteEmailMonitoringConfiguration(): Request[DeleteEmailMonitoringConfigurationResponse, AWSError] = js.native
  def deleteEmailMonitoringConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailMonitoringConfigurationResponse, Unit]
  ): Request[DeleteEmailMonitoringConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the email monitoring configuration for a specified organization.
    */
  def deleteEmailMonitoringConfiguration(params: DeleteEmailMonitoringConfigurationRequest): Request[DeleteEmailMonitoringConfigurationResponse, AWSError] = js.native
  def deleteEmailMonitoringConfiguration(
    params: DeleteEmailMonitoringConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailMonitoringConfigurationResponse, Unit]
  ): Request[DeleteEmailMonitoringConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes a group from WorkMail.
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Deletes a group from WorkMail.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * Deletes an impersonation role for the given WorkMail organization.
    */
  def deleteImpersonationRole(): Request[DeleteImpersonationRoleResponse, AWSError] = js.native
  def deleteImpersonationRole(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImpersonationRoleResponse, Unit]): Request[DeleteImpersonationRoleResponse, AWSError] = js.native
  /**
    * Deletes an impersonation role for the given WorkMail organization.
    */
  def deleteImpersonationRole(params: DeleteImpersonationRoleRequest): Request[DeleteImpersonationRoleResponse, AWSError] = js.native
  def deleteImpersonationRole(
    params: DeleteImpersonationRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImpersonationRoleResponse, Unit]
  ): Request[DeleteImpersonationRoleResponse, AWSError] = js.native
  
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  def deleteMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMailboxPermissionsResponse, Unit]): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  def deleteMailboxPermissions(
    params: DeleteMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMailboxPermissionsResponse, Unit]
  ): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  
  /**
    * Deletes the mobile device access override for the given WorkMail organization, user, and device.  Deleting already deleted and non-existing overrides does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteMobileDeviceAccessOverride(): Request[DeleteMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def deleteMobileDeviceAccessOverride(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMobileDeviceAccessOverrideResponse, Unit]
  ): Request[DeleteMobileDeviceAccessOverrideResponse, AWSError] = js.native
  /**
    * Deletes the mobile device access override for the given WorkMail organization, user, and device.  Deleting already deleted and non-existing overrides does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteMobileDeviceAccessOverride(params: DeleteMobileDeviceAccessOverrideRequest): Request[DeleteMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def deleteMobileDeviceAccessOverride(
    params: DeleteMobileDeviceAccessOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMobileDeviceAccessOverrideResponse, Unit]
  ): Request[DeleteMobileDeviceAccessOverrideResponse, AWSError] = js.native
  
  /**
    * Deletes a mobile device access rule for the specified WorkMail organization.  Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteMobileDeviceAccessRule(): Request[DeleteMobileDeviceAccessRuleResponse, AWSError] = js.native
  def deleteMobileDeviceAccessRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMobileDeviceAccessRuleResponse, Unit]): Request[DeleteMobileDeviceAccessRuleResponse, AWSError] = js.native
  /**
    * Deletes a mobile device access rule for the specified WorkMail organization.  Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def deleteMobileDeviceAccessRule(params: DeleteMobileDeviceAccessRuleRequest): Request[DeleteMobileDeviceAccessRuleResponse, AWSError] = js.native
  def deleteMobileDeviceAccessRule(
    params: DeleteMobileDeviceAccessRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMobileDeviceAccessRuleResponse, Unit]
  ): Request[DeleteMobileDeviceAccessRuleResponse, AWSError] = js.native
  
  /**
    * Deletes an WorkMail organization and all underlying AWS resources managed by WorkMail as part of the organization. You can choose whether to delete the associated directory. For more information, see Removing an organization in the WorkMail Administrator Guide.
    */
  def deleteOrganization(): Request[DeleteOrganizationResponse, AWSError] = js.native
  def deleteOrganization(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOrganizationResponse, Unit]): Request[DeleteOrganizationResponse, AWSError] = js.native
  /**
    * Deletes an WorkMail organization and all underlying AWS resources managed by WorkMail as part of the organization. You can choose whether to delete the associated directory. For more information, see Removing an organization in the WorkMail Administrator Guide.
    */
  def deleteOrganization(params: DeleteOrganizationRequest): Request[DeleteOrganizationResponse, AWSError] = js.native
  def deleteOrganization(
    params: DeleteOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOrganizationResponse, Unit]
  ): Request[DeleteOrganizationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified resource.
    */
  def deleteResource(): Request[DeleteResourceResponse, AWSError] = js.native
  def deleteResource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceResponse, Unit]): Request[DeleteResourceResponse, AWSError] = js.native
  /**
    * Deletes the specified resource.
    */
  def deleteResource(params: DeleteResourceRequest): Request[DeleteResourceResponse, AWSError] = js.native
  def deleteResource(
    params: DeleteResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceResponse, Unit]
  ): Request[DeleteResourceResponse, AWSError] = js.native
  
  /**
    * Deletes the specified retention policy from the specified organization.
    */
  def deleteRetentionPolicy(): Request[DeleteRetentionPolicyResponse, AWSError] = js.native
  def deleteRetentionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRetentionPolicyResponse, Unit]): Request[DeleteRetentionPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified retention policy from the specified organization.
    */
  def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[DeleteRetentionPolicyResponse, AWSError] = js.native
  def deleteRetentionPolicy(
    params: DeleteRetentionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRetentionPolicyResponse, Unit]
  ): Request[DeleteRetentionPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a user from WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user from WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Mark a user, group, or resource as no longer used in WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  def deregisterFromWorkMail(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterFromWorkMailResponse, Unit]): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  /**
    * Mark a user, group, or resource as no longer used in WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  def deregisterFromWorkMail(
    params: DeregisterFromWorkMailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterFromWorkMailResponse, Unit]
  ): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  
  /**
    * Removes a domain from WorkMail, stops email routing to WorkMail, and removes the authorization allowing WorkMail use. SES keeps the domain because other applications may use it. You must first remove any email address used by WorkMail entities before you remove the domain.
    */
  def deregisterMailDomain(): Request[DeregisterMailDomainResponse, AWSError] = js.native
  def deregisterMailDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterMailDomainResponse, Unit]): Request[DeregisterMailDomainResponse, AWSError] = js.native
  /**
    * Removes a domain from WorkMail, stops email routing to WorkMail, and removes the authorization allowing WorkMail use. SES keeps the domain because other applications may use it. You must first remove any email address used by WorkMail entities before you remove the domain.
    */
  def deregisterMailDomain(params: DeregisterMailDomainRequest): Request[DeregisterMailDomainResponse, AWSError] = js.native
  def deregisterMailDomain(
    params: DeregisterMailDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterMailDomainResponse, Unit]
  ): Request[DeregisterMailDomainResponse, AWSError] = js.native
  
  /**
    * Describes the current email monitoring configuration for a specified organization.
    */
  def describeEmailMonitoringConfiguration(): Request[DescribeEmailMonitoringConfigurationResponse, AWSError] = js.native
  def describeEmailMonitoringConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmailMonitoringConfigurationResponse, Unit]
  ): Request[DescribeEmailMonitoringConfigurationResponse, AWSError] = js.native
  /**
    * Describes the current email monitoring configuration for a specified organization.
    */
  def describeEmailMonitoringConfiguration(params: DescribeEmailMonitoringConfigurationRequest): Request[DescribeEmailMonitoringConfigurationResponse, AWSError] = js.native
  def describeEmailMonitoringConfiguration(
    params: DescribeEmailMonitoringConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmailMonitoringConfigurationResponse, Unit]
  ): Request[DescribeEmailMonitoringConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns the data available for the group.
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  
  /**
    * Lists the settings in a DMARC policy for a specified organization.
    */
  def describeInboundDmarcSettings(): Request[DescribeInboundDmarcSettingsResponse, AWSError] = js.native
  def describeInboundDmarcSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundDmarcSettingsResponse, Unit]): Request[DescribeInboundDmarcSettingsResponse, AWSError] = js.native
  /**
    * Lists the settings in a DMARC policy for a specified organization.
    */
  def describeInboundDmarcSettings(params: DescribeInboundDmarcSettingsRequest): Request[DescribeInboundDmarcSettingsResponse, AWSError] = js.native
  def describeInboundDmarcSettings(
    params: DescribeInboundDmarcSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundDmarcSettingsResponse, Unit]
  ): Request[DescribeInboundDmarcSettingsResponse, AWSError] = js.native
  
  /**
    * Describes the current status of a mailbox export job.
    */
  def describeMailboxExportJob(): Request[DescribeMailboxExportJobResponse, AWSError] = js.native
  def describeMailboxExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMailboxExportJobResponse, Unit]): Request[DescribeMailboxExportJobResponse, AWSError] = js.native
  /**
    * Describes the current status of a mailbox export job.
    */
  def describeMailboxExportJob(params: DescribeMailboxExportJobRequest): Request[DescribeMailboxExportJobResponse, AWSError] = js.native
  def describeMailboxExportJob(
    params: DescribeMailboxExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMailboxExportJobResponse, Unit]
  ): Request[DescribeMailboxExportJobResponse, AWSError] = js.native
  
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(): Request[DescribeOrganizationResponse, AWSError] = js.native
  def describeOrganization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationResponse, Unit]): Request[DescribeOrganizationResponse, AWSError] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(params: DescribeOrganizationRequest): Request[DescribeOrganizationResponse, AWSError] = js.native
  def describeOrganization(
    params: DescribeOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationResponse, Unit]
  ): Request[DescribeOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns the data available for the resource.
    */
  def describeResource(): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]): Request[DescribeResourceResponse, AWSError] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(
    params: DescribeResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]
  ): Request[DescribeResourceResponse, AWSError] = js.native
  
  /**
    * Provides information regarding the user.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  def disassociateDelegateFromResource(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDelegateFromResourceResponse, Unit]
  ): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  def disassociateDelegateFromResource(
    params: DisassociateDelegateFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDelegateFromResourceResponse, Unit]
  ): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  def disassociateMemberFromGroup(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberFromGroupResponse, Unit]): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  def disassociateMemberFromGroup(
    params: DisassociateMemberFromGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberFromGroupResponse, Unit]
  ): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  
  /**
    * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access protocol action, and user ID or impersonation role ID. You must provide either the user ID or impersonation role ID. Impersonation role ID can only be used with Action EWS.
    */
  def getAccessControlEffect(): Request[GetAccessControlEffectResponse, AWSError] = js.native
  def getAccessControlEffect(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessControlEffectResponse, Unit]): Request[GetAccessControlEffectResponse, AWSError] = js.native
  /**
    * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access protocol action, and user ID or impersonation role ID. You must provide either the user ID or impersonation role ID. Impersonation role ID can only be used with Action EWS.
    */
  def getAccessControlEffect(params: GetAccessControlEffectRequest): Request[GetAccessControlEffectResponse, AWSError] = js.native
  def getAccessControlEffect(
    params: GetAccessControlEffectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessControlEffectResponse, Unit]
  ): Request[GetAccessControlEffectResponse, AWSError] = js.native
  
  /**
    * Gets the default retention policy details for the specified organization.
    */
  def getDefaultRetentionPolicy(): Request[GetDefaultRetentionPolicyResponse, AWSError] = js.native
  def getDefaultRetentionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultRetentionPolicyResponse, Unit]): Request[GetDefaultRetentionPolicyResponse, AWSError] = js.native
  /**
    * Gets the default retention policy details for the specified organization.
    */
  def getDefaultRetentionPolicy(params: GetDefaultRetentionPolicyRequest): Request[GetDefaultRetentionPolicyResponse, AWSError] = js.native
  def getDefaultRetentionPolicy(
    params: GetDefaultRetentionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultRetentionPolicyResponse, Unit]
  ): Request[GetDefaultRetentionPolicyResponse, AWSError] = js.native
  
  /**
    * Gets the impersonation role details for the given WorkMail organization.
    */
  def getImpersonationRole(): Request[GetImpersonationRoleResponse, AWSError] = js.native
  def getImpersonationRole(callback: js.Function2[/* err */ AWSError, /* data */ GetImpersonationRoleResponse, Unit]): Request[GetImpersonationRoleResponse, AWSError] = js.native
  /**
    * Gets the impersonation role details for the given WorkMail organization.
    */
  def getImpersonationRole(params: GetImpersonationRoleRequest): Request[GetImpersonationRoleResponse, AWSError] = js.native
  def getImpersonationRole(
    params: GetImpersonationRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImpersonationRoleResponse, Unit]
  ): Request[GetImpersonationRoleResponse, AWSError] = js.native
  
  /**
    * Tests whether the given impersonation role can impersonate a target user.
    */
  def getImpersonationRoleEffect(): Request[GetImpersonationRoleEffectResponse, AWSError] = js.native
  def getImpersonationRoleEffect(callback: js.Function2[/* err */ AWSError, /* data */ GetImpersonationRoleEffectResponse, Unit]): Request[GetImpersonationRoleEffectResponse, AWSError] = js.native
  /**
    * Tests whether the given impersonation role can impersonate a target user.
    */
  def getImpersonationRoleEffect(params: GetImpersonationRoleEffectRequest): Request[GetImpersonationRoleEffectResponse, AWSError] = js.native
  def getImpersonationRoleEffect(
    params: GetImpersonationRoleEffectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImpersonationRoleEffectResponse, Unit]
  ): Request[GetImpersonationRoleEffectResponse, AWSError] = js.native
  
  /**
    * Gets details for a mail domain, including domain records required to configure your domain with recommended security.
    */
  def getMailDomain(): Request[GetMailDomainResponse, AWSError] = js.native
  def getMailDomain(callback: js.Function2[/* err */ AWSError, /* data */ GetMailDomainResponse, Unit]): Request[GetMailDomainResponse, AWSError] = js.native
  /**
    * Gets details for a mail domain, including domain records required to configure your domain with recommended security.
    */
  def getMailDomain(params: GetMailDomainRequest): Request[GetMailDomainResponse, AWSError] = js.native
  def getMailDomain(
    params: GetMailDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMailDomainResponse, Unit]
  ): Request[GetMailDomainResponse, AWSError] = js.native
  
  /**
    * Requests a user's mailbox details for a specified organization and user.
    */
  def getMailboxDetails(): Request[GetMailboxDetailsResponse, AWSError] = js.native
  def getMailboxDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetMailboxDetailsResponse, Unit]): Request[GetMailboxDetailsResponse, AWSError] = js.native
  /**
    * Requests a user's mailbox details for a specified organization and user.
    */
  def getMailboxDetails(params: GetMailboxDetailsRequest): Request[GetMailboxDetailsResponse, AWSError] = js.native
  def getMailboxDetails(
    params: GetMailboxDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMailboxDetailsResponse, Unit]
  ): Request[GetMailboxDetailsResponse, AWSError] = js.native
  
  /**
    * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use this method to test the effects of the current set of mobile device access rules for the WorkMail organization for a particular user's attributes.
    */
  def getMobileDeviceAccessEffect(): Request[GetMobileDeviceAccessEffectResponse, AWSError] = js.native
  def getMobileDeviceAccessEffect(callback: js.Function2[/* err */ AWSError, /* data */ GetMobileDeviceAccessEffectResponse, Unit]): Request[GetMobileDeviceAccessEffectResponse, AWSError] = js.native
  /**
    * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use this method to test the effects of the current set of mobile device access rules for the WorkMail organization for a particular user's attributes.
    */
  def getMobileDeviceAccessEffect(params: GetMobileDeviceAccessEffectRequest): Request[GetMobileDeviceAccessEffectResponse, AWSError] = js.native
  def getMobileDeviceAccessEffect(
    params: GetMobileDeviceAccessEffectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMobileDeviceAccessEffectResponse, Unit]
  ): Request[GetMobileDeviceAccessEffectResponse, AWSError] = js.native
  
  /**
    * Gets the mobile device access override for the given WorkMail organization, user, and device.
    */
  def getMobileDeviceAccessOverride(): Request[GetMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def getMobileDeviceAccessOverride(callback: js.Function2[/* err */ AWSError, /* data */ GetMobileDeviceAccessOverrideResponse, Unit]): Request[GetMobileDeviceAccessOverrideResponse, AWSError] = js.native
  /**
    * Gets the mobile device access override for the given WorkMail organization, user, and device.
    */
  def getMobileDeviceAccessOverride(params: GetMobileDeviceAccessOverrideRequest): Request[GetMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def getMobileDeviceAccessOverride(
    params: GetMobileDeviceAccessOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMobileDeviceAccessOverrideResponse, Unit]
  ): Request[GetMobileDeviceAccessOverrideResponse, AWSError] = js.native
  
  /**
    * Lists the access control rules for the specified organization.
    */
  def listAccessControlRules(): Request[ListAccessControlRulesResponse, AWSError] = js.native
  def listAccessControlRules(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessControlRulesResponse, Unit]): Request[ListAccessControlRulesResponse, AWSError] = js.native
  /**
    * Lists the access control rules for the specified organization.
    */
  def listAccessControlRules(params: ListAccessControlRulesRequest): Request[ListAccessControlRulesResponse, AWSError] = js.native
  def listAccessControlRules(
    params: ListAccessControlRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessControlRulesResponse, Unit]
  ): Request[ListAccessControlRulesResponse, AWSError] = js.native
  
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]): Request[ListAliasesResponse, AWSError] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(
    params: ListAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]
  ): Request[ListAliasesResponse, AWSError] = js.native
  
  /**
    * List all the AvailabilityConfiguration's for the given WorkMail organization.
    */
  def listAvailabilityConfigurations(): Request[ListAvailabilityConfigurationsResponse, AWSError] = js.native
  def listAvailabilityConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailabilityConfigurationsResponse, Unit]
  ): Request[ListAvailabilityConfigurationsResponse, AWSError] = js.native
  /**
    * List all the AvailabilityConfiguration's for the given WorkMail organization.
    */
  def listAvailabilityConfigurations(params: ListAvailabilityConfigurationsRequest): Request[ListAvailabilityConfigurationsResponse, AWSError] = js.native
  def listAvailabilityConfigurations(
    params: ListAvailabilityConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailabilityConfigurationsResponse, Unit]
  ): Request[ListAvailabilityConfigurationsResponse, AWSError] = js.native
  
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(): Request[ListGroupMembersResponse, AWSError] = js.native
  def listGroupMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembersResponse, Unit]): Request[ListGroupMembersResponse, AWSError] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse, AWSError] = js.native
  def listGroupMembers(
    params: ListGroupMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembersResponse, Unit]
  ): Request[ListGroupMembersResponse, AWSError] = js.native
  
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists all the impersonation roles for the given WorkMail organization.
    */
  def listImpersonationRoles(): Request[ListImpersonationRolesResponse, AWSError] = js.native
  def listImpersonationRoles(callback: js.Function2[/* err */ AWSError, /* data */ ListImpersonationRolesResponse, Unit]): Request[ListImpersonationRolesResponse, AWSError] = js.native
  /**
    * Lists all the impersonation roles for the given WorkMail organization.
    */
  def listImpersonationRoles(params: ListImpersonationRolesRequest): Request[ListImpersonationRolesResponse, AWSError] = js.native
  def listImpersonationRoles(
    params: ListImpersonationRolesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImpersonationRolesResponse, Unit]
  ): Request[ListImpersonationRolesResponse, AWSError] = js.native
  
  /**
    * Lists the mail domains in a given WorkMail organization.
    */
  def listMailDomains(): Request[ListMailDomainsResponse, AWSError] = js.native
  def listMailDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListMailDomainsResponse, Unit]): Request[ListMailDomainsResponse, AWSError] = js.native
  /**
    * Lists the mail domains in a given WorkMail organization.
    */
  def listMailDomains(params: ListMailDomainsRequest): Request[ListMailDomainsResponse, AWSError] = js.native
  def listMailDomains(
    params: ListMailDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMailDomainsResponse, Unit]
  ): Request[ListMailDomainsResponse, AWSError] = js.native
  
  /**
    * Lists the mailbox export jobs started for the specified organization within the last seven days.
    */
  def listMailboxExportJobs(): Request[ListMailboxExportJobsResponse, AWSError] = js.native
  def listMailboxExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxExportJobsResponse, Unit]): Request[ListMailboxExportJobsResponse, AWSError] = js.native
  /**
    * Lists the mailbox export jobs started for the specified organization within the last seven days.
    */
  def listMailboxExportJobs(params: ListMailboxExportJobsRequest): Request[ListMailboxExportJobsResponse, AWSError] = js.native
  def listMailboxExportJobs(
    params: ListMailboxExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxExportJobsResponse, Unit]
  ): Request[ListMailboxExportJobsResponse, AWSError] = js.native
  
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  def listMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxPermissionsResponse, Unit]): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  def listMailboxPermissions(
    params: ListMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxPermissionsResponse, Unit]
  ): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists all the mobile device access overrides for any given combination of WorkMail organization, user, or device.
    */
  def listMobileDeviceAccessOverrides(): Request[ListMobileDeviceAccessOverridesResponse, AWSError] = js.native
  def listMobileDeviceAccessOverrides(
    callback: js.Function2[/* err */ AWSError, /* data */ ListMobileDeviceAccessOverridesResponse, Unit]
  ): Request[ListMobileDeviceAccessOverridesResponse, AWSError] = js.native
  /**
    * Lists all the mobile device access overrides for any given combination of WorkMail organization, user, or device.
    */
  def listMobileDeviceAccessOverrides(params: ListMobileDeviceAccessOverridesRequest): Request[ListMobileDeviceAccessOverridesResponse, AWSError] = js.native
  def listMobileDeviceAccessOverrides(
    params: ListMobileDeviceAccessOverridesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMobileDeviceAccessOverridesResponse, Unit]
  ): Request[ListMobileDeviceAccessOverridesResponse, AWSError] = js.native
  
  /**
    * Lists the mobile device access rules for the specified WorkMail organization.
    */
  def listMobileDeviceAccessRules(): Request[ListMobileDeviceAccessRulesResponse, AWSError] = js.native
  def listMobileDeviceAccessRules(callback: js.Function2[/* err */ AWSError, /* data */ ListMobileDeviceAccessRulesResponse, Unit]): Request[ListMobileDeviceAccessRulesResponse, AWSError] = js.native
  /**
    * Lists the mobile device access rules for the specified WorkMail organization.
    */
  def listMobileDeviceAccessRules(params: ListMobileDeviceAccessRulesRequest): Request[ListMobileDeviceAccessRulesResponse, AWSError] = js.native
  def listMobileDeviceAccessRules(
    params: ListMobileDeviceAccessRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMobileDeviceAccessRulesResponse, Unit]
  ): Request[ListMobileDeviceAccessRulesResponse, AWSError] = js.native
  
  /**
    * Returns summaries of the customer's organizations.
    */
  def listOrganizations(): Request[ListOrganizationsResponse, AWSError] = js.native
  def listOrganizations(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationsResponse, Unit]): Request[ListOrganizationsResponse, AWSError] = js.native
  /**
    * Returns summaries of the customer's organizations.
    */
  def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse, AWSError] = js.native
  def listOrganizations(
    params: ListOrganizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationsResponse, Unit]
  ): Request[ListOrganizationsResponse, AWSError] = js.native
  
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(): Request[ListResourceDelegatesResponse, AWSError] = js.native
  def listResourceDelegates(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDelegatesResponse, Unit]): Request[ListResourceDelegatesResponse, AWSError] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse, AWSError] = js.native
  def listResourceDelegates(
    params: ListResourceDelegatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDelegatesResponse, Unit]
  ): Request[ListResourceDelegatesResponse, AWSError] = js.native
  
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  
  /**
    * Lists the tags applied to an WorkMail organization resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags applied to an WorkMail organization resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Adds a new access control rule for the specified organization. The rule allows or denies access to the organization for the specified IPv4 addresses, access protocol actions, user IDs and impersonation IDs. Adding a new rule with the same name as an existing rule replaces the older rule.
    */
  def putAccessControlRule(): Request[PutAccessControlRuleResponse, AWSError] = js.native
  def putAccessControlRule(callback: js.Function2[/* err */ AWSError, /* data */ PutAccessControlRuleResponse, Unit]): Request[PutAccessControlRuleResponse, AWSError] = js.native
  /**
    * Adds a new access control rule for the specified organization. The rule allows or denies access to the organization for the specified IPv4 addresses, access protocol actions, user IDs and impersonation IDs. Adding a new rule with the same name as an existing rule replaces the older rule.
    */
  def putAccessControlRule(params: PutAccessControlRuleRequest): Request[PutAccessControlRuleResponse, AWSError] = js.native
  def putAccessControlRule(
    params: PutAccessControlRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccessControlRuleResponse, Unit]
  ): Request[PutAccessControlRuleResponse, AWSError] = js.native
  
  /**
    * Creates or updates the email monitoring configuration for a specified organization.
    */
  def putEmailMonitoringConfiguration(): Request[PutEmailMonitoringConfigurationResponse, AWSError] = js.native
  def putEmailMonitoringConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailMonitoringConfigurationResponse, Unit]
  ): Request[PutEmailMonitoringConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates the email monitoring configuration for a specified organization.
    */
  def putEmailMonitoringConfiguration(params: PutEmailMonitoringConfigurationRequest): Request[PutEmailMonitoringConfigurationResponse, AWSError] = js.native
  def putEmailMonitoringConfiguration(
    params: PutEmailMonitoringConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEmailMonitoringConfigurationResponse, Unit]
  ): Request[PutEmailMonitoringConfigurationResponse, AWSError] = js.native
  
  /**
    * Enables or disables a DMARC policy for a given organization.
    */
  def putInboundDmarcSettings(): Request[PutInboundDmarcSettingsResponse, AWSError] = js.native
  def putInboundDmarcSettings(callback: js.Function2[/* err */ AWSError, /* data */ PutInboundDmarcSettingsResponse, Unit]): Request[PutInboundDmarcSettingsResponse, AWSError] = js.native
  /**
    * Enables or disables a DMARC policy for a given organization.
    */
  def putInboundDmarcSettings(params: PutInboundDmarcSettingsRequest): Request[PutInboundDmarcSettingsResponse, AWSError] = js.native
  def putInboundDmarcSettings(
    params: PutInboundDmarcSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInboundDmarcSettingsResponse, Unit]
  ): Request[PutInboundDmarcSettingsResponse, AWSError] = js.native
  
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  def putMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ PutMailboxPermissionsResponse, Unit]): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  def putMailboxPermissions(
    params: PutMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMailboxPermissionsResponse, Unit]
  ): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  
  /**
    * Creates or updates a mobile device access override for the given WorkMail organization, user, and device.
    */
  def putMobileDeviceAccessOverride(): Request[PutMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def putMobileDeviceAccessOverride(callback: js.Function2[/* err */ AWSError, /* data */ PutMobileDeviceAccessOverrideResponse, Unit]): Request[PutMobileDeviceAccessOverrideResponse, AWSError] = js.native
  /**
    * Creates or updates a mobile device access override for the given WorkMail organization, user, and device.
    */
  def putMobileDeviceAccessOverride(params: PutMobileDeviceAccessOverrideRequest): Request[PutMobileDeviceAccessOverrideResponse, AWSError] = js.native
  def putMobileDeviceAccessOverride(
    params: PutMobileDeviceAccessOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMobileDeviceAccessOverrideResponse, Unit]
  ): Request[PutMobileDeviceAccessOverrideResponse, AWSError] = js.native
  
  /**
    * Puts a retention policy to the specified organization.
    */
  def putRetentionPolicy(): Request[PutRetentionPolicyResponse, AWSError] = js.native
  def putRetentionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionPolicyResponse, Unit]): Request[PutRetentionPolicyResponse, AWSError] = js.native
  /**
    * Puts a retention policy to the specified organization.
    */
  def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[PutRetentionPolicyResponse, AWSError] = js.native
  def putRetentionPolicy(
    params: PutRetentionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionPolicyResponse, Unit]
  ): Request[PutRetentionPolicyResponse, AWSError] = js.native
  
  /**
    * Registers a new domain in WorkMail and SES, and configures it for use by WorkMail. Emails received by SES for this domain are routed to the specified WorkMail organization, and WorkMail has permanent permission to use the specified domain for sending your users' emails.
    */
  def registerMailDomain(): Request[RegisterMailDomainResponse, AWSError] = js.native
  def registerMailDomain(callback: js.Function2[/* err */ AWSError, /* data */ RegisterMailDomainResponse, Unit]): Request[RegisterMailDomainResponse, AWSError] = js.native
  /**
    * Registers a new domain in WorkMail and SES, and configures it for use by WorkMail. Emails received by SES for this domain are routed to the specified WorkMail organization, and WorkMail has permanent permission to use the specified domain for sending your users' emails.
    */
  def registerMailDomain(params: RegisterMailDomainRequest): Request[RegisterMailDomainResponse, AWSError] = js.native
  def registerMailDomain(
    params: RegisterMailDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterMailDomainResponse, Unit]
  ): Request[RegisterMailDomainResponse, AWSError] = js.native
  
  /**
    * Registers an existing and disabled user, group, or resource for WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(): Request[RegisterToWorkMailResponse, AWSError] = js.native
  def registerToWorkMail(callback: js.Function2[/* err */ AWSError, /* data */ RegisterToWorkMailResponse, Unit]): Request[RegisterToWorkMailResponse, AWSError] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse, AWSError] = js.native
  def registerToWorkMail(
    params: RegisterToWorkMailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterToWorkMailResponse, Unit]
  ): Request[RegisterToWorkMailResponse, AWSError] = js.native
  
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(): Request[ResetPasswordResponse, AWSError] = js.native
  def resetPassword(callback: js.Function2[/* err */ AWSError, /* data */ ResetPasswordResponse, Unit]): Request[ResetPasswordResponse, AWSError] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse, AWSError] = js.native
  def resetPassword(
    params: ResetPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetPasswordResponse, Unit]
  ): Request[ResetPasswordResponse, AWSError] = js.native
  
  /**
    * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see Exporting mailbox content in the WorkMail Administrator Guide.
    */
  def startMailboxExportJob(): Request[StartMailboxExportJobResponse, AWSError] = js.native
  def startMailboxExportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartMailboxExportJobResponse, Unit]): Request[StartMailboxExportJobResponse, AWSError] = js.native
  /**
    * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see Exporting mailbox content in the WorkMail Administrator Guide.
    */
  def startMailboxExportJob(params: StartMailboxExportJobRequest): Request[StartMailboxExportJobResponse, AWSError] = js.native
  def startMailboxExportJob(
    params: StartMailboxExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMailboxExportJobResponse, Unit]
  ): Request[StartMailboxExportJobResponse, AWSError] = js.native
  
  /**
    * Applies the specified tags to the specified WorkMailorganization resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies the specified tags to the specified WorkMailorganization resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Performs a test on an availability provider to ensure that access is allowed. For EWS, it verifies the provided credentials can be used to successfully log in. For Lambda, it verifies that the Lambda function can be invoked and that the resource access policy was configured to deny anonymous access. An anonymous invocation is one done without providing either a SourceArn or SourceAccount header.  The request must contain either one provider definition (EwsProvider or LambdaProvider) or the DomainName parameter. If the DomainName parameter is provided, the configuration stored under the DomainName will be tested. 
    */
  def testAvailabilityConfiguration(): Request[TestAvailabilityConfigurationResponse, AWSError] = js.native
  def testAvailabilityConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ TestAvailabilityConfigurationResponse, Unit]): Request[TestAvailabilityConfigurationResponse, AWSError] = js.native
  /**
    * Performs a test on an availability provider to ensure that access is allowed. For EWS, it verifies the provided credentials can be used to successfully log in. For Lambda, it verifies that the Lambda function can be invoked and that the resource access policy was configured to deny anonymous access. An anonymous invocation is one done without providing either a SourceArn or SourceAccount header.  The request must contain either one provider definition (EwsProvider or LambdaProvider) or the DomainName parameter. If the DomainName parameter is provided, the configuration stored under the DomainName will be tested. 
    */
  def testAvailabilityConfiguration(params: TestAvailabilityConfigurationRequest): Request[TestAvailabilityConfigurationResponse, AWSError] = js.native
  def testAvailabilityConfiguration(
    params: TestAvailabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestAvailabilityConfigurationResponse, Unit]
  ): Request[TestAvailabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Untags the specified tags from the specified WorkMail organization resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Untags the specified tags from the specified WorkMail organization resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def updateAvailabilityConfiguration(): Request[UpdateAvailabilityConfigurationResponse, AWSError] = js.native
  def updateAvailabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAvailabilityConfigurationResponse, Unit]
  ): Request[UpdateAvailabilityConfigurationResponse, AWSError] = js.native
  /**
    * Updates an existing AvailabilityConfiguration for the given WorkMail organization and domain.
    */
  def updateAvailabilityConfiguration(params: UpdateAvailabilityConfigurationRequest): Request[UpdateAvailabilityConfigurationResponse, AWSError] = js.native
  def updateAvailabilityConfiguration(
    params: UpdateAvailabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAvailabilityConfigurationResponse, Unit]
  ): Request[UpdateAvailabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates the default mail domain for an organization. The default mail domain is used by the WorkMail AWS Console to suggest an email address when enabling a mail user. You can only have one default domain.
    */
  def updateDefaultMailDomain(): Request[UpdateDefaultMailDomainResponse, AWSError] = js.native
  def updateDefaultMailDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDefaultMailDomainResponse, Unit]): Request[UpdateDefaultMailDomainResponse, AWSError] = js.native
  /**
    * Updates the default mail domain for an organization. The default mail domain is used by the WorkMail AWS Console to suggest an email address when enabling a mail user. You can only have one default domain.
    */
  def updateDefaultMailDomain(params: UpdateDefaultMailDomainRequest): Request[UpdateDefaultMailDomainResponse, AWSError] = js.native
  def updateDefaultMailDomain(
    params: UpdateDefaultMailDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDefaultMailDomainResponse, Unit]
  ): Request[UpdateDefaultMailDomainResponse, AWSError] = js.native
  
  /**
    * Updates an impersonation role for the given WorkMail organization.
    */
  def updateImpersonationRole(): Request[UpdateImpersonationRoleResponse, AWSError] = js.native
  def updateImpersonationRole(callback: js.Function2[/* err */ AWSError, /* data */ UpdateImpersonationRoleResponse, Unit]): Request[UpdateImpersonationRoleResponse, AWSError] = js.native
  /**
    * Updates an impersonation role for the given WorkMail organization.
    */
  def updateImpersonationRole(params: UpdateImpersonationRoleRequest): Request[UpdateImpersonationRoleResponse, AWSError] = js.native
  def updateImpersonationRole(
    params: UpdateImpersonationRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImpersonationRoleResponse, Unit]
  ): Request[UpdateImpersonationRoleResponse, AWSError] = js.native
  
  /**
    * Updates a user's current mailbox quota for a specified organization and user.
    */
  def updateMailboxQuota(): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  def updateMailboxQuota(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMailboxQuotaResponse, Unit]): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  /**
    * Updates a user's current mailbox quota for a specified organization and user.
    */
  def updateMailboxQuota(params: UpdateMailboxQuotaRequest): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  def updateMailboxQuota(
    params: UpdateMailboxQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMailboxQuotaResponse, Unit]
  ): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  
  /**
    * Updates a mobile device access rule for the specified WorkMail organization.
    */
  def updateMobileDeviceAccessRule(): Request[UpdateMobileDeviceAccessRuleResponse, AWSError] = js.native
  def updateMobileDeviceAccessRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMobileDeviceAccessRuleResponse, Unit]): Request[UpdateMobileDeviceAccessRuleResponse, AWSError] = js.native
  /**
    * Updates a mobile device access rule for the specified WorkMail organization.
    */
  def updateMobileDeviceAccessRule(params: UpdateMobileDeviceAccessRuleRequest): Request[UpdateMobileDeviceAccessRuleResponse, AWSError] = js.native
  def updateMobileDeviceAccessRule(
    params: UpdateMobileDeviceAccessRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMobileDeviceAccessRuleResponse, Unit]
  ): Request[UpdateMobileDeviceAccessRuleResponse, AWSError] = js.native
  
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  def updatePrimaryEmailAddress(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrimaryEmailAddressResponse, Unit]): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  def updatePrimaryEmailAddress(
    params: UpdatePrimaryEmailAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrimaryEmailAddressResponse, Unit]
  ): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]): Request[UpdateResourceResponse, AWSError] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]
  ): Request[UpdateResourceResponse, AWSError] = js.native
}
