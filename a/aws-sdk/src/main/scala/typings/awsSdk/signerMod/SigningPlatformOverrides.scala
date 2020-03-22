package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningPlatformOverrides extends js.Object {
  /**
    * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
    */
  var signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.native
  /**
    * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can select either of two signing formats, JSONEmbedded or JSONDetached. (A third format value, JSON, is reserved for future use.) With JSONEmbedded, the signing image has the payload embedded in it. With JSONDetached, the payload is not be embedded in the signing image.
    */
  var signingImageFormat: js.UndefOr[ImageFormat] = js.native
}

object SigningPlatformOverrides {
  @scala.inline
  def apply(signingConfiguration: SigningConfigurationOverrides = null, signingImageFormat: ImageFormat = null): SigningPlatformOverrides = {
    val __obj = js.Dynamic.literal()
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration.asInstanceOf[js.Any])
    if (signingImageFormat != null) __obj.updateDynamic("signingImageFormat")(signingImageFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningPlatformOverrides]
  }
}

