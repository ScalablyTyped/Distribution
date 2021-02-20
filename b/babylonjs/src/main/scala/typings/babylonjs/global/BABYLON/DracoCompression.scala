package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IDracoCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DracoCompression")
@js.native
/**
  * Constructor
  * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
  */
class DracoCompression ()
  extends typings.babylonjs.BABYLON.DracoCompression {
  def this(numWorkers: Double) = this()
}
/* static members */
object DracoCompression {
  
  @JSGlobal("BABYLON.DracoCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The configuration. Defaults to the following urls:
    * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
    * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
    * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
    */
  @JSGlobal("BABYLON.DracoCompression.Configuration")
  @js.native
  def Configuration: IDracoCompressionConfiguration = js.native
  @scala.inline
  def Configuration_=(x: IDracoCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
  
  /**
    * Default number of workers to create when creating the draco compression object.
    */
  @JSGlobal("BABYLON.DracoCompression.DefaultNumWorkers")
  @js.native
  def DefaultNumWorkers: Double = js.native
  @scala.inline
  def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DracoCompression.GetDefaultNumWorkers")
  @js.native
  def GetDefaultNumWorkers: js.Any = js.native
  @scala.inline
  def GetDefaultNumWorkers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DracoCompression._Default")
  @js.native
  def _Default: js.Any = js.native
  @scala.inline
  def _Default_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
}
