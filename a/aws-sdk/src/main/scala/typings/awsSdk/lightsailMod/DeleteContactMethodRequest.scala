package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContactMethodRequest extends js.Object {
  /**
    * The protocol that will be deleted, such as Email or SMS (text messaging).  To delete an Email and an SMS contact method if you added both, you must run separate DeleteContactMethod actions to delete each protocol. 
    */
  var protocol: ContactProtocol = js.native
}

object DeleteContactMethodRequest {
  @scala.inline
  def apply(protocol: ContactProtocol): DeleteContactMethodRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteContactMethodRequest]
  }
}

