package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendContactMethodVerificationRequest extends js.Object {
  /**
    * The protocol to verify, such as Email or SMS (text messaging).
    */
  var protocol: ContactMethodVerificationProtocol = js.native
}

object SendContactMethodVerificationRequest {
  @scala.inline
  def apply(protocol: ContactMethodVerificationProtocol): SendContactMethodVerificationRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactMethodVerificationRequest]
  }
}

