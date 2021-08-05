package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainEndpointOptionsRequest extends StObject {
  
  /**
    * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active configuration. Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DescribeDomainEndpointOptionsRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainEndpointOptionsRequest]
  }
  
  extension [Self <: DescribeDomainEndpointOptionsRequest](x: Self) {
    
    inline def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
