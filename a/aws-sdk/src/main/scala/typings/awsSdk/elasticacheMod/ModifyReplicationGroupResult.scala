package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationGroupResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.undefined
}
object ModifyReplicationGroupResult {
  
  inline def apply(): ModifyReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationGroupResult]
  }
  
  extension [Self <: ModifyReplicationGroupResult](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
