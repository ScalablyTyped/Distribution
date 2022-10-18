package typings.awsSdk.clientsWorkspacesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkSpaces extends Service {
  
  /**
    * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.  Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED. 
    */
  def associateConnectionAlias(): Request[AssociateConnectionAliasResult, AWSError] = js.native
  def associateConnectionAlias(callback: js.Function2[/* err */ AWSError, /* data */ AssociateConnectionAliasResult, Unit]): Request[AssociateConnectionAliasResult, AWSError] = js.native
  /**
    * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.  Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED. 
    */
  def associateConnectionAlias(params: AssociateConnectionAliasRequest): Request[AssociateConnectionAliasResult, AWSError] = js.native
  def associateConnectionAlias(
    params: AssociateConnectionAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateConnectionAliasResult, Unit]
  ): Request[AssociateConnectionAliasResult, AWSError] = js.native
  
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(): Request[AssociateIpGroupsResult, AWSError] = js.native
  def associateIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ AssociateIpGroupsResult, Unit]): Request[AssociateIpGroupsResult, AWSError] = js.native
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult, AWSError] = js.native
  def associateIpGroups(
    params: AssociateIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateIpGroupsResult, Unit]
  ): Request[AssociateIpGroupsResult, AWSError] = js.native
  
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(): Request[AuthorizeIpRulesResult, AWSError] = js.native
  def authorizeIpRules(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeIpRulesResult, Unit]): Request[AuthorizeIpRulesResult, AWSError] = js.native
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult, AWSError] = js.native
  def authorizeIpRules(
    params: AuthorizeIpRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeIpRulesResult, Unit]
  ): Request[AuthorizeIpRulesResult, AWSError] = js.native
  
  @JSName("config")
  var config_WorkSpaces: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies the specified image from the specified Region to the current Region. For more information about copying images, see  Copy a Custom WorkSpaces Image. In the China (Ningxia) Region, you can copy images only within the same Region. In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services Support.  Before copying a shared image, be sure to verify that it has been shared from the correct Amazon Web Services account. To determine if an image has been shared and to see the ID of the Amazon Web Services account that owns an image, use the DescribeWorkSpaceImages and DescribeWorkspaceImagePermissions API operations.  
    */
  def copyWorkspaceImage(): Request[CopyWorkspaceImageResult, AWSError] = js.native
  def copyWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ CopyWorkspaceImageResult, Unit]): Request[CopyWorkspaceImageResult, AWSError] = js.native
  /**
    * Copies the specified image from the specified Region to the current Region. For more information about copying images, see  Copy a Custom WorkSpaces Image. In the China (Ningxia) Region, you can copy images only within the same Region. In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services Support.  Before copying a shared image, be sure to verify that it has been shared from the correct Amazon Web Services account. To determine if an image has been shared and to see the ID of the Amazon Web Services account that owns an image, use the DescribeWorkSpaceImages and DescribeWorkspaceImagePermissions API operations.  
    */
  def copyWorkspaceImage(params: CopyWorkspaceImageRequest): Request[CopyWorkspaceImageResult, AWSError] = js.native
  def copyWorkspaceImage(
    params: CopyWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyWorkspaceImageResult, Unit]
  ): Request[CopyWorkspaceImageResult, AWSError] = js.native
  
  /**
    * Creates a client-add-in for Amazon Connect within a directory. You can create only one Amazon Connect client add-in within a directory. This client add-in allows WorkSpaces users to seamlessly connect to Amazon Connect.
    */
  def createConnectClientAddIn(): Request[CreateConnectClientAddInResult, AWSError] = js.native
  def createConnectClientAddIn(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectClientAddInResult, Unit]): Request[CreateConnectClientAddInResult, AWSError] = js.native
  /**
    * Creates a client-add-in for Amazon Connect within a directory. You can create only one Amazon Connect client add-in within a directory. This client add-in allows WorkSpaces users to seamlessly connect to Amazon Connect.
    */
  def createConnectClientAddIn(params: CreateConnectClientAddInRequest): Request[CreateConnectClientAddInResult, AWSError] = js.native
  def createConnectClientAddIn(
    params: CreateConnectClientAddInRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectClientAddInResult, Unit]
  ): Request[CreateConnectClientAddInResult, AWSError] = js.native
  
  /**
    * Creates the specified connection alias for use with cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def createConnectionAlias(): Request[CreateConnectionAliasResult, AWSError] = js.native
  def createConnectionAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionAliasResult, Unit]): Request[CreateConnectionAliasResult, AWSError] = js.native
  /**
    * Creates the specified connection alias for use with cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def createConnectionAlias(params: CreateConnectionAliasRequest): Request[CreateConnectionAliasResult, AWSError] = js.native
  def createConnectionAlias(
    params: CreateConnectionAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionAliasResult, Unit]
  ): Request[CreateConnectionAliasResult, AWSError] = js.native
  
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(): Request[CreateIpGroupResult, AWSError] = js.native
  def createIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateIpGroupResult, Unit]): Request[CreateIpGroupResult, AWSError] = js.native
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult, AWSError] = js.native
  def createIpGroup(
    params: CreateIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIpGroupResult, Unit]
  ): Request[CreateIpGroupResult, AWSError] = js.native
  
  /**
    * Creates the specified tags for the specified WorkSpaces resource.
    */
  def createTags(): Request[CreateTagsResult, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResult, Unit]): Request[CreateTagsResult, AWSError] = js.native
  /**
    * Creates the specified tags for the specified WorkSpaces resource.
    */
  def createTags(params: CreateTagsRequest): Request[CreateTagsResult, AWSError] = js.native
  def createTags(
    params: CreateTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResult, Unit]
  ): Request[CreateTagsResult, AWSError] = js.native
  
  /**
    * Creates a new updated WorkSpace image based on the specified source image. The new updated WorkSpace image has the latest drivers and other updates required by the Amazon WorkSpaces components. To determine which WorkSpace images need to be updated with the latest Amazon WorkSpaces requirements, use  DescribeWorkspaceImages.    Only Windows 10, Windows Sever 2016, and Windows Server 2019 WorkSpace images can be programmatically updated at this time.   Microsoft Windows updates and other application updates are not included in the update process.   The source WorkSpace image is not deleted. You can delete the source image after you've verified your new updated image and created a new bundle.    
    */
  def createUpdatedWorkspaceImage(): Request[CreateUpdatedWorkspaceImageResult, AWSError] = js.native
  def createUpdatedWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateUpdatedWorkspaceImageResult, Unit]): Request[CreateUpdatedWorkspaceImageResult, AWSError] = js.native
  /**
    * Creates a new updated WorkSpace image based on the specified source image. The new updated WorkSpace image has the latest drivers and other updates required by the Amazon WorkSpaces components. To determine which WorkSpace images need to be updated with the latest Amazon WorkSpaces requirements, use  DescribeWorkspaceImages.    Only Windows 10, Windows Sever 2016, and Windows Server 2019 WorkSpace images can be programmatically updated at this time.   Microsoft Windows updates and other application updates are not included in the update process.   The source WorkSpace image is not deleted. You can delete the source image after you've verified your new updated image and created a new bundle.    
    */
  def createUpdatedWorkspaceImage(params: CreateUpdatedWorkspaceImageRequest): Request[CreateUpdatedWorkspaceImageResult, AWSError] = js.native
  def createUpdatedWorkspaceImage(
    params: CreateUpdatedWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUpdatedWorkspaceImageResult, Unit]
  ): Request[CreateUpdatedWorkspaceImageResult, AWSError] = js.native
  
  /**
    * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see  Create a Custom WorkSpaces Image and Bundle.
    */
  def createWorkspaceBundle(): Request[CreateWorkspaceBundleResult, AWSError] = js.native
  def createWorkspaceBundle(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceBundleResult, Unit]): Request[CreateWorkspaceBundleResult, AWSError] = js.native
  /**
    * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see  Create a Custom WorkSpaces Image and Bundle.
    */
  def createWorkspaceBundle(params: CreateWorkspaceBundleRequest): Request[CreateWorkspaceBundleResult, AWSError] = js.native
  def createWorkspaceBundle(
    params: CreateWorkspaceBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceBundleResult, Unit]
  ): Request[CreateWorkspaceBundleResult, AWSError] = js.native
  
  /**
    * Creates a new WorkSpace image from an existing WorkSpace.
    */
  def createWorkspaceImage(): Request[CreateWorkspaceImageResult, AWSError] = js.native
  def createWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceImageResult, Unit]): Request[CreateWorkspaceImageResult, AWSError] = js.native
  /**
    * Creates a new WorkSpace image from an existing WorkSpace.
    */
  def createWorkspaceImage(params: CreateWorkspaceImageRequest): Request[CreateWorkspaceImageResult, AWSError] = js.native
  def createWorkspaceImage(
    params: CreateWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceImageResult, Unit]
  ): Request[CreateWorkspaceImageResult, AWSError] = js.native
  
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(): Request[CreateWorkspacesResult, AWSError] = js.native
  def createWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspacesResult, Unit]): Request[CreateWorkspacesResult, AWSError] = js.native
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult, AWSError] = js.native
  def createWorkspaces(
    params: CreateWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspacesResult, Unit]
  ): Request[CreateWorkspacesResult, AWSError] = js.native
  
  /**
    * Deletes customized client branding. Client branding allows you to customize your WorkSpace's client login portal. You can tailor your login portal company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in. After you delete your customized client branding, your login portal reverts to the default client branding.
    */
  def deleteClientBranding(): Request[DeleteClientBrandingResult, AWSError] = js.native
  def deleteClientBranding(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientBrandingResult, Unit]): Request[DeleteClientBrandingResult, AWSError] = js.native
  /**
    * Deletes customized client branding. Client branding allows you to customize your WorkSpace's client login portal. You can tailor your login portal company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in. After you delete your customized client branding, your login portal reverts to the default client branding.
    */
  def deleteClientBranding(params: DeleteClientBrandingRequest): Request[DeleteClientBrandingResult, AWSError] = js.native
  def deleteClientBranding(
    params: DeleteClientBrandingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClientBrandingResult, Unit]
  ): Request[DeleteClientBrandingResult, AWSError] = js.native
  
  /**
    * Deletes a client-add-in for Amazon Connect that is configured within a directory.
    */
  def deleteConnectClientAddIn(): Request[DeleteConnectClientAddInResult, AWSError] = js.native
  def deleteConnectClientAddIn(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectClientAddInResult, Unit]): Request[DeleteConnectClientAddInResult, AWSError] = js.native
  /**
    * Deletes a client-add-in for Amazon Connect that is configured within a directory.
    */
  def deleteConnectClientAddIn(params: DeleteConnectClientAddInRequest): Request[DeleteConnectClientAddInResult, AWSError] = js.native
  def deleteConnectClientAddIn(
    params: DeleteConnectClientAddInRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectClientAddInResult, Unit]
  ): Request[DeleteConnectClientAddInResult, AWSError] = js.native
  
  /**
    * Deletes the specified connection alias. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.   If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your WorkSpaces users, you must take certain precautions to prevent potential security issues. For more information, see  Security Considerations if You Stop Using Cross-Region Redirection.   To delete a connection alias that has been shared, the shared account must first disassociate the connection alias from any directories it has been associated with. Then you must unshare the connection alias from the account it has been shared with. You can delete a connection alias only after it is no longer shared with any accounts or associated with any directories. 
    */
  def deleteConnectionAlias(): Request[DeleteConnectionAliasResult, AWSError] = js.native
  def deleteConnectionAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionAliasResult, Unit]): Request[DeleteConnectionAliasResult, AWSError] = js.native
  /**
    * Deletes the specified connection alias. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.   If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your WorkSpaces users, you must take certain precautions to prevent potential security issues. For more information, see  Security Considerations if You Stop Using Cross-Region Redirection.   To delete a connection alias that has been shared, the shared account must first disassociate the connection alias from any directories it has been associated with. Then you must unshare the connection alias from the account it has been shared with. You can delete a connection alias only after it is no longer shared with any accounts or associated with any directories. 
    */
  def deleteConnectionAlias(params: DeleteConnectionAliasRequest): Request[DeleteConnectionAliasResult, AWSError] = js.native
  def deleteConnectionAlias(
    params: DeleteConnectionAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionAliasResult, Unit]
  ): Request[DeleteConnectionAliasResult, AWSError] = js.native
  
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(): Request[DeleteIpGroupResult, AWSError] = js.native
  def deleteIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIpGroupResult, Unit]): Request[DeleteIpGroupResult, AWSError] = js.native
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult, AWSError] = js.native
  def deleteIpGroup(
    params: DeleteIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIpGroupResult, Unit]
  ): Request[DeleteIpGroupResult, AWSError] = js.native
  
  /**
    * Deletes the specified tags from the specified WorkSpaces resource.
    */
  def deleteTags(): Request[DeleteTagsResult, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResult, Unit]): Request[DeleteTagsResult, AWSError] = js.native
  /**
    * Deletes the specified tags from the specified WorkSpaces resource.
    */
  def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResult, Unit]
  ): Request[DeleteTagsResult, AWSError] = js.native
  
  /**
    * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see  Delete a Custom WorkSpaces Bundle or Image.
    */
  def deleteWorkspaceBundle(): Request[DeleteWorkspaceBundleResult, AWSError] = js.native
  def deleteWorkspaceBundle(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceBundleResult, Unit]): Request[DeleteWorkspaceBundleResult, AWSError] = js.native
  /**
    * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see  Delete a Custom WorkSpaces Bundle or Image.
    */
  def deleteWorkspaceBundle(params: DeleteWorkspaceBundleRequest): Request[DeleteWorkspaceBundleResult, AWSError] = js.native
  def deleteWorkspaceBundle(
    params: DeleteWorkspaceBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceBundleResult, Unit]
  ): Request[DeleteWorkspaceBundleResult, AWSError] = js.native
  
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and unshare the image if it is shared with other accounts. 
    */
  def deleteWorkspaceImage(): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  def deleteWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceImageResult, Unit]): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and unshare the image if it is shared with other accounts. 
    */
  def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  def deleteWorkspaceImage(
    params: DeleteWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceImageResult, Unit]
  ): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  
  /**
    * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister the directory.  Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per the Directory Service pricing terms. To delete empty directories, see  Delete the Directory for Your WorkSpaces. If you delete your Simple AD or AD Connector directory, you can always create a new one when you want to start using WorkSpaces again. 
    */
  def deregisterWorkspaceDirectory(): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  def deregisterWorkspaceDirectory(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWorkspaceDirectoryResult, Unit]): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister the directory.  Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per the Directory Service pricing terms. To delete empty directories, see  Delete the Directory for Your WorkSpaces. If you delete your Simple AD or AD Connector directory, you can always create a new one when you want to start using WorkSpaces again. 
    */
  def deregisterWorkspaceDirectory(params: DeregisterWorkspaceDirectoryRequest): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  def deregisterWorkspaceDirectory(
    params: DeregisterWorkspaceDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWorkspaceDirectoryResult, Unit]
  ): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccount(): Request[DescribeAccountResult, AWSError] = js.native
  def describeAccount(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountResult, Unit]): Request[DescribeAccountResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult, AWSError] = js.native
  def describeAccount(
    params: DescribeAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountResult, Unit]
  ): Request[DescribeAccountResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccountModifications(): Request[DescribeAccountModificationsResult, AWSError] = js.native
  def describeAccountModifications(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountModificationsResult, Unit]): Request[DescribeAccountModificationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccountModifications(params: DescribeAccountModificationsRequest): Request[DescribeAccountModificationsResult, AWSError] = js.native
  def describeAccountModifications(
    params: DescribeAccountModificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountModificationsResult, Unit]
  ): Request[DescribeAccountModificationsResult, AWSError] = js.native
  
  /**
    * Describes the specified client branding. Client branding allows you to customize the log in page of various device types for your users. You can add your company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in.  Only device types that have branding information configured will be shown in the response. 
    */
  def describeClientBranding(): Request[DescribeClientBrandingResult, AWSError] = js.native
  def describeClientBranding(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientBrandingResult, Unit]): Request[DescribeClientBrandingResult, AWSError] = js.native
  /**
    * Describes the specified client branding. Client branding allows you to customize the log in page of various device types for your users. You can add your company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in.  Only device types that have branding information configured will be shown in the response. 
    */
  def describeClientBranding(params: DescribeClientBrandingRequest): Request[DescribeClientBrandingResult, AWSError] = js.native
  def describeClientBranding(
    params: DescribeClientBrandingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientBrandingResult, Unit]
  ): Request[DescribeClientBrandingResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(): Request[DescribeClientPropertiesResult, AWSError] = js.native
  def describeClientProperties(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientPropertiesResult, Unit]): Request[DescribeClientPropertiesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult, AWSError] = js.native
  def describeClientProperties(
    params: DescribeClientPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientPropertiesResult, Unit]
  ): Request[DescribeClientPropertiesResult, AWSError] = js.native
  
  /**
    * Retrieves a list of Amazon Connect client add-ins that have been created.
    */
  def describeConnectClientAddIns(): Request[DescribeConnectClientAddInsResult, AWSError] = js.native
  def describeConnectClientAddIns(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectClientAddInsResult, Unit]): Request[DescribeConnectClientAddInsResult, AWSError] = js.native
  /**
    * Retrieves a list of Amazon Connect client add-ins that have been created.
    */
  def describeConnectClientAddIns(params: DescribeConnectClientAddInsRequest): Request[DescribeConnectClientAddInsResult, AWSError] = js.native
  def describeConnectClientAddIns(
    params: DescribeConnectClientAddInsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectClientAddInsResult, Unit]
  ): Request[DescribeConnectClientAddInsResult, AWSError] = js.native
  
  /**
    * Describes the permissions that the owner of a connection alias has granted to another Amazon Web Services account for the specified connection alias. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def describeConnectionAliasPermissions(): Request[DescribeConnectionAliasPermissionsResult, AWSError] = js.native
  def describeConnectionAliasPermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionAliasPermissionsResult, Unit]
  ): Request[DescribeConnectionAliasPermissionsResult, AWSError] = js.native
  /**
    * Describes the permissions that the owner of a connection alias has granted to another Amazon Web Services account for the specified connection alias. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def describeConnectionAliasPermissions(params: DescribeConnectionAliasPermissionsRequest): Request[DescribeConnectionAliasPermissionsResult, AWSError] = js.native
  def describeConnectionAliasPermissions(
    params: DescribeConnectionAliasPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionAliasPermissionsResult, Unit]
  ): Request[DescribeConnectionAliasPermissionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def describeConnectionAliases(): Request[DescribeConnectionAliasesResult, AWSError] = js.native
  def describeConnectionAliases(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionAliasesResult, Unit]): Request[DescribeConnectionAliasesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.
    */
  def describeConnectionAliases(params: DescribeConnectionAliasesRequest): Request[DescribeConnectionAliasesResult, AWSError] = js.native
  def describeConnectionAliases(
    params: DescribeConnectionAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionAliasesResult, Unit]
  ): Request[DescribeConnectionAliasesResult, AWSError] = js.native
  
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(): Request[DescribeIpGroupsResult, AWSError] = js.native
  def describeIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpGroupsResult, Unit]): Request[DescribeIpGroupsResult, AWSError] = js.native
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult, AWSError] = js.native
  def describeIpGroups(
    params: DescribeIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpGroupsResult, Unit]
  ): Request[DescribeIpGroupsResult, AWSError] = js.native
  
  /**
    * Describes the specified tags for the specified WorkSpaces resource.
    */
  def describeTags(): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]): Request[DescribeTagsResult, AWSError] = js.native
  /**
    * Describes the specified tags for the specified WorkSpaces resource.
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]
  ): Request[DescribeTagsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  def describeWorkspaceBundles(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceBundlesResult, Unit]): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  def describeWorkspaceBundles(
    params: DescribeWorkspaceBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceBundlesResult, Unit]
  ): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  
  /**
    * Describes the available directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  def describeWorkspaceDirectories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceDirectoriesResult, Unit]): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  /**
    * Describes the available directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  def describeWorkspaceDirectories(
    params: DescribeWorkspaceDirectoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceDirectoriesResult, Unit]
  ): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  
  /**
    * Describes the permissions that the owner of an image has granted to other Amazon Web Services accounts for an image.
    */
  def describeWorkspaceImagePermissions(): Request[DescribeWorkspaceImagePermissionsResult, AWSError] = js.native
  def describeWorkspaceImagePermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagePermissionsResult, Unit]
  ): Request[DescribeWorkspaceImagePermissionsResult, AWSError] = js.native
  /**
    * Describes the permissions that the owner of an image has granted to other Amazon Web Services accounts for an image.
    */
  def describeWorkspaceImagePermissions(params: DescribeWorkspaceImagePermissionsRequest): Request[DescribeWorkspaceImagePermissionsResult, AWSError] = js.native
  def describeWorkspaceImagePermissions(
    params: DescribeWorkspaceImagePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagePermissionsResult, Unit]
  ): Request[DescribeWorkspaceImagePermissionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  def describeWorkspaceImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagesResult, Unit]): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  def describeWorkspaceImages(
    params: DescribeWorkspaceImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagesResult, Unit]
  ): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  
  /**
    * Describes the snapshots for the specified WorkSpace.
    */
  def describeWorkspaceSnapshots(): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  def describeWorkspaceSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceSnapshotsResult, Unit]): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  /**
    * Describes the snapshots for the specified WorkSpace.
    */
  def describeWorkspaceSnapshots(params: DescribeWorkspaceSnapshotsRequest): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  def describeWorkspaceSnapshots(
    params: DescribeWorkspaceSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceSnapshotsResult, Unit]
  ): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(): Request[DescribeWorkspacesResult, AWSError] = js.native
  def describeWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesResult, Unit]): Request[DescribeWorkspacesResult, AWSError] = js.native
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult, AWSError] = js.native
  def describeWorkspaces(
    params: DescribeWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesResult, Unit]
  ): Request[DescribeWorkspacesResult, AWSError] = js.native
  
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  def describeWorkspacesConnectionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesConnectionStatusResult, Unit]
  ): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  def describeWorkspacesConnectionStatus(
    params: DescribeWorkspacesConnectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesConnectionStatusResult, Unit]
  ): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  
  /**
    * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region redirection between two directories in different Regions. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.  Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED. 
    */
  def disassociateConnectionAlias(): Request[DisassociateConnectionAliasResult, AWSError] = js.native
  def disassociateConnectionAlias(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectionAliasResult, Unit]): Request[DisassociateConnectionAliasResult, AWSError] = js.native
  /**
    * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region redirection between two directories in different Regions. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.  Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED. 
    */
  def disassociateConnectionAlias(params: DisassociateConnectionAliasRequest): Request[DisassociateConnectionAliasResult, AWSError] = js.native
  def disassociateConnectionAlias(
    params: DisassociateConnectionAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectionAliasResult, Unit]
  ): Request[DisassociateConnectionAliasResult, AWSError] = js.native
  
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(): Request[DisassociateIpGroupsResult, AWSError] = js.native
  def disassociateIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIpGroupsResult, Unit]): Request[DisassociateIpGroupsResult, AWSError] = js.native
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult, AWSError] = js.native
  def disassociateIpGroups(
    params: DisassociateIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIpGroupsResult, Unit]
  ): Request[DisassociateIpGroupsResult, AWSError] = js.native
  
  /**
    * Imports client branding. Client branding allows you to customize your WorkSpace's client login portal. You can tailor your login portal company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in. After you import client branding, the default branding experience for the specified platform type is replaced with the imported experience    You must specify at least one platform type when importing client branding.   You can import up to 6 MB of data with each request. If your request exceeds this limit, you can import client branding for different platform types using separate requests.   In each platform type, the SupportEmail and SupportLink parameters are mutually exclusive. You can specify only one parameter for each platform type, but not both.   Imported data can take up to a minute to appear in the WorkSpaces client.   
    */
  def importClientBranding(): Request[ImportClientBrandingResult, AWSError] = js.native
  def importClientBranding(callback: js.Function2[/* err */ AWSError, /* data */ ImportClientBrandingResult, Unit]): Request[ImportClientBrandingResult, AWSError] = js.native
  /**
    * Imports client branding. Client branding allows you to customize your WorkSpace's client login portal. You can tailor your login portal company logo, the support email address, support link, link to reset password, and a custom message for users trying to sign in. After you import client branding, the default branding experience for the specified platform type is replaced with the imported experience    You must specify at least one platform type when importing client branding.   You can import up to 6 MB of data with each request. If your request exceeds this limit, you can import client branding for different platform types using separate requests.   In each platform type, the SupportEmail and SupportLink parameters are mutually exclusive. You can specify only one parameter for each platform type, but not both.   Imported data can take up to a minute to appear in the WorkSpaces client.   
    */
  def importClientBranding(params: ImportClientBrandingRequest): Request[ImportClientBrandingResult, AWSError] = js.native
  def importClientBranding(
    params: ImportClientBrandingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportClientBrandingResult, Unit]
  ): Request[ImportClientBrandingResult, AWSError] = js.native
  
  /**
    * Imports the specified Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an already licensed Amazon EC2 image that is in your Amazon Web Services account, and you must own the image. For more information about creating BYOL images, see  Bring Your Own Windows Desktop Licenses.
    */
  def importWorkspaceImage(): Request[ImportWorkspaceImageResult, AWSError] = js.native
  def importWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ ImportWorkspaceImageResult, Unit]): Request[ImportWorkspaceImageResult, AWSError] = js.native
  /**
    * Imports the specified Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an already licensed Amazon EC2 image that is in your Amazon Web Services account, and you must own the image. For more information about creating BYOL images, see  Bring Your Own Windows Desktop Licenses.
    */
  def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult, AWSError] = js.native
  def importWorkspaceImage(
    params: ImportWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportWorkspaceImageResult, Unit]
  ): Request[ImportWorkspaceImageResult, AWSError] = js.native
  
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable Bring Your Own License (BYOL).  This operation can be run only by Amazon Web Services accounts that are enabled for BYOL. If your account isn't enabled for BYOL, you'll receive an AccessDeniedException error. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  def listAvailableManagementCidrRanges(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagementCidrRangesResult, Unit]
  ): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable Bring Your Own License (BYOL).  This operation can be run only by Amazon Web Services accounts that are enabled for BYOL. If your account isn't enabled for BYOL, you'll receive an AccessDeniedException error. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  def listAvailableManagementCidrRanges(
    params: ListAvailableManagementCidrRangesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagementCidrRangesResult, Unit]
  ): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  
  /**
    * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user volume. The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the user volume from the last available snapshot of the original WorkSpace. During migration, the original D:\Users\%USERNAME% user profile folder is renamed to D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated. A new D:\Users\%USERNAME%\ folder is generated by the new OS. Certain files in the old user profile are moved to the new user profile. For available migration scenarios, details about what happens during migration, and best practices, see Migrate a WorkSpace.
    */
  def migrateWorkspace(): Request[MigrateWorkspaceResult, AWSError] = js.native
  def migrateWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ MigrateWorkspaceResult, Unit]): Request[MigrateWorkspaceResult, AWSError] = js.native
  /**
    * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user volume. The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the user volume from the last available snapshot of the original WorkSpace. During migration, the original D:\Users\%USERNAME% user profile folder is renamed to D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated. A new D:\Users\%USERNAME%\ folder is generated by the new OS. Certain files in the old user profile are moved to the new user profile. For available migration scenarios, details about what happens during migration, and best practices, see Migrate a WorkSpace.
    */
  def migrateWorkspace(params: MigrateWorkspaceRequest): Request[MigrateWorkspaceResult, AWSError] = js.native
  def migrateWorkspace(
    params: MigrateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MigrateWorkspaceResult, Unit]
  ): Request[MigrateWorkspaceResult, AWSError] = js.native
  
  /**
    * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def modifyAccount(): Request[ModifyAccountResult, AWSError] = js.native
  def modifyAccount(callback: js.Function2[/* err */ AWSError, /* data */ ModifyAccountResult, Unit]): Request[ModifyAccountResult, AWSError] = js.native
  /**
    * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult, AWSError] = js.native
  def modifyAccount(
    params: ModifyAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyAccountResult, Unit]
  ): Request[ModifyAccountResult, AWSError] = js.native
  
  /**
    * Modifies the properties of the specified Amazon WorkSpaces clients.
    */
  def modifyClientProperties(): Request[ModifyClientPropertiesResult, AWSError] = js.native
  def modifyClientProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientPropertiesResult, Unit]): Request[ModifyClientPropertiesResult, AWSError] = js.native
  /**
    * Modifies the properties of the specified Amazon WorkSpaces clients.
    */
  def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult, AWSError] = js.native
  def modifyClientProperties(
    params: ModifyClientPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientPropertiesResult, Unit]
  ): Request[ModifyClientPropertiesResult, AWSError] = js.native
  
  /**
    * Modifies multiple properties related to SAML 2.0 authentication, including the enablement status, user access URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
    */
  def modifySamlProperties(): Request[ModifySamlPropertiesResult, AWSError] = js.native
  def modifySamlProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifySamlPropertiesResult, Unit]): Request[ModifySamlPropertiesResult, AWSError] = js.native
  /**
    * Modifies multiple properties related to SAML 2.0 authentication, including the enablement status, user access URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
    */
  def modifySamlProperties(params: ModifySamlPropertiesRequest): Request[ModifySamlPropertiesResult, AWSError] = js.native
  def modifySamlProperties(
    params: ModifySamlPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySamlPropertiesResult, Unit]
  ): Request[ModifySamlPropertiesResult, AWSError] = js.native
  
  /**
    * Modifies the self-service WorkSpace management capabilities for your users. For more information, see Enable Self-Service WorkSpace Management Capabilities for Your Users.
    */
  def modifySelfservicePermissions(): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  def modifySelfservicePermissions(callback: js.Function2[/* err */ AWSError, /* data */ ModifySelfservicePermissionsResult, Unit]): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  /**
    * Modifies the self-service WorkSpace management capabilities for your users. For more information, see Enable Self-Service WorkSpace Management Capabilities for Your Users.
    */
  def modifySelfservicePermissions(params: ModifySelfservicePermissionsRequest): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  def modifySelfservicePermissions(
    params: ModifySelfservicePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySelfservicePermissionsResult, Unit]
  ): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  
  /**
    * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see  Control Device Access.
    */
  def modifyWorkspaceAccessProperties(): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  def modifyWorkspaceAccessProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceAccessPropertiesResult, Unit]): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  /**
    * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see  Control Device Access.
    */
  def modifyWorkspaceAccessProperties(params: ModifyWorkspaceAccessPropertiesRequest): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  def modifyWorkspaceAccessProperties(
    params: ModifyWorkspaceAccessPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceAccessPropertiesResult, Unit]
  ): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  
  /**
    * Modify the default properties used to create WorkSpaces.
    */
  def modifyWorkspaceCreationProperties(): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  def modifyWorkspaceCreationProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceCreationPropertiesResult, Unit]
  ): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  /**
    * Modify the default properties used to create WorkSpaces.
    */
  def modifyWorkspaceCreationProperties(params: ModifyWorkspaceCreationPropertiesRequest): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  def modifyWorkspaceCreationProperties(
    params: ModifyWorkspaceCreationPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceCreationPropertiesResult, Unit]
  ): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  
  /**
    * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root and user volumes, see  Modify a WorkSpace. 
    */
  def modifyWorkspaceProperties(): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  def modifyWorkspaceProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspacePropertiesResult, Unit]): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  /**
    * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root and user volumes, see  Modify a WorkSpace. 
    */
  def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  def modifyWorkspaceProperties(
    params: ModifyWorkspacePropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspacePropertiesResult, Unit]
  ): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  def modifyWorkspaceState(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceStateResult, Unit]): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  def modifyWorkspaceState(
    params: ModifyWorkspaceStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceStateResult, Unit]
  ): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(): Request[RebootWorkspacesResult, AWSError] = js.native
  def rebootWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ RebootWorkspacesResult, Unit]): Request[RebootWorkspacesResult, AWSError] = js.native
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult, AWSError] = js.native
  def rebootWorkspaces(
    params: RebootWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootWorkspacesResult, Unit]
  ): Request[RebootWorkspacesResult, AWSError] = js.native
  
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, UNHEALTHY, STOPPED, or REBOOTING. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(): Request[RebuildWorkspacesResult, AWSError] = js.native
  def rebuildWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ RebuildWorkspacesResult, Unit]): Request[RebuildWorkspacesResult, AWSError] = js.native
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, UNHEALTHY, STOPPED, or REBOOTING. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult, AWSError] = js.native
  def rebuildWorkspaces(
    params: RebuildWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebuildWorkspacesResult, Unit]
  ): Request[RebuildWorkspacesResult, AWSError] = js.native
  
  /**
    * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is registered. If this is the first time you are registering a directory, you will need to create the workspaces_DefaultRole role before you can register a directory. For more information, see  Creating the workspaces_DefaultRole Role.
    */
  def registerWorkspaceDirectory(): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  def registerWorkspaceDirectory(callback: js.Function2[/* err */ AWSError, /* data */ RegisterWorkspaceDirectoryResult, Unit]): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is registered. If this is the first time you are registering a directory, you will need to create the workspaces_DefaultRole role before you can register a directory. For more information, see  Creating the workspaces_DefaultRole Role.
    */
  def registerWorkspaceDirectory(params: RegisterWorkspaceDirectoryRequest): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  def registerWorkspaceDirectory(
    params: RegisterWorkspaceDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterWorkspaceDirectoryResult, Unit]
  ): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  
  /**
    * Restores the specified WorkSpace to its last known healthy state. You cannot restore a WorkSpace unless its state is  AVAILABLE, ERROR, UNHEALTHY, or STOPPED. Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Restore a WorkSpace. This operation is asynchronous and returns before the WorkSpace is completely restored.
    */
  def restoreWorkspace(): Request[RestoreWorkspaceResult, AWSError] = js.native
  def restoreWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ RestoreWorkspaceResult, Unit]): Request[RestoreWorkspaceResult, AWSError] = js.native
  /**
    * Restores the specified WorkSpace to its last known healthy state. You cannot restore a WorkSpace unless its state is  AVAILABLE, ERROR, UNHEALTHY, or STOPPED. Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Restore a WorkSpace. This operation is asynchronous and returns before the WorkSpace is completely restored.
    */
  def restoreWorkspace(params: RestoreWorkspaceRequest): Request[RestoreWorkspaceResult, AWSError] = js.native
  def restoreWorkspace(
    params: RestoreWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreWorkspaceResult, Unit]
  ): Request[RestoreWorkspaceResult, AWSError] = js.native
  
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(): Request[RevokeIpRulesResult, AWSError] = js.native
  def revokeIpRules(callback: js.Function2[/* err */ AWSError, /* data */ RevokeIpRulesResult, Unit]): Request[RevokeIpRulesResult, AWSError] = js.native
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult, AWSError] = js.native
  def revokeIpRules(
    params: RevokeIpRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeIpRulesResult, Unit]
  ): Request[RevokeIpRulesResult, AWSError] = js.native
  
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(): Request[StartWorkspacesResult, AWSError] = js.native
  def startWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ StartWorkspacesResult, Unit]): Request[StartWorkspacesResult, AWSError] = js.native
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult, AWSError] = js.native
  def startWorkspaces(
    params: StartWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartWorkspacesResult, Unit]
  ): Request[StartWorkspacesResult, AWSError] = js.native
  
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(): Request[StopWorkspacesResult, AWSError] = js.native
  def stopWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ StopWorkspacesResult, Unit]): Request[StopWorkspacesResult, AWSError] = js.native
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult, AWSError] = js.native
  def stopWorkspaces(
    params: StopWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopWorkspacesResult, Unit]
  ): Request[StopWorkspacesResult, AWSError] = js.native
  
  /**
    * Terminates the specified WorkSpaces.  Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services Support before terminating the WorkSpace.  You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a WorkSpace is terminated, the TERMINATED state is returned only briefly before the WorkSpace directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated, check for the WorkSpace ID by using  DescribeWorkSpaces. If the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.  Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per the Directory Service pricing terms. To delete empty directories, see  Delete the Directory for Your WorkSpaces. If you delete your Simple AD or AD Connector directory, you can always create a new one when you want to start using WorkSpaces again. 
    */
  def terminateWorkspaces(): Request[TerminateWorkspacesResult, AWSError] = js.native
  def terminateWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ TerminateWorkspacesResult, Unit]): Request[TerminateWorkspacesResult, AWSError] = js.native
  /**
    * Terminates the specified WorkSpaces.  Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services Support before terminating the WorkSpace.  You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a WorkSpace is terminated, the TERMINATED state is returned only briefly before the WorkSpace directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated, check for the WorkSpace ID by using  DescribeWorkSpaces. If the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.  Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per the Directory Service pricing terms. To delete empty directories, see  Delete the Directory for Your WorkSpaces. If you delete your Simple AD or AD Connector directory, you can always create a new one when you want to start using WorkSpaces again. 
    */
  def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult, AWSError] = js.native
  def terminateWorkspaces(
    params: TerminateWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateWorkspacesResult, Unit]
  ): Request[TerminateWorkspacesResult, AWSError] = js.native
  
  /**
    * Updates a Amazon Connect client add-in. Use this action to update the name and endpoint URL of a Amazon Connect client add-in.
    */
  def updateConnectClientAddIn(): Request[UpdateConnectClientAddInResult, AWSError] = js.native
  def updateConnectClientAddIn(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectClientAddInResult, Unit]): Request[UpdateConnectClientAddInResult, AWSError] = js.native
  /**
    * Updates a Amazon Connect client add-in. Use this action to update the name and endpoint URL of a Amazon Connect client add-in.
    */
  def updateConnectClientAddIn(params: UpdateConnectClientAddInRequest): Request[UpdateConnectClientAddInResult, AWSError] = js.native
  def updateConnectClientAddIn(
    params: UpdateConnectClientAddInRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectClientAddInResult, Unit]
  ): Request[UpdateConnectClientAddInResult, AWSError] = js.native
  
  /**
    * Shares or unshares a connection alias with one account by specifying whether that account has permission to associate the connection alias with a directory. If the association permission is granted, the connection alias is shared with that account. If the association permission is revoked, the connection alias is unshared with the account. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.    Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED.   To delete a connection alias that has been shared, the shared account must first disassociate the connection alias from any directories it has been associated with. Then you must unshare the connection alias from the account it has been shared with. You can delete a connection alias only after it is no longer shared with any accounts or associated with any directories.   
    */
  def updateConnectionAliasPermission(): Request[UpdateConnectionAliasPermissionResult, AWSError] = js.native
  def updateConnectionAliasPermission(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionAliasPermissionResult, Unit]): Request[UpdateConnectionAliasPermissionResult, AWSError] = js.native
  /**
    * Shares or unshares a connection alias with one account by specifying whether that account has permission to associate the connection alias with a directory. If the association permission is granted, the connection alias is shared with that account. If the association permission is revoked, the connection alias is unshared with the account. For more information, see  Cross-Region Redirection for Amazon WorkSpaces.    Before performing this operation, call  DescribeConnectionAliases to make sure that the current state of the connection alias is CREATED.   To delete a connection alias that has been shared, the shared account must first disassociate the connection alias from any directories it has been associated with. Then you must unshare the connection alias from the account it has been shared with. You can delete a connection alias only after it is no longer shared with any accounts or associated with any directories.   
    */
  def updateConnectionAliasPermission(params: UpdateConnectionAliasPermissionRequest): Request[UpdateConnectionAliasPermissionResult, AWSError] = js.native
  def updateConnectionAliasPermission(
    params: UpdateConnectionAliasPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionAliasPermissionResult, Unit]
  ): Request[UpdateConnectionAliasPermissionResult, AWSError] = js.native
  
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  def updateRulesOfIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesOfIpGroupResult, Unit]): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  def updateRulesOfIpGroup(
    params: UpdateRulesOfIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesOfIpGroupResult, Unit]
  ): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  
  /**
    * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see  Update a Custom WorkSpaces Bundle.  Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or delete and recreate them. 
    */
  def updateWorkspaceBundle(): Request[UpdateWorkspaceBundleResult, AWSError] = js.native
  def updateWorkspaceBundle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceBundleResult, Unit]): Request[UpdateWorkspaceBundleResult, AWSError] = js.native
  /**
    * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see  Update a Custom WorkSpaces Bundle.  Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or delete and recreate them. 
    */
  def updateWorkspaceBundle(params: UpdateWorkspaceBundleRequest): Request[UpdateWorkspaceBundleResult, AWSError] = js.native
  def updateWorkspaceBundle(
    params: UpdateWorkspaceBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceBundleResult, Unit]
  ): Request[UpdateWorkspaceBundleResult, AWSError] = js.native
  
  /**
    * Shares or unshares an image with one account in the same Amazon Web Services Region by specifying whether that account has permission to copy the image. If the copy image permission is granted, the image is shared with that account. If the copy image permission is revoked, the image is unshared with the account. After an image has been shared, the recipient account can copy the image to other Regions as needed. In the China (Ningxia) Region, you can copy images only within the same Region. In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services Support. For more information about sharing images, see  Share or Unshare a Custom WorkSpaces Image.    To delete an image that has been shared, you must unshare the image before you delete it.   Sharing Bring Your Own License (BYOL) images across Amazon Web Services accounts isn't supported at this time in Amazon Web Services GovCloud (US). To share BYOL images across accounts in Amazon Web Services GovCloud (US), contact Amazon Web Services Support.   
    */
  def updateWorkspaceImagePermission(): Request[UpdateWorkspaceImagePermissionResult, AWSError] = js.native
  def updateWorkspaceImagePermission(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceImagePermissionResult, Unit]): Request[UpdateWorkspaceImagePermissionResult, AWSError] = js.native
  /**
    * Shares or unshares an image with one account in the same Amazon Web Services Region by specifying whether that account has permission to copy the image. If the copy image permission is granted, the image is shared with that account. If the copy image permission is revoked, the image is unshared with the account. After an image has been shared, the recipient account can copy the image to other Regions as needed. In the China (Ningxia) Region, you can copy images only within the same Region. In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services Support. For more information about sharing images, see  Share or Unshare a Custom WorkSpaces Image.    To delete an image that has been shared, you must unshare the image before you delete it.   Sharing Bring Your Own License (BYOL) images across Amazon Web Services accounts isn't supported at this time in Amazon Web Services GovCloud (US). To share BYOL images across accounts in Amazon Web Services GovCloud (US), contact Amazon Web Services Support.   
    */
  def updateWorkspaceImagePermission(params: UpdateWorkspaceImagePermissionRequest): Request[UpdateWorkspaceImagePermissionResult, AWSError] = js.native
  def updateWorkspaceImagePermission(
    params: UpdateWorkspaceImagePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceImagePermissionResult, Unit]
  ): Request[UpdateWorkspaceImagePermissionResult, AWSError] = js.native
}
