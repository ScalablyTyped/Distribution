package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeXRLayerRenderTargetTextureProvider
  extends StObject
     with WebXRLayerRenderTargetTextureProvider {
  
  /* private */ var _nativeLayer: Any = js.native
  
  /* private */ var _nativeRTTProvider: Any = js.native
  
  @JSName("layerWrapper")
  val layerWrapper_NativeXRLayerRenderTargetTextureProvider: NativeXRLayerWrapper = js.native
  
  def trySetViewportForView(viewport: Viewport): Boolean = js.native
}
