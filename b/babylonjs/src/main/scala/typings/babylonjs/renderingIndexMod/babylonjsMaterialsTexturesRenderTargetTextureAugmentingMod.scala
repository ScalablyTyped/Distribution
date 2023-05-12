package typings.babylonjs.renderingIndexMod

import typings.babylonjs.materialsTexturesPrePassRenderTargetMod.PrePassRenderTarget
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod {
  
  trait RenderTargetTexture extends StObject {
    
    /** @internal */
    var _prePassRenderTarget: Nullable[PrePassRenderTarget]
    
    /**
      * Gets or sets a boolean indicating that the prepass renderer should not be used with this render target
      */
    var noPrePassRenderer: Boolean
  }
  object RenderTargetTexture {
    
    inline def apply(noPrePassRenderer: Boolean): RenderTargetTexture = {
      val __obj = js.Dynamic.literal(noPrePassRenderer = noPrePassRenderer.asInstanceOf[js.Any], _prePassRenderTarget = null)
      __obj.asInstanceOf[RenderTargetTexture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderTargetTexture] (val x: Self) extends AnyVal {
      
      inline def setNoPrePassRenderer(value: Boolean): Self = StObject.set(x, "noPrePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRenderTarget(value: Nullable[PrePassRenderTarget]): Self = StObject.set(x, "_prePassRenderTarget", value.asInstanceOf[js.Any])
      
      inline def set_prePassRenderTargetNull: Self = StObject.set(x, "_prePassRenderTarget", null)
    }
  }
}
