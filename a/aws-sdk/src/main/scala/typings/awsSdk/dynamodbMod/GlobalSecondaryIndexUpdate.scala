package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSecondaryIndexUpdate extends StObject {
  
  /**
    * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
    */
  var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
  
  /**
    * The name of an existing global secondary index to be removed.
    */
  var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
  
  /**
    * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
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
