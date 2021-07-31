package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDefaultBranchInput extends StObject {
  
  /**
    * The name of the branch to set as the default.
    */
  var defaultBranchName: BranchName
  
  /**
    * The name of the repository to set or change the default branch for.
    */
  var repositoryName: RepositoryName
}
object UpdateDefaultBranchInput {
  
  @scala.inline
  def apply(defaultBranchName: BranchName, repositoryName: RepositoryName): UpdateDefaultBranchInput = {
    val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDefaultBranchInput]
  }
  
  @scala.inline
  implicit class UpdateDefaultBranchInputMutableBuilder[Self <: UpdateDefaultBranchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBranchName(value: BranchName): Self = StObject.set(x, "defaultBranchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
