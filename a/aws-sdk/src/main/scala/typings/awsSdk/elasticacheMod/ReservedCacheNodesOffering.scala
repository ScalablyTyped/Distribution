package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedCacheNodesOffering extends js.Object {
  /**
    * The cache node type for the reserved cache node. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The duration of the offering. in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The cache engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The recurring price charged to run this reserved cache node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * A unique identifier for the reserved cache node offering.
    */
  var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.native
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedCacheNodesOffering {
  @scala.inline
  def apply(): ReservedCacheNodesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodesOffering]
  }
  @scala.inline
  implicit class ReservedCacheNodesOfferingOps[Self <: ReservedCacheNodesOffering] (val x: Self) extends AnyVal {
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
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    @scala.inline
    def setOfferingType(value: String): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    @scala.inline
    def setProductDescription(value: String): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    @scala.inline
    def setReservedCacheNodesOfferingId(value: String): Self = this.set("ReservedCacheNodesOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedCacheNodesOfferingId: Self = this.set("ReservedCacheNodesOfferingId", js.undefined)
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
  
}

