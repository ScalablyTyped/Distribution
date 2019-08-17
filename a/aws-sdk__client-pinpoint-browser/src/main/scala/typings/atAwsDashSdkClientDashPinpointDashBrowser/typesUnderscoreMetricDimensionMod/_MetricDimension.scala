package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMetricDimensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MetricDimension extends js.Object {
  /**
    * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
    */
  var ComparisonOperator: js.UndefOr[String] = js.undefined
  /**
    * Value to be compared.
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object _MetricDimension {
  @scala.inline
  def apply(ComparisonOperator: String = null, Value: Int | Double = null): _MetricDimension = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MetricDimension]
  }
}

