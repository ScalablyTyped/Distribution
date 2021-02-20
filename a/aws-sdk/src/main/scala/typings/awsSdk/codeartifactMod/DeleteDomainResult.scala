package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainResult extends StObject {
  
  /**
    *  Contains information about the deleted domain after processing the request. 
    */
  var domain: js.UndefOr[DomainDescription] = js.native
}
object DeleteDomainResult {
  
  @scala.inline
  def apply(): DeleteDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainResult]
  }
  
  @scala.inline
  implicit class DeleteDomainResultMutableBuilder[Self <: DeleteDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainDescription): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
