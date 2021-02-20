package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebalanceSlotsInGlobalReplicationGroupMessage extends StObject {
  
  /**
    * If True, redistribution is applied immediately.
    */
  var ApplyImmediately: Boolean = js.native
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}
object RebalanceSlotsInGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): RebalanceSlotsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class RebalanceSlotsInGlobalReplicationGroupMessageMutableBuilder[Self <: RebalanceSlotsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
