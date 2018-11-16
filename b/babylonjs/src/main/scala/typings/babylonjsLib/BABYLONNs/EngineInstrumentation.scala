package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class can be used to get instrumentation data from a Babylon engine
     * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
     */
@JSGlobal("BABYLON.EngineInstrumentation")
@js.native
class EngineInstrumentation protected () extends IDisposable {
  /**
           * Instantiates a new engine instrumentation.
           * This class can be used to get instrumentation data from a Babylon engine
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
           * @param engine Defines the engine to instrument
           */
  def this(/**
           * Define the instrumented engine.
           */
  engine: Engine) = this()
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
           * Gets the GPU frame time capture status
           */
  /**
          * Enable or disable the GPU frame time capture
          */
  var captureGPUFrameTime: scala.Boolean = js.native
  /**
           * Gets the shader compilation time capture status
           */
  /**
          * Enable or disable the shader compilation time capture
          */
  var captureShaderCompilationTime: scala.Boolean = js.native
  /**
           * Define the instrumented engine.
           */
  var engine: Engine = js.native
  /**
           * Gets the perf counter used for GPU frame time
           */
  val gpuFrameTimeCounter: PerfCounter = js.native
  /**
           * Gets the perf counter used for shader compilation time
           */
  val shaderCompilationTimeCounter: PerfCounter = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

