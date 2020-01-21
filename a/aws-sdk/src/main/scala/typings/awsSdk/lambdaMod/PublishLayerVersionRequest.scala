package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishLayerVersionRequest extends js.Object {
  /**
    * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * The function layer archive.
    */
  var Content: LayerVersionContentInput = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.native
}

object PublishLayerVersionRequest {
  @scala.inline
  def apply(
    Content: LayerVersionContentInput,
    LayerName: LayerName,
    CompatibleRuntimes: CompatibleRuntimes = null,
    Description: Description = null,
    LicenseInfo: LicenseInfo = null
  ): PublishLayerVersionRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any])
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishLayerVersionRequest]
  }
}

