package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AdditionalData = java.lang.String

type ApprovalList = js.Array[typings.awsSdk.codecommitMod.Approval]

type ApprovalRuleContent = java.lang.String

type ApprovalRuleId = java.lang.String

type ApprovalRuleName = java.lang.String

type ApprovalRuleTemplateContent = java.lang.String

type ApprovalRuleTemplateDescription = java.lang.String

type ApprovalRuleTemplateId = java.lang.String

type ApprovalRuleTemplateName = java.lang.String

type ApprovalRuleTemplateNameList = js.Array[typings.awsSdk.codecommitMod.ApprovalRuleTemplateName]

type ApprovalRulesList = js.Array[typings.awsSdk.codecommitMod.ApprovalRule]

type ApprovalRulesNotSatisfiedList = js.Array[typings.awsSdk.codecommitMod.ApprovalRuleName]

type ApprovalRulesSatisfiedList = js.Array[typings.awsSdk.codecommitMod.ApprovalRuleName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVE
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type ApprovalState = typings.awsSdk.codecommitMod._ApprovalState | java.lang.String

type Approved = scala.Boolean

type Arn = java.lang.String

type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.Array[
typings.awsSdk.codecommitMod.BatchAssociateApprovalRuleTemplateWithRepositoriesError]

type BatchDescribeMergeConflictsErrors = js.Array[typings.awsSdk.codecommitMod.BatchDescribeMergeConflictsError]

type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.Array[
typings.awsSdk.codecommitMod.BatchDisassociateApprovalRuleTemplateFromRepositoriesError]

type BatchGetCommitsErrorsList = js.Array[typings.awsSdk.codecommitMod.BatchGetCommitsError]

type BranchName = java.lang.String

type BranchNameList = js.Array[typings.awsSdk.codecommitMod.BranchName]

type CallerReactions = js.Array[typings.awsSdk.codecommitMod.ReactionValue]

type CapitalBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.A
  - typings.awsSdk.awsSdkStrings.M
  - typings.awsSdk.awsSdkStrings.D
  - java.lang.String
*/
type ChangeTypeEnum = typings.awsSdk.codecommitMod._ChangeTypeEnum | java.lang.String

type ClientRequestToken = java.lang.String

type CloneUrlHttp = java.lang.String

type CloneUrlSsh = java.lang.String

type CommentId = java.lang.String

type Comments = js.Array[typings.awsSdk.codecommitMod.Comment]

type CommentsForComparedCommitData = js.Array[typings.awsSdk.codecommitMod.CommentsForComparedCommit]

type CommentsForPullRequestData = js.Array[typings.awsSdk.codecommitMod.CommentsForPullRequest]

type CommitId = java.lang.String

type CommitIdsInputList = js.Array[typings.awsSdk.codecommitMod.ObjectId]

type CommitName = java.lang.String

type CommitObjectsList = js.Array[typings.awsSdk.codecommitMod.Commit]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE_LEVEL
  - typings.awsSdk.awsSdkStrings.LINE_LEVEL
  - java.lang.String
*/
type ConflictDetailLevelTypeEnum = typings.awsSdk.codecommitMod._ConflictDetailLevelTypeEnum | java.lang.String

type ConflictMetadataList = js.Array[typings.awsSdk.codecommitMod.ConflictMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ACCEPT_SOURCE
  - typings.awsSdk.awsSdkStrings.ACCEPT_DESTINATION
  - typings.awsSdk.awsSdkStrings.AUTOMERGE
  - java.lang.String
*/
type ConflictResolutionStrategyTypeEnum = typings.awsSdk.codecommitMod._ConflictResolutionStrategyTypeEnum | java.lang.String

type Conflicts = js.Array[typings.awsSdk.codecommitMod.Conflict]

type Content = java.lang.String

type Count = scala.Double

type CreationDate = typings.std.Date

type Date = java.lang.String

type DeleteFileEntries = js.Array[typings.awsSdk.codecommitMod.DeleteFileEntry]

type Description = java.lang.String

type DifferenceList = js.Array[typings.awsSdk.codecommitMod.Difference]

type Email = java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type EventDate = typings.std.Date

type ExceptionName = java.lang.String

type FileContent = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codecommitMod.Blob_ | java.lang.String

type FileList = js.Array[typings.awsSdk.codecommitMod.File]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXECUTABLE
  - typings.awsSdk.awsSdkStrings.NORMAL
  - typings.awsSdk.awsSdkStrings.SYMLINK
  - java.lang.String
*/
type FileModeTypeEnum = typings.awsSdk.codecommitMod._FileModeTypeEnum | java.lang.String

type FilePaths = js.Array[typings.awsSdk.codecommitMod.Path]

type FileSize = scala.Double

type FilesMetadata = js.Array[typings.awsSdk.codecommitMod.FileMetadata]

type FolderList = js.Array[typings.awsSdk.codecommitMod.Folder]

type HunkContent = java.lang.String

type IsCommentDeleted = scala.Boolean

type IsContentConflict = scala.Boolean

type IsFileModeConflict = scala.Boolean

type IsHunkConflict = scala.Boolean

type IsMergeable = scala.Boolean

type IsMerged = scala.Boolean

type IsMove = scala.Boolean

type IsObjectTypeConflict = scala.Boolean

type KeepEmptyFolders = scala.Boolean

type LastModifiedDate = typings.std.Date

type Limit = scala.Double

type LineNumber = scala.Double

type MaxResults = scala.Double

type MergeHunks = js.Array[typings.awsSdk.codecommitMod.MergeHunk]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAST_FORWARD_MERGE
  - typings.awsSdk.awsSdkStrings.SQUASH_MERGE
  - typings.awsSdk.awsSdkStrings.THREE_WAY_MERGE
  - java.lang.String
*/
type MergeOptionTypeEnum = typings.awsSdk.codecommitMod._MergeOptionTypeEnum | java.lang.String

type MergeOptions = js.Array[typings.awsSdk.codecommitMod.MergeOptionTypeEnum]

type Message = java.lang.String

type Mode = java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

type NumberOfConflicts = scala.Double

type ObjectId = java.lang.String

type ObjectSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE
  - typings.awsSdk.awsSdkStrings.DIRECTORY
  - typings.awsSdk.awsSdkStrings.GIT_LINK
  - typings.awsSdk.awsSdkStrings.SYMBOLIC_LINK
  - java.lang.String
*/
type ObjectTypeEnum = typings.awsSdk.codecommitMod._ObjectTypeEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ascending__
  - typings.awsSdk.awsSdkStrings.descending__
  - java.lang.String
*/
type OrderEnum = typings.awsSdk.codecommitMod._OrderEnum | java.lang.String

type Overridden = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERRIDE
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type OverrideStatus = typings.awsSdk.codecommitMod._OverrideStatus | java.lang.String

type ParentList = js.Array[typings.awsSdk.codecommitMod.ObjectId]

type Path = java.lang.String

type Position = scala.Double

type PullRequestEventList = js.Array[typings.awsSdk.codecommitMod.PullRequestEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_CREATED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_STATUS_CHANGED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_MERGE_STATE_CHANGED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_CREATED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_UPDATED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_DELETED
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN
  - typings.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_STATE_CHANGED
  - java.lang.String
*/
type PullRequestEventType = typings.awsSdk.codecommitMod._PullRequestEventType | java.lang.String

type PullRequestId = java.lang.String

type PullRequestIdList = js.Array[typings.awsSdk.codecommitMod.PullRequestId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type PullRequestStatusEnum = typings.awsSdk.codecommitMod._PullRequestStatusEnum | java.lang.String

type PullRequestTargetList = js.Array[typings.awsSdk.codecommitMod.PullRequestTarget]

type PutFileEntries = js.Array[typings.awsSdk.codecommitMod.PutFileEntry]

type ReactionCountsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codecommitMod.Count]

type ReactionEmoji = java.lang.String

type ReactionShortCode = java.lang.String

type ReactionUnicode = java.lang.String

type ReactionUsersList = js.Array[typings.awsSdk.codecommitMod.Arn]

type ReactionValue = java.lang.String

type ReactionsForCommentList = js.Array[typings.awsSdk.codecommitMod.ReactionForComment]

type ReferenceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BEFORE
  - typings.awsSdk.awsSdkStrings.AFTER
  - java.lang.String
*/
type RelativeFileVersionEnum = typings.awsSdk.codecommitMod._RelativeFileVersionEnum | java.lang.String

type ReplaceContentEntries = js.Array[typings.awsSdk.codecommitMod.ReplaceContentEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEEP_BASE
  - typings.awsSdk.awsSdkStrings.KEEP_SOURCE
  - typings.awsSdk.awsSdkStrings.KEEP_DESTINATION
  - typings.awsSdk.awsSdkStrings.USE_NEW_CONTENT
  - java.lang.String
*/
type ReplacementTypeEnum = typings.awsSdk.codecommitMod._ReplacementTypeEnum | java.lang.String

type RepositoryDescription = java.lang.String

type RepositoryId = java.lang.String

type RepositoryMetadataList = js.Array[typings.awsSdk.codecommitMod.RepositoryMetadata]

type RepositoryName = java.lang.String

type RepositoryNameIdPairList = js.Array[typings.awsSdk.codecommitMod.RepositoryNameIdPair]

type RepositoryNameList = js.Array[typings.awsSdk.codecommitMod.RepositoryName]

type RepositoryNotFoundList = js.Array[typings.awsSdk.codecommitMod.RepositoryName]

type RepositoryTriggerCustomData = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.all__
  - typings.awsSdk.awsSdkStrings.updateReference
  - typings.awsSdk.awsSdkStrings.createReference
  - typings.awsSdk.awsSdkStrings.deleteReference
  - java.lang.String
*/
type RepositoryTriggerEventEnum = typings.awsSdk.codecommitMod._RepositoryTriggerEventEnum | java.lang.String

type RepositoryTriggerEventList = js.Array[typings.awsSdk.codecommitMod.RepositoryTriggerEventEnum]

type RepositoryTriggerExecutionFailureList = js.Array[typings.awsSdk.codecommitMod.RepositoryTriggerExecutionFailure]

type RepositoryTriggerExecutionFailureMessage = java.lang.String

type RepositoryTriggerName = java.lang.String

type RepositoryTriggerNameList = js.Array[typings.awsSdk.codecommitMod.RepositoryTriggerName]

type RepositoryTriggersConfigurationId = java.lang.String

type RepositoryTriggersList = js.Array[typings.awsSdk.codecommitMod.RepositoryTrigger]

type ResourceArn = java.lang.String

type RevisionId = java.lang.String

type RuleContentSha256 = java.lang.String

type SetFileModeEntries = js.Array[typings.awsSdk.codecommitMod.SetFileModeEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.repositoryName
  - typings.awsSdk.awsSdkStrings.lastModifiedDate_
  - java.lang.String
*/
type SortByEnum = typings.awsSdk.codecommitMod._SortByEnum | java.lang.String

type SubModuleList = js.Array[typings.awsSdk.codecommitMod.SubModule]

type SymbolicLinkList = js.Array[typings.awsSdk.codecommitMod.SymbolicLink]

type TagKey = java.lang.String

type TagKeysList = js.Array[typings.awsSdk.codecommitMod.TagKey]

type TagValue = java.lang.String

type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codecommitMod.TagValue]

type TargetList = js.Array[typings.awsSdk.codecommitMod.Target]

type Title = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-04-13`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.codecommitMod._apiVersion | java.lang.String

type blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codecommitMod.Blob_ | java.lang.String
