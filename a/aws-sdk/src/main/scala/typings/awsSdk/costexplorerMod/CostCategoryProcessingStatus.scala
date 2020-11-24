package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CostCategoryProcessingStatus extends js.Object {
  
  /**
    *  The Cost Management product name of the applied status. 
    */
  var Component: js.UndefOr[CostCategoryStatusComponent] = js.native
  
  /**
    *  The process status for a specific cost category. 
    */
  var Status: js.UndefOr[CostCategoryStatus] = js.native
}
object CostCategoryProcessingStatus {
  
  @scala.inline
  def apply(): CostCategoryProcessingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryProcessingStatus]
  }
  
  @scala.inline
  implicit class CostCategoryProcessingStatusOps[Self <: CostCategoryProcessingStatus] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: CostCategoryStatusComponent): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setStatus(value: CostCategoryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
