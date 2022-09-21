package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProactiveOrganizationInsightSummary extends StObject {
  
  /**
    * The ID of the Amazon Web Services account.
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The ID of the insight summary.
    */
  var Id: js.UndefOr[InsightId] = js.undefined
  
  var InsightTimeRange: js.UndefOr[typings.awsSdk.devopsguruMod.InsightTimeRange] = js.undefined
  
  /**
    * The name of the insight summary.
    */
  var Name: js.UndefOr[InsightName] = js.undefined
  
  /**
    * The ID of the organizational unit.
    */
  var OrganizationalUnitId: js.UndefOr[typings.awsSdk.devopsguruMod.OrganizationalUnitId] = js.undefined
  
  var PredictionTimeRange: js.UndefOr[typings.awsSdk.devopsguruMod.PredictionTimeRange] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.devopsguruMod.ResourceCollection] = js.undefined
  
  var ServiceCollection: js.UndefOr[typings.awsSdk.devopsguruMod.ServiceCollection] = js.undefined
  
  /**
    *  An array of severity values used to search for insights. For more information, see Understanding insight severities in the Amazon DevOps Guru User Guide.
    */
  var Severity: js.UndefOr[InsightSeverity] = js.undefined
  
  /**
    *  An array of status values used to search for insights. 
    */
  var Status: js.UndefOr[InsightStatus] = js.undefined
}
object ProactiveOrganizationInsightSummary {
  
  inline def apply(): ProactiveOrganizationInsightSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProactiveOrganizationInsightSummary]
  }
  
  extension [Self <: ProactiveOrganizationInsightSummary](x: Self) {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInsightTimeRange(value: InsightTimeRange): Self = StObject.set(x, "InsightTimeRange", value.asInstanceOf[js.Any])
    
    inline def setInsightTimeRangeUndefined: Self = StObject.set(x, "InsightTimeRange", js.undefined)
    
    inline def setName(value: InsightName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationalUnitId(value: OrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdUndefined: Self = StObject.set(x, "OrganizationalUnitId", js.undefined)
    
    inline def setPredictionTimeRange(value: PredictionTimeRange): Self = StObject.set(x, "PredictionTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimeRangeUndefined: Self = StObject.set(x, "PredictionTimeRange", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setServiceCollection(value: ServiceCollection): Self = StObject.set(x, "ServiceCollection", value.asInstanceOf[js.Any])
    
    inline def setServiceCollectionUndefined: Self = StObject.set(x, "ServiceCollection", js.undefined)
    
    inline def setSeverity(value: InsightSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setStatus(value: InsightStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
