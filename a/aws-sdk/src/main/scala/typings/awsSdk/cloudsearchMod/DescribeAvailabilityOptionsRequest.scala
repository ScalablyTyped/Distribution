package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityOptionsRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DescribeAvailabilityOptionsRequest {
  
  inline def apply(DomainName: DomainName): DescribeAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityOptionsRequest]
  }
  
  extension [Self <: DescribeAvailabilityOptionsRequest](x: Self) {
    
    inline def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
