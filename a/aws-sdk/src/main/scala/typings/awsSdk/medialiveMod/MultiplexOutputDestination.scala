package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexOutputDestination extends js.Object {
  /**
    * Multiplex MediaConnect output destination settings.
    */
  var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings] = js.native
}

object MultiplexOutputDestination {
  @scala.inline
  def apply(MediaConnectSettings: MultiplexMediaConnectOutputDestinationSettings = null): MultiplexOutputDestination = {
    val __obj = js.Dynamic.literal()
    if (MediaConnectSettings != null) __obj.updateDynamic("MediaConnectSettings")(MediaConnectSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexOutputDestination]
  }
}

