package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactMethodsRequest extends js.Object {
  /**
    * The protocols used to send notifications, such as Email, or SMS (text messaging). Specify a protocol in your request to return information about a specific contact method protocol.
    */
  var protocols: js.UndefOr[ContactProtocolsList] = js.native
}

object GetContactMethodsRequest {
  @scala.inline
  def apply(protocols: ContactProtocolsList = null): GetContactMethodsRequest = {
    val __obj = js.Dynamic.literal()
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactMethodsRequest]
  }
}

