package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeBranchesByFastForwardInput extends StObject {
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName
  
  /**
    * The name of the repository where you want to merge two branches.
    */
  var repositoryName: RepositoryName
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName
  
  /**
    * The branch where the merge is applied.
    */
  var targetBranch: js.UndefOr[BranchName] = js.undefined
}
object MergeBranchesByFastForwardInput {
  
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): MergeBranchesByFastForwardInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeBranchesByFastForwardInput]
  }
  
  @scala.inline
  implicit class MergeBranchesByFastForwardInputMutableBuilder[Self <: MergeBranchesByFastForwardInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCommitSpecifier(value: CommitName): Self = StObject.set(x, "destinationCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitSpecifier(value: CommitName): Self = StObject.set(x, "sourceCommitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBranch(value: BranchName): Self = StObject.set(x, "targetBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBranchUndefined: Self = StObject.set(x, "targetBranch", js.undefined)
  }
}
