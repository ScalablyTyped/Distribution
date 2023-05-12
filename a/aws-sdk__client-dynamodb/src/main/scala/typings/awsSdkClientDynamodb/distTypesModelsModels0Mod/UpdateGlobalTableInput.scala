package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableInput extends StObject {
  
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of Regions that should be added or removed from the global table.</p>
    */
  var ReplicaUpdates: js.UndefOr[js.Array[ReplicaUpdate]] = js.undefined
}
object UpdateGlobalTableInput {
  
  inline def apply(): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalTableInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicaUpdates(value: js.Array[ReplicaUpdate]): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    inline def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
  }
}
