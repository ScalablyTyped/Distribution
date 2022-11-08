package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadDiscoveryConfig extends StObject {
  
  /**
    * Discovery integration status in respect to Trusted Advisor for the workload.
    */
  var TrustedAdvisorIntegrationStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.TrustedAdvisorIntegrationStatus] = js.undefined
}
object WorkloadDiscoveryConfig {
  
  inline def apply(): WorkloadDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadDiscoveryConfig]
  }
  
  extension [Self <: WorkloadDiscoveryConfig](x: Self) {
    
    inline def setTrustedAdvisorIntegrationStatus(value: TrustedAdvisorIntegrationStatus): Self = StObject.set(x, "TrustedAdvisorIntegrationStatus", value.asInstanceOf[js.Any])
    
    inline def setTrustedAdvisorIntegrationStatusUndefined: Self = StObject.set(x, "TrustedAdvisorIntegrationStatus", js.undefined)
  }
}
