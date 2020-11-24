package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
  
  /**
    * The number of cache node instances to reserve. Default: 1 
    */
  var CacheNodeCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A customer-specified identifier to track this reservation.  The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this parameter is not specified, ElastiCache automatically generates an identifier for the reservation.  Example: myreservationID
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the reserved cache node offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
    */
  var ReservedCacheNodesOfferingId: String = js.native
}
object PurchaseReservedCacheNodesOfferingMessage {
  
  @scala.inline
  def apply(ReservedCacheNodesOfferingId: String): PurchaseReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedCacheNodesOfferingId = ReservedCacheNodesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
  }
  
  @scala.inline
  implicit class PurchaseReservedCacheNodesOfferingMessageOps[Self <: PurchaseReservedCacheNodesOfferingMessage] (val x: Self) extends AnyVal {
    
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
    def setReservedCacheNodesOfferingId(value: String): Self = this.set("ReservedCacheNodesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeCount(value: IntegerOptional): Self = this.set("CacheNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeCount: Self = this.set("CacheNodeCount", js.undefined)
    
    @scala.inline
    def setReservedCacheNodeId(value: String): Self = this.set("ReservedCacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedCacheNodeId: Self = this.set("ReservedCacheNodeId", js.undefined)
  }
}
