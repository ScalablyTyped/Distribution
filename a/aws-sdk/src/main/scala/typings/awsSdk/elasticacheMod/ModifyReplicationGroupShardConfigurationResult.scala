package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationGroupShardConfigurationResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.undefined
}
object ModifyReplicationGroupShardConfigurationResult {
  
  @scala.inline
  def apply(): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
  
  @scala.inline
  implicit class ModifyReplicationGroupShardConfigurationResultMutableBuilder[Self <: ModifyReplicationGroupShardConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
