package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTableDescription extends StObject {
  
  /**
    * <p>The creation time of the global table.</p>
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The unique identifier of the global table.</p>
    */
  var GlobalTableArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The current state of the global table:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The global table is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The global table is being updated.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The global table is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The global table is ready for use.</p>
    *             </li>
    *          </ul>
    */
  var GlobalTableStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.GlobalTableStatus | String
  ] = js.undefined
  
  /**
    * <p>The Regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription]] = js.undefined
}
object GlobalTableDescription {
  
  inline def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setGlobalTableArn(value: String): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setGlobalTableStatus(value: GlobalTableStatus | String): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
    
    inline def setReplicationGroup(value: js.Array[ReplicaDescription]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    inline def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
  }
}
