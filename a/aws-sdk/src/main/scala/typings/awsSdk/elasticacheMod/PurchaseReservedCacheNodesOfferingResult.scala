package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
  
  var ReservedCacheNode: js.UndefOr[typings.awsSdk.elasticacheMod.ReservedCacheNode] = js.native
}
object PurchaseReservedCacheNodesOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedCacheNodesOfferingResultOps[Self <: PurchaseReservedCacheNodesOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReservedCacheNode(value: ReservedCacheNode): Self = this.set("ReservedCacheNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedCacheNode: Self = this.set("ReservedCacheNode", js.undefined)
  }
}
