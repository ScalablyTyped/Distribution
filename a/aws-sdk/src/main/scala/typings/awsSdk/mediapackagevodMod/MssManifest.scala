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
  def apply(): MssManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssManifest]
  }
  @scala.inline
  implicit class MssManifestOps[Self <: MssManifest] (val x: Self) extends AnyVal {
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
    def setManifestName(value: string): Self = this.set("ManifestName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestName: Self = this.set("ManifestName", js.undefined)
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
  }
  
}

