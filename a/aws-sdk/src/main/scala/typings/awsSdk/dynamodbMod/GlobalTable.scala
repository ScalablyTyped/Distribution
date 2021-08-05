package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTable extends StObject {
  
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined
}
object GlobalTable {
  
  inline def apply(): GlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTable]
  }
  
  extension [Self <: GlobalTable](x: Self) {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
  }
}
