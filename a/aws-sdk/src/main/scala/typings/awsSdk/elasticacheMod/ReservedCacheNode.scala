package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedCacheNode extends StObject {
  
  /**
    * The number of cache nodes that have been reserved.
    */
  var CacheNodeCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The cache node type for the reserved cache nodes. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M6g node types: (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward): cache.m6g.large, cache.m6g.xlarge, cache.m6g.2xlarge, cache.m6g.4xlarge, cache.m6g.8xlarge, cache.m6g.12xlarge, cache.m6g.16xlarge   For region availability, see Supported Node Types    M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T4g node types (available only for Redis engine version 5.0.6 onward and Memcached engine version 1.5.16 onward): cache.t4g.micro, cache.t4g.small, cache.t4g.medium   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)  C1 node types: cache.c1.xlarge      Memory optimized with data tiering:   Current generation:   R6gd node types (available only for Redis engine version 6.2 onward).  cache.r6gd.xlarge, cache.r6gd.2xlarge, cache.r6gd.4xlarge, cache.r6gd.8xlarge, cache.r6gd.12xlarge, cache.r6gd.16xlarge      Memory optimized:   Current generation:   R6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.r6g.large, cache.r6g.xlarge, cache.r6g.2xlarge, cache.r6g.4xlarge, cache.r6g.8xlarge, cache.r6g.12xlarge, cache.r6g.16xlarge   For region availability, see Supported Node Types    R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fixed price charged for this reserved cache node.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The offering type of this reserved cache node.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the reserved cache node.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The recurring price charged to run this reserved cache node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the reserved cache node. Example: arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582 
    */
  var ReservationARN: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The offering identifier.
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the reserved cache node.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The hourly price charged for this reserved cache node.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedCacheNode {
  
  inline def apply(): ReservedCacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNode]
  }
  
  extension [Self <: ReservedCacheNode](x: Self) {
    
    inline def setCacheNodeCount(value: Integer): Self = StObject.set(x, "CacheNodeCount", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeCountUndefined: Self = StObject.set(x, "CacheNodeCount", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setProductDescription(value: String): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservationARN(value: String): Self = StObject.set(x, "ReservationARN", value.asInstanceOf[js.Any])
    
    inline def setReservationARNUndefined: Self = StObject.set(x, "ReservationARN", js.undefined)
    
    inline def setReservedCacheNodeId(value: String): Self = StObject.set(x, "ReservedCacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setReservedCacheNodeIdUndefined: Self = StObject.set(x, "ReservedCacheNodeId", js.undefined)
    
    inline def setReservedCacheNodesOfferingId(value: String): Self = StObject.set(x, "ReservedCacheNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedCacheNodesOfferingIdUndefined: Self = StObject.set(x, "ReservedCacheNodesOfferingId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
