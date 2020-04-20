package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBuffer extends js.Object {
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
  def readAsync(byteOffset: Double, byteLength: Double): js.Promise[ArrayBufferView]
}

object IDataBuffer {
  @scala.inline
  def apply(byteLength: Double, readAsync: (Double, Double) => js.Promise[ArrayBufferView]): IDataBuffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], readAsync = js.Any.fromFunction2(readAsync))
    __obj.asInstanceOf[IDataBuffer]
  }
}

