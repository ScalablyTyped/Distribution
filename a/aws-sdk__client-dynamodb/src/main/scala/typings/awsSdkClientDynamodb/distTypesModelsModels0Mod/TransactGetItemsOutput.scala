package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactGetItemsOutput extends StObject {
  
  /**
    * <p>If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
    *             is an array of <code>ConsumedCapacity</code> objects, one for each table addressed by
    *                 <code>TransactGetItem</code> objects in the <i>TransactItems</i>
    *             parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
    *             consumed by the <code>TransactGetItems</code> call in that table.</p>
    */
  var ConsumedCapacity: js.UndefOr[
    js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
  ] = js.undefined
  
  /**
    * <p>An ordered array of up to 100 <code>ItemResponse</code> objects, each of which
    *             corresponds to the <code>TransactGetItem</code> object in the same position in the
    *                 <i>TransactItems</i> array. Each <code>ItemResponse</code> object
    *             contains a Map of the name-value pairs that are the projected attributes of the
    *             requested item.</p>
    *          <p>If a requested item could not be retrieved, the corresponding
    *                 <code>ItemResponse</code> object is Null, or if the requested item has no projected
    *             attributes, the corresponding <code>ItemResponse</code> object is an empty Map. </p>
    */
  var Responses: js.UndefOr[js.Array[ItemResponse]] = js.undefined
}
object TransactGetItemsOutput {
  
  inline def apply(): TransactGetItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactGetItemsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactGetItemsOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setResponses(value: js.Array[ItemResponse]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
