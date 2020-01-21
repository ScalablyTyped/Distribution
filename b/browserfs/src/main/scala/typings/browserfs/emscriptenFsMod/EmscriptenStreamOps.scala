package typings.browserfs.emscriptenFsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenStreamOps extends js.Object {
  def close(stream: EmscriptenStream): Unit
  def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double
  def open(stream: EmscriptenStream): Unit
  def read(stream: EmscriptenStream, buffer: Uint8Array, offset: Double, length: Double, position: Double): Double
  def write(stream: EmscriptenStream, buffer: Uint8Array, offset: Double, length: Double, position: Double): Double
}

object EmscriptenStreamOps {
  @scala.inline
  def apply(
    close: EmscriptenStream => Unit,
    llseek: (EmscriptenStream, Double, Double) => Double,
    open: EmscriptenStream => Unit,
    read: (EmscriptenStream, Uint8Array, Double, Double, Double) => Double,
    write: (EmscriptenStream, Uint8Array, Double, Double, Double) => Double
  ): EmscriptenStreamOps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), llseek = js.Any.fromFunction3(llseek), open = js.Any.fromFunction1(open), read = js.Any.fromFunction5(read), write = js.Any.fromFunction5(write))
  
    __obj.asInstanceOf[EmscriptenStreamOps]
  }
}

