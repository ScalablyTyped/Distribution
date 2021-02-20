package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCostCategoryDefinitionResponse extends StObject {
  
  /**
    *  The unique identifier for your newly created Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
}
object CreateCostCategoryDefinitionResponse {
  
  @scala.inline
  def apply(): CreateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCostCategoryDefinitionResponse]
  }
  
  @scala.inline
  implicit class CreateCostCategoryDefinitionResponseMutableBuilder[Self <: CreateCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostCategoryArnUndefined: Self = StObject.set(x, "CostCategoryArn", js.undefined)
    
    @scala.inline
    def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
  }
}
