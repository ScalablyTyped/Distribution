package typings.awsSdkTypes.signatureMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedEvent extends js.Object {
  
  var headers: Uint8Array = js.native
  
  var payload: Uint8Array = js.native
}
object FormattedEvent {
  
  @scala.inline
  def apply(headers: Uint8Array, payload: Uint8Array): FormattedEvent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedEvent]
  }
  
  @scala.inline
  implicit class FormattedEventOps[Self <: FormattedEvent] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Uint8Array): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
