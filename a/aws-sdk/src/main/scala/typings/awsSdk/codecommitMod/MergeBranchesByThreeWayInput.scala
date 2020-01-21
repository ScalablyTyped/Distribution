package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeBranchesByThreeWayInput extends js.Object {
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.native
  /**
    * The commit message to include in the commit information for the merge.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.native
  /**
    * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  var conflictResolution: js.UndefOr[ConflictResolution] = js.native
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName = js.native
  /**
    * The email address of the person merging the branches. This information is used in the commit information for the merge.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  /**
    * The name of the repository where you want to merge two branches.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName = js.native
  /**
    * The branch where the merge is applied. 
    */
  var targetBranch: js.UndefOr[BranchName] = js.native
}

object MergeBranchesByThreeWayInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName,
    authorName: Name = null,
    commitMessage: Message = null,
    conflictDetailLevel: ConflictDetailLevelTypeEnum = null,
    conflictResolution: ConflictResolution = null,
    conflictResolutionStrategy: ConflictResolutionStrategyTypeEnum = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[Boolean] = js.undefined,
    targetBranch: BranchName = null
  ): MergeBranchesByThreeWayInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage.asInstanceOf[js.Any])
    if (conflictDetailLevel != null) __obj.updateDynamic("conflictDetailLevel")(conflictDetailLevel.asInstanceOf[js.Any])
    if (conflictResolution != null) __obj.updateDynamic("conflictResolution")(conflictResolution.asInstanceOf[js.Any])
    if (conflictResolutionStrategy != null) __obj.updateDynamic("conflictResolutionStrategy")(conflictResolutionStrategy.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders.asInstanceOf[js.Any])
    if (targetBranch != null) __obj.updateDynamic("targetBranch")(targetBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeBranchesByThreeWayInput]
  }
}

