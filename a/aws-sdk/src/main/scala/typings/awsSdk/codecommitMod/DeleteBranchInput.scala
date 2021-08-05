package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBranchInput extends StObject {
  
  /**
    * The name of the branch to delete.
    */
  var branchName: BranchName
  
  /**
    * The name of the repository that contains the branch to be deleted.
    */
  var repositoryName: RepositoryName
}
object DeleteBranchInput {
  
  inline def apply(branchName: BranchName, repositoryName: RepositoryName): DeleteBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchInput]
  }
  
  extension [Self <: DeleteBranchInput](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
