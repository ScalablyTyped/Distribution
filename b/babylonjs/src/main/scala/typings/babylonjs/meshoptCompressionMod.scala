package typings.babylonjs

import typings.babylonjs.anon.Url
import typings.babylonjs.babylonjsStrings.ATTRIBUTES
import typings.babylonjs.babylonjsStrings.INDICES
import typings.babylonjs.babylonjsStrings.TRIANGLES
import typings.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshoptCompressionMod {
  
  @JSImport("babylonjs/Meshes/Compression/meshoptCompression", "MeshoptCompression")
  @js.native
  /**
    * Constructor
    */
  open class MeshoptCompression ()
    extends StObject
       with IDisposable {
    
    /* private */ var _decoderModulePromise: Any = js.native
    
    /**
      * Decode meshopt data.
      * @see https://github.com/zeux/meshoptimizer/tree/master/js#decoder
      * @param source The input data.
      * @param count The number of elements.
      * @param stride The stride in bytes.
      * @param mode The compression mode.
      * @param filter The compression filter.
      * @returns a Promise<Uint8Array> that resolves to the decoded data
      */
    def decodeGltfBufferAsync(
      source: js.typedarray.Uint8Array,
      count: Double,
      stride: Double,
      mode: ATTRIBUTES | TRIANGLES | INDICES
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    def decodeGltfBufferAsync(
      source: js.typedarray.Uint8Array,
      count: Double,
      stride: Double,
      mode: ATTRIBUTES | TRIANGLES | INDICES,
      filter: String
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object MeshoptCompression {
    
    @JSImport("babylonjs/Meshes/Compression/meshoptCompression", "MeshoptCompression")
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
    @JSImport("babylonjs/Meshes/Compression/meshoptCompression", "MeshoptCompression.Configuration")
    @js.native
    def Configuration: IMeshoptCompressionConfiguration = js.native
    inline def Configuration_=(x: IMeshoptCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Compression/meshoptCompression", "MeshoptCompression._Default")
    @js.native
    def _Default: Any = js.native
    inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
  }
  
  trait IMeshoptCompressionConfiguration extends StObject {
    
    /**
      * Configuration for the decoder.
      */
    var decoder: Url
  }
  object IMeshoptCompressionConfiguration {
    
    inline def apply(decoder: Url): IMeshoptCompressionConfiguration = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMeshoptCompressionConfiguration]
    }
    
    extension [Self <: IMeshoptCompressionConfiguration](x: Self) {
      
      inline def setDecoder(value: Url): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
    }
  }
}
