package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableAutoScalingDescription extends StObject {
  
  /**
    * <p>Represents replicas of the global table.</p>
    */
  var Replicas: js.UndefOr[js.Array[ReplicaAutoScalingDescription]] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The current state of the table:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The table is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The table is being updated.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The table is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The table is ready for use.</p>
    *             </li>
    *          </ul>
    */
  var TableStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableStatus | String] = js.undefined
}
object TableAutoScalingDescription {
  
  inline def apply(): TableAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableAutoScalingDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableAutoScalingDescription] (val x: Self) extends AnyVal {
    
    inline def setReplicas(value: js.Array[ReplicaAutoScalingDescription]): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
    
    inline def setReplicasVarargs(value: ReplicaAutoScalingDescription*): Self = StObject.set(x, "Replicas", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableStatus(value: TableStatus | String): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
    
    inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
  }
}
