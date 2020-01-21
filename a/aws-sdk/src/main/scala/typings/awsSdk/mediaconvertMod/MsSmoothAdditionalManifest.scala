package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothAdditionalManifest extends js.Object {
  /**
    * Specify a name modifier that the service adds to the name of this manifest to make it different from the file names of the other main manifests in the output group. For example, say that the default main manifest for your Microsoft Smooth group is film-name.ismv. If you enter "-no-premium" for this setting, then the file name the service generates for this top-level manifest is film-name-no-premium.ismv.
    */
  var ManifestNameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * Specify the outputs that you want this additional top-level manifest to reference.
    */
  var SelectedOutputs: js.UndefOr[listOfStringMin1] = js.native
}

object MsSmoothAdditionalManifest {
  @scala.inline
  def apply(ManifestNameModifier: stringMin1 = null, SelectedOutputs: listOfStringMin1 = null): MsSmoothAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestNameModifier != null) __obj.updateDynamic("ManifestNameModifier")(ManifestNameModifier.asInstanceOf[js.Any])
    if (SelectedOutputs != null) __obj.updateDynamic("SelectedOutputs")(SelectedOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothAdditionalManifest]
  }
}

