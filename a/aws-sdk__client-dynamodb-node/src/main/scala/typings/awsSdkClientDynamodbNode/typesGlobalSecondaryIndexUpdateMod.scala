package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod.CreateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod.UnmarshalledCreateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbNode.typesDeleteGlobalSecondaryIndexActionMod.DeleteGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbNode.typesDeleteGlobalSecondaryIndexActionMod.UnmarshalledDeleteGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalSecondaryIndexActionMod.UnmarshalledUpdateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalSecondaryIndexActionMod.UpdateGlobalSecondaryIndexAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalSecondaryIndexUpdateMod {
  
  trait GlobalSecondaryIndexUpdate extends StObject {
    
    /**
      * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
      */
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * <p>The name of an existing global secondary index to be removed.</p>
      */
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
      */
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined
  }
  object GlobalSecondaryIndexUpdate {
    
    inline def apply(): GlobalSecondaryIndexUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
    }
    
    extension [Self <: GlobalSecondaryIndexUpdate](x: Self) {
      
      inline def setCreate(value: CreateGlobalSecondaryIndexAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: DeleteGlobalSecondaryIndexAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setUpdate(value: UpdateGlobalSecondaryIndexAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  trait UnmarshalledGlobalSecondaryIndexUpdate
    extends StObject
       with GlobalSecondaryIndexUpdate {
    
    /**
      * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
      */
    @JSName("Create")
    var Create_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledCreateGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * <p>The name of an existing global secondary index to be removed.</p>
      */
    @JSName("Delete")
    var Delete_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledDeleteGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
      */
    @JSName("Update")
    var Update_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledUpdateGlobalSecondaryIndexAction] = js.undefined
  }
  object UnmarshalledGlobalSecondaryIndexUpdate {
    
    inline def apply(): UnmarshalledGlobalSecondaryIndexUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexUpdate]
    }
    
    extension [Self <: UnmarshalledGlobalSecondaryIndexUpdate](x: Self) {
      
      inline def setCreate(value: UnmarshalledCreateGlobalSecondaryIndexAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: UnmarshalledDeleteGlobalSecondaryIndexAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setUpdate(value: UnmarshalledUpdateGlobalSecondaryIndexAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
}
