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
}

