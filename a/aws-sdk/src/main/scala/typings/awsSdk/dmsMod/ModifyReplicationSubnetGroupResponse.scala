package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationSubnetGroupResponse extends StObject {
  
  /**
    * The modified replication subnet group.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.dmsMod.ReplicationSubnetGroup] = js.native
}
object ModifyReplicationSubnetGroupResponse {
  
  @scala.inline
  def apply(): ModifyReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
  }
  
  @scala.inline
  implicit class ModifyReplicationSubnetGroupResponseMutableBuilder[Self <: ModifyReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
  }
}
