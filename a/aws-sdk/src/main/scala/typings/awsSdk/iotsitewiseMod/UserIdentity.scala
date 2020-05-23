package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentity extends js.Object {
  /**
    * The AWS SSO ID of the user.
    */
  var id: IdentityId = js.native
}

object UserIdentity {
  @scala.inline
  def apply(id: IdentityId): UserIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
}

