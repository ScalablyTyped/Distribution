package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationSubnetGroupResponse extends js.Object {
  
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
  implicit class ModifyReplicationSubnetGroupResponseOps[Self <: ModifyReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = this.set("ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroup: Self = this.set("ReplicationSubnetGroup", js.undefined)
  }
}
