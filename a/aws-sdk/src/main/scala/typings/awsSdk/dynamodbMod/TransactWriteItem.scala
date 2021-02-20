package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactWriteItem extends StObject {
  
  /**
    * A request to perform a check item operation.
    */
  var ConditionCheck: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionCheck] = js.native
  
  /**
    * A request to perform a DeleteItem operation.
    */
  var Delete: js.UndefOr[typings.awsSdk.dynamodbMod.Delete] = js.native
  
  /**
    * A request to perform a PutItem operation.
    */
  var Put: js.UndefOr[typings.awsSdk.dynamodbMod.Put] = js.native
  
  /**
    * A request to perform an UpdateItem operation.
    */
  var Update: js.UndefOr[typings.awsSdk.dynamodbMod.Update] = js.native
}
object TransactWriteItem {
  
  @scala.inline
  def apply(): TransactWriteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItem]
  }
  
  @scala.inline
  implicit class TransactWriteItemMutableBuilder[Self <: TransactWriteItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionCheck(value: ConditionCheck): Self = StObject.set(x, "ConditionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionCheckUndefined: Self = StObject.set(x, "ConditionCheck", js.undefined)
    
    @scala.inline
    def setDelete(value: Delete): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    
    @scala.inline
    def setPut(value: Put): Self = StObject.set(x, "Put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUndefined: Self = StObject.set(x, "Put", js.undefined)
    
    @scala.inline
    def setUpdate(value: Update): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
