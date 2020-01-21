package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityDkimAttributesRequest extends js.Object {
  /**
    * A list of one or more verified identities - email addresses, domains, or both.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityDkimAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityDkimAttributesRequest]
  }
}

