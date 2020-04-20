package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAlarmRequest extends js.Object {
  /**
    * The name of the alarm to delete.
    */
  var alarmName: ResourceName = js.native
}

object DeleteAlarmRequest {
  @scala.inline
  def apply(alarmName: ResourceName): DeleteAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmRequest]
  }
}

