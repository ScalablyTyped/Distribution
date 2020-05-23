package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchAlarmDefinition extends js.Object {
  /**
    * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
    */
  var ComparisonOperator: typings.awsSdk.emrMod.ComparisonOperator = js.native
  /**
    * A CloudWatch metric dimension.
    */
  var Dimensions: js.UndefOr[MetricDimensionList] = js.native
  /**
    * The number of periods, in five-minute increments, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.native
  /**
    * The name of the CloudWatch metric that is watched to determine an alarm condition.
    */
  var MetricName: String = js.native
  /**
    * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
    */
  var Namespace: js.UndefOr[String] = js.native
  /**
    * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify 300.
    */
  var Period: Integer = js.native
  /**
    * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
    */
  var Statistic: js.UndefOr[typings.awsSdk.emrMod.Statistic] = js.native
  /**
    * The value against which the specified statistic is compared.
    */
  var Threshold: NonNegativeDouble = js.native
  /**
    * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.emrMod.Unit] = js.native
}

object CloudWatchAlarmDefinition {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    MetricName: String,
    Period: Integer,
    Threshold: NonNegativeDouble,
    Dimensions: MetricDimensionList = null,
    EvaluationPeriods: js.UndefOr[Integer] = js.undefined,
    Namespace: String = null,
    Statistic: Statistic = null,
    Unit: Unit = null
  ): CloudWatchAlarmDefinition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(EvaluationPeriods)) __obj.updateDynamic("EvaluationPeriods")(EvaluationPeriods.get.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmDefinition]
  }
}

