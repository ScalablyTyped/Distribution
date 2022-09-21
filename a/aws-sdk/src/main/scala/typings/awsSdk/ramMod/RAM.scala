package typings.awsSdk.ramMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RAM extends Service {
  
  /**
    * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the invitation, the resources included in the resource share are available to interact with in the relevant Amazon Web Services Management Consoles and tools.
    */
  def acceptResourceShareInvitation(): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the invitation, the resources included in the resource share are available to interact with in the relevant Amazon Web Services Management Consoles and tools.
    */
  def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(
    params: AcceptResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]
  ): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  
  /**
    * Adds the specified list of principals and list of resources to a resource share. Principals that already have access to this resource share immediately receive access to the added resources. Newly added principals immediately receive access to the resources shared in this resource share. 
    */
  def associateResourceShare(): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Adds the specified list of principals and list of resources to a resource share. Principals that already have access to this resource share immediately receive access to the added resources. Newly added principals immediately receive access to the resources shared in this resource share. 
    */
  def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(
    params: AssociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]
  ): Request[AssociateResourceShareResponse, AWSError] = js.native
  
  /**
    * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one permission associated with each resource type in the resource share. You can add a new RAM permission only if there are currently no resources of that resource type currently in the resource share.
    */
  def associateResourceSharePermission(): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one permission associated with each resource type in the resource share. You can add a new RAM permission only if there are currently no resources of that resource type currently in the resource share.
    */
  def associateResourceSharePermission(params: AssociateResourceSharePermissionRequest): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    params: AssociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RAM: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a resource share. You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to share, a list of principals you want to share the resources with, and the permissions to grant those principals.  Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account that created it. 
    */
  def createResourceShare(): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Creates a resource share. You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to share, a list of principals you want to share the resources with, and the permissions to grant those principals.  Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account that created it. 
    */
  def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(
    params: CreateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]
  ): Request[CreateResourceShareResponse, AWSError] = js.native
  
  /**
    * Deletes the specified resource share. This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing of those resources outside of the Amazon Web Services account that created them.
    */
  def deleteResourceShare(): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share. This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing of those resources outside of the Amazon Web Services account that created them.
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
    * Disassociates an RAM permission from a resource share. Permission changes take effect immediately. You can remove a RAM permission from a resource share only if there are currently no resources of the relevant resource type currently attached to the resource share.
    */
  def disassociateResourceSharePermission(): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Disassociates an RAM permission from a resource share. Permission changes take effect immediately. You can remove a RAM permission from a resource share only if there are currently no resources of the relevant resource type currently attached to the resource share.
    */
  def disassociateResourceSharePermission(params: DisassociateResourceSharePermissionRequest): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    params: DisassociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  
  /**
    * Enables resource sharing within your organization in Organizations. Calling this operation enables RAM to retrieve information about the organization and its structure. This lets you share resources with all of the accounts in an organization by specifying the organization's ID, or all of the accounts in an organizational unit (OU) by specifying the OU's ID. Until you enable sharing within the organization, you can specify only individual Amazon Web Services accounts, or for supported resource types, IAM users and roles. You must call this operation from an IAM user or role in the organization's management account.
    */
  def enableSharingWithAwsOrganization(): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your organization in Organizations. Calling this operation enables RAM to retrieve information about the organization and its structure. This lets you share resources with all of the accounts in an organization by specifying the organization's ID, or all of the accounts in an organizational unit (OU) by specifying the OU's ID. Until you enable sharing within the organization, you can specify only individual Amazon Web Services accounts, or for supported resource types, IAM users and roles. You must call this operation from an IAM user or role in the organization's management account.
    */
  def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    params: EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  
  /**
    * Gets the contents of an RAM permission in JSON format.
    */
  def getPermission(): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]): Request[GetPermissionResponse, AWSError] = js.native
  /**
    * Gets the contents of an RAM permission in JSON format.
    */
  def getPermission(params: GetPermissionRequest): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(
    params: GetPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]
  ): Request[GetPermissionResponse, AWSError] = js.native
  
  /**
    * Retrieves the resource policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Retrieves the resource policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]
  ): Request[GetResourcePoliciesResponse, AWSError] = js.native
  
  /**
    * Retrieves the resource and principal associations for resource shares that you own.
    */
  def getResourceShareAssociations(): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Retrieves the resource and principal associations for resource shares that you own.
    */
  def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(
    params: GetResourceShareAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]
  ): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  
  /**
    * Retrieves details about invitations that you have received for resource shares.
    */
  def getResourceShareInvitations(): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Retrieves details about invitations that you have received for resource shares.
    */
  def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(
    params: GetResourceShareInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]
  ): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  
  /**
    * Retrieves details about the resource shares that you own or that are shared with you.
    */
  def getResourceShares(): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Retrieves details about the resource shares that you own or that are shared with you.
    */
  def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(
    params: GetResourceSharesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]
  ): Request[GetResourceSharesResponse, AWSError] = js.native
  
  /**
    * Lists the resources in a resource share that is shared with you but for which the invitation is still PENDING. That means that you haven't accepted or rejected the invitation and the invitation hasn't expired.
    */
  def listPendingInvitationResources(): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources in a resource share that is shared with you but for which the invitation is still PENDING. That means that you haven't accepted or rejected the invitation and the invitation hasn't expired.
    */
  def listPendingInvitationResources(params: ListPendingInvitationResourcesRequest): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    params: ListPendingInvitationResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  
  /**
    * Lists the available versions of the specified RAM permission.
    */
  def listPermissionVersions(): Request[ListPermissionVersionsResponse, AWSError] = js.native
  def listPermissionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionVersionsResponse, Unit]): Request[ListPermissionVersionsResponse, AWSError] = js.native
  /**
    * Lists the available versions of the specified RAM permission.
    */
  def listPermissionVersions(params: ListPermissionVersionsRequest): Request[ListPermissionVersionsResponse, AWSError] = js.native
  def listPermissionVersions(
    params: ListPermissionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionVersionsResponse, Unit]
  ): Request[ListPermissionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of available RAM permissions that you can use for the supported resource types. 
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of available RAM permissions that you can use for the supported resource types. 
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the principals that you are sharing resources with or that are sharing resources with you.
    */
  def listPrincipals(): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals that you are sharing resources with or that are sharing resources with you.
    */
  def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(
    params: ListPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]
  ): Request[ListPrincipalsResponse, AWSError] = js.native
  
  /**
    * Lists the RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  /**
    * Lists the RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(params: ListResourceSharePermissionsRequest): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(
    params: ListResourceSharePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]
  ): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the resource types that can be shared by RAM.
    */
  def listResourceTypes(): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]): Request[ListResourceTypesResponse, AWSError] = js.native
  /**
    * Lists the resource types that can be shared by RAM.
    */
  def listResourceTypes(params: ListResourceTypesRequest): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(
    params: ListResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]
  ): Request[ListResourceTypesResponse, AWSError] = js.native
  
  /**
    * Lists the resources that you added to a resource share or the resources that are shared with you.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources that you added to a resource share or the resources that are shared with you.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  
  /**
    * When you attach a resource-based permission policy to a resource, it automatically creates a resource share. However, resource shares created this way are visible only to the resource share owner, and the resource share can't be modified in RAM. You can use this operation to promote the resource share to a full RAM resource share. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you shared it with.
    */
  def promoteResourceShareCreatedFromPolicy(): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  /**
    * When you attach a resource-based permission policy to a resource, it automatically creates a resource share. However, resource shares created this way are visible only to the resource share owner, and the resource share can't be modified in RAM. You can use this operation to promote the resource share to a full RAM resource share. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you shared it with.
    */
  def promoteResourceShareCreatedFromPolicy(params: PromoteResourceShareCreatedFromPolicyRequest): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    params: PromoteResourceShareCreatedFromPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  
  /**
    * Rejects an invitation to a resource share from another Amazon Web Services account.
    */
  def rejectResourceShareInvitation(): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another Amazon Web Services account.
    */
  def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(
    params: RejectResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]
  ): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  
  /**
    * Adds the specified tag keys and values to the specified resource share. The tags are attached only to the resource share, not to the resources that are in the resource share.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tag keys and values to the specified resource share. The tags are attached only to the resource share, not to the resources that are in the resource share.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tag key and value pairs from the specified resource share.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tag key and value pairs from the specified resource share.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies some of the properties of the specified resource share.
    */
  def updateResourceShare(): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]): Request[UpdateResourceShareResponse, AWSError] = js.native
  /**
    * Modifies some of the properties of the specified resource share.
    */
  def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(
    params: UpdateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]
  ): Request[UpdateResourceShareResponse, AWSError] = js.native
}
