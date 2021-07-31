package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryResult extends StObject {
  
  /**
    *  Information about the created repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object CreateRepositoryResult {
  
  @scala.inline
  def apply(): CreateRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryResult]
  }
  
  @scala.inline
  implicit class CreateRepositoryResultMutableBuilder[Self <: CreateRepositoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
