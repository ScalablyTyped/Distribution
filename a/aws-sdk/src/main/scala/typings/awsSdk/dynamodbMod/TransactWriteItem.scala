package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactWriteItem extends js.Object {
  
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
  implicit class TransactWriteItemOps[Self <: TransactWriteItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionCheck(value: ConditionCheck): Self = this.set("ConditionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionCheck: Self = this.set("ConditionCheck", js.undefined)
    
    @scala.inline
    def setDelete(value: Delete): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
    
    @scala.inline
    def setPut(value: Put): Self = this.set("Put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePut: Self = this.set("Put", js.undefined)
    
    @scala.inline
    def setUpdate(value: Update): Self = this.set("Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("Update", js.undefined)
  }
}
