package typings.babylonjs.mod.babylonjsCamerasCameraAugmentingMod

import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends js.Object {
  
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _multiviewTexture: Nullable[RenderTargetTexture] = js.native
  
  /**
    * @hidden
    * ensures the multiview texture of the camera exists and has the specified width/height
    * @param width height to set on the multiview texture
    * @param height width to set on the multiview texture
    */
  def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit = js.native
  
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _useMultiviewToSingleView: Boolean = js.native
}
object Camera {
  
  @scala.inline
  def apply(_resizeOrCreateMultiviewTexture: (Double, Double) => Unit, _useMultiviewToSingleView: Boolean): Camera = {
    val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    
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
    def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = this.set("_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_useMultiviewToSingleView(value: Boolean): Self = this.set("_useMultiviewToSingleView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = this.set("_multiviewTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_multiviewTextureNull: Self = this.set("_multiviewTexture", null)
  }
}
