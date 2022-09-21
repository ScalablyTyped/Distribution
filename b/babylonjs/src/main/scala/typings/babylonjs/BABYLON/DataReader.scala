package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReader extends StObject {
  
  /* private */ var _dataByteOffset: Any
  
  /* private */ var _dataView: Any
  
  /**
    * The data buffer associated with this data reader.
    */
  val buffer: IDataBuffer
  
  /**
    * The current byte offset from the beginning of the data buffer.
    */
  var byteOffset: Double
  
  /**
    * Loads the given byte length.
    * @param byteLength The byte length to load
    * @returns A promise that resolves when the load is complete
    */
  def loadAsync(byteLength: Double): js.Promise[Unit]
  
  /**
    * Read a string from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The string read
    */
  def readString(byteLength: Double): String
  
  /**
    * Read a unsigned 32-bit integer from the currently loaded data range.
    * @returns The 32-bit integer read
    */
  def readUint32(): Double
  
  /**
    * Read a byte array from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The byte array read
    */
  def readUint8Array(byteLength: Double): js.typedarray.Uint8Array
  
  /**
    * Skips the given byte length the currently loaded data range.
    * @param byteLength The byte length to skip
    */
  def skipBytes(byteLength: Double): Unit
}
object DataReader {
  
  inline def apply(
    _dataByteOffset: Any,
    _dataView: Any,
    buffer: IDataBuffer,
    byteOffset: Double,
    loadAsync: Double => js.Promise[Unit],
    readString: Double => String,
    readUint32: () => Double,
    readUint8Array: Double => js.typedarray.Uint8Array,
    skipBytes: Double => Unit
  ): DataReader = {
    val __obj = js.Dynamic.literal(_dataByteOffset = _dataByteOffset.asInstanceOf[js.Any], _dataView = _dataView.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction1(loadAsync), readString = js.Any.fromFunction1(readString), readUint32 = js.Any.fromFunction0(readUint32), readUint8Array = js.Any.fromFunction1(readUint8Array), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[DataReader]
  }
  
  extension [Self <: DataReader](x: Self) {
    
    inline def setBuffer(value: IDataBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    inline def setLoadAsync(value: Double => js.Promise[Unit]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    inline def setReadString(value: Double => String): Self = StObject.set(x, "readString", js.Any.fromFunction1(value))
    
    inline def setReadUint32(value: () => Double): Self = StObject.set(x, "readUint32", js.Any.fromFunction0(value))
    
    inline def setReadUint8Array(value: Double => js.typedarray.Uint8Array): Self = StObject.set(x, "readUint8Array", js.Any.fromFunction1(value))
    
    inline def setSkipBytes(value: Double => Unit): Self = StObject.set(x, "skipBytes", js.Any.fromFunction1(value))
    
    inline def set_dataByteOffset(value: Any): Self = StObject.set(x, "_dataByteOffset", value.asInstanceOf[js.Any])
    
    inline def set_dataView(value: Any): Self = StObject.set(x, "_dataView", value.asInstanceOf[js.Any])
  }
}
