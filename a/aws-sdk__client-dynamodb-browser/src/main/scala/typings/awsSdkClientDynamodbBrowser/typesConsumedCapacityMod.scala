package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesCapacityMod.Capacity
import typings.awsSdkClientDynamodbBrowser.typesCapacityMod.UnmarshalledCapacity
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConsumedCapacityMod {
  
  trait ConsumedCapacity extends StObject {
    
    /**
      * <p>The total number of capacity units consumed by the operation.</p>
      */
    var CapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The amount of throughput consumed on each global index affected by the operation.</p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.undefined
    
    /**
      * <p>The amount of throughput consumed on each local index affected by the operation.</p>
      */
    var LocalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.undefined
    
    /**
      * <p>The amount of throughput consumed on the table affected by the operation.</p>
      */
    var Table: js.UndefOr[Capacity] = js.undefined
    
    /**
      * <p>The name of the table that was affected by the operation.</p>
      */
    var TableName: js.UndefOr[String] = js.undefined
  }
  object ConsumedCapacity {
    
    inline def apply(): ConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumedCapacity]
    }
    
    extension [Self <: ConsumedCapacity](x: Self) {
      
      inline def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  trait UnmarshalledConsumedCapacity
    extends StObject
       with ConsumedCapacity {
    
    /**
      * <p>The amount of throughput consumed on each global index affected by the operation.</p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.undefined
    
    /**
      * <p>The amount of throughput consumed on each local index affected by the operation.</p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.undefined
    
    /**
      * <p>The amount of throughput consumed on the table affected by the operation.</p>
      */
    @JSName("Table")
    var Table_UnmarshalledConsumedCapacity: js.UndefOr[UnmarshalledCapacity] = js.undefined
  }
  object UnmarshalledConsumedCapacity {
    
    inline def apply(): UnmarshalledConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledConsumedCapacity]
    }
    
    extension [Self <: UnmarshalledConsumedCapacity](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setTable(value: UnmarshalledCapacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
}
