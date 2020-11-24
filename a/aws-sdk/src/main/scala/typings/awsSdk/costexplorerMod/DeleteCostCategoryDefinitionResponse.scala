package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCostCategoryDefinitionResponse extends js.Object {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The effective end date of the Cost Category as a result of deleting it. No costs after this date will be categorized by the deleted Cost Category. 
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
}
object DeleteCostCategoryDefinitionResponse {
  
  @scala.inline
  def apply(): DeleteCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCostCategoryDefinitionResponse]
  }
  
  @scala.inline
  implicit class DeleteCostCategoryDefinitionResponseOps[Self <: DeleteCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = this.set("CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostCategoryArn: Self = this.set("CostCategoryArn", js.undefined)
    
    @scala.inline
    def setEffectiveEnd(value: ZonedDateTime): Self = this.set("EffectiveEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveEnd: Self = this.set("EffectiveEnd", js.undefined)
  }
}
