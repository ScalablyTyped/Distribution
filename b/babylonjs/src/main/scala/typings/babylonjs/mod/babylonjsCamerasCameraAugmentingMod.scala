package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasCameraAugmentingMod {
  
  @js.native
  trait Camera extends StObject {
    
    /**
      * @hidden
      * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
      */
    var _multiviewTexture: Nullable[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture] = js.native
    
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
    def apply(_resizeOrCreateMultiviewTexture: (Double, Double) => Unit, _useMultiviewToSingleView: Boolean): typings.babylonjs.mod.babylonjsCamerasCameraAugmentingMod.Camera = {
      val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsCamerasCameraAugmentingMod.Camera]
    }
    
    @scala.inline
    implicit class CameraMutableBuilder[Self <: typings.babylonjs.mod.babylonjsCamerasCameraAugmentingMod.Camera] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_multiviewTexture(value: Nullable[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
      
      @scala.inline
      def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
    }
  }
}
