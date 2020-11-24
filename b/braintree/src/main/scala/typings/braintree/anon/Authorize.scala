package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorize extends js.Object {
  
  var Authorize: String = js.native
  
  var Decline: String = js.native
  
  var Fail: String = js.native
}
object Authorize {
  
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize.asInstanceOf[js.Any], Decline = Decline.asInstanceOf[js.Any], Fail = Fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorize]
  }
  
  @scala.inline
  implicit class AuthorizeOps[Self <: Authorize] (val x: Self) extends AnyVal {
    
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
    def setAuthorize(value: String): Self = this.set("Authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecline(value: String): Self = this.set("Decline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: String): Self = this.set("Fail", value.asInstanceOf[js.Any])
  }
}
