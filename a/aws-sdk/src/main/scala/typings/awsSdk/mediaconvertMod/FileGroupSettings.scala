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
  def apply(Destination: stringPatternS3 = null, DestinationSettings: DestinationSettings = null): FileGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileGroupSettings]
  }
}

