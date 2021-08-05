package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricAlarm extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmArn] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.undefined
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.undefined
  
  /**
    * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.cloudwatchMod.ComparisonOperator] = js.undefined
  
  /**
    * The number of data points that must be breaching to trigger the alarm.
    */
  var DatapointsToAlarm: js.UndefOr[typings.awsSdk.cloudwatchMod.DatapointsToAlarm] = js.undefined
  
  /**
    * The dimensions for the metric associated with the alarm.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.undefined
  
  /**
    * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available.
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typings.awsSdk.cloudwatchMod.EvaluateLowSampleCountPercentile] = js.undefined
  
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var EvaluationPeriods: js.UndefOr[typings.awsSdk.cloudwatchMod.EvaluationPeriods] = js.undefined
  
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsSdk.cloudwatchMod.ExtendedStatistic] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The name of the metric associated with the alarm, if this is an alarm based on a single metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.undefined
  
  /**
    * An array of MetricDataQuery structures, used in an alarm based on a metric math expression. Each structure either retrieves a metric or performs a math expression. One item in the Metrics array is the math expression that the alarm watches. This expression by designated by having ReturnData set to true.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.undefined
  
  /**
    * The namespace of the metric associated with the alarm.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.undefined
  
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReason] = js.undefined
  
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.undefined
  
  /**
    * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic.
    */
  var Statistic: js.UndefOr[typings.awsSdk.cloudwatchMod.Statistic] = js.undefined
  
  /**
    * The value to compare with the specified statistic.
    */
  var Threshold: js.UndefOr[typings.awsSdk.cloudwatchMod.Threshold] = js.undefined
  
  /**
    * In an alarm based on an anomaly detection model, this is the ID of the ANOMALY_DETECTION_BAND function used as the threshold for the alarm.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.undefined
  
  /**
    * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of missing is used.
    */
  var TreatMissingData: js.UndefOr[typings.awsSdk.cloudwatchMod.TreatMissingData] = js.undefined
  
  /**
    * The unit of the metric associated with the alarm.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}
object MetricAlarm {
  
  inline def apply(): MetricAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAlarm]
  }
  
  extension [Self <: MetricAlarm](x: Self) {
    
    inline def setActionsEnabled(value: ActionsEnabled): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    inline def setAlarmActions(value: ResourceList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    inline def setAlarmActionsVarargs(value: ResourceName*): Self = StObject.set(x, "AlarmActions", js.Array(value :_*))
    
    inline def setAlarmArn(value: AlarmArn): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmArnUndefined: Self = StObject.set(x, "AlarmArn", js.undefined)
    
    inline def setAlarmConfigurationUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUpdatedTimestampUndefined: Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", js.undefined)
    
    inline def setAlarmDescription(value: AlarmDescription): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setDatapointsToAlarm(value: DatapointsToAlarm): Self = StObject.set(x, "DatapointsToAlarm", value.asInstanceOf[js.Any])
    
    inline def setDatapointsToAlarmUndefined: Self = StObject.set(x, "DatapointsToAlarm", js.undefined)
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    inline def setEvaluateLowSampleCountPercentile(value: EvaluateLowSampleCountPercentile): Self = StObject.set(x, "EvaluateLowSampleCountPercentile", value.asInstanceOf[js.Any])
    
    inline def setEvaluateLowSampleCountPercentileUndefined: Self = StObject.set(x, "EvaluateLowSampleCountPercentile", js.undefined)
    
    inline def setEvaluationPeriods(value: EvaluationPeriods): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriodsUndefined: Self = StObject.set(x, "EvaluationPeriods", js.undefined)
    
    inline def setExtendedStatistic(value: ExtendedStatistic): Self = StObject.set(x, "ExtendedStatistic", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatisticUndefined: Self = StObject.set(x, "ExtendedStatistic", js.undefined)
    
    inline def setInsufficientDataActions(value: ResourceList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    inline def setInsufficientDataActionsVarargs(value: ResourceName*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value :_*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setMetrics(value: MetricDataQueries): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricDataQuery*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOKActions(value: ResourceList): Self = StObject.set(x, "OKActions", value.asInstanceOf[js.Any])
    
    inline def setOKActionsUndefined: Self = StObject.set(x, "OKActions", js.undefined)
    
    inline def setOKActionsVarargs(value: ResourceName*): Self = StObject.set(x, "OKActions", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonData(value: StateReasonData): Self = StObject.set(x, "StateReasonData", value.asInstanceOf[js.Any])
    
    inline def setStateReasonDataUndefined: Self = StObject.set(x, "StateReasonData", js.undefined)
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "StateUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStateUpdatedTimestampUndefined: Self = StObject.set(x, "StateUpdatedTimestamp", js.undefined)
    
    inline def setStateValue(value: StateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
    
    inline def setStateValueUndefined: Self = StObject.set(x, "StateValue", js.undefined)
    
    inline def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    inline def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdMetricId(value: MetricId): Self = StObject.set(x, "ThresholdMetricId", value.asInstanceOf[js.Any])
    
    inline def setThresholdMetricIdUndefined: Self = StObject.set(x, "ThresholdMetricId", js.undefined)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    inline def setTreatMissingData(value: TreatMissingData): Self = StObject.set(x, "TreatMissingData", value.asInstanceOf[js.Any])
    
    inline def setTreatMissingDataUndefined: Self = StObject.set(x, "TreatMissingData", js.undefined)
    
    inline def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
