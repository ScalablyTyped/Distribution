package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageBuffer extends StObject {
  
  /* private */ var _buffer: Any = js.native
  
  /* private */ var _bufferSize: Any = js.native
  
  /* private */ var _create: Any = js.native
  
  /* private */ var _creationFlags: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  /**
    * Disposes the storage buffer
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets underlying native buffer
    * @returns underlying native buffer
    */
  def getBuffer(): DataBuffer = js.native
  
  /**
    * Reads data from the storage buffer
    * @param offset The offset in the storage buffer to start reading from (default: 0)
    * @param size  The number of bytes to read from the storage buffer (default: capacity of the buffer)
    * @param buffer The buffer to write the data we have read from the storage buffer to (optional)
    * @returns If not undefined, returns the (promise) buffer (as provided by the 4th parameter) filled with the data, else it returns a (promise) Uint8Array with the data read from the storage buffer
    */
  def read(): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Double, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Double, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Double, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Unit, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Unit, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def read(offset: Unit, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
  
  /**
    * Updates the storage buffer
    * @param data the data used to update the storage buffer
    * @param byteOffset the byte offset of the data (optional)
    * @param byteLength the byte length of the data (optional)
    */
  def update(data: DataArray): Unit = js.native
  def update(data: DataArray, byteOffset: Double): Unit = js.native
  def update(data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
  def update(data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
}
