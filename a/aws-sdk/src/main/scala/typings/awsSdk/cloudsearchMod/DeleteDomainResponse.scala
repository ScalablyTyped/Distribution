package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainResponse extends StObject {
  
  var DomainStatus: js.UndefOr[typings.awsSdk.cloudsearchMod.DomainStatus] = js.native
}
object DeleteDomainResponse {
  
  @scala.inline
  def apply(): DeleteDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainResponse]
  }
  
  @scala.inline
  implicit class DeleteDomainResponseMutableBuilder[Self <: DeleteDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
