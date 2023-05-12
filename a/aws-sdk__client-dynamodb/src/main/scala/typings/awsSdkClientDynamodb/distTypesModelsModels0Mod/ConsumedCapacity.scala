package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedCapacity extends StObject {
  
  /**
    * <p>The total number of capacity units consumed by the operation.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The amount of throughput consumed on each global index affected by the
    *             operation.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[Record[String, Capacity]] = js.undefined
  
  /**
    * <p>The amount of throughput consumed on each local index affected by the
    *             operation.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[Record[String, Capacity]] = js.undefined
  
  /**
    * <p>The total number of read capacity units consumed by the operation.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  var Table: js.UndefOr[Capacity] = js.undefined
  
  /**
    * <p>The name of the table that was affected by the operation.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The total number of write capacity units consumed by the operation.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.undefined
}
object ConsumedCapacity {
  
  inline def apply(): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedCapacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
    
    inline def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: Record[String, Capacity]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setLocalSecondaryIndexes(value: Record[String, Capacity]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    inline def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    inline def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
