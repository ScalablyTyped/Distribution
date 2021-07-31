package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseReplicaCountResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.undefined
}
object DecreaseReplicaCountResult {
  
  @scala.inline
  def apply(): DecreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseReplicaCountResult]
  }
  
  @scala.inline
  implicit class DecreaseReplicaCountResultMutableBuilder[Self <: DecreaseReplicaCountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
