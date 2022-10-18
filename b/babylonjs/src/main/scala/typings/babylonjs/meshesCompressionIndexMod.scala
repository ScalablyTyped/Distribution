package typings.babylonjs

import typings.babylonjs.meshesCompressionDracoCompressionMod.IDracoCompressionConfiguration
import typings.babylonjs.meshesCompressionMeshoptCompressionMod.IMeshoptCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesCompressionIndexMod {
  
  @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression")
  @js.native
  /**
    * Constructor
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  open class DracoCompression ()
    extends typings.babylonjs.meshesCompressionDracoCompressionMod.DracoCompression {
    def this(numWorkers: Double) = this()
  }
  /* static members */
  object DracoCompression {
    
    @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The configuration. Defaults to the following urls:
      * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
      * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
      * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
      */
    @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression.Configuration")
    @js.native
    def Configuration: IDracoCompressionConfiguration = js.native
    inline def Configuration_=(x: IDracoCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
    
    /**
      * Default number of workers to create when creating the draco compression object.
      */
    @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression.DefaultNumWorkers")
    @js.native
    def DefaultNumWorkers: Double = js.native
    inline def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression.GetDefaultNumWorkers")
    @js.native
    def GetDefaultNumWorkers: Any = js.native
    inline def GetDefaultNumWorkers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/index", "DracoCompression._Default")
    @js.native
    def _Default: Any = js.native
    inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Meshes/Compression/index", "MeshoptCompression")
  @js.native
  /**
    * Constructor
    */
  open class MeshoptCompression ()
    extends typings.babylonjs.meshesCompressionMeshoptCompressionMod.MeshoptCompression
  /* static members */
  object MeshoptCompression {
    
    @JSImport("babylonjs/Meshes/Compression/index", "MeshoptCompression")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The configuration. Defaults to the following:
      * ```javascript
      * decoder: {
      *   url: "https://preview.babylonjs.com/meshopt_decoder.js"
      * }
      * ```
      */
    @JSImport("babylonjs/Meshes/Compression/index", "MeshoptCompression.Configuration")
    @js.native
    def Configuration: IMeshoptCompressionConfiguration = js.native
    inline def Configuration_=(x: IMeshoptCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/index", "MeshoptCompression._Default")
    @js.native
    def _Default: Any = js.native
    inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
  }
}
