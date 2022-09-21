package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsStrings.ATTRIBUTES
import typings.babylonjs.babylonjsStrings.INDICES
import typings.babylonjs.babylonjsStrings.TRIANGLES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshoptCompression
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
}
