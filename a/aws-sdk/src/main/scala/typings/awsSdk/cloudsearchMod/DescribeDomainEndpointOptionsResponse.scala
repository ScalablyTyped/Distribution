package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainEndpointOptionsResponse extends StObject {
  
  /**
    * The status and configuration of a search domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
}
object DescribeDomainEndpointOptionsResponse {
  
  inline def apply(): DescribeDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
  }
  
  extension [Self <: DescribeDomainEndpointOptionsResponse](x: Self) {
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
  }
}
