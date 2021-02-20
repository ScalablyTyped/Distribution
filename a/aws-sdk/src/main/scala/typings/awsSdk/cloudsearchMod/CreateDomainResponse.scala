package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainResponse extends StObject {
  
  var DomainStatus: js.UndefOr[typings.awsSdk.cloudsearchMod.DomainStatus] = js.native
}
object CreateDomainResponse {
  
  @scala.inline
  def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  @scala.inline
  implicit class CreateDomainResponseMutableBuilder[Self <: CreateDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
