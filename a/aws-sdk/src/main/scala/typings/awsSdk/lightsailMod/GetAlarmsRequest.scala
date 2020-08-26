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
  def apply(): GetAlarmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsRequest]
  }
  @scala.inline
  implicit class GetAlarmsRequestOps[Self <: GetAlarmsRequest] (val x: Self) extends AnyVal {
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
    def setAlarmName(value: ResourceName): Self = this.set("alarmName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmName: Self = this.set("alarmName", js.undefined)
    @scala.inline
    def setMonitoredResourceName(value: ResourceName): Self = this.set("monitoredResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoredResourceName: Self = this.set("monitoredResourceName", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

