package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryTriggersInput extends StObject {
  
  /**
    * The name of the repository for which the trigger is configured.
    */
  var repositoryName: RepositoryName
}
object GetRepositoryTriggersInput {
  
  inline def apply(repositoryName: RepositoryName): GetRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryTriggersInput]
  }
  
  extension [Self <: GetRepositoryTriggersInput](x: Self) {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
