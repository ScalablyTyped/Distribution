package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarm extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmArn] = js.native
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.cloudwatchMod.ComparisonOperator] = js.native
  /**
    * The number of data points that must be breaching to trigger the alarm.
    */
  var DatapointsToAlarm: js.UndefOr[typings.awsSdk.cloudwatchMod.DatapointsToAlarm] = js.native
  /**
    * The dimensions for the metric associated with the alarm.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available.
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typings.awsSdk.cloudwatchMod.EvaluateLowSampleCountPercentile] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var EvaluationPeriods: js.UndefOr[typings.awsSdk.cloudwatchMod.EvaluationPeriods] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The name of the metric associated with the alarm, if this is an alarm based on a single metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.native
  /**
    * An array of MetricDataQuery structures, used in an alarm based on a metric math expression. Each structure either retrieves a metric or performs a math expression. One item in the Metrics array is the math expression that the alarm watches. This expression by designated by having ReturnValue set to true.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.native
  /**
    * The namespace of the metric associated with the alarm.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.native
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.native
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReason] = js.native
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.native
  /**
    * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic.
    */
  var Statistic: js.UndefOr[typings.awsSdk.cloudwatchMod.Statistic] = js.native
  /**
    * The value to compare with the specified statistic.
    */
  var Threshold: js.UndefOr[typings.awsSdk.cloudwatchMod.Threshold] = js.native
  /**
    * In an alarm based on an anomaly detection model, this is the ID of the ANOMALY_DETECTION_BAND function used as the threshold for the alarm.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.native
  /**
    * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of missing is used.
    */
  var TreatMissingData: js.UndefOr[typings.awsSdk.cloudwatchMod.TreatMissingData] = js.native
  /**
    * The unit of the metric associated with the alarm.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object MetricAlarm {
  @scala.inline
  def apply(
    ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
    AlarmActions: ResourceList = null,
    AlarmArn: AlarmArn = null,
    AlarmConfigurationUpdatedTimestamp: Timestamp = null,
    AlarmDescription: AlarmDescription = null,
    AlarmName: AlarmName = null,
    ComparisonOperator: ComparisonOperator = null,
    DatapointsToAlarm: js.UndefOr[DatapointsToAlarm] = js.undefined,
    Dimensions: Dimensions = null,
    EvaluateLowSampleCountPercentile: EvaluateLowSampleCountPercentile = null,
    EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined,
    ExtendedStatistic: ExtendedStatistic = null,
    InsufficientDataActions: ResourceList = null,
    MetricName: MetricName = null,
    Metrics: MetricDataQueries = null,
    Namespace: Namespace = null,
    OKActions: ResourceList = null,
    Period: js.UndefOr[Period] = js.undefined,
    StateReason: StateReason = null,
    StateReasonData: StateReasonData = null,
    StateUpdatedTimestamp: Timestamp = null,
    StateValue: StateValue = null,
    Statistic: Statistic = null,
    Threshold: js.UndefOr[Threshold] = js.undefined,
    ThresholdMetricId: MetricId = null,
    TreatMissingData: TreatMissingData = null,
    Unit: StandardUnit = null
  ): MetricAlarm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActionsEnabled)) __obj.updateDynamic("ActionsEnabled")(ActionsEnabled.get.asInstanceOf[js.Any])
    if (AlarmActions != null) __obj.updateDynamic("AlarmActions")(AlarmActions.asInstanceOf[js.Any])
    if (AlarmArn != null) __obj.updateDynamic("AlarmArn")(AlarmArn.asInstanceOf[js.Any])
    if (AlarmConfigurationUpdatedTimestamp != null) __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(AlarmConfigurationUpdatedTimestamp.asInstanceOf[js.Any])
    if (AlarmDescription != null) __obj.updateDynamic("AlarmDescription")(AlarmDescription.asInstanceOf[js.Any])
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (!js.isUndefined(DatapointsToAlarm)) __obj.updateDynamic("DatapointsToAlarm")(DatapointsToAlarm.get.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (EvaluateLowSampleCountPercentile != null) __obj.updateDynamic("EvaluateLowSampleCountPercentile")(EvaluateLowSampleCountPercentile.asInstanceOf[js.Any])
    if (!js.isUndefined(EvaluationPeriods)) __obj.updateDynamic("EvaluationPeriods")(EvaluationPeriods.get.asInstanceOf[js.Any])
    if (ExtendedStatistic != null) __obj.updateDynamic("ExtendedStatistic")(ExtendedStatistic.asInstanceOf[js.Any])
    if (InsufficientDataActions != null) __obj.updateDynamic("InsufficientDataActions")(InsufficientDataActions.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (OKActions != null) __obj.updateDynamic("OKActions")(OKActions.asInstanceOf[js.Any])
    if (!js.isUndefined(Period)) __obj.updateDynamic("Period")(Period.get.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData.asInstanceOf[js.Any])
    if (StateUpdatedTimestamp != null) __obj.updateDynamic("StateUpdatedTimestamp")(StateUpdatedTimestamp.asInstanceOf[js.Any])
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (!js.isUndefined(Threshold)) __obj.updateDynamic("Threshold")(Threshold.get.asInstanceOf[js.Any])
    if (ThresholdMetricId != null) __obj.updateDynamic("ThresholdMetricId")(ThresholdMetricId.asInstanceOf[js.Any])
    if (TreatMissingData != null) __obj.updateDynamic("TreatMissingData")(TreatMissingData.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarm]
  }
}

