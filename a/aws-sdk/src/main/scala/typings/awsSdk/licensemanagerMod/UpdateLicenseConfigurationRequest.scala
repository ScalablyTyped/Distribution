package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseConfigurationRequest extends js.Object {
  /**
    * New description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * New status of the license configuration.
    */
  var LicenseConfigurationStatus: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationStatus] = js.native
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * New hard limit of the number of available licenses.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * New license rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * New product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.licensemanagerMod.ProductInformationList] = js.native
}

object UpdateLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateLicenseConfigurationRequestOps[Self <: UpdateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setLicenseConfigurationArn(value: String): Self = this.set("LicenseConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLicenseConfigurationStatus(value: LicenseConfigurationStatus): Self = this.set("LicenseConfigurationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseConfigurationStatus: Self = this.set("LicenseConfigurationStatus", js.undefined)
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = this.set("LicenseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseCount: Self = this.set("LicenseCount", js.undefined)
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = this.set("LicenseCountHardLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseCountHardLimit: Self = this.set("LicenseCountHardLimit", js.undefined)
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = this.set("LicenseRules", js.Array(value :_*))
    @scala.inline
    def setLicenseRules(value: StringList): Self = this.set("LicenseRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseRules: Self = this.set("LicenseRules", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = this.set("ProductInformationList", js.Array(value :_*))
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = this.set("ProductInformationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductInformationList: Self = this.set("ProductInformationList", js.undefined)
  }
  
}

