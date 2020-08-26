package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blueprint extends js.Object {
  /**
    * The ID for the virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The description of the blueprint.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The group name of the blueprint (e.g., amazon-linux).
    */
  var group: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The end-user license agreement URL for the image or blueprint.
    */
  var licenseUrl: js.UndefOr[String] = js.native
  /**
    * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500. 0 indicates that the blueprint runs on all instance sizes. 
    */
  var minPower: js.UndefOr[integer] = js.native
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
    */
  var platform: js.UndefOr[InstancePlatform] = js.native
  /**
    * The product URL to learn more about the image or blueprint.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * The type of the blueprint (e.g., os or app).
    */
  var `type`: js.UndefOr[BlueprintType] = js.native
  /**
    * The version number of the operating system, application, or stack (e.g., 2016.03.0).
    */
  var version: js.UndefOr[String] = js.native
  /**
    * The version code.
    */
  var versionCode: js.UndefOr[String] = js.native
}

object Blueprint {
  @scala.inline
  def apply(): Blueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blueprint]
  }
  @scala.inline
  implicit class BlueprintOps[Self <: Blueprint] (val x: Self) extends AnyVal {
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
    def setBlueprintId(value: NonEmptyString): Self = this.set("blueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintId: Self = this.set("blueprintId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGroup(value: NonEmptyString): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setLicenseUrl(value: String): Self = this.set("licenseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseUrl: Self = this.set("licenseUrl", js.undefined)
    @scala.inline
    def setMinPower(value: integer): Self = this.set("minPower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPower: Self = this.set("minPower", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlatform(value: InstancePlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setProductUrl(value: String): Self = this.set("productUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductUrl: Self = this.set("productUrl", js.undefined)
    @scala.inline
    def setType(value: BlueprintType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionCode(value: String): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
  }
  
}

