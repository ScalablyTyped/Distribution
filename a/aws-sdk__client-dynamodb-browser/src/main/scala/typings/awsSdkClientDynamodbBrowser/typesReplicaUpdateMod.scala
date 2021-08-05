package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.CreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.UnmarshalledCreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.DeleteReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.UnmarshalledDeleteReplicaAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaUpdateMod {
  
  trait ReplicaUpdate extends StObject {
    
    /**
      * <p>The parameters required for creating a replica on an existing global table.</p>
      */
    var Create: js.UndefOr[CreateReplicaAction] = js.undefined
    
    /**
      * <p>The name of the existing replica to be removed.</p>
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
  
  trait UnmarshalledReplicaUpdate
    extends StObject
       with ReplicaUpdate {
    
    /**
      * <p>The parameters required for creating a replica on an existing global table.</p>
      */
    @JSName("Create")
    var Create_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledCreateReplicaAction] = js.undefined
    
    /**
      * <p>The name of the existing replica to be removed.</p>
      */
    @JSName("Delete")
    var Delete_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledDeleteReplicaAction] = js.undefined
  }
  object UnmarshalledReplicaUpdate {
    
    inline def apply(): UnmarshalledReplicaUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledReplicaUpdate]
    }
    
    extension [Self <: UnmarshalledReplicaUpdate](x: Self) {
      
      inline def setCreate(value: UnmarshalledCreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: UnmarshalledDeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    }
  }
}
