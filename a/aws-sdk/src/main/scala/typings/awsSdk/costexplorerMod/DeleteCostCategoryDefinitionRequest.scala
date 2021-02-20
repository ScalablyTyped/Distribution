package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCostCategoryDefinitionRequest extends StObject {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn = js.native
}
object DeleteCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(CostCategoryArn: Arn): DeleteCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteCostCategoryDefinitionRequestMutableBuilder[Self <: DeleteCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
  }
}
