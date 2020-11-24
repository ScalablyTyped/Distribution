package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableDescription extends js.Object {
  
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.native
  
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[typings.awsSdk.dynamodbMod.GlobalTableStatus] = js.native
  
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.native
}
object GlobalTableDescription {
  
  @scala.inline
  def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  
  @scala.inline
  implicit class GlobalTableDescriptionOps[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalTableArn(value: GlobalTableArnString): Self = this.set("GlobalTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableArn: Self = this.set("GlobalTableArn", js.undefined)
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableName: Self = this.set("GlobalTableName", js.undefined)
    
    @scala.inline
    def setGlobalTableStatus(value: GlobalTableStatus): Self = this.set("GlobalTableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableStatus: Self = this.set("GlobalTableStatus", js.undefined)
    
    @scala.inline
    def setReplicationGroupVarargs(value: ReplicaDescription*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroup(value: ReplicaDescriptionList): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
}
