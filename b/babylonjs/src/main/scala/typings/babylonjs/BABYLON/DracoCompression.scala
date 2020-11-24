package typings.babylonjs.BABYLON

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DracoCompression extends IDisposable {
  
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
  def decodeMeshAsync(data: ArrayBufferView, attributes: org.scalablytyped.runtime.StringDictionary[Double]): js.Promise[VertexData] = js.native
  def decodeMeshAsync(data: ArrayBuffer, attributes: org.scalablytyped.runtime.StringDictionary[Double]): js.Promise[VertexData] = js.native
  
  /**
    * Returns a promise that resolves when ready. Call this manually to ensure draco compression is ready before use.
    * @returns a promise that resolves when ready
    */
  def whenReadyAsync(): js.Promise[Unit] = js.native
}
