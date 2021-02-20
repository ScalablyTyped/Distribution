package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLimitsOutput extends StObject {
  
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject = js.native
  
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject = js.native
}
object DescribeLimitsOutput {
  
  @scala.inline
  def apply(OpenShardCount: ShardCountObject, ShardLimit: ShardCountObject): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  @scala.inline
  implicit class DescribeLimitsOutputMutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenShardCount(value: ShardCountObject): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardLimit(value: ShardCountObject): Self = StObject.set(x, "ShardLimit", value.asInstanceOf[js.Any])
  }
}
