package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemCollectionMetricsMod {
  
  trait ItemCollectionMetrics extends StObject {
    
    /**
      * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
      */
    var ItemCollectionKey: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.undefined
    
    /**
      * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
      */
    var SizeEstimateRangeGB: js.UndefOr[js.Array[Double] | Iterable[Double]] = js.undefined
  }
  object ItemCollectionMetrics {
    
    inline def apply(): ItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionMetrics]
    }
    
    extension [Self <: ItemCollectionMetrics](x: Self) {
      
      inline def setItemCollectionKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      inline def setSizeEstimateRangeGB(value: js.Array[Double] | Iterable[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      inline def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledItemCollectionMetrics
    extends StObject
       with ItemCollectionMetrics {
    
    /**
      * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
      */
    @JSName("ItemCollectionKey")
    var ItemCollectionKey_UnmarshalledItemCollectionMetrics: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
      */
    @JSName("SizeEstimateRangeGB")
    var SizeEstimateRangeGB_UnmarshalledItemCollectionMetrics: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object UnmarshalledItemCollectionMetrics {
    
    inline def apply(): UnmarshalledItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledItemCollectionMetrics]
    }
    
    extension [Self <: UnmarshalledItemCollectionMetrics](x: Self) {
      
      inline def setItemCollectionKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      inline def setSizeEstimateRangeGB(value: js.Array[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      inline def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value :_*))
    }
  }
}
