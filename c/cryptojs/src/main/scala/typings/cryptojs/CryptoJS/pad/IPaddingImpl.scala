package typings.cryptojs.CryptoJS.pad

import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaddingImpl extends js.Object {
  def pad(data: WordArray, blockSize: Double): Unit = js.native
  def unpad(data: WordArray): Unit = js.native
}

object IPaddingImpl {
  @scala.inline
  def apply(pad: (WordArray, Double) => Unit, unpad: WordArray => Unit): IPaddingImpl = {
    val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2(pad), unpad = js.Any.fromFunction1(unpad))
    __obj.asInstanceOf[IPaddingImpl]
  }
  @scala.inline
  implicit class IPaddingImplOps[Self <: IPaddingImpl] (val x: Self) extends AnyVal {
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
    def setPad(value: (WordArray, Double) => Unit): Self = this.set("pad", js.Any.fromFunction2(value))
    @scala.inline
    def setUnpad(value: WordArray => Unit): Self = this.set("unpad", js.Any.fromFunction1(value))
  }
  
}

