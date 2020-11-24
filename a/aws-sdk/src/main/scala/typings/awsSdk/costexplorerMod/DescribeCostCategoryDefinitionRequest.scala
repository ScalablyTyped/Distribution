package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCostCategoryDefinitionRequest extends js.Object {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn = js.native
  
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
}
object DescribeCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(CostCategoryArn: Arn): DescribeCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class DescribeCostCategoryDefinitionRequestOps[Self <: DescribeCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setEffectiveOn(value: ZonedDateTime): Self = this.set("EffectiveOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveOn: Self = this.set("EffectiveOn", js.undefined)
  }
}
