package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingDepthTextureCopy extends StObject {
  
  /* private */ var _copyTextureToTexture: Any = js.native
  
  /* private */ var _depthRTWrapper: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  def copy(source: InternalTexture): Boolean = js.native
  
  def depthRTWrapper: RenderTargetWrapper = js.native
  
  def dispose(): Unit = js.native
}
