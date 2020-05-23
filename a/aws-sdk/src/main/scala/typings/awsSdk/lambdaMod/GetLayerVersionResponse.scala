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
  def apply(
    CompatibleRuntimes: CompatibleRuntimes = null,
    Content: LayerVersionContentOutput = null,
    CreatedDate: Timestamp = null,
    Description: Description = null,
    LayerArn: LayerArn = null,
    LayerVersionArn: LayerVersionArn = null,
    LicenseInfo: LicenseInfo = null,
    Version: js.UndefOr[LayerVersionNumber] = js.undefined
  ): GetLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LayerArn != null) __obj.updateDynamic("LayerArn")(LayerArn.asInstanceOf[js.Any])
    if (LayerVersionArn != null) __obj.updateDynamic("LayerVersionArn")(LayerVersionArn.asInstanceOf[js.Any])
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionResponse]
  }
}

