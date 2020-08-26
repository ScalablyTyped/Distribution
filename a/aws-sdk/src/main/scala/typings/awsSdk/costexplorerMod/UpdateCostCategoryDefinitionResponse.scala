package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
}

object UpdateCostCategoryDefinitionResponse {
  @scala.inline
  def apply(): UpdateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCostCategoryDefinitionResponse]
  }
  @scala.inline
  implicit class UpdateCostCategoryDefinitionResponseOps[Self <: UpdateCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
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
    def setEffectiveStart(value: ZonedDateTime): Self = this.set("EffectiveStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveStart: Self = this.set("EffectiveStart", js.undefined)
  }
  
}

