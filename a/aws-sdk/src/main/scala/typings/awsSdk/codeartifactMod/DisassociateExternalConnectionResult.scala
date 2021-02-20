package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateExternalConnectionResult extends StObject {
  
  /**
    *  The repository associated with the removed external connection. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}
object DisassociateExternalConnectionResult {
  
  @scala.inline
  def apply(): DisassociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateExternalConnectionResult]
  }
  
  @scala.inline
  implicit class DisassociateExternalConnectionResultMutableBuilder[Self <: DisassociateExternalConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
