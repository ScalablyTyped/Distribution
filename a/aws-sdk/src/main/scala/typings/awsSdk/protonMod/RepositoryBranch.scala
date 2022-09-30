package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryBranch extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the linked repository.
    */
  var arn: RepositoryArn
  
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
object RepositoryBranch {
  
  inline def apply(arn: RepositoryArn, branch: GitBranchName, name: RepositoryName, provider: RepositoryProvider): RepositoryBranch = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryBranch]
  }
  
  extension [Self <: RepositoryBranch](x: Self) {
    
    inline def setArn(value: RepositoryArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
