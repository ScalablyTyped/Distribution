package typings.chenfengyuanVueQrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QrCodeMethods extends js.Object {
  
  // Generate QR code.
  def generate(): Unit = js.native
}
object QrCodeMethods {
  
  @scala.inline
  def apply(generate: () => Unit): QrCodeMethods = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    __obj.asInstanceOf[QrCodeMethods]
  }
  
  @scala.inline
  implicit class QrCodeMethodsOps[Self <: QrCodeMethods] (val x: Self) extends AnyVal {
    
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
    def setGenerate(value: () => Unit): Self = this.set("generate", js.Any.fromFunction0(value))
  }
}
