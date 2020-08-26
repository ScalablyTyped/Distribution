package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackageGroupSettings extends js.Object {
  /**
    * MediaPackage channel destination.
    */
  var Destination: OutputLocationRef = js.native
}

object MediaPackageGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): MediaPackageGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPackageGroupSettings]
  }
  @scala.inline
  implicit class MediaPackageGroupSettingsOps[Self <: MediaPackageGroupSettings] (val x: Self) extends AnyVal {
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

