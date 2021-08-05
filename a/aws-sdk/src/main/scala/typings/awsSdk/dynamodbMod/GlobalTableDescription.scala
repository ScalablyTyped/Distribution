package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTableDescription extends StObject {
  
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined
  
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[typings.awsSdk.dynamodbMod.GlobalTableStatus] = js.undefined
  
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined
}
object GlobalTableDescription {
  
  inline def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  
  extension [Self <: GlobalTableDescription](x: Self) {
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setGlobalTableArn(value: GlobalTableArnString): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setGlobalTableStatus(value: GlobalTableStatus): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
    
    inline def setReplicationGroup(value: ReplicaDescriptionList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    inline def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
  }
}
