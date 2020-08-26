package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsAdditionalManifest extends js.Object {
  /**
    * Specify a name modifier that the service adds to the name of this manifest to make it different from the file names of the other main manifests in the output group. For example, say that the default main manifest for your HLS group is film-name.m3u8. If you enter "-no-premium" for this setting, then the file name the service generates for this top-level manifest is film-name-no-premium.m3u8. For HLS output groups, specify a manifestNameModifier that is different from the nameModifier of the output. The service uses the output name modifier to create unique names for the individual variant manifests.
    */
  var ManifestNameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * Specify the outputs that you want this additional top-level manifest to reference.
    */
  var SelectedOutputs: js.UndefOr[listOfStringMin1] = js.native
}

object HlsAdditionalManifest {
  @scala.inline
  def apply(): HlsAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsAdditionalManifest]
  }
  @scala.inline
  implicit class HlsAdditionalManifestOps[Self <: HlsAdditionalManifest] (val x: Self) extends AnyVal {
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
    def setManifestNameModifier(value: stringMin1): Self = this.set("ManifestNameModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestNameModifier: Self = this.set("ManifestNameModifier", js.undefined)
    @scala.inline
    def setSelectedOutputsVarargs(value: stringMin1*): Self = this.set("SelectedOutputs", js.Array(value :_*))
    @scala.inline
    def setSelectedOutputs(value: listOfStringMin1): Self = this.set("SelectedOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedOutputs: Self = this.set("SelectedOutputs", js.undefined)
  }
  
}

