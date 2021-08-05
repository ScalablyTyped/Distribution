package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLimitsOutput extends StObject {
  
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject
  
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject
}
object DescribeLimitsOutput {
  
  inline def apply(OpenShardCount: ShardCountObject, ShardLimit: ShardCountObject): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  extension [Self <: DescribeLimitsOutput](x: Self) {
    
    inline def setOpenShardCount(value: ShardCountObject): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
    
    inline def setShardLimit(value: ShardCountObject): Self = StObject.set(x, "ShardLimit", value.asInstanceOf[js.Any])
  }
}
