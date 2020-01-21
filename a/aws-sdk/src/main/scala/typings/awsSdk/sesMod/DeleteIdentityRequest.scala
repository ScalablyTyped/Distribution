package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentityRequest extends js.Object {
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
}

object DeleteIdentityRequest {
  @scala.inline
  def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
}

