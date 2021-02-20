package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataBuffer extends StObject {
  
  /**
    * The byte length of the buffer.
    */
  val byteLength: Double = js.native
  
  /**
    * Reads bytes from the data buffer.
    * @param byteOffset The byte offset to read
    * @param byteLength The byte length to read
    * @returns A promise that resolves when the bytes are read
    */
  def readAsync(byteOffset: Double, byteLength: Double): js.Promise[ArrayBufferView] = js.native
}
object IDataBuffer {
  
  @scala.inline
  def apply(byteLength: Double, readAsync: (Double, Double) => js.Promise[ArrayBufferView]): IDataBuffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], readAsync = js.Any.fromFunction2(readAsync))
    __obj.asInstanceOf[IDataBuffer]
  }
  
  @scala.inline
  implicit class IDataBufferMutableBuilder[Self <: IDataBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsync(value: (Double, Double) => js.Promise[ArrayBufferView]): Self = StObject.set(x, "readAsync", js.Any.fromFunction2(value))
  }
}
