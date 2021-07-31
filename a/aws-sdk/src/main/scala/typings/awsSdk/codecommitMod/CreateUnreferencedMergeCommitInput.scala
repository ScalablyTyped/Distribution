package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUnreferencedMergeCommitInput extends StObject {
  
  /**
    * The name of the author who created the unreferenced commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The commit message for the unreferenced commit.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined
  
  /**
    * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  var conflictResolution: js.UndefOr[ConflictResolution] = js.undefined
  
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName
  
  /**
    * The email address for the person who created the unreferenced commit.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  
  /**
    * The merge option or strategy you want to use to merge the code.
    */
  var mergeOption: MergeOptionTypeEnum
  
  /**
    * The name of the repository where you want to create the unreferenced merge commit.
    */
  var repositoryName: RepositoryName
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName
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
  implicit class CreateUnreferencedMergeCommitInputMutableBuilder[Self <: CreateUnreferencedMergeCommitInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorName(value: Name): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setCommitMessage(value: Message): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    @scala.inline
    def setConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = StObject.set(x, "conflictDetailLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictDetailLevelUndefined: Self = StObject.set(x, "conflictDetailLevel", js.undefined)
    
    @scala.inline
    def setConflictResolution(value: ConflictResolution): Self = StObject.set(x, "conflictResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = StObject.set(x, "conflictResolutionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictResolutionStrategyUndefined: Self = StObject.set(x, "conflictResolutionStrategy", js.undefined)
    
    @scala.inline
    def setConflictResolutionUndefined: Self = StObject.set(x, "conflictResolution", js.undefined)
    
    @scala.inline
    def setDestinationCommitSpecifier(value: CommitName): Self = StObject.set(x, "destinationCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKeepEmptyFolders(value: KeepEmptyFolders): Self = StObject.set(x, "keepEmptyFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEmptyFoldersUndefined: Self = StObject.set(x, "keepEmptyFolders", js.undefined)
    
    @scala.inline
    def setMergeOption(value: MergeOptionTypeEnum): Self = StObject.set(x, "mergeOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitSpecifier(value: CommitName): Self = StObject.set(x, "sourceCommitSpecifier", value.asInstanceOf[js.Any])
  }
}
