package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionResponse extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.native
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerArn] = js.native
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerVersionArn] = js.native
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}

object GetLayerVersionResponse {
  @scala.inline
  def apply(): GetLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLayerVersionResponse]
  }
  @scala.inline
  implicit class GetLayerVersionResponseOps[Self <: GetLayerVersionResponse] (val x: Self) extends AnyVal {
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
    def setContent(value: LayerVersionContentOutput): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLayerArn(value: LayerArn): Self = this.set("LayerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerArn: Self = this.set("LayerArn", js.undefined)
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

