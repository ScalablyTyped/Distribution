package typings.chenfengyuanVueQrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QrCodeWatch extends js.Object {
  
  @JSName("$props")
  def $props(`val`: js.Any): Unit = js.native
}
object QrCodeWatch {
  
  @scala.inline
  def apply($props: js.Any => Unit): QrCodeWatch = {
    val __obj = js.Dynamic.literal($props = js.Any.fromFunction1($props))
    __obj.asInstanceOf[QrCodeWatch]
  }
  
  @scala.inline
  implicit class QrCodeWatchOps[Self <: QrCodeWatch] (val x: Self) extends AnyVal {
    
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
    def set$props(value: js.Any => Unit): Self = this.set("$props", js.Any.fromFunction1(value))
  }
}
