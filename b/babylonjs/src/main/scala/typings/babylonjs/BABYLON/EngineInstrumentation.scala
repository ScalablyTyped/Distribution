package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineInstrumentation
  extends StObject
     with IDisposable {
  
  /* private */ var _captureGPUFrameTime: js.Any = js.native
  
  /* private */ var _captureShaderCompilationTime: js.Any = js.native
  
  /* private */ var _gpuFrameTime: js.Any = js.native
  
  /* private */ var _gpuFrameTimeToken: js.Any = js.native
  
  /* private */ var _onAfterShaderCompilationObserver: js.Any = js.native
  
  /* private */ var _onBeforeShaderCompilationObserver: js.Any = js.native
  
  /* private */ var _onBeginFrameObserver: js.Any = js.native
  
  /* private */ var _onEndFrameObserver: js.Any = js.native
  
  /* private */ var _shaderCompilationTime: js.Any = js.native
  
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
