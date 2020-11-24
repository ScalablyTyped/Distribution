package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableAutoScalingDescription extends js.Object {
  
  /**
    * Represents replicas of the global table.
    */
  var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableStatus] = js.native
}
object TableAutoScalingDescription {
  
  @scala.inline
  def apply(): TableAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableAutoScalingDescription]
  }
  
  @scala.inline
  implicit class TableAutoScalingDescriptionOps[Self <: TableAutoScalingDescription] (val x: Self) extends AnyVal {
    
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
    def setReplicasVarargs(value: ReplicaAutoScalingDescription*): Self = this.set("Replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: ReplicaAutoScalingDescriptionList): Self = this.set("Replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("Replicas", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTableStatus(value: TableStatus): Self = this.set("TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStatus: Self = this.set("TableStatus", js.undefined)
  }
}
