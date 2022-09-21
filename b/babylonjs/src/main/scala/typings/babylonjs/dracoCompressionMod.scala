package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.FallbackUrl
import typings.babylonjs.meshVertexDataMod.VertexData
import typings.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dracoCompressionMod {
  
  @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression")
  @js.native
  /**
    * Constructor
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  open class DracoCompression ()
    extends StObject
       with IDisposable {
    def this(numWorkers: Double) = this()
    
    /* private */ var _decoderModulePromise: Any = js.native
    
    /* private */ var _workerPoolPromise: Any = js.native
    
    /**
      * Decode Draco compressed mesh data to vertex data.
      * @param data The ArrayBuffer or ArrayBufferView for the Draco compression data
      * @param attributes A map of attributes from vertex buffer kinds to Draco unique ids
      * @param dividers a list of optional dividers for normalization
      * @returns A promise that resolves with the decoded vertex data
      */
    def decodeMeshAsync(data: js.typedarray.ArrayBuffer): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: js.typedarray.ArrayBufferView): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: js.typedarray.ArrayBufferView, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
    def decodeMeshAsync(
      data: js.typedarray.ArrayBufferView,
      attributes: StringDictionary[Double],
      dividers: StringDictionary[Double]
    ): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: js.typedarray.ArrayBufferView, attributes: Unit, dividers: StringDictionary[Double]): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: js.typedarray.ArrayBuffer, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
    def decodeMeshAsync(
      data: js.typedarray.ArrayBuffer,
      attributes: StringDictionary[Double],
      dividers: StringDictionary[Double]
    ): js.Promise[VertexData] = js.native
    def decodeMeshAsync(data: js.typedarray.ArrayBuffer, attributes: Unit, dividers: StringDictionary[Double]): js.Promise[VertexData] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
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
    inline def Configuration_=(x: IDracoCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
    
    /**
      * Default number of workers to create when creating the draco compression object.
      */
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression.DefaultNumWorkers")
    @js.native
    def DefaultNumWorkers: Double = js.native
    inline def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression.GetDefaultNumWorkers")
    @js.native
    def GetDefaultNumWorkers: Any = js.native
    inline def GetDefaultNumWorkers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression._Default")
    @js.native
    def _Default: Any = js.native
    inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
  }
  
  trait IDracoCompressionConfiguration extends StObject {
    
    /**
      * Configuration for the decoder.
      */
    var decoder: FallbackUrl
  }
  object IDracoCompressionConfiguration {
    
    inline def apply(decoder: FallbackUrl): IDracoCompressionConfiguration = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDracoCompressionConfiguration]
    }
    
    extension [Self <: IDracoCompressionConfiguration](x: Self) {
      
      inline def setDecoder(value: FallbackUrl): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
    }
  }
}
