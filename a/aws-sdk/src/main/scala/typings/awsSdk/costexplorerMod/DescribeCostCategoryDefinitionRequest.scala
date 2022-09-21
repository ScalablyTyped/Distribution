package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCostCategoryDefinitionRequest extends StObject {
  
  /**
    * The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn
  
  /**
    * The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.undefined
}
object DescribeCostCategoryDefinitionRequest {
  
  inline def apply(CostCategoryArn: Arn): DescribeCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
  }
  
  extension [Self <: DescribeCostCategoryDefinitionRequest](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setEffectiveOn(value: ZonedDateTime): Self = StObject.set(x, "EffectiveOn", value.asInstanceOf[js.Any])
    
    inline def setEffectiveOnUndefined: Self = StObject.set(x, "EffectiveOn", js.undefined)
  }
}
