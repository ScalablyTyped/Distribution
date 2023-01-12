package typings.babylonjs.enginesIndexMod

import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasCameraAugmentingMod {
  
  trait Camera extends StObject {
    
    /**
      * @internal
      * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
      */
    var _multiviewTexture: Nullable[RenderTargetTexture]
    
    /**
      * @internal
      * For WebXR cameras that are rendering to multiview texture arrays.
      */
    var _renderingMultiview: Boolean
    
    /**
      * @internal
      * ensures the multiview texture of the camera exists and has the specified width/height
      * @param width height to set on the multiview texture
      * @param height width to set on the multiview texture
      */
    def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit
    
    /**
      * @internal
      * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
      */
    var _useMultiviewToSingleView: Boolean
  }
  object Camera {
    
    inline def apply(
      _renderingMultiview: Boolean,
      _resizeOrCreateMultiviewTexture: (Double, Double) => Unit,
      _useMultiviewToSingleView: Boolean
    ): Camera = {
      val __obj = js.Dynamic.literal(_renderingMultiview = _renderingMultiview.asInstanceOf[js.Any], _resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any], _multiviewTexture = null)
      __obj.asInstanceOf[Camera]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
      
      inline def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
      
      inline def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
      
      inline def set_renderingMultiview(value: Boolean): Self = StObject.set(x, "_renderingMultiview", value.asInstanceOf[js.Any])
      
      inline def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
      
      inline def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
    }
  }
}
