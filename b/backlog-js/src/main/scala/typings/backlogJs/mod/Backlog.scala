package typings.backlogJs.mod

import typings.backlogJs.anon.AccessToken
import typings.backlogJs.mod.Entity.File.FileData
import typings.backlogJs.mod.Option.Group.GetGroupsParams
import typings.backlogJs.mod.Option.Group.PatchGroupParams
import typings.backlogJs.mod.Option.Group.PostGroupsParams
import typings.backlogJs.mod.Option.Issue.GetIssueCommentsParams
import typings.backlogJs.mod.Option.Issue.GetIssuesParams
import typings.backlogJs.mod.Option.Issue.IssueCommentNotifications
import typings.backlogJs.mod.Option.Issue.LinkIssueSharedFilesParams
import typings.backlogJs.mod.Option.Issue.PatchIssueCommentParams
import typings.backlogJs.mod.Option.Issue.PatchIssueParams
import typings.backlogJs.mod.Option.Issue.PostIssueCommentsParams
import typings.backlogJs.mod.Option.Issue.PostIssueParams
import typings.backlogJs.mod.Option.Notification.GetNotificationsCountParams
import typings.backlogJs.mod.Option.Notification.GetNotificationsParams
import typings.backlogJs.mod.Option.Project.DeleteIssueTypeParams
import typings.backlogJs.mod.Option.Project.DeleteProjectAdministrators
import typings.backlogJs.mod.Option.Project.DeleteProjectUsersParams
import typings.backlogJs.mod.Option.Project.GetProjectsParams
import typings.backlogJs.mod.Option.Project.GetSharedFilesParams
import typings.backlogJs.mod.Option.Project.PatchCategoriesParams
import typings.backlogJs.mod.Option.Project.PatchCustomFieldItemParams
import typings.backlogJs.mod.Option.Project.PatchCustomFieldParams
import typings.backlogJs.mod.Option.Project.PatchCustomFieldWithDateParams
import typings.backlogJs.mod.Option.Project.PatchCustomFieldWithListParams
import typings.backlogJs.mod.Option.Project.PatchCustomFieldWithNumericParams
import typings.backlogJs.mod.Option.Project.PatchIssueTypeParams
import typings.backlogJs.mod.Option.Project.PatchProjectParams
import typings.backlogJs.mod.Option.Project.PatchVersionsParams
import typings.backlogJs.mod.Option.Project.PatchWebhookParams
import typings.backlogJs.mod.Option.Project.PostCategoriesParams
import typings.backlogJs.mod.Option.Project.PostCustomFieldItemParams
import typings.backlogJs.mod.Option.Project.PostCustomFieldParams
import typings.backlogJs.mod.Option.Project.PostCustomFieldWithDateParams
import typings.backlogJs.mod.Option.Project.PostCustomFieldWithListParams
import typings.backlogJs.mod.Option.Project.PostCustomFieldWithNumericParams
import typings.backlogJs.mod.Option.Project.PostIssueTypeParams
import typings.backlogJs.mod.Option.Project.PostProjectAdministrators
import typings.backlogJs.mod.Option.Project.PostProjectParams
import typings.backlogJs.mod.Option.Project.PostStarParams
import typings.backlogJs.mod.Option.Project.PostVersionsParams
import typings.backlogJs.mod.Option.Project.PostWebhookParams
import typings.backlogJs.mod.Option.PullRequest.GetPullRequestCommentsParams
import typings.backlogJs.mod.Option.PullRequest.GetPullRequestsParams
import typings.backlogJs.mod.Option.PullRequest.PatchPullRequestCommentsParams
import typings.backlogJs.mod.Option.PullRequest.PatchPullRequestParams
import typings.backlogJs.mod.Option.PullRequest.PostPullRequestCommentsParams
import typings.backlogJs.mod.Option.PullRequest.PostPullRequestParams
import typings.backlogJs.mod.Option.Space.GetActivitiesParams
import typings.backlogJs.mod.Option.Space.PutSpaceNotificationParams
import typings.backlogJs.mod.Option.User.GetRecentlyViewedParams
import typings.backlogJs.mod.Option.User.GetUserActivitiesParams
import typings.backlogJs.mod.Option.User.GetUserStarsCountParams
import typings.backlogJs.mod.Option.User.GetUserStarsParams
import typings.backlogJs.mod.Option.User.PatchUserParams
import typings.backlogJs.mod.Option.User.PostUserParams
import typings.backlogJs.mod.Option.Wiki.GetWikisHistoryParams
import typings.backlogJs.mod.Option.Wiki.PatchWikiParams
import typings.backlogJs.mod.Option.Wiki.PostWikiParams
import typings.std.FormData
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backlog-js", "Backlog")
@js.native
class Backlog protected ()
  extends StObject
     with Request {
  def this(configure: AccessToken) = this()
  
  def deleteCategories(projectIdOrKey: String, id: Double): js.Promise[js.Any] = js.native
  
  def deleteCustomField(projectIdOrKey: String, id: Double): js.Promise[js.Any] = js.native
  
  def deleteCustomFieldItem(projectIdOrKey: String, id: Double, params: PostCustomFieldItemParams): js.Promise[js.Any] = js.native
  
  def deleteGroup(groupId: Double): js.Promise[js.Any] = js.native
  
  def deleteIssueAttachment(issueIdOrKey: String, attachmentId: String): js.Promise[js.Any] = js.native
  
  def deleteIssueType(projectIdOrKey: String, id: Double, params: DeleteIssueTypeParams): js.Promise[js.Any] = js.native
  
  def deleteIssuesCount(issueIdOrKey: String): js.Promise[js.Any] = js.native
  
  def deleteProject(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def deleteProjectAdministrators(projectIdOrKey: String, params: DeleteProjectAdministrators): js.Promise[js.Any] = js.native
  
  def deleteProjectUsers(projectIdOrKey: String, params: DeleteProjectUsersParams): js.Promise[js.Any] = js.native
  
  def deletePullRequestAttachment(projectIdOrKey: String, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[js.Any] = js.native
  
  def deleteUser(userId: Double): js.Promise[js.Any] = js.native
  
  def deleteVersions(projectIdOrKey: String, id: Double): js.Promise[js.Any] = js.native
  
  def deleteWebhook(projectIdOrKey: String, webhookId: String): js.Promise[js.Any] = js.native
  
  def deleteWiki(wikiId: Double, mailNotify: Boolean): js.Promise[js.Any] = js.native
  
  def deleteWikisAttachments(wikiId: Double, attachmentId: Double): js.Promise[js.Any] = js.native
  
  /* private */ def download(path: js.Any): js.Any = js.native
  
  def getCategories(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getCustomFields(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getGitRepositories(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getGitRepository(projectIdOrKey: String, repoIdOrName: String): js.Promise[js.Any] = js.native
  
  def getGroup(groupId: Double): js.Promise[js.Any] = js.native
  
  def getGroups(params: GetGroupsParams): js.Promise[js.Any] = js.native
  
  def getIssue(issueIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getIssueAttachment(issueIdOrKey: String, attachmentId: Double): js.Promise[FileData] = js.native
  
  def getIssueAttachments(issueIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getIssueComment(issueIdOrKey: String, commentId: Double): js.Promise[js.Any] = js.native
  
  def getIssueCommentNotifications(issueIdOrKey: String, commentId: Double): js.Promise[js.Any] = js.native
  
  def getIssueComments(issueIdOrKey: String, params: GetIssueCommentsParams): js.Promise[js.Any] = js.native
  
  def getIssueCommentsCount(issueIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getIssueSharedFiles(issueIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getIssueTypes(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getIssues(): js.Promise[js.Any] = js.native
  def getIssues(params: GetIssuesParams): js.Promise[js.Any] = js.native
  
  def getIssuesCount(): js.Promise[js.Any] = js.native
  def getIssuesCount(params: GetIssuesParams): js.Promise[js.Any] = js.native
  
  def getMyself(): js.Promise[js.Any] = js.native
  
  def getNotifications(params: GetNotificationsParams): js.Promise[js.Any] = js.native
  
  def getNotificationsCount(params: GetNotificationsCountParams): js.Promise[js.Any] = js.native
  
  def getPriorities(): js.Promise[js.Any] = js.native
  
  def getProject(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getProjectActivities(projectIdOrKey: String, params: GetActivitiesParams): js.Promise[js.Any] = js.native
  
  def getProjectAdministrators(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getProjectIcon(projectIdOrKey: String): js.Promise[FileData] = js.native
  
  def getProjectUsers(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getProjects(): js.Promise[js.Any] = js.native
  def getProjects(params: GetProjectsParams): js.Promise[js.Any] = js.native
  
  def getProjectsDiskUsage(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getPullRequest(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[js.Any] = js.native
  
  def getPullRequestAttachment(projectIdOrKey: String, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[FileData] = js.native
  
  def getPullRequestAttachments(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[js.Any] = js.native
  
  def getPullRequestComments(projectIdOrKey: String, repoIdOrName: String, number: Double, params: GetPullRequestCommentsParams): js.Promise[js.Any] = js.native
  
  def getPullRequestCommentsCount(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[js.Any] = js.native
  
  def getPullRequests(projectIdOrKey: String, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[js.Any] = js.native
  
  def getPullRequestsCount(projectIdOrKey: String, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[js.Any] = js.native
  
  def getRecentlyViewedIssues(params: GetRecentlyViewedParams): js.Promise[js.Any] = js.native
  
  def getRecentlyViewedProjects(params: GetRecentlyViewedParams): js.Promise[js.Any] = js.native
  
  def getRecentlyViewedWikis(params: GetRecentlyViewedParams): js.Promise[js.Any] = js.native
  
  def getResolutions(): js.Promise[js.Any] = js.native
  
  def getSharedFile(projectIdOrKey: String, sharedFileId: Double): js.Promise[FileData] = js.native
  
  def getSharedFiles(projectIdOrKey: String, path: String, params: GetSharedFilesParams): js.Promise[js.Any] = js.native
  
  def getSpace(): js.Promise[js.Any] = js.native
  
  def getSpaceActivities(params: GetActivitiesParams): js.Promise[js.Any] = js.native
  
  def getSpaceDiskUsage(): js.Promise[js.Any] = js.native
  
  def getSpaceIcon(): js.Promise[FileData] = js.native
  
  def getSpaceNotification(): js.Promise[js.Any] = js.native
  
  def getStatuses(): js.Promise[js.Any] = js.native
  
  def getUser(userId: Double): js.Promise[js.Any] = js.native
  
  def getUserActivities(userId: Double, params: GetUserActivitiesParams): js.Promise[js.Any] = js.native
  
  def getUserIcon(userId: Double): js.Promise[FileData] = js.native
  
  def getUserStars(userId: Double, params: GetUserStarsParams): js.Promise[js.Any] = js.native
  
  def getUserStarsCount(userId: Double, params: GetUserStarsCountParams): js.Promise[js.Any] = js.native
  
  def getUsers(): js.Promise[js.Any] = js.native
  
  def getVersions(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getWebhook(projectIdOrKey: String, webhookId: String): js.Promise[js.Any] = js.native
  
  def getWebhooks(projectIdOrKey: String): js.Promise[js.Any] = js.native
  
  def getWiki(wikiId: Double): js.Promise[js.Any] = js.native
  
  def getWikiAttachment(wikiId: Double, attachmentId: Double): js.Promise[FileData] = js.native
  
  def getWikis(projectIdOrKey: Double): js.Promise[js.Any] = js.native
  
  def getWikisAttachments(wikiId: Double): js.Promise[js.Any] = js.native
  
  def getWikisCount(projectIdOrKey: Double): js.Promise[js.Any] = js.native
  
  def getWikisHistory(wikiId: Double, params: GetWikisHistoryParams): js.Promise[js.Any] = js.native
  
  def getWikisSharedFiles(wikiId: Double): js.Promise[js.Any] = js.native
  
  def getWikisStars(wikiId: Double): js.Promise[js.Any] = js.native
  
  def getWikisTags(projectIdOrKey: Double): js.Promise[js.Any] = js.native
  
  def linkIssueSharedFiles(issueIdOrKey: String, params: LinkIssueSharedFilesParams): js.Promise[js.Any] = js.native
  
  def linkWikisSharedFiles(wikiId: Double, fileId: js.Array[Double]): js.Promise[js.Any] = js.native
  
  def markAsReadNotification(id: Double): js.Promise[js.Any] = js.native
  
  /* private */ def parseFileData(response: js.Any): js.Any = js.native
  
  def patchCategories(projectIdOrKey: String, id: Double, params: PatchCategoriesParams): js.Promise[js.Any] = js.native
  
  def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldParams): js.Promise[js.Any] = js.native
  def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithDateParams): js.Promise[js.Any] = js.native
  def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithListParams): js.Promise[js.Any] = js.native
  def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithNumericParams): js.Promise[js.Any] = js.native
  
  def patchCustomFieldItem(projectIdOrKey: String, id: Double, itemId: Double, params: PatchCustomFieldItemParams): js.Promise[js.Any] = js.native
  
  def patchGroup(groupId: Double, params: PatchGroupParams): js.Promise[js.Any] = js.native
  
  def patchIssue(issueIdOrKey: String, params: PatchIssueParams): js.Promise[js.Any] = js.native
  
  def patchIssueComment(issueIdOrKey: String, commentId: Double, params: PatchIssueCommentParams): js.Promise[js.Any] = js.native
  
  def patchIssueType(projectIdOrKey: String, id: Double, params: PatchIssueTypeParams): js.Promise[js.Any] = js.native
  
  def patchProject(projectIdOrKey: String, params: PatchProjectParams): js.Promise[js.Any] = js.native
  
  def patchPullRequest(projectIdOrKey: String, repoIdOrName: String, number: Double, params: PatchPullRequestParams): js.Promise[js.Any] = js.native
  
  def patchPullRequestComments(
    projectIdOrKey: String,
    repoIdOrName: String,
    number: Double,
    commentId: Double,
    params: PatchPullRequestCommentsParams
  ): js.Promise[js.Any] = js.native
  
  def patchUser(userId: Double, params: PatchUserParams): js.Promise[js.Any] = js.native
  
  def patchVersions(projectIdOrKey: String, id: Double, params: PatchVersionsParams): js.Promise[js.Any] = js.native
  
  def patchWebhook(projectIdOrKey: String, webhookId: String, params: PatchWebhookParams): js.Promise[js.Any] = js.native
  
  def patchWiki(wikiId: Double, params: PatchWikiParams): js.Promise[js.Any] = js.native
  
  def postCategories(projectIdOrKey: String, params: PostCategoriesParams): js.Promise[js.Any] = js.native
  
  def postCustomField(projectIdOrKey: String, params: PostCustomFieldParams): js.Promise[js.Any] = js.native
  def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithDateParams): js.Promise[js.Any] = js.native
  def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithListParams): js.Promise[js.Any] = js.native
  def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithNumericParams): js.Promise[js.Any] = js.native
  
  def postCustomFieldItem(projectIdOrKey: String, id: Double, params: PostCustomFieldItemParams): js.Promise[js.Any] = js.native
  
  def postGroups(params: PostGroupsParams): js.Promise[js.Any] = js.native
  
  def postIssue(params: PostIssueParams): js.Promise[js.Any] = js.native
  
  def postIssueCommentNotifications(issueIdOrKey: String, commentId: Double, prams: IssueCommentNotifications): js.Promise[js.Any] = js.native
  
  def postIssueComments(issueIdOrKey: String, params: PostIssueCommentsParams): js.Promise[js.Any] = js.native
  
  def postIssueType(projectIdOrKey: String, params: PostIssueTypeParams): js.Promise[js.Any] = js.native
  
  def postProject(params: PostProjectParams): js.Promise[js.Any] = js.native
  
  def postProjectAdministrators(projectIdOrKey: String, params: PostProjectAdministrators): js.Promise[js.Any] = js.native
  
  def postPullRequest(projectIdOrKey: String, repoIdOrName: String, params: PostPullRequestParams): js.Promise[js.Any] = js.native
  
  def postPullRequestComments(
    projectIdOrKey: String,
    repoIdOrName: String,
    number: Double,
    params: PostPullRequestCommentsParams
  ): js.Promise[js.Any] = js.native
  
  def postSpaceAttachment(form: FormData): js.Promise[Response] = js.native
  
  def postStar(params: PostStarParams): js.Promise[js.Any] = js.native
  
  def postUser(params: PostUserParams): js.Promise[js.Any] = js.native
  
  def postVersions(projectIdOrKey: String, params: PostVersionsParams): js.Promise[js.Any] = js.native
  
  def postWebhook(projectIdOrKey: String, params: PostWebhookParams): js.Promise[js.Any] = js.native
  
  def postWiki(params: PostWikiParams): js.Promise[js.Any] = js.native
  
  def postWikisAttachments(wikiId: Double, attachmentId: js.Array[Double]): js.Promise[js.Any] = js.native
  
  def putSpaceNotification(params: PutSpaceNotificationParams): js.Promise[js.Any] = js.native
  
  def resetNotificationsMarkAsRead(): js.Promise[js.Any] = js.native
  
  def unlinkIssueSharedFile(issueIdOrKey: String, id: Double): js.Promise[js.Any] = js.native
  
  def unlinkWikisSharedFiles(wikiId: Double, id: Double): js.Promise[js.Any] = js.native
  
  /* private */ def upload(path: js.Any, params: js.Any): js.Any = js.native
}
