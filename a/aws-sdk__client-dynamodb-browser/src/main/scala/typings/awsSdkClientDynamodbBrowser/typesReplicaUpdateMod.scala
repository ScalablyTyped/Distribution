package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.CreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.UnmarshalledCreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.DeleteReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.UnmarshalledDeleteReplicaAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaUpdateMod {
  
  @js.native
  trait ReplicaUpdate extends StObject {
    
    /**
      * <p>The parameters required for creating a replica on an existing global table.</p>
      */
    var Create: js.UndefOr[CreateReplicaAction] = js.native
    
    /**
      * <p>The name of the existing replica to be removed.</p>
      */
    var Delete: js.UndefOr[DeleteReplicaAction] = js.native
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
  
  @js.native
  trait UnmarshalledReplicaUpdate extends ReplicaUpdate {
    
    /**
      * <p>The parameters required for creating a replica on an existing global table.</p>
      */
    @JSName("Create")
    var Create_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledCreateReplicaAction] = js.native
    
    /**
      * <p>The name of the existing replica to be removed.</p>
      */
    @JSName("Delete")
    var Delete_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledDeleteReplicaAction] = js.native
  }
  object UnmarshalledReplicaUpdate {
    
    @scala.inline
    def apply(): UnmarshalledReplicaUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledReplicaUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicaUpdateMutableBuilder[Self <: UnmarshalledReplicaUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: UnmarshalledCreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      @scala.inline
      def setDelete(value: UnmarshalledDeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    }
  }
}
