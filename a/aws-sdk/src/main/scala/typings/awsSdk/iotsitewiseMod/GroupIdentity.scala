package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupIdentity extends js.Object {
  /**
    * The AWS SSO ID of the group.
    */
  var id: IdentityId = js.native
}

object GroupIdentity {
  @scala.inline
  def apply(id: IdentityId): GroupIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdentity]
  }
}

