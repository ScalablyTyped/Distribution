package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositorySyncStatusInput extends StObject {
  
  /**
    * The repository branch.
    */
  var branch: GitBranchName
  
  /**
    * The repository name.
    */
  var repositoryName: RepositoryName
  
  /**
    * The repository provider.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * The repository sync type.
    */
  var syncType: SyncType
}
object GetRepositorySyncStatusInput {
  
  inline def apply(
    branch: GitBranchName,
    repositoryName: RepositoryName,
    repositoryProvider: RepositoryProvider,
    syncType: SyncType
  ): GetRepositorySyncStatusInput = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], syncType = syncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositorySyncStatusInput]
  }
  
  extension [Self <: GetRepositorySyncStatusInput](x: Self) {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setSyncType(value: SyncType): Self = StObject.set(x, "syncType", value.asInstanceOf[js.Any])
  }
}
