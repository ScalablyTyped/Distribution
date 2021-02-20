package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTable extends StObject {
  
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaList] = js.native
}
object GlobalTable {
  
  @scala.inline
  def apply(): GlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTable]
  }
  
  @scala.inline
  implicit class GlobalTableMutableBuilder[Self <: GlobalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    @scala.inline
    def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    @scala.inline
    def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
  }
}
