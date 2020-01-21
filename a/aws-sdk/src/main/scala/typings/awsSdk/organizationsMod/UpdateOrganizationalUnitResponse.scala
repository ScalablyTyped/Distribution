package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains the details about the specified OU, including its new name.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}

object UpdateOrganizationalUnitResponse {
  @scala.inline
  def apply(OrganizationalUnit: OrganizationalUnit = null): UpdateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationalUnitResponse]
  }
}

