package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeRenderTargetWrapper
  extends StObject
     with RenderTargetWrapper {
  
  /* private */ var __framebuffer: Any = js.native
  
  /* private */ var __framebufferDepthStencil: Any = js.native
  
  @JSName("_engine")
  val _engine_NativeRenderTargetWrapper: NativeEngine = js.native
  
  def _framebuffer: Nullable[js.typedarray.Uint32Array] = js.native
  
  def _framebufferDepthStencil: Nullable[js.typedarray.Uint32Array] = js.native
  def _framebufferDepthStencil_=(framebufferDepthStencil: Nullable[js.typedarray.Uint32Array]): Unit = js.native
  
  def _framebuffer_=(framebuffer: Nullable[js.typedarray.Uint32Array]): Unit = js.native
}
