package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCostCategoryDefinitionResponse extends StObject {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The effective end date of the Cost Category as a result of deleting it. No costs after this date will be categorized by the deleted Cost Category. 
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined
}
object DeleteCostCategoryDefinitionResponse {
  
  inline def apply(): DeleteCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCostCategoryDefinitionResponse]
  }
  
  extension [Self <: DeleteCostCategoryDefinitionResponse](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryArnUndefined: Self = StObject.set(x, "CostCategoryArn", js.undefined)
    
    inline def setEffectiveEnd(value: ZonedDateTime): Self = StObject.set(x, "EffectiveEnd", value.asInstanceOf[js.Any])
    
    inline def setEffectiveEndUndefined: Self = StObject.set(x, "EffectiveEnd", js.undefined)
  }
}
