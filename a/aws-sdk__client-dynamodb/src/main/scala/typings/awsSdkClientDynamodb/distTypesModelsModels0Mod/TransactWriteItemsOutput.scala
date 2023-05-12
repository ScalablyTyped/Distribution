package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactWriteItemsOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by the entire <code>TransactWriteItems</code> operation.
    *             The values of the list are ordered according to the ordering of the
    *                 <code>TransactItems</code> request parameter. </p>
    */
  var ConsumedCapacity: js.UndefOr[
    js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
  ] = js.undefined
  
  /**
    * <p>A list of tables that were processed by <code>TransactWriteItems</code> and, for each
    *             table, information about any item collections that were affected by individual
    *                 <code>UpdateItem</code>, <code>PutItem</code>, or <code>DeleteItem</code>
    *             operations. </p>
    */
  var ItemCollectionMetrics: js.UndefOr[
    Record[
      String, 
      js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ItemCollectionMetrics]
    ]
  ] = js.undefined
}
object TransactWriteItemsOutput {
  
  inline def apply(): TransactWriteItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItemsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactWriteItemsOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setItemCollectionMetrics(value: Record[String, js.Array[ItemCollectionMetrics]]): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
