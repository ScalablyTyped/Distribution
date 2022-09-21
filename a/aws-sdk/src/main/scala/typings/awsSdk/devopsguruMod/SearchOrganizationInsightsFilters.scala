package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOrganizationInsightsFilters extends StObject {
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.devopsguruMod.ResourceCollection] = js.undefined
  
  var ServiceCollection: js.UndefOr[typings.awsSdk.devopsguruMod.ServiceCollection] = js.undefined
  
  /**
    *  An array of severity values used to search for insights. 
    */
  var Severities: js.UndefOr[InsightSeverities] = js.undefined
  
  /**
    *  An array of status values used to search for insights. 
    */
  var Statuses: js.UndefOr[InsightStatuses] = js.undefined
}
object SearchOrganizationInsightsFilters {
  
  inline def apply(): SearchOrganizationInsightsFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOrganizationInsightsFilters]
  }
  
  extension [Self <: SearchOrganizationInsightsFilters](x: Self) {
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setServiceCollection(value: ServiceCollection): Self = StObject.set(x, "ServiceCollection", value.asInstanceOf[js.Any])
    
    inline def setServiceCollectionUndefined: Self = StObject.set(x, "ServiceCollection", js.undefined)
    
    inline def setSeverities(value: InsightSeverities): Self = StObject.set(x, "Severities", value.asInstanceOf[js.Any])
    
    inline def setSeveritiesUndefined: Self = StObject.set(x, "Severities", js.undefined)
    
    inline def setSeveritiesVarargs(value: InsightSeverity*): Self = StObject.set(x, "Severities", js.Array(value*))
    
    inline def setStatuses(value: InsightStatuses): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    inline def setStatusesVarargs(value: InsightStatus*): Self = StObject.set(x, "Statuses", js.Array(value*))
  }
}
