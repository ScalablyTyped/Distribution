package typings.awsSdk.workdocsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkDocs extends Service {
  
  /**
    * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
    */
  def abortDocumentVersionUpload(): Request[js.Object, AWSError] = js.native
  def abortDocumentVersionUpload(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
    */
  def abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest): Request[js.Object, AWSError] = js.native
  def abortDocumentVersionUpload(
    params: AbortDocumentVersionUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Activates the specified user. Only active users can access Amazon WorkDocs.
    */
  def activateUser(): Request[ActivateUserResponse, AWSError] = js.native
  def activateUser(callback: js.Function2[/* err */ AWSError, /* data */ ActivateUserResponse, Unit]): Request[ActivateUserResponse, AWSError] = js.native
  /**
    * Activates the specified user. Only active users can access Amazon WorkDocs.
    */
  def activateUser(params: ActivateUserRequest): Request[ActivateUserResponse, AWSError] = js.native
  def activateUser(
    params: ActivateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateUserResponse, Unit]
  ): Request[ActivateUserResponse, AWSError] = js.native
  
  /**
    * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
    */
  def addResourcePermissions(): Request[AddResourcePermissionsResponse, AWSError] = js.native
  def addResourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ AddResourcePermissionsResponse, Unit]): Request[AddResourcePermissionsResponse, AWSError] = js.native
  /**
    * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
    */
  def addResourcePermissions(params: AddResourcePermissionsRequest): Request[AddResourcePermissionsResponse, AWSError] = js.native
  def addResourcePermissions(
    params: AddResourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddResourcePermissionsResponse, Unit]
  ): Request[AddResourcePermissionsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_WorkDocs: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Adds a new comment to the specified document version.
    */
  def createComment(): Request[CreateCommentResponse, AWSError] = js.native
  def createComment(callback: js.Function2[/* err */ AWSError, /* data */ CreateCommentResponse, Unit]): Request[CreateCommentResponse, AWSError] = js.native
  /**
    * Adds a new comment to the specified document version.
    */
  def createComment(params: CreateCommentRequest): Request[CreateCommentResponse, AWSError] = js.native
  def createComment(
    params: CreateCommentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCommentResponse, Unit]
  ): Request[CreateCommentResponse, AWSError] = js.native
  
  /**
    * Adds one or more custom properties to the specified resource (a folder, document, or version).
    */
  def createCustomMetadata(): Request[CreateCustomMetadataResponse, AWSError] = js.native
  def createCustomMetadata(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomMetadataResponse, Unit]): Request[CreateCustomMetadataResponse, AWSError] = js.native
  /**
    * Adds one or more custom properties to the specified resource (a folder, document, or version).
    */
  def createCustomMetadata(params: CreateCustomMetadataRequest): Request[CreateCustomMetadataResponse, AWSError] = js.native
  def createCustomMetadata(
    params: CreateCustomMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomMetadataResponse, Unit]
  ): Request[CreateCustomMetadataResponse, AWSError] = js.native
  
  /**
    * Creates a folder with the specified name and parent folder.
    */
  def createFolder(): Request[CreateFolderResponse, AWSError] = js.native
  def createFolder(callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderResponse, Unit]): Request[CreateFolderResponse, AWSError] = js.native
  /**
    * Creates a folder with the specified name and parent folder.
    */
  def createFolder(params: CreateFolderRequest): Request[CreateFolderResponse, AWSError] = js.native
  def createFolder(
    params: CreateFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderResponse, Unit]
  ): Request[CreateFolderResponse, AWSError] = js.native
  
  /**
    * Adds the specified list of labels to the given resource (a document or folder)
    */
  def createLabels(): Request[CreateLabelsResponse, AWSError] = js.native
  def createLabels(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelsResponse, Unit]): Request[CreateLabelsResponse, AWSError] = js.native
  /**
    * Adds the specified list of labels to the given resource (a document or folder)
    */
  def createLabels(params: CreateLabelsRequest): Request[CreateLabelsResponse, AWSError] = js.native
  def createLabels(
    params: CreateLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelsResponse, Unit]
  ): Request[CreateLabelsResponse, AWSError] = js.native
  
  /**
    * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
    */
  def createNotificationSubscription(): Request[CreateNotificationSubscriptionResponse, AWSError] = js.native
  def createNotificationSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationSubscriptionResponse, Unit]
  ): Request[CreateNotificationSubscriptionResponse, AWSError] = js.native
  /**
    * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
    */
  def createNotificationSubscription(params: CreateNotificationSubscriptionRequest): Request[CreateNotificationSubscriptionResponse, AWSError] = js.native
  def createNotificationSubscription(
    params: CreateNotificationSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationSubscriptionResponse, Unit]
  ): Request[CreateNotificationSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
    */
  def deactivateUser(): Request[js.Object, AWSError] = js.native
  def deactivateUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
    */
  def deactivateUser(params: DeactivateUserRequest): Request[js.Object, AWSError] = js.native
  def deactivateUser(
    params: DeactivateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified comment from the document version.
    */
  def deleteComment(): Request[js.Object, AWSError] = js.native
  def deleteComment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified comment from the document version.
    */
  def deleteComment(params: DeleteCommentRequest): Request[js.Object, AWSError] = js.native
  def deleteComment(
    params: DeleteCommentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes custom metadata from the specified resource.
    */
  def deleteCustomMetadata(): Request[DeleteCustomMetadataResponse, AWSError] = js.native
  def deleteCustomMetadata(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomMetadataResponse, Unit]): Request[DeleteCustomMetadataResponse, AWSError] = js.native
  /**
    * Deletes custom metadata from the specified resource.
    */
  def deleteCustomMetadata(params: DeleteCustomMetadataRequest): Request[DeleteCustomMetadataResponse, AWSError] = js.native
  def deleteCustomMetadata(
    params: DeleteCustomMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomMetadataResponse, Unit]
  ): Request[DeleteCustomMetadataResponse, AWSError] = js.native
  
  /**
    * Permanently deletes the specified document and its associated metadata.
    */
  def deleteDocument(): Request[js.Object, AWSError] = js.native
  def deleteDocument(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes the specified document and its associated metadata.
    */
  def deleteDocument(params: DeleteDocumentRequest): Request[js.Object, AWSError] = js.native
  def deleteDocument(
    params: DeleteDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Permanently deletes the specified folder and its contents.
    */
  def deleteFolder(): Request[js.Object, AWSError] = js.native
  def deleteFolder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes the specified folder and its contents.
    */
  def deleteFolder(params: DeleteFolderRequest): Request[js.Object, AWSError] = js.native
  def deleteFolder(
    params: DeleteFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the contents of the specified folder.
    */
  def deleteFolderContents(): Request[js.Object, AWSError] = js.native
  def deleteFolderContents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the contents of the specified folder.
    */
  def deleteFolderContents(params: DeleteFolderContentsRequest): Request[js.Object, AWSError] = js.native
  def deleteFolderContents(
    params: DeleteFolderContentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified list of labels from a resource.
    */
  def deleteLabels(): Request[DeleteLabelsResponse, AWSError] = js.native
  def deleteLabels(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLabelsResponse, Unit]): Request[DeleteLabelsResponse, AWSError] = js.native
  /**
    * Deletes the specified list of labels from a resource.
    */
  def deleteLabels(params: DeleteLabelsRequest): Request[DeleteLabelsResponse, AWSError] = js.native
  def deleteLabels(
    params: DeleteLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLabelsResponse, Unit]
  ): Request[DeleteLabelsResponse, AWSError] = js.native
  
  /**
    * Deletes the specified subscription from the specified organization.
    */
  def deleteNotificationSubscription(): Request[js.Object, AWSError] = js.native
  def deleteNotificationSubscription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified subscription from the specified organization.
    */
  def deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest): Request[js.Object, AWSError] = js.native
  def deleteNotificationSubscription(
    params: DeleteNotificationSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified user from a Simple AD or Microsoft AD directory.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified user from a Simple AD or Microsoft AD directory.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(params: DeleteUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the user activities in a specified time period.
    */
  def describeActivities(): Request[DescribeActivitiesResponse, AWSError] = js.native
  def describeActivities(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivitiesResponse, Unit]): Request[DescribeActivitiesResponse, AWSError] = js.native
  /**
    * Describes the user activities in a specified time period.
    */
  def describeActivities(params: DescribeActivitiesRequest): Request[DescribeActivitiesResponse, AWSError] = js.native
  def describeActivities(
    params: DescribeActivitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivitiesResponse, Unit]
  ): Request[DescribeActivitiesResponse, AWSError] = js.native
  
  /**
    * List all the comments for the specified document version.
    */
  def describeComments(): Request[DescribeCommentsResponse, AWSError] = js.native
  def describeComments(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommentsResponse, Unit]): Request[DescribeCommentsResponse, AWSError] = js.native
  /**
    * List all the comments for the specified document version.
    */
  def describeComments(params: DescribeCommentsRequest): Request[DescribeCommentsResponse, AWSError] = js.native
  def describeComments(
    params: DescribeCommentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommentsResponse, Unit]
  ): Request[DescribeCommentsResponse, AWSError] = js.native
  
  /**
    * Retrieves the document versions for the specified document. By default, only active versions are returned.
    */
  def describeDocumentVersions(): Request[DescribeDocumentVersionsResponse, AWSError] = js.native
  def describeDocumentVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentVersionsResponse, Unit]): Request[DescribeDocumentVersionsResponse, AWSError] = js.native
  /**
    * Retrieves the document versions for the specified document. By default, only active versions are returned.
    */
  def describeDocumentVersions(params: DescribeDocumentVersionsRequest): Request[DescribeDocumentVersionsResponse, AWSError] = js.native
  def describeDocumentVersions(
    params: DescribeDocumentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentVersionsResponse, Unit]
  ): Request[DescribeDocumentVersionsResponse, AWSError] = js.native
  
  /**
    * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
    */
  def describeFolderContents(): Request[DescribeFolderContentsResponse, AWSError] = js.native
  def describeFolderContents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderContentsResponse, Unit]): Request[DescribeFolderContentsResponse, AWSError] = js.native
  /**
    * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
    */
  def describeFolderContents(params: DescribeFolderContentsRequest): Request[DescribeFolderContentsResponse, AWSError] = js.native
  def describeFolderContents(
    params: DescribeFolderContentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderContentsResponse, Unit]
  ): Request[DescribeFolderContentsResponse, AWSError] = js.native
  
  /**
    * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
    */
  def describeGroups(): Request[DescribeGroupsResponse, AWSError] = js.native
  def describeGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupsResponse, Unit]): Request[DescribeGroupsResponse, AWSError] = js.native
  /**
    * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
    */
  def describeGroups(params: DescribeGroupsRequest): Request[DescribeGroupsResponse, AWSError] = js.native
  def describeGroups(
    params: DescribeGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupsResponse, Unit]
  ): Request[DescribeGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the specified notification subscriptions.
    */
  def describeNotificationSubscriptions(): Request[DescribeNotificationSubscriptionsResponse, AWSError] = js.native
  def describeNotificationSubscriptions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationSubscriptionsResponse, Unit]
  ): Request[DescribeNotificationSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists the specified notification subscriptions.
    */
  def describeNotificationSubscriptions(params: DescribeNotificationSubscriptionsRequest): Request[DescribeNotificationSubscriptionsResponse, AWSError] = js.native
  def describeNotificationSubscriptions(
    params: DescribeNotificationSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationSubscriptionsResponse, Unit]
  ): Request[DescribeNotificationSubscriptionsResponse, AWSError] = js.native
  
  /**
    * Describes the permissions of a specified resource.
    */
  def describeResourcePermissions(): Request[DescribeResourcePermissionsResponse, AWSError] = js.native
  def describeResourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePermissionsResponse, Unit]): Request[DescribeResourcePermissionsResponse, AWSError] = js.native
  /**
    * Describes the permissions of a specified resource.
    */
  def describeResourcePermissions(params: DescribeResourcePermissionsRequest): Request[DescribeResourcePermissionsResponse, AWSError] = js.native
  def describeResourcePermissions(
    params: DescribeResourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePermissionsResponse, Unit]
  ): Request[DescribeResourcePermissionsResponse, AWSError] = js.native
  
  /**
    * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def describeRootFolders(): Request[DescribeRootFoldersResponse, AWSError] = js.native
  def describeRootFolders(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRootFoldersResponse, Unit]): Request[DescribeRootFoldersResponse, AWSError] = js.native
  /**
    * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def describeRootFolders(params: DescribeRootFoldersRequest): Request[DescribeRootFoldersResponse, AWSError] = js.native
  def describeRootFolders(
    params: DescribeRootFoldersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRootFoldersResponse, Unit]
  ): Request[DescribeRootFoldersResponse, AWSError] = js.native
  
  /**
    * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
    */
  def describeUsers(): Request[DescribeUsersResponse, AWSError] = js.native
  def describeUsers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResponse, Unit]): Request[DescribeUsersResponse, AWSError] = js.native
  /**
    * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
    */
  def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResponse, AWSError] = js.native
  def describeUsers(
    params: DescribeUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResponse, Unit]
  ): Request[DescribeUsersResponse, AWSError] = js.native
  
  /**
    * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def getCurrentUser(): Request[GetCurrentUserResponse, AWSError] = js.native
  def getCurrentUser(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentUserResponse, Unit]): Request[GetCurrentUserResponse, AWSError] = js.native
  /**
    * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def getCurrentUser(params: GetCurrentUserRequest): Request[GetCurrentUserResponse, AWSError] = js.native
  def getCurrentUser(
    params: GetCurrentUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentUserResponse, Unit]
  ): Request[GetCurrentUserResponse, AWSError] = js.native
  
  /**
    * Retrieves details of a document.
    */
  def getDocument(): Request[GetDocumentResponse, AWSError] = js.native
  def getDocument(callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentResponse, Unit]): Request[GetDocumentResponse, AWSError] = js.native
  /**
    * Retrieves details of a document.
    */
  def getDocument(params: GetDocumentRequest): Request[GetDocumentResponse, AWSError] = js.native
  def getDocument(
    params: GetDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentResponse, Unit]
  ): Request[GetDocumentResponse, AWSError] = js.native
  
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
    */
  def getDocumentPath(): Request[GetDocumentPathResponse, AWSError] = js.native
  def getDocumentPath(callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentPathResponse, Unit]): Request[GetDocumentPathResponse, AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
    */
  def getDocumentPath(params: GetDocumentPathRequest): Request[GetDocumentPathResponse, AWSError] = js.native
  def getDocumentPath(
    params: GetDocumentPathRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentPathResponse, Unit]
  ): Request[GetDocumentPathResponse, AWSError] = js.native
  
  /**
    * Retrieves version metadata for the specified document.
    */
  def getDocumentVersion(): Request[GetDocumentVersionResponse, AWSError] = js.native
  def getDocumentVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentVersionResponse, Unit]): Request[GetDocumentVersionResponse, AWSError] = js.native
  /**
    * Retrieves version metadata for the specified document.
    */
  def getDocumentVersion(params: GetDocumentVersionRequest): Request[GetDocumentVersionResponse, AWSError] = js.native
  def getDocumentVersion(
    params: GetDocumentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDocumentVersionResponse, Unit]
  ): Request[GetDocumentVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves the metadata of the specified folder.
    */
  def getFolder(): Request[GetFolderResponse, AWSError] = js.native
  def getFolder(callback: js.Function2[/* err */ AWSError, /* data */ GetFolderResponse, Unit]): Request[GetFolderResponse, AWSError] = js.native
  /**
    * Retrieves the metadata of the specified folder.
    */
  def getFolder(params: GetFolderRequest): Request[GetFolderResponse, AWSError] = js.native
  def getFolder(
    params: GetFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFolderResponse, Unit]
  ): Request[GetFolderResponse, AWSError] = js.native
  
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
    */
  def getFolderPath(): Request[GetFolderPathResponse, AWSError] = js.native
  def getFolderPath(callback: js.Function2[/* err */ AWSError, /* data */ GetFolderPathResponse, Unit]): Request[GetFolderPathResponse, AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
    */
  def getFolderPath(params: GetFolderPathRequest): Request[GetFolderPathResponse, AWSError] = js.native
  def getFolderPath(
    params: GetFolderPathRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFolderPathResponse, Unit]
  ): Request[GetFolderPathResponse, AWSError] = js.native
  
  /**
    * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
    */
  def getResources(): Request[GetResourcesResponse, AWSError] = js.native
  def getResources(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesResponse, Unit]): Request[GetResourcesResponse, AWSError] = js.native
  /**
    * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
    */
  def getResources(params: GetResourcesRequest): Request[GetResourcesResponse, AWSError] = js.native
  def getResources(
    params: GetResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesResponse, Unit]
  ): Request[GetResourcesResponse, AWSError] = js.native
  
  /**
    * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
    */
  def initiateDocumentVersionUpload(): Request[InitiateDocumentVersionUploadResponse, AWSError] = js.native
  def initiateDocumentVersionUpload(callback: js.Function2[/* err */ AWSError, /* data */ InitiateDocumentVersionUploadResponse, Unit]): Request[InitiateDocumentVersionUploadResponse, AWSError] = js.native
  /**
    * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
    */
  def initiateDocumentVersionUpload(params: InitiateDocumentVersionUploadRequest): Request[InitiateDocumentVersionUploadResponse, AWSError] = js.native
  def initiateDocumentVersionUpload(
    params: InitiateDocumentVersionUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateDocumentVersionUploadResponse, Unit]
  ): Request[InitiateDocumentVersionUploadResponse, AWSError] = js.native
  
  /**
    * Removes all the permissions from the specified resource.
    */
  def removeAllResourcePermissions(): Request[js.Object, AWSError] = js.native
  def removeAllResourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes all the permissions from the specified resource.
    */
  def removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest): Request[js.Object, AWSError] = js.native
  def removeAllResourcePermissions(
    params: RemoveAllResourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the permission for the specified principal from the specified resource.
    */
  def removeResourcePermission(): Request[js.Object, AWSError] = js.native
  def removeResourcePermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the permission for the specified principal from the specified resource.
    */
  def removeResourcePermission(params: RemoveResourcePermissionRequest): Request[js.Object, AWSError] = js.native
  def removeResourcePermission(
    params: RemoveResourcePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
    */
  def updateDocument(): Request[js.Object, AWSError] = js.native
  def updateDocument(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
    */
  def updateDocument(params: UpdateDocumentRequest): Request[js.Object, AWSError] = js.native
  def updateDocument(
    params: UpdateDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
    */
  def updateDocumentVersion(): Request[js.Object, AWSError] = js.native
  def updateDocumentVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
    */
  def updateDocumentVersion(params: UpdateDocumentVersionRequest): Request[js.Object, AWSError] = js.native
  def updateDocumentVersion(
    params: UpdateDocumentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
    */
  def updateFolder(): Request[js.Object, AWSError] = js.native
  def updateFolder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
    */
  def updateFolder(params: UpdateFolderRequest): Request[js.Object, AWSError] = js.native
  def updateFolder(
    params: UpdateFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}
