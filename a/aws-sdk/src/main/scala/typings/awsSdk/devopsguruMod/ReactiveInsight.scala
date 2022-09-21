package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveInsight extends StObject {
  
  /**
    * Describes the reactive insight.
    */
  var Description: js.UndefOr[InsightDescription] = js.undefined
  
  /**
    *  The ID of a reactive insight. 
    */
  var Id: js.UndefOr[InsightId] = js.undefined
  
  var InsightTimeRange: js.UndefOr[typings.awsSdk.devopsguruMod.InsightTimeRange] = js.undefined
  
  /**
    *  The name of a reactive insight. 
    */
  var Name: js.UndefOr[InsightName] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.devopsguruMod.ResourceCollection] = js.undefined
  
  /**
    * The severity of the insight. For more information, see Understanding insight severities in the Amazon DevOps Guru User Guide.
    */
  var Severity: js.UndefOr[InsightSeverity] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services System Manager OpsItem created for this insight. You must enable the creation of OpstItems insights before they are created for each insight. 
    */
  var SsmOpsItemId: js.UndefOr[typings.awsSdk.devopsguruMod.SsmOpsItemId] = js.undefined
  
  /**
    *  The status of a reactive insight. 
    */
  var Status: js.UndefOr[InsightStatus] = js.undefined
}
object ReactiveInsight {
  
  inline def apply(): ReactiveInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveInsight]
  }
  
  extension [Self <: ReactiveInsight](x: Self) {
    
    inline def setDescription(value: InsightDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInsightTimeRange(value: InsightTimeRange): Self = StObject.set(x, "InsightTimeRange", value.asInstanceOf[js.Any])
    
    inline def setInsightTimeRangeUndefined: Self = StObject.set(x, "InsightTimeRange", js.undefined)
    
    inline def setName(value: InsightName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setSeverity(value: InsightSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSsmOpsItemId(value: SsmOpsItemId): Self = StObject.set(x, "SsmOpsItemId", value.asInstanceOf[js.Any])
    
    inline def setSsmOpsItemIdUndefined: Self = StObject.set(x, "SsmOpsItemId", js.undefined)
    
    inline def setStatus(value: InsightStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
