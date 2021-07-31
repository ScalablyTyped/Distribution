package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedCacheNodesOfferingMessage extends StObject {
  
  /**
    * The number of cache node instances to reserve. Default: 1 
    */
  var CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A customer-specified identifier to track this reservation.  The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this parameter is not specified, ElastiCache automatically generates an identifier for the reservation.  Example: myreservationID
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reserved cache node offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
    */
  var ReservedCacheNodesOfferingId: String
}
object PurchaseReservedCacheNodesOfferingMessage {
  
  @scala.inline
  def apply(ReservedCacheNodesOfferingId: String): PurchaseReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedCacheNodesOfferingId = ReservedCacheNodesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
  }
  
  @scala.inline
  implicit class PurchaseReservedCacheNodesOfferingMessageMutableBuilder[Self <: PurchaseReservedCacheNodesOfferingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeCount(value: IntegerOptional): Self = StObject.set(x, "CacheNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeCountUndefined: Self = StObject.set(x, "CacheNodeCount", js.undefined)
    
    @scala.inline
    def setReservedCacheNodeId(value: String): Self = StObject.set(x, "ReservedCacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedCacheNodeIdUndefined: Self = StObject.set(x, "ReservedCacheNodeId", js.undefined)
    
    @scala.inline
    def setReservedCacheNodesOfferingId(value: String): Self = StObject.set(x, "ReservedCacheNodesOfferingId", value.asInstanceOf[js.Any])
  }
}
