package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableInput extends StObject {
  
  /**
    * The global table name.
    */
  var GlobalTableName: TableName
  
  /**
    * A list of Regions that should be added or removed from the global table.
    */
  var ReplicaUpdates: ReplicaUpdateList
}
object UpdateGlobalTableInput {
  
  inline def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalTableInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdates(value: ReplicaUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
  }
}
