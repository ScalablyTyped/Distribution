package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreItemCollectionMetricsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ItemCollectionMetrics extends js.Object {
  /**
    * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
    */
  var ItemCollectionKey: js.UndefOr[
    StringDictionary[_AttributeValue] | (Iterable[js.Tuple2[String, _AttributeValue]])
  ] = js.undefined
  /**
    * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
    */
  var SizeEstimateRangeGB: js.UndefOr[js.Array[Double] | Iterable[Double]] = js.undefined
}

object _ItemCollectionMetrics {
  @scala.inline
  def apply(
    ItemCollectionKey: StringDictionary[_AttributeValue] | (Iterable[js.Tuple2[String, _AttributeValue]]) = null,
    SizeEstimateRangeGB: js.Array[Double] | Iterable[Double] = null
  ): _ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    if (ItemCollectionKey != null) __obj.updateDynamic("ItemCollectionKey")(ItemCollectionKey.asInstanceOf[js.Any])
    if (SizeEstimateRangeGB != null) __obj.updateDynamic("SizeEstimateRangeGB")(SizeEstimateRangeGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ItemCollectionMetrics]
  }
}

