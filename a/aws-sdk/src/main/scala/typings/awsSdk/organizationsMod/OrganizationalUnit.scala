package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnit extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of this OU. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[OrganizationalUnitArn] = js.native
  /**
    * The unique identifier (ID) associated with this OU. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
    */
  var Id: js.UndefOr[OrganizationalUnitId] = js.native
  /**
    * The friendly name of this OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[OrganizationalUnitName] = js.native
}

object OrganizationalUnit {
  @scala.inline
  def apply(
    Arn: OrganizationalUnitArn = null,
    Id: OrganizationalUnitId = null,
    Name: OrganizationalUnitName = null
  ): OrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnit]
  }
}

