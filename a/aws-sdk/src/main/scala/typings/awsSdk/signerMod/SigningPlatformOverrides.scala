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
  def apply(): SigningPlatformOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatformOverrides]
  }
  @scala.inline
  implicit class SigningPlatformOverridesOps[Self <: SigningPlatformOverrides] (val x: Self) extends AnyVal {
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
    def setSigningConfiguration(value: SigningConfigurationOverrides): Self = this.set("signingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningConfiguration: Self = this.set("signingConfiguration", js.undefined)
    @scala.inline
    def setSigningImageFormat(value: ImageFormat): Self = this.set("signingImageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningImageFormat: Self = this.set("signingImageFormat", js.undefined)
  }
  
}

