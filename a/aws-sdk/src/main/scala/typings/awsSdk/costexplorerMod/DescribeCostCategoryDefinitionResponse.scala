package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCostCategoryDefinitionResponse extends js.Object {
  
  var CostCategory: js.UndefOr[typings.awsSdk.costexplorerMod.CostCategory] = js.native
}
object DescribeCostCategoryDefinitionResponse {
  
  @scala.inline
  def apply(): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
  
  @scala.inline
  implicit class DescribeCostCategoryDefinitionResponseOps[Self <: DescribeCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    
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
    def setCostCategory(value: CostCategory): Self = this.set("CostCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostCategory: Self = this.set("CostCategory", js.undefined)
  }
}
