package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryProcessingStatus extends StObject {
  
  /**
    *  The Cost Management product name of the applied status. 
    */
  var Component: js.UndefOr[CostCategoryStatusComponent] = js.undefined
  
  /**
    *  The process status for a specific cost category. 
    */
  var Status: js.UndefOr[CostCategoryStatus] = js.undefined
}
object CostCategoryProcessingStatus {
  
  @scala.inline
  def apply(): CostCategoryProcessingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryProcessingStatus]
  }
  
  @scala.inline
  implicit class CostCategoryProcessingStatusMutableBuilder[Self <: CostCategoryProcessingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: CostCategoryStatusComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setStatus(value: CostCategoryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
