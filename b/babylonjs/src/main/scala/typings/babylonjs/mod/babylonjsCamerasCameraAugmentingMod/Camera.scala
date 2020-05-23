package typings.babylonjs.mod.babylonjsCamerasCameraAugmentingMod

import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _multiviewTexture: Nullable[RenderTargetTexture]
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _useMultiviewToSingleView: Boolean
  /**
    * @hidden
    * ensures the multiview texture of the camera exists and has the specified width/height
    * @param width height to set on the multiview texture
    * @param height width to set on the multiview texture
    */
  def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit
}

object Camera {
  @scala.inline
  def apply(
    _resizeOrCreateMultiviewTexture: (Double, Double) => Unit,
    _useMultiviewToSingleView: Boolean,
    _multiviewTexture: Nullable[RenderTargetTexture] = null
  ): Camera = {
    val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any], _multiviewTexture = _multiviewTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
}

