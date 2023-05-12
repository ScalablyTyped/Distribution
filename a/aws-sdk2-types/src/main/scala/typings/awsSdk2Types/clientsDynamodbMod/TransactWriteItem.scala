package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactWriteItem extends StObject {
  
  /**
    * A request to perform a check item operation.
    */
  var ConditionCheck: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ConditionCheck] = js.undefined
  
  /**
    * A request to perform a DeleteItem operation.
    */
  var Delete: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.Delete] = js.undefined
  
  /**
    * A request to perform a PutItem operation.
    */
  var Put: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.Put] = js.undefined
  
  /**
    * A request to perform an UpdateItem operation.
    */
  var Update: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.Update] = js.undefined
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
