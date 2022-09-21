package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineInstrumentation
  extends StObject
     with IDisposable {
  
  /* private */ var _captureGPUFrameTime: Any = js.native
  
  /* private */ var _captureShaderCompilationTime: Any = js.native
  
  /* private */ var _onAfterShaderCompilationObserver: Any = js.native
  
  /* private */ var _onBeforeShaderCompilationObserver: Any = js.native
  
  /* private */ var _onBeginFrameObserver: Any = js.native
  
  /* private */ var _onEndFrameObserver: Any = js.native
  
  /* private */ var _shaderCompilationTime: Any = js.native
  
  /**
    * Gets the GPU frame time capture status
    */
  def captureGPUFrameTime: Boolean = js.native
  /**
    * Enable or disable the GPU frame time capture
    */
  def captureGPUFrameTime_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the shader compilation time capture status
    */
  def captureShaderCompilationTime: Boolean = js.native
  /**
    * Enable or disable the shader compilation time capture
    */
  def captureShaderCompilationTime_=(value: Boolean): Unit = js.native
  
  /**
    * Define the instrumented engine.
    */
  var engine: Engine = js.native
  
  /**
    * Gets the perf counter used for GPU frame time
    */
  def gpuFrameTimeCounter: PerfCounter = js.native
  
  /**
    * Gets the perf counter used for shader compilation time
    */
  def shaderCompilationTimeCounter: PerfCounter = js.native
}
