package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationUsage extends js.Object {
  /**
    * Time when the license configuration was initially associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.native
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Status of the resource.
    */
  var ResourceStatus: js.UndefOr[String] = js.native
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object LicenseConfigurationUsage {
  @scala.inline
  def apply(): LicenseConfigurationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationUsage]
  }
  @scala.inline
  implicit class LicenseConfigurationUsageOps[Self <: LicenseConfigurationUsage] (val x: Self) extends AnyVal {
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
    def setAssociationTime(value: DateTime): Self = this.set("AssociationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationTime: Self = this.set("AssociationTime", js.undefined)
    @scala.inline
    def setConsumedLicenses(value: BoxLong): Self = this.set("ConsumedLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedLicenses: Self = this.set("ConsumedLicenses", js.undefined)
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceOwnerId(value: String): Self = this.set("ResourceOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOwnerId: Self = this.set("ResourceOwnerId", js.undefined)
    @scala.inline
    def setResourceStatus(value: String): Self = this.set("ResourceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceStatus: Self = this.set("ResourceStatus", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

