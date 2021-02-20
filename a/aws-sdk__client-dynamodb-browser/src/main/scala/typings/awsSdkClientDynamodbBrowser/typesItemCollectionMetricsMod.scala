package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemCollectionMetricsMod {
  
  @js.native
  trait ItemCollectionMetrics extends StObject {
    
    /**
      * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
      */
    var ItemCollectionKey: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.native
    
    /**
      * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
      */
    var SizeEstimateRangeGB: js.UndefOr[js.Array[Double] | Iterable[Double]] = js.native
  }
  object ItemCollectionMetrics {
    
    @scala.inline
    def apply(): ItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionMetrics]
    }
    
    @scala.inline
    implicit class ItemCollectionMetricsMutableBuilder[Self <: ItemCollectionMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemCollectionKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGB(value: js.Array[Double] | Iterable[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledItemCollectionMetrics extends ItemCollectionMetrics {
    
    /**
      * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
      */
    @JSName("ItemCollectionKey")
    var ItemCollectionKey_UnmarshalledItemCollectionMetrics: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
    
    /**
      * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
      */
    @JSName("SizeEstimateRangeGB")
    var SizeEstimateRangeGB_UnmarshalledItemCollectionMetrics: js.UndefOr[js.Array[Double]] = js.native
  }
  object UnmarshalledItemCollectionMetrics {
    
    @scala.inline
    def apply(): UnmarshalledItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledItemCollectionMetrics]
    }
    
    @scala.inline
    implicit class UnmarshalledItemCollectionMetricsMutableBuilder[Self <: UnmarshalledItemCollectionMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemCollectionKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGB(value: js.Array[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value :_*))
    }
  }
}
