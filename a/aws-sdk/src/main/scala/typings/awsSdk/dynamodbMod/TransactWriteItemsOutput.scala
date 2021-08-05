package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactWriteItemsOutput extends StObject {
  
  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
  
  /**
    * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem, or DeleteItem operations. 
    */
  var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
}
object TransactWriteItemsOutput {
  
  inline def apply(): TransactWriteItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItemsOutput]
  }
  
  extension [Self <: TransactWriteItemsOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
    
    inline def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
