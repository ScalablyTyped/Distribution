package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationPreferencesDetail extends StObject {
  
  /**
    * The status of the enhanced infrastructure metrics recommendation preference. A status of Active confirms that the preference is applied in the latest recommendation refresh, and a status of Inactive confirms that it's not yet applied to recommendations. For more information, see Enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined
  
  /**
    * The status of the inferred workload types recommendation preference. A status of Active confirms that the preference is applied in the latest recommendation refresh. A status of Inactive confirms that it's not yet applied to recommendations.
    */
  var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined
  
  /**
    * The target resource type of the recommendation preference to create. The Ec2Instance option encompasses standalone instances and instances that are part of Auto Scaling groups. The AutoScalingGroup option encompasses only instances that are part of an Auto Scaling group.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * An object that describes the scope of the recommendation preference. Recommendation preferences can be created at the organization level (for management accounts of an organization only), account level, and resource level. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var scope: js.UndefOr[Scope] = js.undefined
}
object RecommendationPreferencesDetail {
  
  inline def apply(): RecommendationPreferencesDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationPreferencesDetail]
  }
  
  extension [Self <: RecommendationPreferencesDetail](x: Self) {
    
    inline def setEnhancedInfrastructureMetrics(value: EnhancedInfrastructureMetrics): Self = StObject.set(x, "enhancedInfrastructureMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnhancedInfrastructureMetricsUndefined: Self = StObject.set(x, "enhancedInfrastructureMetrics", js.undefined)
    
    inline def setInferredWorkloadTypes(value: InferredWorkloadTypesPreference): Self = StObject.set(x, "inferredWorkloadTypes", value.asInstanceOf[js.Any])
    
    inline def setInferredWorkloadTypesUndefined: Self = StObject.set(x, "inferredWorkloadTypes", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
