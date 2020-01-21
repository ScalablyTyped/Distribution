package typings.awsSdkClientDynamodbBrowser.typesItemCollectionMetricsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCollectionMetrics extends js.Object {
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
  @scala.inline
  def apply(
    ItemCollectionKey: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]) = null,
    SizeEstimateRangeGB: js.Array[Double] | Iterable[Double] = null
  ): ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    if (ItemCollectionKey != null) __obj.updateDynamic("ItemCollectionKey")(ItemCollectionKey.asInstanceOf[js.Any])
    if (SizeEstimateRangeGB != null) __obj.updateDynamic("SizeEstimateRangeGB")(SizeEstimateRangeGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollectionMetrics]
  }
}

