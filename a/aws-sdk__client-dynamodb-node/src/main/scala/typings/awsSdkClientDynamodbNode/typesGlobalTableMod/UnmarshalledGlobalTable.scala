package typings.awsSdkClientDynamodbNode.typesGlobalTableMod

import typings.awsSdkClientDynamodbNode.typesReplicaMod.UnmarshalledReplica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledGlobalTable extends GlobalTable {
  
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTable: js.UndefOr[js.Array[UnmarshalledReplica]] = js.native
}
object UnmarshalledGlobalTable {
  
  @scala.inline
  def apply(): UnmarshalledGlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalTable]
  }
  
  @scala.inline
  implicit class UnmarshalledGlobalTableOps[Self <: UnmarshalledGlobalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationGroupVarargs(value: UnmarshalledReplica*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroup(value: js.Array[UnmarshalledReplica]): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
}
