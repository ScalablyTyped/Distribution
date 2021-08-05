package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBranchInput extends StObject {
  
  /**
    * The name of the branch for which you want to retrieve information.
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The name of the repository that contains the branch for which you want to retrieve information.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object GetBranchInput {
  
  inline def apply(): GetBranchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBranchInput]
  }
  
  extension [Self <: GetBranchInput](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
