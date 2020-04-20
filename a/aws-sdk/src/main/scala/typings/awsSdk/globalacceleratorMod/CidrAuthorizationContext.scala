package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CidrAuthorizationContext extends js.Object {
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: GenericString = js.native
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: GenericString = js.native
}

object CidrAuthorizationContext {
  @scala.inline
  def apply(Message: GenericString, Signature: GenericString): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
}

