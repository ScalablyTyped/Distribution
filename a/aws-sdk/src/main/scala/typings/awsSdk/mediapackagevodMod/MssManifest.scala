package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssManifest extends js.Object {
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.native
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackagevodMod.StreamSelection] = js.native
}

object MssManifest {
  @scala.inline
  def apply(ManifestName: string = null, StreamSelection: StreamSelection = null): MssManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssManifest]
  }
}

