package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryResponse extends StObject {
  
  /**
    * The repository that was created.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object CreateRepositoryResponse {
  
  @scala.inline
  def apply(): CreateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryResponse]
  }
  
  @scala.inline
  implicit class CreateRepositoryResponseMutableBuilder[Self <: CreateRepositoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
