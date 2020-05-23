package typings.awsSdkClientPinpointBrowser.typesMetricDimensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDimension extends js.Object {
  /**
    * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
    */
  var ComparisonOperator: js.UndefOr[String] = js.undefined
  /**
    * Value to be compared.
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object MetricDimension {
  @scala.inline
  def apply(ComparisonOperator: String = null, Value: js.UndefOr[Double] = js.undefined): MetricDimension = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
}

