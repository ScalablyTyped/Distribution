package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateExternalConnectionResult extends StObject {
  
  /**
    *  Information about the connected repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object AssociateExternalConnectionResult {
  
  @scala.inline
  def apply(): AssociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateExternalConnectionResult]
  }
  
  @scala.inline
  implicit class AssociateExternalConnectionResultMutableBuilder[Self <: AssociateExternalConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
