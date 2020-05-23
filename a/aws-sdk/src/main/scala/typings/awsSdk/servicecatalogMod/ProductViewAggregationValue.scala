package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewAggregationValue extends js.Object {
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typings.awsSdk.servicecatalogMod.ApproximateCount] = js.native
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.native
}

object ProductViewAggregationValue {
  @scala.inline
  def apply(ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined, Value: AttributeValue = null): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ApproximateCount)) __obj.updateDynamic("ApproximateCount")(ApproximateCount.get.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
}

