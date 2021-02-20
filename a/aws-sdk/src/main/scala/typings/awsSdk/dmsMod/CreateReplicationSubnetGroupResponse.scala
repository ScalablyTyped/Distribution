package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationSubnetGroupResponse extends StObject {
  
  /**
    * The replication subnet group that was created.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.dmsMod.ReplicationSubnetGroup] = js.native
}
object CreateReplicationSubnetGroupResponse {
  
  @scala.inline
  def apply(): CreateReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
  }
  
  @scala.inline
  implicit class CreateReplicationSubnetGroupResponseMutableBuilder[Self <: CreateReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
  }
}
