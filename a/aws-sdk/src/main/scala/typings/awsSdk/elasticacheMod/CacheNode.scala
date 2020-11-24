package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNode extends js.Object {
  
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this cache node, one of the following values: available, creating, rebooting, or deleting.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The customer outpost ARN of the cache node.
    */
  var CustomerOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.elasticacheMod.Endpoint] = js.native
  
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.native
}
object CacheNode {
  
  @scala.inline
  def apply(): CacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNode]
  }
  
  @scala.inline
  implicit class CacheNodeOps[Self <: CacheNode] (val x: Self) extends AnyVal {
    
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
    def setCacheNodeCreateTime(value: TStamp): Self = this.set("CacheNodeCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeCreateTime: Self = this.set("CacheNodeCreateTime", js.undefined)
    
    @scala.inline
    def setCacheNodeId(value: String): Self = this.set("CacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeId: Self = this.set("CacheNodeId", js.undefined)
    
    @scala.inline
    def setCacheNodeStatus(value: String): Self = this.set("CacheNodeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeStatus: Self = this.set("CacheNodeStatus", js.undefined)
    
    @scala.inline
    def setCustomerAvailabilityZone(value: String): Self = this.set("CustomerAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAvailabilityZone: Self = this.set("CustomerAvailabilityZone", js.undefined)
    
    @scala.inline
    def setCustomerOutpostArn(value: String): Self = this.set("CustomerOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOutpostArn: Self = this.set("CustomerOutpostArn", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setParameterGroupStatus(value: String): Self = this.set("ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupStatus: Self = this.set("ParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setSourceCacheNodeId(value: String): Self = this.set("SourceCacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCacheNodeId: Self = this.set("SourceCacheNodeId", js.undefined)
  }
}
