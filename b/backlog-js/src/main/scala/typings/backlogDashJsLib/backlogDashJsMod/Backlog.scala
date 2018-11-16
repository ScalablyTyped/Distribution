package typings
package backlogDashJsLib.backlogDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Backlog")
@js.native
class Backlog protected () extends Request {
  def this(configure: backlogDashJsLib.Anon_ApiKey) = this()
  def deleteCategories(projectIdOrKey: java.lang.String, id: scala.Double): stdLib.Promise[_] = js.native
  def deleteCustomField(projectIdOrKey: java.lang.String, id: scala.Double): stdLib.Promise[_] = js.native
  def deleteCustomFieldItem(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldItemParams
  ): stdLib.Promise[_] = js.native
  def deleteGroup(groupId: scala.Double): stdLib.Promise[_] = js.native
  def deleteIssueAttachment(issueIdOrKey: java.lang.String, attachmentId: java.lang.String): stdLib.Promise[_] = js.native
  def deleteIssueType(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.DeleteIssueTypeParams
  ): stdLib.Promise[_] = js.native
  def deleteIssuesCount(issueIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def deleteProject(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def deleteProjectAdministrators(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.DeleteProjectAdministrators
  ): stdLib.Promise[_] = js.native
  def deleteProjectUsers(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.DeleteProjectUsersParams
  ): stdLib.Promise[_] = js.native
  def deletePullRequestAttachment(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    attachmentId: scala.Double
  ): stdLib.Promise[_] = js.native
  def deleteUser(userId: scala.Double): stdLib.Promise[_] = js.native
  def deleteVersions(projectIdOrKey: java.lang.String, id: scala.Double): stdLib.Promise[_] = js.native
  def deleteWebhook(projectIdOrKey: java.lang.String, webhookId: java.lang.String): stdLib.Promise[_] = js.native
  def deleteWiki(wikiId: scala.Double, mailNotify: scala.Boolean): stdLib.Promise[_] = js.native
  def deleteWikisAttachments(wikiId: scala.Double, attachmentId: scala.Double): stdLib.Promise[_] = js.native
  /* private */ def download(path: js.Any): js.Any = js.native
  def getCategories(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getCustomFields(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getGitRepositories(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getGitRepository(projectIdOrKey: java.lang.String, repoIdOrName: java.lang.String): stdLib.Promise[_] = js.native
  def getGroup(groupId: scala.Double): stdLib.Promise[_] = js.native
  def getGroups(params: backlogDashJsLib.backlogDashJsMod.OptionNs.GroupNs.GetGroupsParams): stdLib.Promise[_] = js.native
  def getIssue(issueIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getIssueAttachment(issueIdOrKey: java.lang.String, attachmentId: scala.Double): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getIssueAttachments(issueIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getIssueComment(issueIdOrKey: java.lang.String, commentId: scala.Double): stdLib.Promise[_] = js.native
  def getIssueCommentNotifications(issueIdOrKey: java.lang.String, commentId: scala.Double): stdLib.Promise[_] = js.native
  def getIssueComments(
    issueIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.GetIssueCommentsParams
  ): stdLib.Promise[_] = js.native
  def getIssueCommentsCount(issueIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getIssueSharedFiles(issueIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getIssueTypes(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getIssues(): stdLib.Promise[_] = js.native
  def getIssues(params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.GetIssuesParams): stdLib.Promise[_] = js.native
  def getIssuesCount(): stdLib.Promise[_] = js.native
  def getIssuesCount(params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.GetIssuesParams): stdLib.Promise[_] = js.native
  def getMyself(): stdLib.Promise[_] = js.native
  def getNotifications(params: backlogDashJsLib.backlogDashJsMod.OptionNs.NotificationNs.GetNotificationsParams): stdLib.Promise[_] = js.native
  def getNotificationsCount(params: backlogDashJsLib.backlogDashJsMod.OptionNs.NotificationNs.GetNotificationsCountParams): stdLib.Promise[_] = js.native
  def getPriorities(): stdLib.Promise[_] = js.native
  def getProject(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getProjectActivities(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.SpaceNs.GetActivitiesParams
  ): stdLib.Promise[_] = js.native
  def getProjectAdministrators(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getProjectIcon(projectIdOrKey: java.lang.String): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getProjectUsers(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getProjects(): stdLib.Promise[_] = js.native
  def getProjects(params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.GetProjectsParams): stdLib.Promise[_] = js.native
  def getProjectsDiskUsage(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getPullRequest(projectIdOrKey: java.lang.String, repoIdOrName: java.lang.String, number: scala.Double): stdLib.Promise[_] = js.native
  def getPullRequestAttachment(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    attachmentId: scala.Double
  ): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getPullRequestAttachments(projectIdOrKey: java.lang.String, repoIdOrName: java.lang.String, number: scala.Double): stdLib.Promise[_] = js.native
  def getPullRequestComments(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.GetPullRequestCommentsParams
  ): stdLib.Promise[_] = js.native
  def getPullRequestCommentsCount(projectIdOrKey: java.lang.String, repoIdOrName: java.lang.String, number: scala.Double): stdLib.Promise[_] = js.native
  def getPullRequests(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.GetPullRequestsParams
  ): stdLib.Promise[_] = js.native
  def getPullRequestsCount(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.GetPullRequestsParams
  ): stdLib.Promise[_] = js.native
  def getRecentlyViewedIssues(params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetRecentlyViewedParams): stdLib.Promise[_] = js.native
  def getRecentlyViewedProjects(params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetRecentlyViewedParams): stdLib.Promise[_] = js.native
  def getRecentlyViewedWikis(params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetRecentlyViewedParams): stdLib.Promise[_] = js.native
  def getResolutions(): stdLib.Promise[_] = js.native
  def getSharedFile(projectIdOrKey: java.lang.String, sharedFileId: scala.Double): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getSharedFiles(
    projectIdOrKey: java.lang.String,
    path: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.GetSharedFilesParams
  ): stdLib.Promise[_] = js.native
  def getSpace(): stdLib.Promise[_] = js.native
  def getSpaceActivities(params: backlogDashJsLib.backlogDashJsMod.OptionNs.SpaceNs.GetActivitiesParams): stdLib.Promise[_] = js.native
  def getSpaceDiskUsage(): stdLib.Promise[_] = js.native
  def getSpaceIcon(): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getSpaceNotification(): stdLib.Promise[_] = js.native
  def getStatuses(): stdLib.Promise[_] = js.native
  def getUser(userId: scala.Double): stdLib.Promise[_] = js.native
  def getUserActivities(
    userId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetUserActivitiesParams
  ): stdLib.Promise[_] = js.native
  def getUserIcon(userId: scala.Double): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getUserStars(userId: scala.Double, params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetUserStarsParams): stdLib.Promise[_] = js.native
  def getUserStarsCount(
    userId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.GetUserStarsCountParams
  ): stdLib.Promise[_] = js.native
  def getUsers(): stdLib.Promise[_] = js.native
  def getVersions(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getWebhook(projectIdOrKey: java.lang.String, webhookId: java.lang.String): stdLib.Promise[_] = js.native
  def getWebhooks(projectIdOrKey: java.lang.String): stdLib.Promise[_] = js.native
  def getWiki(wikiId: scala.Double): stdLib.Promise[_] = js.native
  def getWikiAttachment(wikiId: scala.Double, attachmentId: scala.Double): stdLib.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs.FileData] = js.native
  def getWikis(projectIdOrKey: scala.Double): stdLib.Promise[_] = js.native
  def getWikisAttachments(wikiId: scala.Double): stdLib.Promise[_] = js.native
  def getWikisCount(projectIdOrKey: scala.Double): stdLib.Promise[_] = js.native
  def getWikisHistory(
    wikiId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.WikiNs.GetWikisHistoryParams
  ): stdLib.Promise[_] = js.native
  def getWikisSharedFiles(wikiId: scala.Double): stdLib.Promise[_] = js.native
  def getWikisStars(wikiId: scala.Double): stdLib.Promise[_] = js.native
  def getWikisTags(projectIdOrKey: scala.Double): stdLib.Promise[_] = js.native
  def linkIssueSharedFiles(
    issueIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.LinkIssueSharedFilesParams
  ): stdLib.Promise[_] = js.native
  def linkWikisSharedFiles(wikiId: scala.Double, fileId: js.Array[scala.Double]): stdLib.Promise[_] = js.native
  def markAsReadNotification(id: scala.Double): stdLib.Promise[_] = js.native
  /* private */ def parseFileData(response: js.Any): js.Any = js.native
  def patchCategories(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCategoriesParams
  ): stdLib.Promise[_] = js.native
  def patchCustomField(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldParams
  ): stdLib.Promise[_] = js.native
  def patchCustomField(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldWithDateParams
  ): stdLib.Promise[_] = js.native
  def patchCustomField(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldWithListParams
  ): stdLib.Promise[_] = js.native
  def patchCustomField(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldWithNumericParams
  ): stdLib.Promise[_] = js.native
  def patchCustomFieldItem(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    itemId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchCustomFieldItemParams
  ): stdLib.Promise[_] = js.native
  def patchGroup(groupId: scala.Double, params: backlogDashJsLib.backlogDashJsMod.OptionNs.GroupNs.PatchGroupParams): stdLib.Promise[_] = js.native
  def patchIssue(
    issueIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.PatchIssueParams
  ): stdLib.Promise[_] = js.native
  def patchIssueComment(
    issueIdOrKey: java.lang.String,
    commentId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.PatchIssueCommentParams
  ): stdLib.Promise[_] = js.native
  def patchIssueType(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchIssueTypeParams
  ): stdLib.Promise[_] = js.native
  def patchProject(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchProjectParams
  ): stdLib.Promise[_] = js.native
  def patchPullRequest(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.PatchPullRequestParams
  ): stdLib.Promise[_] = js.native
  def patchPullRequestComments(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    commentId: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.PatchPullRequestCommentsParams
  ): stdLib.Promise[_] = js.native
  def patchUser(userId: scala.Double, params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.PatchUserParams): stdLib.Promise[_] = js.native
  def patchVersions(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchVersionsParams
  ): stdLib.Promise[_] = js.native
  def patchWebhook(
    projectIdOrKey: java.lang.String,
    webhookId: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PatchWebhookParams
  ): stdLib.Promise[_] = js.native
  def patchWiki(wikiId: scala.Double, params: backlogDashJsLib.backlogDashJsMod.OptionNs.WikiNs.PatchWikiParams): stdLib.Promise[_] = js.native
  def postCategories(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCategoriesParams
  ): stdLib.Promise[_] = js.native
  def postCustomField(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldParams
  ): stdLib.Promise[_] = js.native
  def postCustomField(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldWithDateParams
  ): stdLib.Promise[_] = js.native
  def postCustomField(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldWithListParams
  ): stdLib.Promise[_] = js.native
  def postCustomField(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldWithNumericParams
  ): stdLib.Promise[_] = js.native
  def postCustomFieldItem(
    projectIdOrKey: java.lang.String,
    id: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostCustomFieldItemParams
  ): stdLib.Promise[_] = js.native
  def postGroups(params: backlogDashJsLib.backlogDashJsMod.OptionNs.GroupNs.PostGroupsParams): stdLib.Promise[_] = js.native
  def postIssue(params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.PostIssueParams): stdLib.Promise[_] = js.native
  def postIssueCommentNotifications(
    issueIdOrKey: java.lang.String,
    commentId: scala.Double,
    prams: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.IssueCommentNotifications
  ): stdLib.Promise[_] = js.native
  def postIssueComments(
    issueIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.IssueNs.PostIssueCommentsParams
  ): stdLib.Promise[_] = js.native
  def postIssueType(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostIssueTypeParams
  ): stdLib.Promise[_] = js.native
  def postProject(params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostProjectParams): stdLib.Promise[_] = js.native
  def postProjectAdministrators(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostProjectAdministrators
  ): stdLib.Promise[_] = js.native
  def postPullRequest(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.PostPullRequestParams
  ): stdLib.Promise[_] = js.native
  def postPullRequestComments(
    projectIdOrKey: java.lang.String,
    repoIdOrName: java.lang.String,
    number: scala.Double,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.PullRequestNs.PostPullRequestCommentsParams
  ): stdLib.Promise[_] = js.native
  def postSpaceAttachment(form: stdLib.FormData): stdLib.Promise[stdLib.Response] = js.native
  def postStar(params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostStarParams): stdLib.Promise[_] = js.native
  def postUser(params: backlogDashJsLib.backlogDashJsMod.OptionNs.UserNs.PostUserParams): stdLib.Promise[_] = js.native
  def postVersions(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostVersionsParams
  ): stdLib.Promise[_] = js.native
  def postWebhook(
    projectIdOrKey: java.lang.String,
    params: backlogDashJsLib.backlogDashJsMod.OptionNs.ProjectNs.PostWebhookParams
  ): stdLib.Promise[_] = js.native
  def postWiki(params: backlogDashJsLib.backlogDashJsMod.OptionNs.WikiNs.PostWikiParams): stdLib.Promise[_] = js.native
  def postWikisAttachments(wikiId: scala.Double, attachmentId: js.Array[scala.Double]): stdLib.Promise[_] = js.native
  def putSpaceNotification(params: backlogDashJsLib.backlogDashJsMod.OptionNs.SpaceNs.PutSpaceNotificationParams): stdLib.Promise[_] = js.native
  def resetNotificationsMarkAsRead(): stdLib.Promise[_] = js.native
  def unlinkIssueSharedFile(issueIdOrKey: java.lang.String, id: scala.Double): stdLib.Promise[_] = js.native
  def unlinkWikisSharedFiles(wikiId: scala.Double, id: scala.Double): stdLib.Promise[_] = js.native
  /* private */ def upload(path: js.Any, params: js.Any): js.Any = js.native
}

