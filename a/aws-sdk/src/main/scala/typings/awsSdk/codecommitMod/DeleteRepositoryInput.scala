package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRepositoryInput extends StObject {
  
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName = js.native
}
object DeleteRepositoryInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): DeleteRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryInput]
  }
  
  @scala.inline
  implicit class DeleteRepositoryInputMutableBuilder[Self <: DeleteRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
