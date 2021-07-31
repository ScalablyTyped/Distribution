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
  
  @scala.inline
  def apply(): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaUpdate]
  }
  
  @scala.inline
  implicit class ReplicaUpdateMutableBuilder[Self <: ReplicaUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: CreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
    
    @scala.inline
    def setDelete(value: DeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
  }
}
