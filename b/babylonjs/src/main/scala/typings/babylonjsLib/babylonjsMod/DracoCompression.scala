package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Draco compression (https://google.github.io/draco/)
     *
     * This class wraps the Draco module.
     *
     * **Encoder**
     *
     * The encoder is not currently implemented.
     *
     * **Decoder**
     *
     * By default, the configuration points to a copy of the Draco decoder files for glTF from the babylon.js preview cdn https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js.
     *
     * To update the configuration, use the following code:
     * ```javascript
     *     BABYLON.DracoCompression.Configuration = {
     *         decoder: {
     *             wasmUrl: "<url to the WebAssembly library>",
     *             wasmBinaryUrl: "<url to the WebAssembly binary>",
     *             fallbackUrl: "<url to the fallback JavaScript library>",
     *         }
     *     };
     * ```
     *
     * Draco has two versions, one for WebAssembly and one for JavaScript. The decoder configuration can be set to only support Webssembly or only support the JavaScript version.
     * Decoding will automatically fallback to the JavaScript version if WebAssembly version is not configured or if WebAssembly is not supported by the browser.
     * Use `BABYLON.DracoCompression.DecoderAvailable` to determine if the decoder is available for the current session.
     *
     * To decode Draco compressed data, create a DracoCompression object and call decodeMeshAsync:
     * ```javascript
     *     var dracoCompression = new BABYLON.DracoCompression();
     *     var vertexData = await dracoCompression.decodeMeshAsync(data, {
     *         [BABYLON.VertexBuffer.PositionKind]: 0
     *     });
     * ```
     *
     * @see https://www.babylonjs-playground.com/#N3EK4B#0
     */
@JSImport("babylonjs", "DracoCompression")
@js.native
class DracoCompression ()
  extends babylonjsLib.BABYLONNs.DracoCompression

/**
     * Draco compression (https://google.github.io/draco/)
     *
     * This class wraps the Draco module.
     *
     * **Encoder**
     *
     * The encoder is not currently implemented.
     *
     * **Decoder**
     *
     * By default, the configuration points to a copy of the Draco decoder files for glTF from the babylon.js preview cdn https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js.
     *
     * To update the configuration, use the following code:
     * ```javascript
     *     BABYLON.DracoCompression.Configuration = {
     *         decoder: {
     *             wasmUrl: "<url to the WebAssembly library>",
     *             wasmBinaryUrl: "<url to the WebAssembly binary>",
     *             fallbackUrl: "<url to the fallback JavaScript library>",
     *         }
     *     };
     * ```
     *
     * Draco has two versions, one for WebAssembly and one for JavaScript. The decoder configuration can be set to only support Webssembly or only support the JavaScript version.
     * Decoding will automatically fallback to the JavaScript version if WebAssembly version is not configured or if WebAssembly is not supported by the browser.
     * Use `BABYLON.DracoCompression.DecoderAvailable` to determine if the decoder is available for the current session.
     *
     * To decode Draco compressed data, create a DracoCompression object and call decodeMeshAsync:
     * ```javascript
     *     var dracoCompression = new BABYLON.DracoCompression();
     *     var vertexData = await dracoCompression.decodeMeshAsync(data, {
     *         [BABYLON.VertexBuffer.PositionKind]: 0
     *     });
     * ```
     *
     * @see https://www.babylonjs-playground.com/#N3EK4B#0
     */
@JSImport("babylonjs", "DracoCompression")
@js.native
object DracoCompression extends js.Object {
  /**
           * The configuration. Defaults to the following urls:
           * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
           * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
           * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
           */
  var Configuration: babylonjsLib.BABYLONNs.IDracoCompressionConfiguration = js.native
  /**
           * Returns true if the decoder is available.
           */
  val DecoderAvailable: scala.Boolean = js.native
  var _DecoderModulePromise: js.Any = js.native
  var _GetDecoderModule: js.Any = js.native
  var _LoadFileAsync: js.Any = js.native
  var _LoadScriptAsync: js.Any = js.native
}

