package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBranchInput extends StObject {
  
  /**
    * The name of the branch to delete.
    */
  var branchName: BranchName = js.native
  
  /**
    * The name of the repository that contains the branch to be deleted.
    */
  var repositoryName: RepositoryName = js.native
}
object DeleteBranchInput {
  
  @scala.inline
  def apply(branchName: BranchName, repositoryName: RepositoryName): DeleteBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchInput]
  }
  
  @scala.inline
  implicit class DeleteBranchInputMutableBuilder[Self <: DeleteBranchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
