package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryResponse extends StObject {
  
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object DeleteRepositoryResponse {
  
  @scala.inline
  def apply(): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
  
  @scala.inline
  implicit class DeleteRepositoryResponseMutableBuilder[Self <: DeleteRepositoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
