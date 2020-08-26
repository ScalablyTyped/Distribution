package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackageMod.StreamSelection] = js.native
}

object MssPackage {
  @scala.inline
  def apply(): MssPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssPackage]
  }
  @scala.inline
  implicit class MssPackageOps[Self <: MssPackage] (val x: Self) extends AnyVal {
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
    def setEncryption(value: MssEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setManifestWindowSeconds(value: integer): Self = this.set("ManifestWindowSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestWindowSeconds: Self = this.set("ManifestWindowSeconds", js.undefined)
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
  }
  
}

