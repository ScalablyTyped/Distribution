package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUSnapshotRendering extends StObject {
  
  /* private */ var _bundleList: Any = js.native
  
  /* private */ var _bundleListRenderTarget: Any = js.native
  
  /* private */ var _enabled: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _mainPassBundleList: Any = js.native
  
  /* private */ var _mode: Any = js.native
  
  /* private */ var _modeSaved: Any = js.native
  
  /* private */ var _play: Any = js.native
  
  /* private */ var _record: Any = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(activate: Boolean): Unit = js.native
  
  def endFrame(mainRenderPass: Nullable[GPURenderPassEncoder]): Unit = js.native
  
  def endMainRenderPass(): Unit = js.native
  
  def endRenderTargetPass(currentRenderPass: GPURenderPassEncoder, gpuWrapper: WebGPUHardwareTexture): Boolean = js.native
  
  def mode: Double = js.native
  def mode_=(mode: Double): Unit = js.native
  
  def play: Boolean = js.native
  
  def record: Boolean = js.native
  
  def reset(): Unit = js.native
}
