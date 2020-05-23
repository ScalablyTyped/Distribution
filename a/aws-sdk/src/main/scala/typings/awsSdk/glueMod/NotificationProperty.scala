package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[typings.awsSdk.glueMod.NotifyDelayAfter] = js.native
}

object NotificationProperty {
  @scala.inline
  def apply(NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NotifyDelayAfter)) __obj.updateDynamic("NotifyDelayAfter")(NotifyDelayAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProperty]
  }
}

