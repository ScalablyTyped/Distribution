package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
  /**
    * A list of one or more identities.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityMailFromDomainAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityMailFromDomainAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
  }
}

