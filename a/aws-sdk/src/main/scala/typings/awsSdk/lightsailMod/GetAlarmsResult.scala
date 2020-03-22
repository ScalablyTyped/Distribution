package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAlarmsResult extends js.Object {
  /**
    * An array of objects that describe the alarms.
    */
  var alarms: js.UndefOr[AlarmsList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetAlarms request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetAlarmsResult {
  @scala.inline
  def apply(alarms: AlarmsList = null, nextPageToken: String = null): GetAlarmsResult = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAlarmsResult]
  }
}

