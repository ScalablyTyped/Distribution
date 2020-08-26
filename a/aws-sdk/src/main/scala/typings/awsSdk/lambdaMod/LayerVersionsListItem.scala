package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionsListItem extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerVersionArn] = js.native
  /**
    * The layer's open-source license.
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}

object LayerVersionsListItem {
  @scala.inline
  def apply(): LayerVersionsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionsListItem]
  }
  @scala.inline
  implicit class LayerVersionsListItemOps[Self <: LayerVersionsListItem] (val x: Self) extends AnyVal {
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
    def setCompatibleRuntimesVarargs(value: Runtime*): Self = this.set("CompatibleRuntimes", js.Array(value :_*))
    @scala.inline
    def setCompatibleRuntimes(value: CompatibleRuntimes): Self = this.set("CompatibleRuntimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleRuntimes: Self = this.set("CompatibleRuntimes", js.undefined)
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLayerVersionArn(value: LayerVersionArn): Self = this.set("LayerVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerVersionArn: Self = this.set("LayerVersionArn", js.undefined)
    @scala.inline
    def setLicenseInfo(value: LicenseInfo): Self = this.set("LicenseInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseInfo: Self = this.set("LicenseInfo", js.undefined)
    @scala.inline
    def setVersion(value: LayerVersionNumber): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

