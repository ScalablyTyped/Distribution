package typings.awsSdk.ramMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RAM extends Service {
  @JSName("config")
  var config_RAM: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(
    params: AcceptResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]
  ): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(
    params: AssociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]
  ): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Associates a permission with a resource share.
    */
  def associateResourceSharePermission(): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Associates a permission with a resource share.
    */
  def associateResourceSharePermission(params: AssociateResourceSharePermissionRequest): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    params: AssociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(
    params: CreateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]
  ): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(
    params: DeleteResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]
  ): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]): Request[DisassociateResourceShareResponse, AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(params: DisassociateResourceShareRequest): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(
    params: DisassociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]
  ): Request[DisassociateResourceShareResponse, AWSError] = js.native
  /**
    * Disassociates an AWS RAM permission from a resource share.
    */
  def disassociateResourceSharePermission(): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Disassociates an AWS RAM permission from a resource share.
    */
  def disassociateResourceSharePermission(params: DisassociateResourceSharePermissionRequest): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    params: DisassociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your AWS Organization. The caller must be the master account for the AWS Organization.
    */
  def enableSharingWithAwsOrganization(): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your AWS Organization. The caller must be the master account for the AWS Organization.
    */
  def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    params: EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Gets the contents of an AWS RAM permission in JSON format.
    */
  def getPermission(): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]): Request[GetPermissionResponse, AWSError] = js.native
  /**
    * Gets the contents of an AWS RAM permission in JSON format.
    */
  def getPermission(params: GetPermissionRequest): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(
    params: GetPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]
  ): Request[GetPermissionResponse, AWSError] = js.native
  /**
    * Gets the policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Gets the policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]
  ): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Gets the resources or principals for the resource shares that you own.
    */
  def getResourceShareAssociations(): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Gets the resources or principals for the resource shares that you own.
    */
  def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(
    params: GetResourceShareAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]
  ): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Gets the invitations for resource sharing that you've received.
    */
  def getResourceShareInvitations(): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Gets the invitations for resource sharing that you've received.
    */
  def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(
    params: GetResourceShareInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]
  ): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Gets the resource shares that you own or the resource shares that are shared with you.
    */
  def getResourceShares(): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Gets the resource shares that you own or the resource shares that are shared with you.
    */
  def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(
    params: GetResourceSharesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]
  ): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Lists the resources in a resource share that is shared with you but that the invitation is still pending for.
    */
  def listPendingInvitationResources(): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources in a resource share that is shared with you but that the invitation is still pending for.
    */
  def listPendingInvitationResources(params: ListPendingInvitationResourcesRequest): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    params: ListPendingInvitationResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  /**
    * Lists the AWS RAM permissions.
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Lists the AWS RAM permissions.
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Lists the principals that you have shared resources with or that have shared resources with you.
    */
  def listPrincipals(): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals that you have shared resources with or that have shared resources with you.
    */
  def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(
    params: ListPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]
  ): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the AWS RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  /**
    * Lists the AWS RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(params: ListResourceSharePermissionsRequest): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(
    params: ListResourceSharePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]
  ): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  /**
    * Lists the shareable resource types supported by AWS RAM.
    */
  def listResourceTypes(): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]): Request[ListResourceTypesResponse, AWSError] = js.native
  /**
    * Lists the shareable resource types supported by AWS RAM.
    */
  def listResourceTypes(params: ListResourceTypesRequest): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(
    params: ListResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]
  ): Request[ListResourceTypesResponse, AWSError] = js.native
  /**
    * Lists the resources that you added to a resource shares or the resources that are shared with you.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources that you added to a resource shares or the resources that are shared with you.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Resource shares that were created by attaching a policy to a resource are visible only to the resource share owner, and the resource share cannot be modified in AWS RAM. Use this API action to promote the resource share. When you promote the resource share, it becomes:   Visible to all principals that it is shared with.   Modifiable in AWS RAM.  
    */
  def promoteResourceShareCreatedFromPolicy(): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  /**
    * Resource shares that were created by attaching a policy to a resource are visible only to the resource share owner, and the resource share cannot be modified in AWS RAM. Use this API action to promote the resource share. When you promote the resource share, it becomes:   Visible to all principals that it is shared with.   Modifiable in AWS RAM.  
    */
  def promoteResourceShareCreatedFromPolicy(params: PromoteResourceShareCreatedFromPolicyRequest): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    params: PromoteResourceShareCreatedFromPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(
    params: RejectResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]
  ): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share that you own.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share that you own.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share that you own.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share that you own.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the specified resource share that you own.
    */
  def updateResourceShare(): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]): Request[UpdateResourceShareResponse, AWSError] = js.native
  /**
    * Updates the specified resource share that you own.
    */
  def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(
    params: UpdateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]
  ): Request[UpdateResourceShareResponse, AWSError] = js.native
}

