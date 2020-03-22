package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The arithmetic operation used when comparing the specified statistic and threshold.
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.native
  /**
    * The contact protocols for the alarm, such as Email, SMS (text messaging), or both.
    */
  var contactProtocols: js.UndefOr[ContactProtocolsList] = js.native
  /**
    * The timestamp when the alarm was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The number of data points that must not within the specified threshold to trigger the alarm.
    */
  var datapointsToAlarm: js.UndefOr[integer] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var evaluationPeriods: js.UndefOr[integer] = js.native
  /**
    * An object that lists information about the location of the alarm.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the metric associated with the alarm.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * An object that lists information about the resource monitored by the alarm.
    */
  var monitoredResourceInfo: js.UndefOr[MonitoredResourceInfo] = js.native
  /**
    * The name of the alarm.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * Indicates whether the alarm is enabled.
    */
  var notificationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The alarm states that trigger a notification.
    */
  var notificationTriggers: js.UndefOr[NotificationTriggerList] = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var period: js.UndefOr[MetricPeriod] = js.native
  /**
    * The Lightsail resource type (e.g., Alarm).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The current state of the alarm. An alarm has the following possible states:    ALARM — The metric is outside of the defined threshold.    INSUFFICIENT_DATA — The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK — The metric is within the defined threshold.  
    */
  var state: js.UndefOr[AlarmState] = js.native
  /**
    * The statistic for the metric associated with the alarm. The following statistics are available:    Minimum — The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum — The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum — All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average — The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount — The count, or number, of data points used for the statistical calculation.  
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail alarm. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The value against which the specified statistic is compared.
    */
  var threshold: js.UndefOr[double] = js.native
  /**
    * Specifies how the alarm handles missing data points. An alarm can treat missing data in the following ways:    breaching — Assume the missing data is not within the threshold. Missing data counts towards the number of times the metric is not within the threshold.    notBreaching — Assume the missing data is within the threshold. Missing data does not count towards the number of times the metric is not within the threshold.    ignore — Ignore the missing data. Maintains the current alarm state.    missing — Missing data is treated as missing.  
    */
  var treatMissingData: js.UndefOr[TreatMissingData] = js.native
  /**
    * The unit of the metric associated with the alarm.
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}

object Alarm {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    comparisonOperator: ComparisonOperator = null,
    contactProtocols: ContactProtocolsList = null,
    createdAt: IsoDate = null,
    datapointsToAlarm: Int | Double = null,
    evaluationPeriods: Int | Double = null,
    location: ResourceLocation = null,
    metricName: MetricName = null,
    monitoredResourceInfo: MonitoredResourceInfo = null,
    name: ResourceName = null,
    notificationEnabled: js.UndefOr[Boolean] = js.undefined,
    notificationTriggers: NotificationTriggerList = null,
    period: Int | Double = null,
    resourceType: ResourceType = null,
    state: AlarmState = null,
    statistic: MetricStatistic = null,
    supportCode: String = null,
    threshold: Int | Double = null,
    treatMissingData: TreatMissingData = null,
    unit: MetricUnit = null
  ): Alarm = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (comparisonOperator != null) __obj.updateDynamic("comparisonOperator")(comparisonOperator.asInstanceOf[js.Any])
    if (contactProtocols != null) __obj.updateDynamic("contactProtocols")(contactProtocols.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (datapointsToAlarm != null) __obj.updateDynamic("datapointsToAlarm")(datapointsToAlarm.asInstanceOf[js.Any])
    if (evaluationPeriods != null) __obj.updateDynamic("evaluationPeriods")(evaluationPeriods.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (monitoredResourceInfo != null) __obj.updateDynamic("monitoredResourceInfo")(monitoredResourceInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationEnabled)) __obj.updateDynamic("notificationEnabled")(notificationEnabled.asInstanceOf[js.Any])
    if (notificationTriggers != null) __obj.updateDynamic("notificationTriggers")(notificationTriggers.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statistic != null) __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (treatMissingData != null) __obj.updateDynamic("treatMissingData")(treatMissingData.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

