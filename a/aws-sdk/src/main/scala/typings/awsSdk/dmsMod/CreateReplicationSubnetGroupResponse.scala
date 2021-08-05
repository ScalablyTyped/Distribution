package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationSubnetGroupResponse extends StObject {
  
  /**
    * The replication subnet group that was created.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.dmsMod.ReplicationSubnetGroup] = js.undefined
}
object CreateReplicationSubnetGroupResponse {
  
  inline def apply(): CreateReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
  }
  
  extension [Self <: CreateReplicationSubnetGroupResponse](x: Self) {
    
    inline def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
  }
}
