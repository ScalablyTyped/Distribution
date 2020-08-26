package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexOutputSettings extends js.Object {
  /**
    * Destination is a Multiplex.
    */
  var Destination: OutputLocationRef = js.native
}

object MultiplexOutputSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): MultiplexOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexOutputSettings]
  }
  @scala.inline
  implicit class MultiplexOutputSettingsOps[Self <: MultiplexOutputSettings] (val x: Self) extends AnyVal {
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
    def setDestination(value: OutputLocationRef): Self = this.set("Destination", value.asInstanceOf[js.Any])
  }
  
}

