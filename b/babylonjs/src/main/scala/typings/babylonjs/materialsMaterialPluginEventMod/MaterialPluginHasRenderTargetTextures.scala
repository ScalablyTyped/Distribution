package typings.babylonjs.materialsMaterialPluginEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginHasRenderTargetTextures extends StObject {
  
  var hasRenderTargetTextures: Boolean
}
object MaterialPluginHasRenderTargetTextures {
  
  inline def apply(hasRenderTargetTextures: Boolean): MaterialPluginHasRenderTargetTextures = {
    val __obj = js.Dynamic.literal(hasRenderTargetTextures = hasRenderTargetTextures.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginHasRenderTargetTextures]
  }
  
  extension [Self <: MaterialPluginHasRenderTargetTextures](x: Self) {
    
    inline def setHasRenderTargetTextures(value: Boolean): Self = StObject.set(x, "hasRenderTargetTextures", value.asInstanceOf[js.Any])
  }
}
