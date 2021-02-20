package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainEndpointOptionsResponse extends StObject {
  
  /**
    * The status and configuration of a search domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}
object DescribeDomainEndpointOptionsResponse {
  
  @scala.inline
  def apply(): DescribeDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainEndpointOptionsResponseMutableBuilder[Self <: DescribeDomainEndpointOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
  }
}
