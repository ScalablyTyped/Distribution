package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains details about the specified OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}

object DescribeOrganizationalUnitResponse {
  @scala.inline
  def apply(OrganizationalUnit: OrganizationalUnit = null): DescribeOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationalUnitResponse]
  }
}

