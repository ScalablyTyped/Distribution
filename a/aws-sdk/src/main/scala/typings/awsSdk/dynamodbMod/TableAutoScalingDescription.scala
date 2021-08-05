package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableAutoScalingDescription extends StObject {
  
  /**
    * Represents replicas of the global table.
    */
  var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.undefined
  
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[typings.awsSdk.dynamodbMod.TableStatus] = js.undefined
}
object TableAutoScalingDescription {
  
  inline def apply(): TableAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableAutoScalingDescription]
  }
  
  extension [Self <: TableAutoScalingDescription](x: Self) {
    
    inline def setReplicas(value: ReplicaAutoScalingDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
    
    inline def setReplicasVarargs(value: ReplicaAutoScalingDescription*): Self = StObject.set(x, "Replicas", js.Array(value :_*))
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
    
    inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
  }
}
