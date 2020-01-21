package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
    */
  var name: js.UndefOr[AlarmName] = js.native
}

object Alarm {
  @scala.inline
  def apply(name: AlarmName = null): Alarm = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

