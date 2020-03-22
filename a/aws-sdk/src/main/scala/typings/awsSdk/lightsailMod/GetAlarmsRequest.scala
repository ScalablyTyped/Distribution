package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAlarmsRequest extends js.Object {
  /**
    * The name of the alarm. Specify an alarm name to return information about a specific alarm.
    */
  var alarmName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the Lightsail resource being monitored by the alarm. Specify a monitored resource name to return information about all alarms for a specific resource.
    */
  var monitoredResourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetAlarms request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetAlarmsRequest {
  @scala.inline
  def apply(
    alarmName: ResourceName = null,
    monitoredResourceName: ResourceName = null,
    pageToken: String = null
  ): GetAlarmsRequest = {
    val __obj = js.Dynamic.literal()
    if (alarmName != null) __obj.updateDynamic("alarmName")(alarmName.asInstanceOf[js.Any])
    if (monitoredResourceName != null) __obj.updateDynamic("monitoredResourceName")(monitoredResourceName.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAlarmsRequest]
  }
}

