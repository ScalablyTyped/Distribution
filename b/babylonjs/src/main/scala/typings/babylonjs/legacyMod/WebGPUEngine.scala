package typings.babylonjs.legacyMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.webgpuEngineMod.WebGPUEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebGPUEngine")
@js.native
open class WebGPUEngine protected ()
  extends typings.babylonjs.indexMod.WebGPUEngine {
  /**
    * Create a new instance of the gpu engine.
    * @param canvas Defines the canvas to use to display the result
    * @param options Defines the options passed to the engine to create the GPU context dependencies
    */
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: WebGPUEngineOptions) = this()
}
/* static members */
object WebGPUEngine {
  
  @JSImport("babylonjs/Legacy/legacy", "WebGPUEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new instance of the gpu engine asynchronously
    * @param canvas Defines the canvas to use to display the result
    * @param options Defines the options passed to the engine to create the GPU context dependencies
    * @returns a promise that resolves with the created engine
    */
  inline def CreateAsync(canvas: HTMLCanvasElement): js.Promise[typings.babylonjs.webgpuEngineMod.WebGPUEngine] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(canvas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babylonjs.webgpuEngineMod.WebGPUEngine]]
  inline def CreateAsync(canvas: HTMLCanvasElement, options: WebGPUEngineOptions): js.Promise[typings.babylonjs.webgpuEngineMod.WebGPUEngine] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.webgpuEngineMod.WebGPUEngine]]
  
  /** true to enable using TintWASM to convert Spir-V to WGSL */
  @JSImport("babylonjs/Legacy/legacy", "WebGPUEngine.UseTWGSL")
  @js.native
  def UseTWGSL: Boolean = js.native
  inline def UseTWGSL_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseTWGSL")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "WebGPUEngine._GLSLslangDefaultOptions")
  @js.native
  val _GLSLslangDefaultOptions: Any = js.native
}
