package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommendationPreferencesRequest extends StObject {
  
  /**
    * The name of the recommendation preference to delete. Enhanced infrastructure metrics (EnhancedInfrastructureMetrics) is the only feature that can be activated through preferences. Therefore, it is also the only recommendation preference that can be deleted.
    */
  var recommendationPreferenceNames: RecommendationPreferenceNames
  
  /**
    * The target resource type of the recommendation preference to delete. The Ec2Instance option encompasses standalone instances and instances that are part of Auto Scaling groups. The AutoScalingGroup option encompasses only instances that are part of an Auto Scaling group.  The valid values for this parameter are Ec2Instance and AutoScalingGroup. 
    */
  var resourceType: ResourceType
  
  /**
    * An object that describes the scope of the recommendation preference to delete. You can delete recommendation preferences that are created at the organization level (for management accounts of an organization only), account level, and resource level. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var scope: js.UndefOr[Scope] = js.undefined
}
object DeleteRecommendationPreferencesRequest {
  
  inline def apply(recommendationPreferenceNames: RecommendationPreferenceNames, resourceType: ResourceType): DeleteRecommendationPreferencesRequest = {
    val __obj = js.Dynamic.literal(recommendationPreferenceNames = recommendationPreferenceNames.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommendationPreferencesRequest]
  }
  
  extension [Self <: DeleteRecommendationPreferencesRequest](x: Self) {
    
    inline def setRecommendationPreferenceNames(value: RecommendationPreferenceNames): Self = StObject.set(x, "recommendationPreferenceNames", value.asInstanceOf[js.Any])
    
    inline def setRecommendationPreferenceNamesVarargs(value: RecommendationPreferenceName*): Self = StObject.set(x, "recommendationPreferenceNames", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
