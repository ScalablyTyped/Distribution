package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactGetItemsInput extends js.Object {
  
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
    */
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  
  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get structure.
    */
  var TransactItems: TransactGetItemList = js.native
}
object TransactGetItemsInput {
  
  @scala.inline
  def apply(TransactItems: TransactGetItemList): TransactGetItemsInput = {
    val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItemsInput]
  }
  
  @scala.inline
  implicit class TransactGetItemsInputOps[Self <: TransactGetItemsInput] (val x: Self) extends AnyVal {
    
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
    def setTransactItemsVarargs(value: TransactGetItem*): Self = this.set("TransactItems", js.Array(value :_*))
    
    @scala.inline
    def setTransactItems(value: TransactGetItemList): Self = this.set("TransactItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
  }
}
