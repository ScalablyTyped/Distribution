package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCostCategoryDefinitionResponse extends StObject {
  
  var CostCategory: js.UndefOr[typings.awsSdk.costexplorerMod.CostCategory] = js.undefined
}
object DescribeCostCategoryDefinitionResponse {
  
  inline def apply(): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
  
  extension [Self <: DescribeCostCategoryDefinitionResponse](x: Self) {
    
    inline def setCostCategory(value: CostCategory): Self = StObject.set(x, "CostCategory", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryUndefined: Self = StObject.set(x, "CostCategory", js.undefined)
  }
}
