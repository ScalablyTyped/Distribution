package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBranchOutput extends StObject {
  
  /**
    * Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.
    */
  var deletedBranch: js.UndefOr[BranchInfo] = js.native
}
object DeleteBranchOutput {
  
  @scala.inline
  def apply(): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBranchOutput]
  }
  
  @scala.inline
  implicit class DeleteBranchOutputMutableBuilder[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedBranch(value: BranchInfo): Self = StObject.set(x, "deletedBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedBranchUndefined: Self = StObject.set(x, "deletedBranch", js.undefined)
  }
}
