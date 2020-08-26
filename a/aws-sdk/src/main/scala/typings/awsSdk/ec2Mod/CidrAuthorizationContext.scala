package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CidrAuthorizationContext extends js.Object {
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: String = js.native
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: String = js.native
}

object CidrAuthorizationContext {
  @scala.inline
  def apply(Message: String, Signature: String): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
  @scala.inline
  implicit class CidrAuthorizationContextOps[Self <: CidrAuthorizationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
  }
  
}

