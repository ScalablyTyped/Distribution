package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningPlatformResponse extends js.Object {
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.native
}

object GetSigningPlatformResponse {
  @scala.inline
  def apply(
    category: Category = null,
    displayName: DisplayName = null,
    maxSizeInMB: Int | Double = null,
    partner: String = null,
    platformId: PlatformId = null,
    signingConfiguration: SigningConfiguration = null,
    signingImageFormat: SigningImageFormat = null,
    target: String = null
  ): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (maxSizeInMB != null) __obj.updateDynamic("maxSizeInMB")(maxSizeInMB.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner.asInstanceOf[js.Any])
    if (platformId != null) __obj.updateDynamic("platformId")(platformId.asInstanceOf[js.Any])
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration.asInstanceOf[js.Any])
    if (signingImageFormat != null) __obj.updateDynamic("signingImageFormat")(signingImageFormat.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
}

