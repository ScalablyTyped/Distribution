package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCostCategoryDefinitionRequest extends StObject {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn
  
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.undefined
}
object DescribeCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(CostCategoryArn: Arn): DescribeCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class DescribeCostCategoryDefinitionRequestMutableBuilder[Self <: DescribeCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveOn(value: ZonedDateTime): Self = StObject.set(x, "EffectiveOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveOnUndefined: Self = StObject.set(x, "EffectiveOn", js.undefined)
  }
}
