package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The current state of the alarm. An alarm has the following possible states:    ALARM - The metric is outside of the defined threshold.    INSUFFICIENT_DATA - The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK - The metric is within the defined threshold.  
    */
  var state: js.UndefOr[AlarmState] = js.native
  
  /**
    * The statistic for the metric associated with the alarm. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
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
    * Specifies how the alarm handles missing data points. An alarm can treat missing data in the following ways:    breaching - Assume the missing data is not within the threshold. Missing data counts towards the number of times the metric is not within the threshold.    notBreaching - Assume the missing data is within the threshold. Missing data does not count towards the number of times the metric is not within the threshold.    ignore - Ignore the missing data. Maintains the current alarm state.    missing - Missing data is treated as missing.  
    */
  var treatMissingData: js.UndefOr[TreatMissingData] = js.native
  
  /**
    * The unit of the metric associated with the alarm.
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}
object Alarm {
  
  @scala.inline
  def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonOperator: Self = this.set("comparisonOperator", js.undefined)
    
    @scala.inline
    def setContactProtocolsVarargs(value: ContactProtocol*): Self = this.set("contactProtocols", js.Array(value :_*))
    
    @scala.inline
    def setContactProtocols(value: ContactProtocolsList): Self = this.set("contactProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactProtocols: Self = this.set("contactProtocols", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDatapointsToAlarm(value: integer): Self = this.set("datapointsToAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatapointsToAlarm: Self = this.set("datapointsToAlarm", js.undefined)
    
    @scala.inline
    def setEvaluationPeriods(value: integer): Self = this.set("evaluationPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationPeriods: Self = this.set("evaluationPeriods", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    
    @scala.inline
    def setMonitoredResourceInfo(value: MonitoredResourceInfo): Self = this.set("monitoredResourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResourceInfo: Self = this.set("monitoredResourceInfo", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationEnabled(value: Boolean): Self = this.set("notificationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEnabled: Self = this.set("notificationEnabled", js.undefined)
    
    @scala.inline
    def setNotificationTriggersVarargs(value: AlarmState*): Self = this.set("notificationTriggers", js.Array(value :_*))
    
    @scala.inline
    def setNotificationTriggers(value: NotificationTriggerList): Self = this.set("notificationTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTriggers: Self = this.set("notificationTriggers", js.undefined)
    
    @scala.inline
    def setPeriod(value: MetricPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setState(value: AlarmState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatistic(value: MetricStatistic): Self = this.set("statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistic: Self = this.set("statistic", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    
    @scala.inline
    def setThreshold(value: double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setTreatMissingData(value: TreatMissingData): Self = this.set("treatMissingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatMissingData: Self = this.set("treatMissingData", js.undefined)
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
