package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepositoryResult extends StObject {
  
  /**
    *  The updated repository. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}
object UpdateRepositoryResult {
  
  @scala.inline
  def apply(): UpdateRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRepositoryResult]
  }
  
  @scala.inline
  implicit class UpdateRepositoryResultMutableBuilder[Self <: UpdateRepositoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
