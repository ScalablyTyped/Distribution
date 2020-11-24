package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignRequest extends js.Object {
  
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit = js.native
}
object SignRequest {
  
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): SignRequest = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[SignRequest]
  }
  
  @scala.inline
  implicit class SignRequestOps[Self <: SignRequest] (val x: Self) extends AnyVal {
    
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
    def setSignRequest(value: (js.Any, js.Function0[Unit]) => Unit): Self = this.set("signRequest", js.Any.fromFunction2(value))
  }
}
