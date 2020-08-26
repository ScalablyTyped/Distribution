package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryReference extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective end date.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The Cost Category's effective start date.
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
  var Name: js.UndefOr[CostCategoryName] = js.native
  /**
    *  The number of rules associated with a specific Cost Category. 
    */
  var NumberOfRules: js.UndefOr[NonNegativeInteger] = js.native
}

object CostCategoryReference {
  @scala.inline
  def apply(): CostCategoryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryReference]
  }
  @scala.inline
  implicit class CostCategoryReferenceOps[Self <: CostCategoryReference] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setEffectiveStart(value: ZonedDateTime): Self = this.set("EffectiveStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveStart: Self = this.set("EffectiveStart", js.undefined)
    @scala.inline
    def setName(value: CostCategoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNumberOfRules(value: NonNegativeInteger): Self = this.set("NumberOfRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRules: Self = this.set("NumberOfRules", js.undefined)
  }
  
}

