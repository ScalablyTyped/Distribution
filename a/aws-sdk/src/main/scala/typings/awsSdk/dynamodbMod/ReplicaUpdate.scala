package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaUpdate extends StObject {
  
  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.undefined
  
  /**
    * The name of the existing replica to be removed.
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
}
object ReplicaUpdate {
  
  inline def apply(): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaUpdate]
  }
  
  extension [Self <: ReplicaUpdate](x: Self) {
    
    inline def setCreate(value: CreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
    
    inline def setDelete(value: DeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
  }
}
