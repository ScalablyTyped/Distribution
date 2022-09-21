package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositorySyncDefinition extends StObject {
  
  /**
    * The repository branch.
    */
  var branch: GitBranchName
  
  /**
    * The directory in the repository.
    */
  var directory: String
  
  /**
    * The resource that is synced from.
    */
  var parent: String
  
  /**
    * The resource that is synced to.
    */
  var target: String
}
object RepositorySyncDefinition {
  
  inline def apply(branch: GitBranchName, directory: String, parent: String, target: String): RepositorySyncDefinition = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositorySyncDefinition]
  }
  
  extension [Self <: RepositorySyncDefinition](x: Self) {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
