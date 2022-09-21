package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCostCategoryDefinitionResponse extends StObject {
  
  /**
    * The unique identifier for your newly created Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
}
object CreateCostCategoryDefinitionResponse {
  
  inline def apply(): CreateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCostCategoryDefinitionResponse]
  }
  
  extension [Self <: CreateCostCategoryDefinitionResponse](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryArnUndefined: Self = StObject.set(x, "CostCategoryArn", js.undefined)
    
    inline def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    inline def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
  }
}
