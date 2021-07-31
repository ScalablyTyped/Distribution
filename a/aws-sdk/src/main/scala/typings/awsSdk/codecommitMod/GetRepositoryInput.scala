package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryInput extends StObject {
  
  /**
    * The name of the repository to get information about.
    */
  var repositoryName: RepositoryName
}
object GetRepositoryInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): GetRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryInput]
  }
  
  @scala.inline
  implicit class GetRepositoryInputMutableBuilder[Self <: GetRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
