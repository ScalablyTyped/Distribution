package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverShardRequest extends StObject {
  
  /**
    * The cluster being failed over
    */
  var ClusterName: String
  
  /**
    * The name of the shard
    */
  var ShardName: String
}
object FailoverShardRequest {
  
  inline def apply(ClusterName: String, ShardName: String): FailoverShardRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], ShardName = ShardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverShardRequest]
  }
  
  extension [Self <: FailoverShardRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setShardName(value: String): Self = StObject.set(x, "ShardName", value.asInstanceOf[js.Any])
  }
}
