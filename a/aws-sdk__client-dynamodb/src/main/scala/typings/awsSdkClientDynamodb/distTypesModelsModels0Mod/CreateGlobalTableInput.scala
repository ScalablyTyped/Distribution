package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalTableInput extends StObject {
  
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Regions where the global table needs to be created.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[Replica]] = js.undefined
}
object CreateGlobalTableInput {
  
  inline def apply(): CreateGlobalTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGlobalTableInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicationGroup(value: js.Array[Replica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
  }
}
