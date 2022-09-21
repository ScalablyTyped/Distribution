package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AdditionalData = String

type ApprovalList = js.Array[Approval]

type ApprovalRuleContent = String

type ApprovalRuleId = String

type ApprovalRuleName = String

type ApprovalRuleTemplateContent = String

type ApprovalRuleTemplateDescription = String

type ApprovalRuleTemplateId = String

type ApprovalRuleTemplateName = String

type ApprovalRuleTemplateNameList = js.Array[ApprovalRuleTemplateName]

type ApprovalRulesList = js.Array[ApprovalRule]

type ApprovalRulesNotSatisfiedList = js.Array[ApprovalRuleName]

type ApprovalRulesSatisfiedList = js.Array[ApprovalRuleName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVE
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type ApprovalState = _ApprovalState | String

type Approved = Boolean

type Arn = String

type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.Array[BatchAssociateApprovalRuleTemplateWithRepositoriesError]

type BatchDescribeMergeConflictsErrors = js.Array[BatchDescribeMergeConflictsError]

type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.Array[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]

type BatchGetCommitsErrorsList = js.Array[BatchGetCommitsError]

type BranchName = String

type BranchNameList = js.Array[BranchName]

type CallerReactions = js.Array[ReactionValue]

type CapitalBoolean = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.A
  - typings.awsSdk.awsSdkStrings.M
  - typings.awsSdk.awsSdkStrings.D
  - java.lang.String
*/
type ChangeTypeEnum = _ChangeTypeEnum | String

type ClientRequestToken = String

type CloneUrlHttp = String

type CloneUrlSsh = String

type CommentId = String

type Comments = js.Array[Comment]

type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]

type CommentsForPullRequestData = js.Array[CommentsForPullRequest]

type CommitId = String

type CommitIdsInputList = js.Array[ObjectId]

type CommitName = String

type CommitObjectsList = js.Array[Commit]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE_LEVEL
  - typings.awsSdk.awsSdkStrings.LINE_LEVEL
  - java.lang.String
*/
type ConflictDetailLevelTypeEnum = _ConflictDetailLevelTypeEnum | String

type ConflictMetadataList = js.Array[ConflictMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ACCEPT_SOURCE
  - typings.awsSdk.awsSdkStrings.ACCEPT_DESTINATION
  - typings.awsSdk.awsSdkStrings.AUTOMERGE
  - java.lang.String
*/
type ConflictResolutionStrategyTypeEnum = _ConflictResolutionStrategyTypeEnum | String

type Conflicts = js.Array[Conflict]

type Content = String

type Count = Double

type CreationDate = js.Date

type Date = String

type DeleteFileEntries = js.Array[DeleteFileEntry]

type Description = String

type DifferenceList = js.Array[Difference]

type Email = String

type ErrorCode = String

type ErrorMessage = String

type EventDate = js.Date

type ExceptionName = String

type FileContent = Buffer | js.typedarray.Uint8Array | Blob_ | String

type FileList = js.Array[File]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXECUTABLE
  - typings.awsSdk.awsSdkStrings.NORMAL
  - typings.awsSdk.awsSdkStrings.SYMLINK
  - java.lang.String
*/
type FileModeTypeEnum = _FileModeTypeEnum | String

type FilePaths = js.Array[Path]

type FileSize = Double

type FilesMetadata = js.Array[FileMetadata]

type FolderList = js.Array[Folder]

type HunkContent = String

type IsCommentDeleted = Boolean

type IsContentConflict = Boolean

type IsFileModeConflict = Boolean

type IsHunkConflict = Boolean

type IsMergeable = Boolean

type IsMerged = Boolean

type IsMove = Boolean

type IsObjectTypeConflict = Boolean

type KeepEmptyFolders = Boolean

type LastModifiedDate = js.Date

type Limit = Double

type LineNumber = Double

type MaxResults = Double

type MergeHunks = js.Array[MergeHunk]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAST_FORWARD_MERGE
  - typings.awsSdk.awsSdkStrings.SQUASH_MERGE
  - typings.awsSdk.awsSdkStrings.THREE_WAY_MERGE
  - java.lang.String
*/
type MergeOptionTypeEnum = _MergeOptionTypeEnum | String

type MergeOptions = js.Array[MergeOptionTypeEnum]

type Message = String

type Mode = String

type Name = String

type NextToken = String

type NumberOfConflicts = Double

type ObjectId = String

type ObjectSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE
  - typings.awsSdk.awsSdkStrings.DIRECTORY
  - typings.awsSdk.awsSdkStrings.GIT_LINK
  - typings.awsSdk.awsSdkStrings.SYMBOLIC_LINK
  - java.lang.String
*/
type ObjectTypeEnum = _ObjectTypeEnum | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ascending__
  - typings.awsSdk.awsSdkStrings.descending__
  - java.lang.String
*/
type OrderEnum = _OrderEnum | String

type Overridden = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERRIDE
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type OverrideStatus = _OverrideStatus | String

type ParentList = js.Array[ObjectId]

type Path = String

type Position = Double

type PullRequestEventList = js.Array[PullRequestEvent]

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
type PullRequestEventType = _PullRequestEventType | String

type PullRequestId = String

type PullRequestIdList = js.Array[PullRequestId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type PullRequestStatusEnum = _PullRequestStatusEnum | String

type PullRequestTargetList = js.Array[PullRequestTarget]

type PutFileEntries = js.Array[PutFileEntry]

type ReactionCountsMap = StringDictionary[Count]

type ReactionEmoji = String

type ReactionShortCode = String

type ReactionUnicode = String

type ReactionUsersList = js.Array[Arn]

type ReactionValue = String

type ReactionsForCommentList = js.Array[ReactionForComment]

type ReferenceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BEFORE
  - typings.awsSdk.awsSdkStrings.AFTER
  - java.lang.String
*/
type RelativeFileVersionEnum = _RelativeFileVersionEnum | String

type ReplaceContentEntries = js.Array[ReplaceContentEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEEP_BASE
  - typings.awsSdk.awsSdkStrings.KEEP_SOURCE
  - typings.awsSdk.awsSdkStrings.KEEP_DESTINATION
  - typings.awsSdk.awsSdkStrings.USE_NEW_CONTENT
  - java.lang.String
*/
type ReplacementTypeEnum = _ReplacementTypeEnum | String

type RepositoryDescription = String

type RepositoryId = String

type RepositoryMetadataList = js.Array[RepositoryMetadata]

type RepositoryName = String

type RepositoryNameIdPairList = js.Array[RepositoryNameIdPair]

type RepositoryNameList = js.Array[RepositoryName]

type RepositoryNotFoundList = js.Array[RepositoryName]

type RepositoryTriggerCustomData = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.all__
  - typings.awsSdk.awsSdkStrings.updateReference
  - typings.awsSdk.awsSdkStrings.createReference
  - typings.awsSdk.awsSdkStrings.deleteReference
  - java.lang.String
*/
type RepositoryTriggerEventEnum = _RepositoryTriggerEventEnum | String

type RepositoryTriggerEventList = js.Array[RepositoryTriggerEventEnum]

type RepositoryTriggerExecutionFailureList = js.Array[RepositoryTriggerExecutionFailure]

type RepositoryTriggerExecutionFailureMessage = String

type RepositoryTriggerName = String

type RepositoryTriggerNameList = js.Array[RepositoryTriggerName]

type RepositoryTriggersConfigurationId = String

type RepositoryTriggersList = js.Array[RepositoryTrigger]

type ResourceArn = String

type RevisionId = String

type RuleContentSha256 = String

type SetFileModeEntries = js.Array[SetFileModeEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.repositoryName
  - typings.awsSdk.awsSdkStrings.lastModifiedDate_
  - java.lang.String
*/
type SortByEnum = _SortByEnum | String

type SubModuleList = js.Array[SubModule]

type SymbolicLinkList = js.Array[SymbolicLink]

type TagKey = String

type TagKeysList = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

type TargetList = js.Array[Target]

type Title = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-04-13`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type blob = Buffer | js.typedarray.Uint8Array | Blob_ | String
