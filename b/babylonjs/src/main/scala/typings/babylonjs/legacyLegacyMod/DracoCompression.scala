package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.meshesCompressionDracoCompressionMod.IDracoCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DracoCompression")
@js.native
/**
  * Constructor
  * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
  */
open class DracoCompression ()
  extends typings.babylonjs.indexMod.DracoCompression {
  def this(numWorkers: Double) = this()
}
/* static members */
object DracoCompression {
  
  @JSImport("babylonjs/Legacy/legacy", "DracoCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The configuration. Defaults to the following urls:
    * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
    * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
    * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
    */
  @JSImport("babylonjs/Legacy/legacy", "DracoCompression.Configuration")
  @js.native
  def Configuration: IDracoCompressionConfiguration = js.native
  inline def Configuration_=(x: IDracoCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
  
  /**
    * Default number of workers to create when creating the draco compression object.
    */
  @JSImport("babylonjs/Legacy/legacy", "DracoCompression.DefaultNumWorkers")
  @js.native
  def DefaultNumWorkers: Double = js.native
  inline def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DracoCompression.GetDefaultNumWorkers")
  @js.native
  def GetDefaultNumWorkers: Any = js.native
  inline def GetDefaultNumWorkers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DracoCompression._Default")
  @js.native
  def _Default: Any = js.native
  inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
}
