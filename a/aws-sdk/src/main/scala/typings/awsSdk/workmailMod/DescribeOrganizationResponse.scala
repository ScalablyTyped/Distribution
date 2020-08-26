package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the organization.
    */
  var ARN: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The alias for an organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.native
  /**
    * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
    */
  var CompletedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The default mail domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[String] = js.native
  /**
    * The identifier for the directory associated with an Amazon WorkMail organization.
    */
  var DirectoryId: js.UndefOr[String] = js.native
  /**
    * The type of directory associated with the WorkMail organization.
    */
  var DirectoryType: js.UndefOr[String] = js.native
  /**
    * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The identifier of an organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.native
  /**
    * The state of an organization.
    */
  var State: js.UndefOr[String] = js.native
}

object DescribeOrganizationResponse {
  @scala.inline
  def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationResponseOps[Self <: DescribeOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARN(value: AmazonResourceName): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setAlias(value: OrganizationName): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("Alias", js.undefined)
    @scala.inline
    def setCompletedDate(value: Timestamp): Self = this.set("CompletedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedDate: Self = this.set("CompletedDate", js.undefined)
    @scala.inline
    def setDefaultMailDomain(value: String): Self = this.set("DefaultMailDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMailDomain: Self = this.set("DefaultMailDomain", js.undefined)
    @scala.inline
    def setDirectoryId(value: String): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setDirectoryType(value: String): Self = this.set("DirectoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryType: Self = this.set("DirectoryType", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

