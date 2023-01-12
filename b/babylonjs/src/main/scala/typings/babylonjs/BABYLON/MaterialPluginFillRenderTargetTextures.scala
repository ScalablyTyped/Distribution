package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginFillRenderTargetTextures extends StObject {
  
  var renderTargets: SmartArray[RenderTargetTexture]
}
object MaterialPluginFillRenderTargetTextures {
  
  inline def apply(renderTargets: SmartArray[RenderTargetTexture]): MaterialPluginFillRenderTargetTextures = {
    val __obj = js.Dynamic.literal(renderTargets = renderTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginFillRenderTargetTextures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginFillRenderTargetTextures] (val x: Self) extends AnyVal {
    
    inline def setRenderTargets(value: SmartArray[RenderTargetTexture]): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
  }
}
