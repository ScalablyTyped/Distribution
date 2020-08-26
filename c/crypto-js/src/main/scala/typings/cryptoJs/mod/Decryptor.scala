package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decryptor extends js.Object {
  def process(messagePart: String): String = js.native
}

object Decryptor {
  @scala.inline
  def apply(process: String => String): Decryptor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[Decryptor]
  }
  @scala.inline
  implicit class DecryptorOps[Self <: Decryptor] (val x: Self) extends AnyVal {
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
    def setProcess(value: String => String): Self = this.set("process", js.Any.fromFunction1(value))
  }
  
}

