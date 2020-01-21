package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoleAliasesResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The role aliases.
    */
  var roleAliases: js.UndefOr[RoleAliases] = js.native
}

object ListRoleAliasesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, roleAliases: RoleAliases = null): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (roleAliases != null) __obj.updateDynamic("roleAliases")(roleAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
}

