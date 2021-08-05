package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRepositoryDescriptionInput extends StObject {
  
  /**
    * The new comment or description for the specified repository. Repository descriptions are limited to 1,000 characters.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The name of the repository to set or change the comment or description for.
    */
  var repositoryName: RepositoryName
}
object UpdateRepositoryDescriptionInput {
  
  inline def apply(repositoryName: RepositoryName): UpdateRepositoryDescriptionInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
  }
  
  extension [Self <: UpdateRepositoryDescriptionInput](x: Self) {
    
    inline def setRepositoryDescription(value: RepositoryDescription): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
    
    inline def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
