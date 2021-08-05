package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheNode extends StObject {
  
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this cache node, one of the following values: available, creating, rebooting, or deleting.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The customer outpost ARN of the cache node.
    */
  var CustomerOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.elasticacheMod.Endpoint] = js.undefined
  
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.undefined
}
object CacheNode {
  
  inline def apply(): CacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNode]
  }
  
  extension [Self <: CacheNode](x: Self) {
    
    inline def setCacheNodeCreateTime(value: TStamp): Self = StObject.set(x, "CacheNodeCreateTime", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeCreateTimeUndefined: Self = StObject.set(x, "CacheNodeCreateTime", js.undefined)
    
    inline def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    inline def setCacheNodeStatus(value: String): Self = StObject.set(x, "CacheNodeStatus", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeStatusUndefined: Self = StObject.set(x, "CacheNodeStatus", js.undefined)
    
    inline def setCustomerAvailabilityZone(value: String): Self = StObject.set(x, "CustomerAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setCustomerAvailabilityZoneUndefined: Self = StObject.set(x, "CustomerAvailabilityZone", js.undefined)
    
    inline def setCustomerOutpostArn(value: String): Self = StObject.set(x, "CustomerOutpostArn", value.asInstanceOf[js.Any])
    
    inline def setCustomerOutpostArnUndefined: Self = StObject.set(x, "CustomerOutpostArn", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
    
    inline def setSourceCacheNodeId(value: String): Self = StObject.set(x, "SourceCacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setSourceCacheNodeIdUndefined: Self = StObject.set(x, "SourceCacheNodeId", js.undefined)
  }
}
