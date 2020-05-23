package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineInstrumentation extends IDisposable {
  var _captureGPUFrameTime: js.Any = js.native
  var _captureShaderCompilationTime: js.Any = js.native
  var _gpuFrameTime: js.Any = js.native
  var _gpuFrameTimeToken: js.Any = js.native
  var _onAfterShaderCompilationObserver: js.Any = js.native
  var _onBeforeShaderCompilationObserver: js.Any = js.native
  var _onBeginFrameObserver: js.Any = js.native
  var _onEndFrameObserver: js.Any = js.native
  var _shaderCompilationTime: js.Any = js.native
  /**
    * Define the instrumented engine.
    */
  var engine: Engine = js.native
  /**
    * Gets the GPU frame time capture status
    */
  def captureGPUFrameTime: Boolean = js.native
  /**
    * Enable or disable the GPU frame time capture
    */
  def captureGPUFrameTime(value: Boolean): js.Any = js.native
  /**
    * Gets the shader compilation time capture status
    */
  def captureShaderCompilationTime: Boolean = js.native
  /**
    * Enable or disable the shader compilation time capture
    */
  def captureShaderCompilationTime(value: Boolean): js.Any = js.native
  /**
    * Gets the perf counter used for GPU frame time
    */
  def gpuFrameTimeCounter: PerfCounter = js.native
  /**
    * Gets the perf counter used for shader compilation time
    */
  def shaderCompilationTimeCounter: PerfCounter = js.native
}

