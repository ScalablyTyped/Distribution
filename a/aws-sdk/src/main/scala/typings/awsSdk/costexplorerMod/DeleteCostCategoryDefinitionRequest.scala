package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCostCategoryDefinitionRequest extends js.Object {
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
}

