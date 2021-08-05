package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactGetItemsInput extends StObject {
  
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
    */
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get structure.
    */
  var TransactItems: TransactGetItemList
}
object TransactGetItemsInput {
  
  inline def apply(TransactItems: TransactGetItemList): TransactGetItemsInput = {
    val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItemsInput]
  }
  
  extension [Self <: TransactGetItemsInput](x: Self) {
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTransactItems(value: TransactGetItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
    
    inline def setTransactItemsVarargs(value: TransactGetItem*): Self = StObject.set(x, "TransactItems", js.Array(value :_*))
  }
}
