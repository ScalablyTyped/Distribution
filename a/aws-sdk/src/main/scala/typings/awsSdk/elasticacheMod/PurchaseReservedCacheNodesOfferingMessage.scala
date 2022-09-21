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
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PurchaseReservedCacheNodesOfferingMessage {
  
  inline def apply(ReservedCacheNodesOfferingId: String): PurchaseReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedCacheNodesOfferingId = ReservedCacheNodesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
  }
  
  extension [Self <: PurchaseReservedCacheNodesOfferingMessage](x: Self) {
    
    inline def setCacheNodeCount(value: IntegerOptional): Self = StObject.set(x, "CacheNodeCount", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeCountUndefined: Self = StObject.set(x, "CacheNodeCount", js.undefined)
    
    inline def setReservedCacheNodeId(value: String): Self = StObject.set(x, "ReservedCacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setReservedCacheNodeIdUndefined: Self = StObject.set(x, "ReservedCacheNodeId", js.undefined)
    
    inline def setReservedCacheNodesOfferingId(value: String): Self = StObject.set(x, "ReservedCacheNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
