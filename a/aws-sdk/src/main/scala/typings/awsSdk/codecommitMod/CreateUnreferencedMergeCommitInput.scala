package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUnreferencedMergeCommitInput extends js.Object {
  
  /**
    * The name of the author who created the unreferenced commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.native
  
  /**
    * The commit message for the unreferenced commit.
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
    * The email address for the person who created the unreferenced commit.
    */
  var email: js.UndefOr[Email] = js.native
  
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  
  /**
    * The merge option or strategy you want to use to merge the code.
    */
  var mergeOption: MergeOptionTypeEnum = js.native
  
  /**
    * The name of the repository where you want to create the unreferenced merge commit.
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName = js.native
}
object CreateUnreferencedMergeCommitInput {
  
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    mergeOption: MergeOptionTypeEnum,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): CreateUnreferencedMergeCommitInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUnreferencedMergeCommitInput]
  }
  
  @scala.inline
  implicit class CreateUnreferencedMergeCommitInputOps[Self <: CreateUnreferencedMergeCommitInput] (val x: Self) extends AnyVal {
    
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
    def setMergeOption(value: MergeOptionTypeEnum): Self = this.set("mergeOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitSpecifier(value: CommitName): Self = this.set("sourceCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorName(value: Name): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    
    @scala.inline
    def setCommitMessage(value: Message): Self = this.set("commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitMessage: Self = this.set("commitMessage", js.undefined)
    
    @scala.inline
    def setConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = this.set("conflictDetailLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictDetailLevel: Self = this.set("conflictDetailLevel", js.undefined)
    
    @scala.inline
    def setConflictResolution(value: ConflictResolution): Self = this.set("conflictResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictResolution: Self = this.set("conflictResolution", js.undefined)
    
    @scala.inline
    def setConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = this.set("conflictResolutionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictResolutionStrategy: Self = this.set("conflictResolutionStrategy", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKeepEmptyFolders(value: KeepEmptyFolders): Self = this.set("keepEmptyFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepEmptyFolders: Self = this.set("keepEmptyFolders", js.undefined)
  }
}
