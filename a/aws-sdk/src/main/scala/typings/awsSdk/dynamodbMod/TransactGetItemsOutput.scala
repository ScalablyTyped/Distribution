package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactGetItemsOutput extends js.Object {
  
  /**
    * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  
  /**
    * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
    */
  var Responses: js.UndefOr[ItemResponseList] = js.native
}
object TransactGetItemsOutput {
  
  @scala.inline
  def apply(): TransactGetItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactGetItemsOutput]
  }
  
  @scala.inline
  implicit class TransactGetItemsOutputOps[Self <: TransactGetItemsOutput] (val x: Self) extends AnyVal {
    
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
    def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = this.set("ConsumedCapacity", js.Array(value :_*))
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedCapacity: Self = this.set("ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: ItemResponse*): Self = this.set("Responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: ItemResponseList): Self = this.set("Responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("Responses", js.undefined)
  }
}
