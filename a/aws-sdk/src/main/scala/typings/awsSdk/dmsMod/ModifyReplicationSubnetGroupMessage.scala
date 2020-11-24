package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationSubnetGroupMessage extends js.Object {
  
  /**
    * A description for the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}
object ModifyReplicationSubnetGroupMessage {
  
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String, SubnetIds: SubnetIdentifierList): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationSubnetGroupMessageOps[Self <: ModifyReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setReplicationSubnetGroupIdentifier(value: String): Self = this.set("ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: String): Self = this.set("ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupDescription: Self = this.set("ReplicationSubnetGroupDescription", js.undefined)
  }
}
