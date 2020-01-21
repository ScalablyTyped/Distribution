package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailConfiguration extends js.Object {
  /**
    * Ad avail settings.
    */
  var AvailSettings: js.UndefOr[typings.awsSdk.medialiveMod.AvailSettings] = js.native
}

object AvailConfiguration {
  @scala.inline
  def apply(AvailSettings: AvailSettings = null): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AvailSettings != null) __obj.updateDynamic("AvailSettings")(AvailSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailConfiguration]
  }
}

