package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedNodeTypeModificationsMessage extends StObject {
  
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter. 
    */
  var ScaleDownModifications: js.UndefOr[NodeTypeList] = js.undefined
  
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling up a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
    */
  var ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined
}
object AllowedNodeTypeModificationsMessage {
  
  inline def apply(): AllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
  }
  
  extension [Self <: AllowedNodeTypeModificationsMessage](x: Self) {
    
    inline def setScaleDownModifications(value: NodeTypeList): Self = StObject.set(x, "ScaleDownModifications", value.asInstanceOf[js.Any])
    
    inline def setScaleDownModificationsUndefined: Self = StObject.set(x, "ScaleDownModifications", js.undefined)
    
    inline def setScaleDownModificationsVarargs(value: String*): Self = StObject.set(x, "ScaleDownModifications", js.Array(value :_*))
    
    inline def setScaleUpModifications(value: NodeTypeList): Self = StObject.set(x, "ScaleUpModifications", value.asInstanceOf[js.Any])
    
    inline def setScaleUpModificationsUndefined: Self = StObject.set(x, "ScaleUpModifications", js.undefined)
    
    inline def setScaleUpModificationsVarargs(value: String*): Self = StObject.set(x, "ScaleUpModifications", js.Array(value :_*))
  }
}
