package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusionProtectionGroupFilters extends StObject {
  
  /**
    * The aggregation setting of the protection groups that you want to retrieve. 
    */
  var Aggregations: js.UndefOr[ProtectionGroupAggregationFilters] = js.undefined
  
  /**
    * The pattern specification of the protection groups that you want to retrieve. 
    */
  var Patterns: js.UndefOr[ProtectionGroupPatternFilters] = js.undefined
  
  /**
    * The ID of the protection group that you want to retrieve. 
    */
  var ProtectionGroupIds: js.UndefOr[ProtectionGroupIdFilters] = js.undefined
  
  /**
    * The resource type configuration of the protection groups that you want to retrieve. In the protection group configuration, you specify the resource type when you set the group's Pattern to BY_RESOURCE_TYPE. 
    */
  var ResourceTypes: js.UndefOr[ProtectedResourceTypeFilters] = js.undefined
}
object InclusionProtectionGroupFilters {
  
  inline def apply(): InclusionProtectionGroupFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionProtectionGroupFilters]
  }
  
  extension [Self <: InclusionProtectionGroupFilters](x: Self) {
    
    inline def setAggregations(value: ProtectionGroupAggregationFilters): Self = StObject.set(x, "Aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "Aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: ProtectionGroupAggregation*): Self = StObject.set(x, "Aggregations", js.Array(value*))
    
    inline def setPatterns(value: ProtectionGroupPatternFilters): Self = StObject.set(x, "Patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "Patterns", js.undefined)
    
    inline def setPatternsVarargs(value: ProtectionGroupPattern*): Self = StObject.set(x, "Patterns", js.Array(value*))
    
    inline def setProtectionGroupIds(value: ProtectionGroupIdFilters): Self = StObject.set(x, "ProtectionGroupIds", value.asInstanceOf[js.Any])
    
    inline def setProtectionGroupIdsUndefined: Self = StObject.set(x, "ProtectionGroupIds", js.undefined)
    
    inline def setProtectionGroupIdsVarargs(value: ProtectionGroupId*): Self = StObject.set(x, "ProtectionGroupIds", js.Array(value*))
    
    inline def setResourceTypes(value: ProtectedResourceTypeFilters): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ProtectedResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
