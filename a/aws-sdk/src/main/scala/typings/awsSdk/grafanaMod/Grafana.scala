package typings.awsSdk.grafanaMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grafana extends Service {
  
  /**
    * Assigns a Grafana Enterprise license to a workspace. Upgrading to Grafana Enterprise incurs additional fees. For more information, see Upgrade a workspace to Grafana Enterprise.
    */
  def associateLicense(): Request[AssociateLicenseResponse, AWSError] = js.native
  def associateLicense(callback: js.Function2[/* err */ AWSError, /* data */ AssociateLicenseResponse, Unit]): Request[AssociateLicenseResponse, AWSError] = js.native
  /**
    * Assigns a Grafana Enterprise license to a workspace. Upgrading to Grafana Enterprise incurs additional fees. For more information, see Upgrade a workspace to Grafana Enterprise.
    */
  def associateLicense(params: AssociateLicenseRequest): Request[AssociateLicenseResponse, AWSError] = js.native
  def associateLicense(
    params: AssociateLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateLicenseResponse, Unit]
  ): Request[AssociateLicenseResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Grafana: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a workspace. In a workspace, you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server. Don't use CreateWorkspace to modify an existing workspace. Instead, use UpdateWorkspace.
    */
  def createWorkspace(): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]): Request[CreateWorkspaceResponse, AWSError] = js.native
  /**
    * Creates a workspace. In a workspace, you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server. Don't use CreateWorkspace to modify an existing workspace. Instead, use UpdateWorkspace.
    */
  def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(
    params: CreateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]
  ): Request[CreateWorkspaceResponse, AWSError] = js.native
  
  /**
    * Creates an API key for the workspace. This key can be used to authenticate requests sent to the workspace's HTTP API. See  https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html for available APIs and example requests.
    */
  def createWorkspaceApiKey(): Request[CreateWorkspaceApiKeyResponse, AWSError] = js.native
  def createWorkspaceApiKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceApiKeyResponse, Unit]): Request[CreateWorkspaceApiKeyResponse, AWSError] = js.native
  /**
    * Creates an API key for the workspace. This key can be used to authenticate requests sent to the workspace's HTTP API. See  https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html for available APIs and example requests.
    */
  def createWorkspaceApiKey(params: CreateWorkspaceApiKeyRequest): Request[CreateWorkspaceApiKeyResponse, AWSError] = js.native
  def createWorkspaceApiKey(
    params: CreateWorkspaceApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceApiKeyResponse, Unit]
  ): Request[CreateWorkspaceApiKeyResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Managed Grafana workspace.
    */
  def deleteWorkspace(): Request[DeleteWorkspaceResponse, AWSError] = js.native
  def deleteWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceResponse, Unit]): Request[DeleteWorkspaceResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Managed Grafana workspace.
    */
  def deleteWorkspace(params: DeleteWorkspaceRequest): Request[DeleteWorkspaceResponse, AWSError] = js.native
  def deleteWorkspace(
    params: DeleteWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceResponse, Unit]
  ): Request[DeleteWorkspaceResponse, AWSError] = js.native
  
  /**
    * Deletes an API key for a workspace.
    */
  def deleteWorkspaceApiKey(): Request[DeleteWorkspaceApiKeyResponse, AWSError] = js.native
  def deleteWorkspaceApiKey(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceApiKeyResponse, Unit]): Request[DeleteWorkspaceApiKeyResponse, AWSError] = js.native
  /**
    * Deletes an API key for a workspace.
    */
  def deleteWorkspaceApiKey(params: DeleteWorkspaceApiKeyRequest): Request[DeleteWorkspaceApiKeyResponse, AWSError] = js.native
  def deleteWorkspaceApiKey(
    params: DeleteWorkspaceApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceApiKeyResponse, Unit]
  ): Request[DeleteWorkspaceApiKeyResponse, AWSError] = js.native
  
  /**
    * Displays information about one Amazon Managed Grafana workspace.
    */
  def describeWorkspace(): Request[DescribeWorkspaceResponse, AWSError] = js.native
  def describeWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]): Request[DescribeWorkspaceResponse, AWSError] = js.native
  /**
    * Displays information about one Amazon Managed Grafana workspace.
    */
  def describeWorkspace(params: DescribeWorkspaceRequest): Request[DescribeWorkspaceResponse, AWSError] = js.native
  def describeWorkspace(
    params: DescribeWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
  
  /**
    * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
    */
  def describeWorkspaceAuthentication(): Request[DescribeWorkspaceAuthenticationResponse, AWSError] = js.native
  def describeWorkspaceAuthentication(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceAuthenticationResponse, Unit]
  ): Request[DescribeWorkspaceAuthenticationResponse, AWSError] = js.native
  /**
    * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
    */
  def describeWorkspaceAuthentication(params: DescribeWorkspaceAuthenticationRequest): Request[DescribeWorkspaceAuthenticationResponse, AWSError] = js.native
  def describeWorkspaceAuthentication(
    params: DescribeWorkspaceAuthenticationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceAuthenticationResponse, Unit]
  ): Request[DescribeWorkspaceAuthenticationResponse, AWSError] = js.native
  
  /**
    * Removes the Grafana Enterprise license from a workspace.
    */
  def disassociateLicense(): Request[DisassociateLicenseResponse, AWSError] = js.native
  def disassociateLicense(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLicenseResponse, Unit]): Request[DisassociateLicenseResponse, AWSError] = js.native
  /**
    * Removes the Grafana Enterprise license from a workspace.
    */
  def disassociateLicense(params: DisassociateLicenseRequest): Request[DisassociateLicenseResponse, AWSError] = js.native
  def disassociateLicense(
    params: DisassociateLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLicenseResponse, Unit]
  ): Request[DisassociateLicenseResponse, AWSError] = js.native
  
  /**
    * Lists the users and groups who have the Grafana Admin and Editor roles in this workspace. If you use this operation without specifying userId or groupId, the operation returns the roles of all users and groups. If you specify a userId or a groupId, only the roles for that user or group are returned. If you do this, you can specify only one userId or one groupId.
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Lists the users and groups who have the Grafana Admin and Editor roles in this workspace. If you use this operation without specifying userId or groupId, the operation returns the roles of all users and groups. If you specify a userId or a groupId, only the roles for that user or group are returned. If you do this, you can specify only one userId or one groupId.
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  
  /**
    * The ListTagsForResource operation returns the tags that are associated with the Amazon Managed Service for Grafana resource specified by the resourceArn. Currently, the only resource that can be tagged is a workspace. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * The ListTagsForResource operation returns the tags that are associated with the Amazon Managed Service for Grafana resource specified by the resourceArn. Currently, the only resource that can be tagged is a workspace. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace. For more complete information about one workspace, use DescribeWorkspace.
    */
  def listWorkspaces(): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]): Request[ListWorkspacesResponse, AWSError] = js.native
  /**
    * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace. For more complete information about one workspace, use DescribeWorkspace.
    */
  def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(
    params: ListWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]
  ): Request[ListWorkspacesResponse, AWSError] = js.native
  
  /**
    * The TagResource operation associates tags with an Amazon Managed Grafana resource. Currently, the only resource that can be tagged is workspaces.  If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * The TagResource operation associates tags with an Amazon Managed Grafana resource. Currently, the only resource that can be tagged is workspaces.  If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * The UntagResource operation removes the association of the tag with the Amazon Managed Grafana resource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * The UntagResource operation removes the association of the tag with the Amazon Managed Grafana resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates which users in a workspace have the Grafana Admin or Editor roles.
    */
  def updatePermissions(): Request[UpdatePermissionsResponse, AWSError] = js.native
  def updatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionsResponse, Unit]): Request[UpdatePermissionsResponse, AWSError] = js.native
  /**
    * Updates which users in a workspace have the Grafana Admin or Editor roles.
    */
  def updatePermissions(params: UpdatePermissionsRequest): Request[UpdatePermissionsResponse, AWSError] = js.native
  def updatePermissions(
    params: UpdatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionsResponse, Unit]
  ): Request[UpdatePermissionsResponse, AWSError] = js.native
  
  /**
    * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional parameters, the existing values of those parameters are not changed. To modify the user authentication methods that the workspace uses, such as SAML or Amazon Web Services SSO, use UpdateWorkspaceAuthentication. To modify which users in the workspace have the Admin and Editor Grafana roles, use UpdatePermissions.
    */
  def updateWorkspace(): Request[UpdateWorkspaceResponse, AWSError] = js.native
  def updateWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceResponse, Unit]): Request[UpdateWorkspaceResponse, AWSError] = js.native
  /**
    * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional parameters, the existing values of those parameters are not changed. To modify the user authentication methods that the workspace uses, such as SAML or Amazon Web Services SSO, use UpdateWorkspaceAuthentication. To modify which users in the workspace have the Admin and Editor Grafana roles, use UpdatePermissions.
    */
  def updateWorkspace(params: UpdateWorkspaceRequest): Request[UpdateWorkspaceResponse, AWSError] = js.native
  def updateWorkspace(
    params: UpdateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceResponse, Unit]
  ): Request[UpdateWorkspaceResponse, AWSError] = js.native
  
  /**
    * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the assertion attribute are to have the Admin and Editor roles in the workspace.
    */
  def updateWorkspaceAuthentication(): Request[UpdateWorkspaceAuthenticationResponse, AWSError] = js.native
  def updateWorkspaceAuthentication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceAuthenticationResponse, Unit]): Request[UpdateWorkspaceAuthenticationResponse, AWSError] = js.native
  /**
    * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the assertion attribute are to have the Admin and Editor roles in the workspace.
    */
  def updateWorkspaceAuthentication(params: UpdateWorkspaceAuthenticationRequest): Request[UpdateWorkspaceAuthenticationResponse, AWSError] = js.native
  def updateWorkspaceAuthentication(
    params: UpdateWorkspaceAuthenticationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceAuthenticationResponse, Unit]
  ): Request[UpdateWorkspaceAuthenticationResponse, AWSError] = js.native
}
