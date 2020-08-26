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
  def apply(): MultiplexOutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexOutputDestination]
  }
  @scala.inline
  implicit class MultiplexOutputDestinationOps[Self <: MultiplexOutputDestination] (val x: Self) extends AnyVal {
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
    def setMediaConnectSettings(value: MultiplexMediaConnectOutputDestinationSettings): Self = this.set("MediaConnectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaConnectSettings: Self = this.set("MediaConnectSettings", js.undefined)
  }
  
}

