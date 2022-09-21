package typings.babylonjs.legacyMod

import typings.babylonjs.prePassRenderTargetMod.PrePassRenderTarget
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod {
  
  trait RenderTargetTexture extends StObject {
    
    /** @hidden */
    var _prePassRenderTarget: Nullable[PrePassRenderTarget]
  }
  object RenderTargetTexture {
    
    inline def apply(): typings.babylonjs.legacyMod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture = {
      val __obj = js.Dynamic.literal(_prePassRenderTarget = null)
      __obj.asInstanceOf[typings.babylonjs.legacyMod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture]
    }
    
    extension [Self <: typings.babylonjs.legacyMod.babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod.RenderTargetTexture](x: Self) {
      
      inline def set_prePassRenderTarget(value: Nullable[PrePassRenderTarget]): Self = StObject.set(x, "_prePassRenderTarget", value.asInstanceOf[js.Any])
      
      inline def set_prePassRenderTargetNull: Self = StObject.set(x, "_prePassRenderTarget", null)
    }
  }
}
