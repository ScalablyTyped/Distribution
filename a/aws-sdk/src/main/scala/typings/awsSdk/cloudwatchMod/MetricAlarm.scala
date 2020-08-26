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
  def apply(): MetricAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAlarm]
  }
  @scala.inline
  implicit class MetricAlarmOps[Self <: MetricAlarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsEnabled(value: ActionsEnabled): Self = this.set("ActionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsEnabled: Self = this.set("ActionsEnabled", js.undefined)
    @scala.inline
    def setAlarmActionsVarargs(value: ResourceName*): Self = this.set("AlarmActions", js.Array(value :_*))
    @scala.inline
    def setAlarmActions(value: ResourceList): Self = this.set("AlarmActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmActions: Self = this.set("AlarmActions", js.undefined)
    @scala.inline
    def setAlarmArn(value: AlarmArn): Self = this.set("AlarmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmArn: Self = this.set("AlarmArn", js.undefined)
    @scala.inline
    def setAlarmConfigurationUpdatedTimestamp(value: Timestamp): Self = this.set("AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmConfigurationUpdatedTimestamp: Self = this.set("AlarmConfigurationUpdatedTimestamp", js.undefined)
    @scala.inline
    def setAlarmDescription(value: AlarmDescription): Self = this.set("AlarmDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmDescription: Self = this.set("AlarmDescription", js.undefined)
    @scala.inline
    def setAlarmName(value: AlarmName): Self = this.set("AlarmName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmName: Self = this.set("AlarmName", js.undefined)
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonOperator: Self = this.set("ComparisonOperator", js.undefined)
    @scala.inline
    def setDatapointsToAlarm(value: DatapointsToAlarm): Self = this.set("DatapointsToAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatapointsToAlarm: Self = this.set("DatapointsToAlarm", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setEvaluateLowSampleCountPercentile(value: EvaluateLowSampleCountPercentile): Self = this.set("EvaluateLowSampleCountPercentile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluateLowSampleCountPercentile: Self = this.set("EvaluateLowSampleCountPercentile", js.undefined)
    @scala.inline
    def setEvaluationPeriods(value: EvaluationPeriods): Self = this.set("EvaluationPeriods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationPeriods: Self = this.set("EvaluationPeriods", js.undefined)
    @scala.inline
    def setExtendedStatistic(value: ExtendedStatistic): Self = this.set("ExtendedStatistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedStatistic: Self = this.set("ExtendedStatistic", js.undefined)
    @scala.inline
    def setInsufficientDataActionsVarargs(value: ResourceName*): Self = this.set("InsufficientDataActions", js.Array(value :_*))
    @scala.inline
    def setInsufficientDataActions(value: ResourceList): Self = this.set("InsufficientDataActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsufficientDataActions: Self = this.set("InsufficientDataActions", js.undefined)
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: MetricDataQuery*): Self = this.set("Metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: MetricDataQueries): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setOKActionsVarargs(value: ResourceName*): Self = this.set("OKActions", js.Array(value :_*))
    @scala.inline
    def setOKActions(value: ResourceList): Self = this.set("OKActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOKActions: Self = this.set("OKActions", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("Period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    @scala.inline
    def setStateReasonData(value: StateReasonData): Self = this.set("StateReasonData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReasonData: Self = this.set("StateReasonData", js.undefined)
    @scala.inline
    def setStateUpdatedTimestamp(value: Timestamp): Self = this.set("StateUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateUpdatedTimestamp: Self = this.set("StateUpdatedTimestamp", js.undefined)
    @scala.inline
    def setStateValue(value: StateValue): Self = this.set("StateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateValue: Self = this.set("StateValue", js.undefined)
    @scala.inline
    def setStatistic(value: Statistic): Self = this.set("Statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistic: Self = this.set("Statistic", js.undefined)
    @scala.inline
    def setThreshold(value: Threshold): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("Threshold", js.undefined)
    @scala.inline
    def setThresholdMetricId(value: MetricId): Self = this.set("ThresholdMetricId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdMetricId: Self = this.set("ThresholdMetricId", js.undefined)
    @scala.inline
    def setTreatMissingData(value: TreatMissingData): Self = this.set("TreatMissingData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatMissingData: Self = this.set("TreatMissingData", js.undefined)
    @scala.inline
    def setUnit(value: StandardUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

