package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BranchInfo extends StObject {
  
  /**
    * The name of the branch.
    */
  var branchName: js.UndefOr[BranchName] = js.native
  
  /**
    * The ID of the last commit made to the branch.
    */
  var commitId: js.UndefOr[CommitId] = js.native
}
object BranchInfo {
  
  @scala.inline
  def apply(): BranchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BranchInfo]
  }
  
  @scala.inline
  implicit class BranchInfoMutableBuilder[Self <: BranchInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    @scala.inline
    def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
  }
}
