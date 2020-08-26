package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMergeConflictsInput extends js.Object {
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.native
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName = js.native
  /**
    * The path of the target files used to describe the conflicts. 
    */
  var filePath: Path = js.native
  /**
    * The maximum number of merge hunks to include in the output.
    */
  var maxMergeHunks: js.UndefOr[MaxResults] = js.native
  /**
    * The merge option or strategy you want to use to merge the code.
    */
  var mergeOption: MergeOptionTypeEnum = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository where you want to get information about a merge conflict.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName = js.native
}

object DescribeMergeConflictsInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    filePath: Path,
    mergeOption: MergeOptionTypeEnum,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): DescribeMergeConflictsInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMergeConflictsInput]
  }
  @scala.inline
  implicit class DescribeMergeConflictsInputOps[Self <: DescribeMergeConflictsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationCommitSpecifier(value: CommitName): Self = this.set("destinationCommitSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeOption(value: MergeOptionTypeEnum): Self = this.set("mergeOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCommitSpecifier(value: CommitName): Self = this.set("sourceCommitSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = this.set("conflictDetailLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictDetailLevel: Self = this.set("conflictDetailLevel", js.undefined)
    @scala.inline
    def setConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = this.set("conflictResolutionStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictResolutionStrategy: Self = this.set("conflictResolutionStrategy", js.undefined)
    @scala.inline
    def setMaxMergeHunks(value: MaxResults): Self = this.set("maxMergeHunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMergeHunks: Self = this.set("maxMergeHunks", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

