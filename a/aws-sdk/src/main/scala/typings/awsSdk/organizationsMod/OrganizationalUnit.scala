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
  def apply(): OrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalUnit]
  }
  @scala.inline
  implicit class OrganizationalUnitOps[Self <: OrganizationalUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: OrganizationalUnitArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: OrganizationalUnitId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: OrganizationalUnitName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

