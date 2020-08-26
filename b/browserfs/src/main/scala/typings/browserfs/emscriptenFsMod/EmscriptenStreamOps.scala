package typings.browserfs.emscriptenFsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenStreamOps extends js.Object {
  def close(stream: EmscriptenStream): Unit = js.native
  def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double = js.native
  def open(stream: EmscriptenStream): Unit = js.native
  def read(stream: EmscriptenStream, buffer: Uint8Array, offset: Double, length: Double, position: Double): Double = js.native
  def write(stream: EmscriptenStream, buffer: Uint8Array, offset: Double, length: Double, position: Double): Double = js.native
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
  @scala.inline
  implicit class EmscriptenStreamOpsOps[Self <: EmscriptenStreamOps] (val x: Self) extends AnyVal {
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
    def setClose(value: EmscriptenStream => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setLlseek(value: (EmscriptenStream, Double, Double) => Double): Self = this.set("llseek", js.Any.fromFunction3(value))
    @scala.inline
    def setOpen(value: EmscriptenStream => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: (EmscriptenStream, Uint8Array, Double, Double, Double) => Double): Self = this.set("read", js.Any.fromFunction5(value))
    @scala.inline
    def setWrite(value: (EmscriptenStream, Uint8Array, Double, Double, Double) => Double): Self = this.set("write", js.Any.fromFunction5(value))
  }
  
}

