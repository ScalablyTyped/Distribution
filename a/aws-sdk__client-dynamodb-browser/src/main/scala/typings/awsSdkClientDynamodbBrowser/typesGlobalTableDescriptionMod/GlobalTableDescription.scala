package typings.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.ReplicaDescription
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableDescription extends js.Object {
  
  /**
    * <p>The creation time of the global table.</p>
    */
  var CreationDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The unique identifier of the global table.</p>
    */
  var GlobalTableArn: js.UndefOr[String] = js.native
  
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.native
  
  /**
    * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
    */
  var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.native
  
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription] | Iterable[ReplicaDescription]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDateTime(value: Date | String | Double): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalTableArn(value: String): Self = this.set("GlobalTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableArn: Self = this.set("GlobalTableArn", js.undefined)
    
    @scala.inline
    def setGlobalTableName(value: String): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableName: Self = this.set("GlobalTableName", js.undefined)
    
    @scala.inline
    def setGlobalTableStatus(value: CREATING | ACTIVE | DELETING | UPDATING | String): Self = this.set("GlobalTableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTableStatus: Self = this.set("GlobalTableStatus", js.undefined)
    
    @scala.inline
    def setReplicationGroupVarargs(value: ReplicaDescription*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroup(value: js.Array[ReplicaDescription] | Iterable[ReplicaDescription]): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
}
