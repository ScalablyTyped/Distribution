package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetricAlarmInput extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-id:autoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The description for the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.undefined
  
  /**
    * The name for the alarm. This name must be unique within the Region.
    */
  var AlarmName: typings.awsSdk.cloudwatchMod.AlarmName
  
  /**
    *  The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand. The values LessThanLowerOrGreaterThanUpperThreshold, LessThanLowerThreshold, and GreaterThanUpperThreshold are used only for alarms based on anomaly detection models.
    */
  var ComparisonOperator: typings.awsSdk.cloudwatchMod.ComparisonOperator
  
  /**
    * The number of data points that must be breaching to trigger the alarm. This is used only if you are setting an "M out of N" alarm. In that case, this value is the M. For more information, see Evaluating an Alarm in the Amazon CloudWatch User Guide.
    */
  var DatapointsToAlarm: js.UndefOr[typings.awsSdk.cloudwatchMod.DatapointsToAlarm] = js.undefined
  
  /**
    * The dimensions for the metric specified in MetricName.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.undefined
  
  /**
    *  Used only for alarms based on percentiles. If you specify ignore, the alarm state does not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are available. For more information, see Percentile-Based CloudWatch Alarms and Low Data Samples. Valid Values: evaluate | ignore 
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typings.awsSdk.cloudwatchMod.EvaluateLowSampleCountPercentile] = js.undefined
  
  /**
    * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that number. If you are setting an "M out of N" alarm, this value is the N. An alarm's total current evaluation period can be no longer than one day, so this number multiplied by Period cannot be more than 86,400 seconds.
    */
  var EvaluationPeriods: typings.awsSdk.cloudwatchMod.EvaluationPeriods
  
  /**
    * The percentile statistic for the metric specified in MetricName. Specify a value between p0.0 and p100. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsSdk.cloudwatchMod.ExtendedStatistic] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-id:autoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): &gt;arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The name for the metric associated with the alarm. For each PutMetricAlarm operation, you must specify either MetricName or a Metrics array. If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters. Instead, you specify all this information in the Metrics array.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.undefined
  
  /**
    * An array of MetricDataQuery structures that enable you to create an alarm based on the result of a metric math expression. For each PutMetricAlarm operation, you must specify either MetricName or a Metrics array. Each item in the Metrics array either retrieves a metric or performs a math expression. One item in the Metrics array is the expression that the alarm watches. You designate this expression by setting ReturnData to true for this object in the array. For more information, see MetricDataQuery. If you use the Metrics parameter, you cannot include the MetricName, Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters of PutMetricAlarm in the same operation. Instead, you retrieve the metrics you are using in your math expression as part of the Metrics array.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.undefined
  
  /**
    * The namespace for the metric associated specified in MetricName.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-id:autoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
    */
  var OKActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The length, in seconds, used each time the metric specified in MetricName is evaluated. Valid values are 10, 30, and any multiple of 60.  Period is required for alarms based on static thresholds. If you are creating an alarm based on a metric math expression, you specify the period for each metric within the objects in the Metrics array. Be sure to specify 10 or 30 only for metrics that are stored by a PutMetricData call with a StorageResolution of 1. If you specify a period of 10 or 30 for a metric that does not have sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case, it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm might often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information about pricing, see Amazon CloudWatch Pricing. An alarm's total current evaluation period can be no longer than one day, so Period multiplied by EvaluationPeriods cannot be more than 86,400 seconds.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.undefined
  
  /**
    * The statistic for the metric specified in MetricName, other than percentile. For percentile statistics, use ExtendedStatistic. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
    */
  var Statistic: js.UndefOr[typings.awsSdk.cloudwatchMod.Statistic] = js.undefined
  
  /**
    * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
    */
  var Threshold: js.UndefOr[typings.awsSdk.cloudwatchMod.Threshold] = js.undefined
  
  /**
    * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function. For an example of how to use this parameter, see the Anomaly Detection Model Alarm example on this page. If your alarm uses this parameter, it cannot have Auto Scaling actions.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.undefined
  
  /**
    *  Sets how this alarm is to handle missing data points. If TreatMissingData is omitted, the default behavior of missing is used. For more information, see Configuring How CloudWatch Alarms Treats Missing Data. Valid Values: breaching | notBreaching | ignore | missing 
    */
  var TreatMissingData: js.UndefOr[typings.awsSdk.cloudwatchMod.TreatMissingData] = js.undefined
  
  /**
    * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately. If you don't specify Unit, CloudWatch retrieves all unit types that have been published for the metric and attempts to evaluate the alarm. Usually, metrics are published with only one unit, so the alarm works as intended. However, if the metric is published with multiple types of units and you don't specify a unit, the alarm's behavior is not defined and it behaves predictably. We recommend omitting Unit so that you don't inadvertently specify an incorrect unit that is not published for this metric. Doing so causes the alarm to be stuck in the INSUFFICIENT DATA state.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}
object PutMetricAlarmInput {
  
  @scala.inline
  def apply(AlarmName: AlarmName, ComparisonOperator: ComparisonOperator, EvaluationPeriods: EvaluationPeriods): PutMetricAlarmInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], EvaluationPeriods = EvaluationPeriods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricAlarmInput]
  }
  
  @scala.inline
  implicit class PutMetricAlarmInputMutableBuilder[Self <: PutMetricAlarmInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsEnabled(value: ActionsEnabled): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    @scala.inline
    def setAlarmActions(value: ResourceList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    @scala.inline
    def setAlarmActionsVarargs(value: ResourceName*): Self = StObject.set(x, "AlarmActions", js.Array(value :_*))
    
    @scala.inline
    def setAlarmDescription(value: AlarmDescription): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsToAlarm(value: DatapointsToAlarm): Self = StObject.set(x, "DatapointsToAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsToAlarmUndefined: Self = StObject.set(x, "DatapointsToAlarm", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setEvaluateLowSampleCountPercentile(value: EvaluateLowSampleCountPercentile): Self = StObject.set(x, "EvaluateLowSampleCountPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluateLowSampleCountPercentileUndefined: Self = StObject.set(x, "EvaluateLowSampleCountPercentile", js.undefined)
    
    @scala.inline
    def setEvaluationPeriods(value: EvaluationPeriods): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatistic(value: ExtendedStatistic): Self = StObject.set(x, "ExtendedStatistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatisticUndefined: Self = StObject.set(x, "ExtendedStatistic", js.undefined)
    
    @scala.inline
    def setInsufficientDataActions(value: ResourceList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    @scala.inline
    def setInsufficientDataActionsVarargs(value: ResourceName*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setMetrics(value: MetricDataQueries): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricDataQuery*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setOKActions(value: ResourceList): Self = StObject.set(x, "OKActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOKActionsUndefined: Self = StObject.set(x, "OKActions", js.undefined)
    
    @scala.inline
    def setOKActionsVarargs(value: ResourceName*): Self = StObject.set(x, "OKActions", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdMetricId(value: MetricId): Self = StObject.set(x, "ThresholdMetricId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdMetricIdUndefined: Self = StObject.set(x, "ThresholdMetricId", js.undefined)
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    @scala.inline
    def setTreatMissingData(value: TreatMissingData): Self = StObject.set(x, "TreatMissingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatMissingDataUndefined: Self = StObject.set(x, "TreatMissingData", js.undefined)
    
    @scala.inline
    def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
