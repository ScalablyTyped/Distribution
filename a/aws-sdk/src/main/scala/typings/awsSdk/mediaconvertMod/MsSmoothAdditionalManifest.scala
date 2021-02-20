package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsSmoothAdditionalManifest extends StObject {
  
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
  def apply(): MsSmoothAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothAdditionalManifest]
  }
  
  @scala.inline
  implicit class MsSmoothAdditionalManifestMutableBuilder[Self <: MsSmoothAdditionalManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestNameModifier(value: stringMin1): Self = StObject.set(x, "ManifestNameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestNameModifierUndefined: Self = StObject.set(x, "ManifestNameModifier", js.undefined)
    
    @scala.inline
    def setSelectedOutputs(value: listOfStringMin1): Self = StObject.set(x, "SelectedOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOutputsUndefined: Self = StObject.set(x, "SelectedOutputs", js.undefined)
    
    @scala.inline
    def setSelectedOutputsVarargs(value: stringMin1*): Self = StObject.set(x, "SelectedOutputs", js.Array(value :_*))
  }
}
