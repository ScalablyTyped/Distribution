package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOrganizationConfigurationRequest extends js.Object {
  /**
    * Indicates whether to automatically enable member accounts in the organization.
    */
  var AutoEnable: Boolean = js.native
  /**
    * An object describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurations] = js.native
  /**
    * The ID of the detector to update the delegated administrator for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object UpdateOrganizationConfigurationRequest {
  @scala.inline
  def apply(AutoEnable: Boolean, DetectorId: DetectorId): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateOrganizationConfigurationRequestOps[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setAutoEnable(value: Boolean): Self = this.set("AutoEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSources(value: OrganizationDataSourceConfigurations): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
  }
  
}

