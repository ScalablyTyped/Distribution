package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * ARNs of the license configurations to add.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * ARNs of the license configurations to remove.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS resource.
    */
  var ResourceArn: String = js.native
}

object UpdateLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: String): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
  @scala.inline
  implicit class UpdateLicenseSpecificationsForResourceRequestOps[Self <: UpdateLicenseSpecificationsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = this.set("AddLicenseSpecifications", js.Array(value :_*))
    @scala.inline
    def setAddLicenseSpecifications(value: LicenseSpecifications): Self = this.set("AddLicenseSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddLicenseSpecifications: Self = this.set("AddLicenseSpecifications", js.undefined)
    @scala.inline
    def setRemoveLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = this.set("RemoveLicenseSpecifications", js.Array(value :_*))
    @scala.inline
    def setRemoveLicenseSpecifications(value: LicenseSpecifications): Self = this.set("RemoveLicenseSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveLicenseSpecifications: Self = this.set("RemoveLicenseSpecifications", js.undefined)
  }
  
}

