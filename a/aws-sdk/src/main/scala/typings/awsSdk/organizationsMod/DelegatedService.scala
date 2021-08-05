package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedService extends StObject {
  
  /**
    * The date that the account became a delegated administrator for this service. 
    */
  var DelegationEnabledDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of a service that can request an operation for the specified service. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.organizationsMod.ServicePrincipal] = js.undefined
}
object DelegatedService {
  
  inline def apply(): DelegatedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedService]
  }
  
  extension [Self <: DelegatedService](x: Self) {
    
    inline def setDelegationEnabledDate(value: Timestamp): Self = StObject.set(x, "DelegationEnabledDate", value.asInstanceOf[js.Any])
    
    inline def setDelegationEnabledDateUndefined: Self = StObject.set(x, "DelegationEnabledDate", js.undefined)
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
