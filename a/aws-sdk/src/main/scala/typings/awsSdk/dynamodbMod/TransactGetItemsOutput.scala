package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactGetItemsOutput extends StObject {
  
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
  implicit class TransactGetItemsOutputMutableBuilder[Self <: TransactGetItemsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: ItemResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value :_*))
  }
}
