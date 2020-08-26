package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDestination extends js.Object {
  /**
    * User-specified id. This is used in an output group or an output.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Destination settings for a MediaPackage output; one destination for both encoders.
    */
  var MediaPackageSettings: js.UndefOr[listOfMediaPackageOutputDestinationSettings] = js.native
  /**
    * Destination settings for a Multiplex output; one destination for both encoders.
    */
  var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings] = js.native
  /**
    * Destination settings for a standard output; one destination for each redundant encoder.
    */
  var Settings: js.UndefOr[listOfOutputDestinationSettings] = js.native
}

object OutputDestination {
  @scala.inline
  def apply(): OutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDestination]
  }
  @scala.inline
  implicit class OutputDestinationOps[Self <: OutputDestination] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setMediaPackageSettingsVarargs(value: MediaPackageOutputDestinationSettings*): Self = this.set("MediaPackageSettings", js.Array(value :_*))
    @scala.inline
    def setMediaPackageSettings(value: listOfMediaPackageOutputDestinationSettings): Self = this.set("MediaPackageSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaPackageSettings: Self = this.set("MediaPackageSettings", js.undefined)
    @scala.inline
    def setMultiplexSettings(value: MultiplexProgramChannelDestinationSettings): Self = this.set("MultiplexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexSettings: Self = this.set("MultiplexSettings", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: OutputDestinationSettings*): Self = this.set("Settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: listOfOutputDestinationSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
  
}

