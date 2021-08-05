package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSnapshot extends StObject {
  
  /**
    * A unique identifier for the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the cache node was created in the source cluster.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The cache node identifier for the node in the source cluster.
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the cache on the source cache node.
    */
  var CacheSize: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration for the source node group (shard).
    */
  var NodeGroupConfiguration: js.UndefOr[typings.awsSdk.elasticacheMod.NodeGroupConfiguration] = js.undefined
  
  /**
    * A unique identifier for the source node group (shard).
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
}
object NodeSnapshot {
  
  inline def apply(): NodeSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSnapshot]
  }
  
  extension [Self <: NodeSnapshot](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setCacheNodeCreateTime(value: TStamp): Self = StObject.set(x, "CacheNodeCreateTime", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeCreateTimeUndefined: Self = StObject.set(x, "CacheNodeCreateTime", js.undefined)
    
    inline def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    inline def setCacheSize(value: String): Self = StObject.set(x, "CacheSize", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeUndefined: Self = StObject.set(x, "CacheSize", js.undefined)
    
    inline def setNodeGroupConfiguration(value: NodeGroupConfiguration): Self = StObject.set(x, "NodeGroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupConfigurationUndefined: Self = StObject.set(x, "NodeGroupConfiguration", js.undefined)
    
    inline def setNodeGroupId(value: String): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    inline def setSnapshotCreateTime(value: TStamp): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
  }
}
