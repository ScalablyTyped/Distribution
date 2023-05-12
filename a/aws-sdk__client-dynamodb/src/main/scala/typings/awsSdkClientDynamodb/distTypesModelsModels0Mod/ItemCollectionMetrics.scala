package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCollectionMetrics extends StObject {
  
  /**
    * <p>The partition key value of the item collection. This value is the same as the
    *             partition key value of the item.</p>
    */
  var ItemCollectionKey: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>An estimate of item collection size, in gigabytes. This value is a two-element array
    *             containing a lower bound and an upper bound for the estimate. The estimate includes the
    *             size of all the items in the table, plus the size of all attributes projected into all
    *             of the local secondary indexes on that table. Use this estimate to measure whether a
    *             local secondary index is approaching its size limit.</p>
    *          <p>The estimate is subject to change over time; therefore, do not rely on the precision
    *             or accuracy of the estimate.</p>
    */
  var SizeEstimateRangeGB: js.UndefOr[js.Array[Double]] = js.undefined
}
object ItemCollectionMetrics {
  
  inline def apply(): ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCollectionMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemCollectionMetrics] (val x: Self) extends AnyVal {
    
    inline def setItemCollectionKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
    
    inline def setSizeEstimateRangeGB(value: js.Array[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
    
    inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
    
    inline def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value*))
  }
}
