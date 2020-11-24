package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptOutOfModalBackdrop extends js.Object {
  
  var optOutOfModalBackdrop: Boolean = js.native
}
object OptOutOfModalBackdrop {
  
  @scala.inline
  def apply(optOutOfModalBackdrop: Boolean): OptOutOfModalBackdrop = {
    val __obj = js.Dynamic.literal(optOutOfModalBackdrop = optOutOfModalBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptOutOfModalBackdrop]
  }
  
  @scala.inline
  implicit class OptOutOfModalBackdropOps[Self <: OptOutOfModalBackdrop] (val x: Self) extends AnyVal {
    
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
    def setOptOutOfModalBackdrop(value: Boolean): Self = this.set("optOutOfModalBackdrop", value.asInstanceOf[js.Any])
  }
}
