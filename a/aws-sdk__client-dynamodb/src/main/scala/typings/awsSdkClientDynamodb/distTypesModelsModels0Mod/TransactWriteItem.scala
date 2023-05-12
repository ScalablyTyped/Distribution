package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactWriteItem extends StObject {
  
  /**
    * <p>A request to perform a check item operation.</p>
    */
  var ConditionCheck: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionCheck] = js.undefined
  
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  var Delete: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Delete] = js.undefined
  
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  var Put: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Put] = js.undefined
  
  /**
    * <p>A request to perform an <code>UpdateItem</code> operation.</p>
    */
  var Update: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Update] = js.undefined
}
object TransactWriteItem {
  
  inline def apply(): TransactWriteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactWriteItem] (val x: Self) extends AnyVal {
    
    inline def setConditionCheck(value: ConditionCheck): Self = StObject.set(x, "ConditionCheck", value.asInstanceOf[js.Any])
    
    inline def setConditionCheckUndefined: Self = StObject.set(x, "ConditionCheck", js.undefined)
    
    inline def setDelete(value: Delete): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    
    inline def setPut(value: Put): Self = StObject.set(x, "Put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "Put", js.undefined)
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
