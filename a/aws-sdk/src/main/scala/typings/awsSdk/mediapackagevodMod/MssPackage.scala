package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: listOfMssManifest = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}

object MssPackage {
  @scala.inline
  def apply(
    MssManifests: listOfMssManifest,
    Encryption: MssEncryption = null,
    SegmentDurationSeconds: Int | Double = null
  ): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
}

