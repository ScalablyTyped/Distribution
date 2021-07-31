package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryResult extends StObject {
  
  /**
    *  Information about the deleted repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object DeleteRepositoryResult {
  
  @scala.inline
  def apply(): DeleteRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryResult]
  }
  
  @scala.inline
  implicit class DeleteRepositoryResultMutableBuilder[Self <: DeleteRepositoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
