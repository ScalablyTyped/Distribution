package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDimension extends js.Object {
  /**
    * A unique identifier for the dimension.
    */
  var dimensionName: DimensionName = js.native
  /**
    * Defines how the dimensionValues of a dimension are interpreted. For example, for dimension type TOPIC_FILTER, the IN operator, a message will be counted only if its topic matches one of the topic filters. With NOT_IN operator, a message will be counted only if it doesn't match any of the topic filters. The operator is optional: if it's not provided (is null), it will be interpreted as IN.
    */
  var operator: js.UndefOr[DimensionValueOperator] = js.native
}

object MetricDimension {
  @scala.inline
  def apply(dimensionName: DimensionName, operator: DimensionValueOperator = null): MetricDimension = {
    val __obj = js.Dynamic.literal(dimensionName = dimensionName.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
}

