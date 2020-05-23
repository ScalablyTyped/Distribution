package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningPlatform extends js.Object {
  /**
    * The category of a code signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  /**
    * The display name of a code signing platform.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The maximum size (in MB) of code that can be signed by a code signing platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  /**
    * Any partner entities linked to a code signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * The ID of a code signing; platform.
    */
  var platformId: js.UndefOr[String] = js.native
  /**
    * The configuration of a code signing platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  /**
    * The types of targets that can be signed by a code signing platform.
    */
  var target: js.UndefOr[String] = js.native
}

object SigningPlatform {
  @scala.inline
  def apply(
    category: Category = null,
    displayName: String = null,
    maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
    partner: String = null,
    platformId: String = null,
    signingConfiguration: SigningConfiguration = null,
    signingImageFormat: SigningImageFormat = null,
    target: String = null
  ): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSizeInMB)) __obj.updateDynamic("maxSizeInMB")(maxSizeInMB.get.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner.asInstanceOf[js.Any])
    if (platformId != null) __obj.updateDynamic("platformId")(platformId.asInstanceOf[js.Any])
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration.asInstanceOf[js.Any])
    if (signingImageFormat != null) __obj.updateDynamic("signingImageFormat")(signingImageFormat.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningPlatform]
  }
}

