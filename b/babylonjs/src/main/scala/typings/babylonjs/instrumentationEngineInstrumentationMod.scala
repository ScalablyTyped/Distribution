package typings.babylonjs

import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.miscPerfCounterMod.PerfCounter
import typings.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentationEngineInstrumentationMod {
  
  @JSImport("babylonjs/Instrumentation/engineInstrumentation", "EngineInstrumentation")
  @js.native
  open class EngineInstrumentation protected ()
    extends StObject
       with IDisposable {
    /**
      * Instantiates a new engine instrumentation.
      * This class can be used to get instrumentation data from a Babylon engine
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#engineinstrumentation
      * @param engine Defines the engine to instrument
      */
    def this(/**
      * Define the instrumented engine.
      */
    engine: Engine) = this()
    
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
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
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
}
