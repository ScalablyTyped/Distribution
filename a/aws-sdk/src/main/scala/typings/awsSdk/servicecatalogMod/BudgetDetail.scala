package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetDetail extends js.Object {
  
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typings.awsSdk.servicecatalogMod.BudgetName] = js.native
}
object BudgetDetail {
  
  @scala.inline
  def apply(): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetDetail]
  }
  
  @scala.inline
  implicit class BudgetDetailOps[Self <: BudgetDetail] (val x: Self) extends AnyVal {
    
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
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetName: Self = this.set("BudgetName", js.undefined)
  }
}
