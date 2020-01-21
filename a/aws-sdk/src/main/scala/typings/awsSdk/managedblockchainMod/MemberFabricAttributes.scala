package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricAttributes extends js.Object {
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.native
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.native
}

object MemberFabricAttributes {
  @scala.inline
  def apply(AdminUsername: UsernameString = null, CaEndpoint: String = null): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    if (AdminUsername != null) __obj.updateDynamic("AdminUsername")(AdminUsername.asInstanceOf[js.Any])
    if (CaEndpoint != null) __obj.updateDynamic("CaEndpoint")(CaEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFabricAttributes]
  }
}

