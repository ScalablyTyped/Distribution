package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafAdditionalManifest extends js.Object {
  /**
    * Specify a name modifier that the service adds to the name of this manifest to make it different from the file names of the other main manifests in the output group. For example, say that the default main manifest for your HLS group is film-name.m3u8. If you enter "-no-premium" for this setting, then the file name the service generates for this top-level manifest is film-name-no-premium.m3u8. For HLS output groups, specify a manifestNameModifier that is different from the nameModifier of the output. The service uses the output name modifier to create unique names for the individual variant manifests.
    */
  var ManifestNameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * Specify the outputs that you want this additional top-level manifest to reference.
    */
  var SelectedOutputs: js.UndefOr[listOfStringMin1] = js.native
}

object CmafAdditionalManifest {
  @scala.inline
  def apply(ManifestNameModifier: stringMin1 = null, SelectedOutputs: listOfStringMin1 = null): CmafAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestNameModifier != null) __obj.updateDynamic("ManifestNameModifier")(ManifestNameModifier.asInstanceOf[js.Any])
    if (SelectedOutputs != null) __obj.updateDynamic("SelectedOutputs")(SelectedOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafAdditionalManifest]
  }
}

