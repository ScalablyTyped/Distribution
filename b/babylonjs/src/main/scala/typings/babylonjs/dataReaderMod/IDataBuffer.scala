package typings.babylonjs.dataReaderMod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataBuffer extends js.Object {
  
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
  implicit class IDataBufferOps[Self <: IDataBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsync(value: (Double, Double) => js.Promise[ArrayBufferView]): Self = this.set("readAsync", js.Any.fromFunction2(value))
  }
}
