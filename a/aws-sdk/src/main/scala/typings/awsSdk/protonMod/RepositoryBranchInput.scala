package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryBranchInput extends StObject {
  
  /**
    * The repository branch.
    */
  var branch: GitBranchName
  
  /**
    * The repository name.
    */
  var name: RepositoryName
  
  /**
    * The repository provider.
    */
  var provider: RepositoryProvider
}
object RepositoryBranchInput {
  
  inline def apply(branch: GitBranchName, name: RepositoryName, provider: RepositoryProvider): RepositoryBranchInput = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryBranchInput]
  }
  
  extension [Self <: RepositoryBranchInput](x: Self) {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
