package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadDiscoveryConfig extends StObject {
  
  /**
    * Discovery integration status in respect to Trusted Advisor for the workload.
    */
  var TrustedAdvisorIntegrationStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.TrustedAdvisorIntegrationStatus] = js.undefined
  
  /**
    * The mode to use for identifying resources associated with the workload. You can specify WORKLOAD_METADATA, APP_REGISTRY, or both.
    */
  var WorkloadResourceDefinition: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadResourceDefinition] = js.undefined
}
object WorkloadDiscoveryConfig {
  
  inline def apply(): WorkloadDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadDiscoveryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkloadDiscoveryConfig] (val x: Self) extends AnyVal {
    
    inline def setTrustedAdvisorIntegrationStatus(value: TrustedAdvisorIntegrationStatus): Self = StObject.set(x, "TrustedAdvisorIntegrationStatus", value.asInstanceOf[js.Any])
    
    inline def setTrustedAdvisorIntegrationStatusUndefined: Self = StObject.set(x, "TrustedAdvisorIntegrationStatus", js.undefined)
    
    inline def setWorkloadResourceDefinition(value: WorkloadResourceDefinition): Self = StObject.set(x, "WorkloadResourceDefinition", value.asInstanceOf[js.Any])
    
    inline def setWorkloadResourceDefinitionUndefined: Self = StObject.set(x, "WorkloadResourceDefinition", js.undefined)
    
    inline def setWorkloadResourceDefinitionVarargs(value: DefinitionType*): Self = StObject.set(x, "WorkloadResourceDefinition", js.Array(value*))
  }
}
