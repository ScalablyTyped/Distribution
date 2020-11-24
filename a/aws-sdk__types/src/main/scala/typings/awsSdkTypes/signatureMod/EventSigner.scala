package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSigner extends js.Object {
  
  /**
    * Sign the individual event of the event stream.
    */
  def sign(event: FormattedEvent, options: EventSigningArguments): js.Promise[String] = js.native
}
object EventSigner {
  
  @scala.inline
  def apply(sign: (FormattedEvent, EventSigningArguments) => js.Promise[String]): EventSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[EventSigner]
  }
  
  @scala.inline
  implicit class EventSignerOps[Self <: EventSigner] (val x: Self) extends AnyVal {
    
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
    def setSign(value: (FormattedEvent, EventSigningArguments) => js.Promise[String]): Self = this.set("sign", js.Any.fromFunction2(value))
  }
}
