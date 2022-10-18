package typings.backlogJs

import typings.backlogJs.anon.AccessToken
import typings.backlogJs.distTypesEntityMod.File.FileData
import typings.backlogJs.distTypesOptionMod.Group.GetGroupsParams
import typings.backlogJs.distTypesOptionMod.Group.PatchGroupParams
import typings.backlogJs.distTypesOptionMod.Group.PostGroupsParams
import typings.backlogJs.distTypesOptionMod.Issue.GetIssueCommentsParams
import typings.backlogJs.distTypesOptionMod.Issue.GetIssuesParams
import typings.backlogJs.distTypesOptionMod.Issue.IssueCommentNotifications
import typings.backlogJs.distTypesOptionMod.Issue.LinkIssueSharedFilesParams
import typings.backlogJs.distTypesOptionMod.Issue.PatchIssueCommentParams
import typings.backlogJs.distTypesOptionMod.Issue.PatchIssueParams
import typings.backlogJs.distTypesOptionMod.Issue.PostIssueCommentsParams
import typings.backlogJs.distTypesOptionMod.Issue.PostIssueParams
import typings.backlogJs.distTypesOptionMod.Notification.GetNotificationsCountParams
import typings.backlogJs.distTypesOptionMod.Notification.GetNotificationsParams
import typings.backlogJs.distTypesOptionMod.Project.DeleteIssueTypeParams
import typings.backlogJs.distTypesOptionMod.Project.DeleteProjectAdministrators
import typings.backlogJs.distTypesOptionMod.Project.DeleteProjectUsersParams
import typings.backlogJs.distTypesOptionMod.Project.GetProjectsParams
import typings.backlogJs.distTypesOptionMod.Project.GetSharedFilesParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCategoriesParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCustomFieldItemParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCustomFieldParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCustomFieldWithDateParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCustomFieldWithListParams
import typings.backlogJs.distTypesOptionMod.Project.PatchCustomFieldWithNumericParams
import typings.backlogJs.distTypesOptionMod.Project.PatchIssueTypeParams
import typings.backlogJs.distTypesOptionMod.Project.PatchProjectParams
import typings.backlogJs.distTypesOptionMod.Project.PatchStatusParams
import typings.backlogJs.distTypesOptionMod.Project.PatchVersionsParams
import typings.backlogJs.distTypesOptionMod.Project.PatchWebhookParams
import typings.backlogJs.distTypesOptionMod.Project.PostCategoriesParams
import typings.backlogJs.distTypesOptionMod.Project.PostCustomFieldItemParams
import typings.backlogJs.distTypesOptionMod.Project.PostCustomFieldParams
import typings.backlogJs.distTypesOptionMod.Project.PostCustomFieldWithDateParams
import typings.backlogJs.distTypesOptionMod.Project.PostCustomFieldWithListParams
import typings.backlogJs.distTypesOptionMod.Project.PostCustomFieldWithNumericParams
import typings.backlogJs.distTypesOptionMod.Project.PostIssueTypeParams
import typings.backlogJs.distTypesOptionMod.Project.PostProjectAdministrators
import typings.backlogJs.distTypesOptionMod.Project.PostProjectParams
import typings.backlogJs.distTypesOptionMod.Project.PostStarParams
import typings.backlogJs.distTypesOptionMod.Project.PostStatusParams
import typings.backlogJs.distTypesOptionMod.Project.PostVersionsParams
import typings.backlogJs.distTypesOptionMod.Project.PostWebhookParams
import typings.backlogJs.distTypesOptionMod.PullRequest.GetPullRequestCommentsParams
import typings.backlogJs.distTypesOptionMod.PullRequest.GetPullRequestsParams
import typings.backlogJs.distTypesOptionMod.PullRequest.PatchPullRequestCommentsParams
import typings.backlogJs.distTypesOptionMod.PullRequest.PatchPullRequestParams
import typings.backlogJs.distTypesOptionMod.PullRequest.PostPullRequestCommentsParams
import typings.backlogJs.distTypesOptionMod.PullRequest.PostPullRequestParams
import typings.backlogJs.distTypesOptionMod.Space.GetActivitiesParams
import typings.backlogJs.distTypesOptionMod.Space.PutSpaceNotificationParams
import typings.backlogJs.distTypesOptionMod.Team.GetTeamsParams
import typings.backlogJs.distTypesOptionMod.Team.PatchTeamParams
import typings.backlogJs.distTypesOptionMod.User.GetRecentlyViewedParams
import typings.backlogJs.distTypesOptionMod.User.GetUserActivitiesParams
import typings.backlogJs.distTypesOptionMod.User.GetUserStarsCountParams
import typings.backlogJs.distTypesOptionMod.User.GetUserStarsParams
import typings.backlogJs.distTypesOptionMod.User.PatchUserParams
import typings.backlogJs.distTypesOptionMod.User.PostUserParams
import typings.backlogJs.distTypesOptionMod.Wiki.GetWikiParams
import typings.backlogJs.distTypesOptionMod.Wiki.GetWikisHistoryParams
import typings.backlogJs.distTypesOptionMod.Wiki.PatchWikiParams
import typings.backlogJs.distTypesOptionMod.Wiki.PostWikiParams
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBacklogMod {
  
  @JSImport("backlog-js/dist/types/backlog", JSImport.Default)
  @js.native
  open class default protected () extends Backlog {
    def this(configure: AccessToken) = this()
  }
  
  @js.native
  trait Backlog
    extends typings.backlogJs.distTypesRequestMod.default {
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-category/
      */
    def deleteCategories(projectIdOrKey: String, id: Double): js.Promise[Any] = js.native
    def deleteCategories(projectIdOrKey: Double, id: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-custom-field/
      */
    def deleteCustomField(projectIdOrKey: String, id: Double): js.Promise[Any] = js.native
    def deleteCustomField(projectIdOrKey: Double, id: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-list-item-for-list-type-custom-field/
      */
    def deleteCustomFieldItem(projectIdOrKey: String, id: Double, itemId: Double): js.Promise[Any] = js.native
    def deleteCustomFieldItem(projectIdOrKey: Double, id: Double, itemId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-group/
      * @deprecated
      */
    def deleteGroup(groupId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-issue-attachment/
      */
    def deleteIssueAttachment(issueIdOrKey: String, attachmentId: String): js.Promise[Any] = js.native
    def deleteIssueAttachment(issueIdOrKey: Double, attachmentId: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-comment/
      */
    def deleteIssueComment(issueIdOrKey: String, commentId: Double): js.Promise[Any] = js.native
    def deleteIssueComment(issueIdOrKey: Double, commentId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-issue-type/
      */
    def deleteIssueType(projectIdOrKey: String, id: Double, params: DeleteIssueTypeParams): js.Promise[Any] = js.native
    def deleteIssueType(projectIdOrKey: Double, id: Double, params: DeleteIssueTypeParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-issue/
      */
    def deleteIssuesCount(issueIdOrKey: String): js.Promise[Any] = js.native
    def deleteIssuesCount(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-project/
      */
    def deleteProject(projectIdOrKey: String): js.Promise[Any] = js.native
    def deleteProject(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-project-administrator/
      */
    def deleteProjectAdministrators(projectIdOrKey: String, params: DeleteProjectAdministrators): js.Promise[Any] = js.native
    def deleteProjectAdministrators(projectIdOrKey: Double, params: DeleteProjectAdministrators): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-project-group
      * @deprecated
      */
    def deleteProjectGroup(projectIdOrKey: String): js.Promise[Any] = js.native
    def deleteProjectGroup(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-status/
      */
    def deleteProjectStatus(projectIdOrKey: String, id: Double, substituteStatusId: Double): js.Promise[Any] = js.native
    def deleteProjectStatus(projectIdOrKey: Double, id: Double, substituteStatusId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-project-team/
      */
    def deleteProjectTeam(projectIdOrKey: String, teamId: Double): js.Promise[Any] = js.native
    def deleteProjectTeam(projectIdOrKey: Double, teamId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-project-user/
      */
    def deleteProjectUsers(projectIdOrKey: String, params: DeleteProjectUsersParams): js.Promise[Any] = js.native
    def deleteProjectUsers(projectIdOrKey: Double, params: DeleteProjectUsersParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-pull-request-attachments/
      */
    def deletePullRequestAttachment(projectIdOrKey: String, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[Any] = js.native
    def deletePullRequestAttachment(projectIdOrKey: Double, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-team/
      */
    def deleteTeam(teamId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-user/
      */
    def deleteUser(userId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-version/
      */
    def deleteVersions(projectIdOrKey: String, id: Double): js.Promise[Any] = js.native
    def deleteVersions(projectIdOrKey: Double, id: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-webhook/
      */
    def deleteWebhook(projectIdOrKey: String, webhookId: String): js.Promise[Any] = js.native
    def deleteWebhook(projectIdOrKey: Double, webhookId: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-wiki-page/
      */
    def deleteWiki(wikiId: Double, mailNotify: Boolean): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/remove-wiki-attachment/
      */
    def deleteWikisAttachments(wikiId: Double, attachmentId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/delete-watching
      */
    def deletehWatchingListItem(watchId: Double): js.Promise[Any] = js.native
    
    /* private */ var download: Any = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-category-list/
      */
    def getCategories(projectIdOrKey: String): js.Promise[Any] = js.native
    def getCategories(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-custom-field-list/
      */
    def getCustomFields(projectIdOrKey: String): js.Promise[Any] = js.native
    def getCustomFields(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-git-repositories/
      */
    def getGitRepositories(projectIdOrKey: String): js.Promise[Any] = js.native
    def getGitRepositories(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-git-repository/
      */
    def getGitRepository(projectIdOrKey: String, repoIdOrName: String): js.Promise[Any] = js.native
    def getGitRepository(projectIdOrKey: Double, repoIdOrName: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-group/
      * @deprecated
      */
    def getGroup(groupId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-group-icon
      * @deprecated
      */
    def getGroupIcon(groupId: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-groups/
      * @deprecated
      */
    def getGroups(params: GetGroupsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-issue/
      */
    def getIssue(issueIdOrKey: String): js.Promise[Any] = js.native
    def getIssue(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-issue-attachment/
      */
    def getIssueAttachment(issueIdOrKey: String, attachmentId: Double): js.Promise[FileData] = js.native
    def getIssueAttachment(issueIdOrKey: Double, attachmentId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-issue-attachments/
      */
    def getIssueAttachments(issueIdOrKey: String): js.Promise[Any] = js.native
    def getIssueAttachments(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-comment/
      */
    def getIssueComment(issueIdOrKey: String, commentId: Double): js.Promise[Any] = js.native
    def getIssueComment(issueIdOrKey: Double, commentId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-comment-notifications/
      */
    def getIssueCommentNotifications(issueIdOrKey: String, commentId: Double): js.Promise[Any] = js.native
    def getIssueCommentNotifications(issueIdOrKey: Double, commentId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-comment-list/
      */
    def getIssueComments(issueIdOrKey: String, params: GetIssueCommentsParams): js.Promise[Any] = js.native
    def getIssueComments(issueIdOrKey: Double, params: GetIssueCommentsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-comment/
      */
    def getIssueCommentsCount(issueIdOrKey: String): js.Promise[Any] = js.native
    def getIssueCommentsCount(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-issue-participant-list/
      */
    def getIssueParticipants(issueIdOrKey: String): js.Promise[Any] = js.native
    def getIssueParticipants(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-linked-shared-files/
      */
    def getIssueSharedFiles(issueIdOrKey: String): js.Promise[Any] = js.native
    def getIssueSharedFiles(issueIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-issue-type-list/
      */
    def getIssueTypes(projectIdOrKey: String): js.Promise[Any] = js.native
    def getIssueTypes(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-issue-list/
      */
    def getIssues(): js.Promise[Any] = js.native
    def getIssues(params: GetIssuesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-issue/
      */
    def getIssuesCount(): js.Promise[Any] = js.native
    def getIssuesCount(params: GetIssuesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-licence
      */
    def getLicence(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-own-user/
      */
    def getMyself(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-notification/
      */
    def getNotifications(params: GetNotificationsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-notification/
      */
    def getNotificationsCount(params: GetNotificationsCountParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-priority-list/
      */
    def getPriorities(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project/
      */
    def getProject(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProject(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-recent-updates/
      */
    def getProjectActivities(projectIdOrKey: String, params: GetActivitiesParams): js.Promise[Any] = js.native
    def getProjectActivities(projectIdOrKey: Double, params: GetActivitiesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-project-administrators/
      */
    def getProjectAdministrators(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectAdministrators(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-group-list
      * @deprecated
      */
    def getProjectGroupList(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectGroupList(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-icon/
      */
    def getProjectIcon(projectIdOrKey: String): js.Promise[FileData] = js.native
    def getProjectIcon(projectIdOrKey: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-status-list-of-project/
      */
    def getProjectStatuses(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectStatuses(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-team-list/
      */
    def getProjectTeams(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectTeams(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-user-list/
      */
    def getProjectUsers(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectUsers(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-list/
      */
    def getProjects(): js.Promise[Any] = js.native
    def getProjects(params: GetProjectsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-project-disk-usage/
      */
    def getProjectsDiskUsage(projectIdOrKey: String): js.Promise[Any] = js.native
    def getProjectsDiskUsage(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-pull-request/
      */
    def getPullRequest(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    def getPullRequest(projectIdOrKey: Double, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/download-pull-request-attachment/
      */
    def getPullRequestAttachment(projectIdOrKey: String, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[FileData] = js.native
    def getPullRequestAttachment(projectIdOrKey: Double, repoIdOrName: String, number: Double, attachmentId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-pull-request-attachment/
      */
    def getPullRequestAttachments(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    def getPullRequestAttachments(projectIdOrKey: Double, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-pull-request-comment/
      */
    def getPullRequestComments(projectIdOrKey: String, repoIdOrName: String, number: Double, params: GetPullRequestCommentsParams): js.Promise[Any] = js.native
    def getPullRequestComments(projectIdOrKey: Double, repoIdOrName: String, number: Double, params: GetPullRequestCommentsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-number-of-pull-request-comments/
      */
    def getPullRequestCommentsCount(projectIdOrKey: String, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    def getPullRequestCommentsCount(projectIdOrKey: Double, repoIdOrName: String, number: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-pull-request-list/
      */
    def getPullRequests(projectIdOrKey: String, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[Any] = js.native
    def getPullRequests(projectIdOrKey: Double, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-number-of-pull-requests/
      */
    def getPullRequestsCount(projectIdOrKey: String, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[Any] = js.native
    def getPullRequestsCount(projectIdOrKey: Double, repoIdOrName: String, params: GetPullRequestsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-rate-limit/
      */
    def getRateLimit(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-recently-viewed-issues/
      */
    def getRecentlyViewedIssues(params: GetRecentlyViewedParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-recently-viewed-projects/
      */
    def getRecentlyViewedProjects(params: GetRecentlyViewedParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-recently-viewed-wikis/
      */
    def getRecentlyViewedWikis(params: GetRecentlyViewedParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-resolution-list/
      */
    def getResolutions(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-file/
      */
    def getSharedFile(projectIdOrKey: String, sharedFileId: Double): js.Promise[FileData] = js.native
    def getSharedFile(projectIdOrKey: Double, sharedFileId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-shared-files/
      */
    def getSharedFiles(projectIdOrKey: String, path: String, params: GetSharedFilesParams): js.Promise[Any] = js.native
    def getSharedFiles(projectIdOrKey: Double, path: String, params: GetSharedFilesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-space/
      */
    def getSpace(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-recent-updates/
      */
    def getSpaceActivities(params: GetActivitiesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-space-disk-usage/
      */
    def getSpaceDiskUsage(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-space-logo/
      */
    def getSpaceIcon(): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-space-notification/
      */
    def getSpaceNotification(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-status-list/
      * @deprecated
      */
    def getStatuses(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-team/
      */
    def getTeam(teamId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-team-icon/
      */
    def getTeamIcon(teamId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-teams/
      */
    def getTeams(): js.Promise[Any] = js.native
    def getTeams(params: GetTeamsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-user/
      */
    def getUser(userId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-user-recent-updates/
      */
    def getUserActivities(userId: Double, params: GetUserActivitiesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-user-icon/
      */
    def getUserIcon(userId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-received-star-list/
      */
    def getUserStars(userId: Double, params: GetUserStarsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-user-received-stars/
      */
    def getUserStarsCount(userId: Double, params: GetUserStarsCountParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-user-list/
      */
    def getUsers(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-version-milestone-list/
      */
    def getVersions(projectIdOrKey: String): js.Promise[Any] = js.native
    def getVersions(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-watching
      */
    def getWatchingListCount(userId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-watching
      */
    def getWatchingListItem(watchId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-watching-list
      */
    def getWatchingListItems(userId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-webhook/
      */
    def getWebhook(projectIdOrKey: String, webhookId: String): js.Promise[Any] = js.native
    def getWebhook(projectIdOrKey: Double, webhookId: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-webhooks/
      */
    def getWebhooks(projectIdOrKey: String): js.Promise[Any] = js.native
    def getWebhooks(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page/
      */
    def getWiki(wikiId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page-attachment/
      */
    def getWikiAttachment(wikiId: Double, attachmentId: Double): js.Promise[FileData] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page-list/
      */
    def getWikis(params: GetWikiParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-wiki-attachments/
      */
    def getWikisAttachments(wikiId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/count-wiki-page/
      */
    def getWikisCount(projectIdOrKey: String): js.Promise[Any] = js.native
    def getWikisCount(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page-history/
      */
    def getWikisHistory(wikiId: Double, params: GetWikisHistoryParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-list-of-shared-files-on-wiki/
      */
    def getWikisSharedFiles(wikiId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page-star/
      */
    def getWikisStars(wikiId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/get-wiki-page-tag-list/
      */
    def getWikisTags(projectIdOrKey: String): js.Promise[Any] = js.native
    def getWikisTags(projectIdOrKey: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/link-shared-files-to-issue/
      */
    def linkIssueSharedFiles(issueIdOrKey: String, params: LinkIssueSharedFilesParams): js.Promise[Any] = js.native
    def linkIssueSharedFiles(issueIdOrKey: Double, params: LinkIssueSharedFilesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/link-shared-files-to-wiki/
      */
    def linkWikisSharedFiles(wikiId: Double, fileId: js.Array[Double]): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/read-notification/
      */
    def markAsReadNotification(id: Double): js.Promise[Any] = js.native
    
    /* private */ var parseFileData: Any = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-category/
      */
    def patchCategories(projectIdOrKey: String, id: Double, params: PatchCategoriesParams): js.Promise[Any] = js.native
    def patchCategories(projectIdOrKey: Double, id: Double, params: PatchCategoriesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-custom-field/
      */
    def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithDateParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithListParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: String, id: Double, params: PatchCustomFieldWithNumericParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: Double, id: Double, params: PatchCustomFieldParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: Double, id: Double, params: PatchCustomFieldWithDateParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: Double, id: Double, params: PatchCustomFieldWithListParams): js.Promise[Any] = js.native
    def patchCustomField(projectIdOrKey: Double, id: Double, params: PatchCustomFieldWithNumericParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-list-item-for-list-type-custom-field/
      */
    def patchCustomFieldItem(projectIdOrKey: String, id: Double, itemId: Double, params: PatchCustomFieldItemParams): js.Promise[Any] = js.native
    def patchCustomFieldItem(projectIdOrKey: Double, id: Double, itemId: Double, params: PatchCustomFieldItemParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-group/
      * @deprecated
      */
    def patchGroup(groupId: Double, params: PatchGroupParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-issue/
      */
    def patchIssue(issueIdOrKey: String, params: PatchIssueParams): js.Promise[Any] = js.native
    def patchIssue(issueIdOrKey: Double, params: PatchIssueParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-comment/
      */
    def patchIssueComment(issueIdOrKey: String, commentId: Double, params: PatchIssueCommentParams): js.Promise[Any] = js.native
    def patchIssueComment(issueIdOrKey: Double, commentId: Double, params: PatchIssueCommentParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-issue-type/
      */
    def patchIssueType(projectIdOrKey: String, id: Double, params: PatchIssueTypeParams): js.Promise[Any] = js.native
    def patchIssueType(projectIdOrKey: Double, id: Double, params: PatchIssueTypeParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-project/
      */
    def patchProject(projectIdOrKey: String, params: PatchProjectParams): js.Promise[Any] = js.native
    def patchProject(projectIdOrKey: Double, params: PatchProjectParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-status/
      */
    def patchProjectStatus(projectIdOrKey: String, id: Double, params: PatchStatusParams): js.Promise[Any] = js.native
    def patchProjectStatus(projectIdOrKey: Double, id: Double, params: PatchStatusParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-order-of-status/
      */
    def patchProjectStatusOrder(projectIdOrKey: String, statusId: js.Array[Double]): js.Promise[Any] = js.native
    def patchProjectStatusOrder(projectIdOrKey: Double, statusId: js.Array[Double]): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-pull-request/
      */
    def patchPullRequest(projectIdOrKey: String, repoIdOrName: String, number: Double, params: PatchPullRequestParams): js.Promise[Any] = js.native
    def patchPullRequest(projectIdOrKey: Double, repoIdOrName: String, number: Double, params: PatchPullRequestParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-pull-request-comment-information/
      */
    def patchPullRequestComments(
      projectIdOrKey: String,
      repoIdOrName: String,
      number: Double,
      commentId: Double,
      params: PatchPullRequestCommentsParams
    ): js.Promise[Any] = js.native
    def patchPullRequestComments(
      projectIdOrKey: Double,
      repoIdOrName: String,
      number: Double,
      commentId: Double,
      params: PatchPullRequestCommentsParams
    ): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-team/
      */
    def patchTeam(teamId: Double, params: PatchTeamParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-user/
      */
    def patchUser(userId: Double, params: PatchUserParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-version-milestone/
      */
    def patchVersions(projectIdOrKey: String, id: Double, params: PatchVersionsParams): js.Promise[Any] = js.native
    def patchVersions(projectIdOrKey: Double, id: Double, params: PatchVersionsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-watching
      */
    def patchWatchingListItem(watchId: Double, note: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-webhook/
      */
    def patchWebhook(projectIdOrKey: String, webhookId: String, params: PatchWebhookParams): js.Promise[Any] = js.native
    def patchWebhook(projectIdOrKey: Double, webhookId: String, params: PatchWebhookParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-wiki-page/
      */
    def patchWiki(wikiId: Double, params: PatchWikiParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-category/
      */
    def postCategories(projectIdOrKey: String, params: PostCategoriesParams): js.Promise[Any] = js.native
    def postCategories(projectIdOrKey: Double, params: PostCategoriesParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-custom-field/
      */
    def postCustomField(projectIdOrKey: String, params: PostCustomFieldParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithDateParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithListParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: String, params: PostCustomFieldWithNumericParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: Double, params: PostCustomFieldParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: Double, params: PostCustomFieldWithDateParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: Double, params: PostCustomFieldWithListParams): js.Promise[Any] = js.native
    def postCustomField(projectIdOrKey: Double, params: PostCustomFieldWithNumericParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-list-item-for-list-type-custom-field/
      */
    def postCustomFieldItem(projectIdOrKey: String, id: Double, params: PostCustomFieldItemParams): js.Promise[Any] = js.native
    def postCustomFieldItem(projectIdOrKey: Double, id: Double, params: PostCustomFieldItemParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-group/
      * @deprecated
      */
    def postGroups(params: PostGroupsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-issue/
      */
    def postIssue(params: PostIssueParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-comment-notification/
      */
    def postIssueCommentNotifications(issueIdOrKey: String, commentId: Double, prams: IssueCommentNotifications): js.Promise[Any] = js.native
    def postIssueCommentNotifications(issueIdOrKey: Double, commentId: Double, prams: IssueCommentNotifications): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-comment/
      */
    def postIssueComments(issueIdOrKey: String, params: PostIssueCommentsParams): js.Promise[Any] = js.native
    def postIssueComments(issueIdOrKey: Double, params: PostIssueCommentsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-issue-type/
      */
    def postIssueType(projectIdOrKey: String, params: PostIssueTypeParams): js.Promise[Any] = js.native
    def postIssueType(projectIdOrKey: Double, params: PostIssueTypeParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-project/
      */
    def postProject(params: PostProjectParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-project-administrator/
      */
    def postProjectAdministrators(projectIdOrKey: String, params: PostProjectAdministrators): js.Promise[Any] = js.native
    def postProjectAdministrators(projectIdOrKey: Double, params: PostProjectAdministrators): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-project-group
      * @deprecated
      */
    def postProjectGroup(projectIdOrKey: String, params: Any): js.Promise[Any] = js.native
    def postProjectGroup(projectIdOrKey: Double, params: Any): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-status/
      */
    def postProjectStatus(projectIdOrKey: String, params: PostStatusParams): js.Promise[Any] = js.native
    def postProjectStatus(projectIdOrKey: Double, params: PostStatusParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-project-team/
      */
    def postProjectTeam(projectIdOrKey: String, teamId: Double): js.Promise[Any] = js.native
    def postProjectTeam(projectIdOrKey: Double, teamId: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-project-user/
      */
    def postProjectUser(projectIdOrKey: String, userId: String): js.Promise[Any] = js.native
    def postProjectUser(projectIdOrKey: Double, userId: String): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-pull-request/
      */
    def postPullRequest(projectIdOrKey: String, repoIdOrName: String, params: PostPullRequestParams): js.Promise[Any] = js.native
    def postPullRequest(projectIdOrKey: Double, repoIdOrName: String, params: PostPullRequestParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-pull-request-comment/
      */
    def postPullRequestComments(
      projectIdOrKey: String,
      repoIdOrName: String,
      number: Double,
      params: PostPullRequestCommentsParams
    ): js.Promise[Any] = js.native
    def postPullRequestComments(
      projectIdOrKey: Double,
      repoIdOrName: String,
      number: Double,
      params: PostPullRequestCommentsParams
    ): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/post-attachment-file/
      */
    def postSpaceAttachment(form: FormData): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-star/
      */
    def postStar(params: PostStarParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-team/
      */
    def postTeam(members: js.Array[Double]): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-user/
      */
    def postUser(params: PostUserParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-version-milestone/
      */
    def postVersions(projectIdOrKey: String, params: PostVersionsParams): js.Promise[Any] = js.native
    def postVersions(projectIdOrKey: Double, params: PostVersionsParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-watching
      */
    def postWatchingListItem(params: Any): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-webhook/
      */
    def postWebhook(projectIdOrKey: String, params: PostWebhookParams): js.Promise[Any] = js.native
    def postWebhook(projectIdOrKey: Double, params: PostWebhookParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/add-wiki-page/
      */
    def postWiki(params: PostWikiParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/attach-file-to-wiki/
      */
    def postWikisAttachments(wikiId: Double, attachmentId: js.Array[Double]): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/update-space-notification/
      */
    def putSpaceNotification(params: PutSpaceNotificationParams): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/reset-unread-notification-count/
      */
    def resetNotificationsMarkAsRead(): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/mark-watching-as-read
      */
    def resetWatchingListItemAsRead(watchId: Double): js.Promise[Unit] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/remove-link-to-shared-file-from-issue/
      */
    def unlinkIssueSharedFile(issueIdOrKey: String, id: Double): js.Promise[Any] = js.native
    def unlinkIssueSharedFile(issueIdOrKey: Double, id: Double): js.Promise[Any] = js.native
    
    /**
      * https://developer.nulab.com/docs/backlog/api/2/remove-link-to-shared-file-from-wiki/
      */
    def unlinkWikisSharedFiles(wikiId: Double, id: Double): js.Promise[Any] = js.native
    
    /* private */ var upload: Any = js.native
  }
}
