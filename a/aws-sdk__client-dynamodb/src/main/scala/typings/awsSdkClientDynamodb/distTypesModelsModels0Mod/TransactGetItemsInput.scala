package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactGetItemsInput extends StObject {
  
  /**
    * <p>A value of <code>TOTAL</code> causes consumed capacity information to be returned, and
    *             a value of <code>NONE</code> prevents that information from being returned. No other
    *             value is valid.</p>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>An ordered array of up to 100 <code>TransactGetItem</code> objects, each of which
    *             contains a <code>Get</code> structure.</p>
    */
  var TransactItems: js.UndefOr[js.Array[TransactGetItem]] = js.undefined
}
object TransactGetItemsInput {
  
  inline def apply(): TransactGetItemsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactGetItemsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactGetItemsInput] (val x: Self) extends AnyVal {
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTransactItems(value: js.Array[TransactGetItem]): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
    
    inline def setTransactItemsUndefined: Self = StObject.set(x, "TransactItems", js.undefined)
    
    inline def setTransactItemsVarargs(value: TransactGetItem*): Self = StObject.set(x, "TransactItems", js.Array(value*))
  }
}
