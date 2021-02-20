package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainEndpointOptionsResponse extends StObject {
  
  /**
    * The newly-configured domain endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}
object UpdateDomainEndpointOptionsResponse {
  
  @scala.inline
  def apply(): UpdateDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainEndpointOptionsResponse]
  }
  
  @scala.inline
  implicit class UpdateDomainEndpointOptionsResponseMutableBuilder[Self <: UpdateDomainEndpointOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
  }
}
