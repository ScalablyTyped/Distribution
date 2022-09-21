package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataBuffer extends StObject {
  
  /**
    * The byte length of the buffer.
    */
  val byteLength: Double
  
  /**
    * Reads bytes from the data buffer.
    * @param byteOffset The byte offset to read
    * @param byteLength The byte length to read
    * @returns A promise that resolves when the bytes are read
    */
  def readAsync(byteOffset: Double, byteLength: Double): js.Promise[js.typedarray.ArrayBufferView]
}
object IDataBuffer {
  
  inline def apply(byteLength: Double, readAsync: (Double, Double) => js.Promise[js.typedarray.ArrayBufferView]): IDataBuffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], readAsync = js.Any.fromFunction2(readAsync))
    __obj.asInstanceOf[IDataBuffer]
  }
  
  extension [Self <: IDataBuffer](x: Self) {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setReadAsync(value: (Double, Double) => js.Promise[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "readAsync", js.Any.fromFunction2(value))
  }
}
