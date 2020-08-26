package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileGroupSettings extends js.Object {
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.native
}

object FileGroupSettings {
  @scala.inline
  def apply(): FileGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileGroupSettings]
  }
  @scala.inline
  implicit class FileGroupSettingsOps[Self <: FileGroupSettings] (val x: Self) extends AnyVal {
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
    def setDestination(value: stringPatternS3): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = this.set("DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSettings: Self = this.set("DestinationSettings", js.undefined)
  }
  
}

