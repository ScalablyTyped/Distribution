package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.FallbackUrl
import typings.babylonjs.meshVertexDataMod.VertexData
import typings.babylonjs.sceneMod.IDisposable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dracoCompressionMod {
  
  @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression")
  @js.native
  /**
    * Constructor
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  class DracoCompression () extends IDisposable {
    def this(numWorkers: Double) = this()
    
    var _decoderModulePromise: js.Any = js.native
    
    var _workerPoolPromise: js.Any = js.native
    
    /**
      * Decode Draco compressed mesh data to vertex data.
      * @param data The ArrayBuffer or ArrayBufferView for the Draco compression data
      * @param attributes A map of attributes from vertex buffer kinds to Draco unique ids
      * @returns A promise that resolves with the decoded vertex data
      */
    def decodeMeshAsync(data: ArrayBuffer): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: ArrayBufferView): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: ArrayBufferView, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: ArrayBuffer, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
    
    /**
      * Returns a promise that resolves when ready. Call this manually to ensure draco compression is ready before use.
      * @returns a promise that resolves when ready
      */
    def whenReadyAsync(): js.Promise[Unit] = js.native
  }
  /* static members */
  object DracoCompression {
    
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The configuration. Defaults to the following urls:
      * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
      * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
      * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
      */
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression.Configuration")
    @js.native
    def Configuration: IDracoCompressionConfiguration = js.native
    @scala.inline
    def Configuration_=(x: IDracoCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
    
    /**
      * Default number of workers to create when creating the draco compression object.
      */
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression.DefaultNumWorkers")
    @js.native
    def DefaultNumWorkers: Double = js.native
    @scala.inline
    def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression.GetDefaultNumWorkers")
    @js.native
    def GetDefaultNumWorkers: js.Any = js.native
    @scala.inline
    def GetDefaultNumWorkers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression._Default")
    @js.native
    def _Default: js.Any = js.native
    @scala.inline
    def _Default_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDracoCompressionConfiguration extends StObject {
    
    /**
      * Configuration for the decoder.
      */
    var decoder: FallbackUrl = js.native
  }
  object IDracoCompressionConfiguration {
    
    @scala.inline
    def apply(decoder: FallbackUrl): IDracoCompressionConfiguration = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDracoCompressionConfiguration]
    }
    
    @scala.inline
    implicit class IDracoCompressionConfigurationMutableBuilder[Self <: IDracoCompressionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoder(value: FallbackUrl): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
    }
  }
}
